
###Start MongoDB

* Download MongoDB and GUI mongo-compass
Server https://www.mongodb.com/try/download/community

* GUI tool https://www.mongodb.com/try/download/compass

---
<!-- OL -->
1) install MongoDB Server => to start mongodb server

2) Create a bacth file ( startMongoDB.batch) for future use
cd C:\Program Files\MongoDB\Server\4.4\bin
mongod.exe --dbpath C:\D\MEAN\mongo-data

3) create batch file startMongoDB.batch 
cd C:\Program Files\MongoDB\Server\4.4\bin mongod.exe --dbpath C:\D\MEAN\mongo-data

4) install Mongo Compass or Robo Mongo
New Connection => Connect => Create Database Name => and Create Collection


### Running the application locally
---
<!-- OL -->
1. Download the zip and unzip at project development folder
2. Open eclipse <br>
  2.1 - File import as existing Maven project
  2.2 - Navigate up to folder POM.xml for maven dependencies
  2.3 - Search file Application with @SpringBootApplication annotation as main starting file
  2.4 - Right click and run as java application   
3. Check console log as project run at Tomcat server on port 8080
4. The application will run at http://localhost:8080 or check http://localhost:8080/actuator/health
5. Application flow architecture 
<!-- UL -->
* Java CartOrderController file -> MongodbRepository file --> MongoRepository file.


1) http://localhost:8080/order/placeOrder

{
    "id":1234,
    "name":"John",
    "gender":"Male",
    "products": [
        {
            "name":"mobile",
            "quantity":1,
            "price":3
        }
    ],
    "address":{
        "city":"dallas",
        "state":"Texas",
        "zipcode":"77075"
    }
}

2) http://localhost:8080/order/getUserByAddress/dallas

3) http://localhost:8080/order/getUserByName/John







