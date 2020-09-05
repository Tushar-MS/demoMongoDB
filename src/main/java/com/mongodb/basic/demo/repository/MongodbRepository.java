package com.mongodb.basic.demo.repository;

import com.mongodb.basic.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MongodbRepository extends MongoRepository<User, Integer> {

    List<User> findByName(String name);
    @Query("{'Address.city':?0}")
    List<User> findByCity(String city);
}
