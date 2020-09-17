Coverage:  src/main/java: 64.3%
# Inventory Managment System
Part of my learning at QA academy.
This project is an inventory management system that uses Java, Maven and SQL to CREATE, READ, UPDATE and DELETE records from database tables. The database is made up of 4 tables the CUSTOMER table is used to store infomation about the customer e.g first name, surname. The ITEM is table is used to store information about the item e.g name, price. The ORDER table stores information about the order and who is making the order e.g customerId, address. The ORDERITEM table is used to store the items that are being added to the orders.

## Getting Started

In order to run the project on your local machine you will need to ensure a Java IDE (I used Eclipse for this project), a database platform that uses SQL (I used mySQL) and Maven is needed as the build tool for this project.

### Prerequisites

What things you need to install the software and how to install them

Java - Download the most recent version of Java from the Java website.
Eclipse - Download Eclipse from the Eclipse website and pick either Eclipse for Java Developers or Enterprise Developers.
mySQL - Download mySQL from the mySQL website - this project is compatible with the mySQL version 5.7.31.
Maven - Download the binary zip archive from the Maven Website. This will allow you to use techonlogies such as JUnit.

### Installing

A step by step series of examples that tell you how to get a development env running

For Java, Maven and mySQL they must all have systems variables created within your local machines and then be added to your path.

Once everything is set up, in Eclipse you should open the Runner.java class and click the run button.
This will then give you the option of Customer, Item or Order.
Once you've entered your choice you will be taken the the CRUD menu which allows you to interact with the database.
For example, if you enter Customer then create you will be prompted to enter a first name and surname.
Then if you enter read then program will read all of the customers in the database with the customer you entered at the bottom.
Say you entered "John" and then "Smith" and there is already one customer in the database your read function will show that customer and then "id:2 first name: john surname: smith".
You can repeat these steps for the other tables. 

## Running the tests

The tests for this program are run using Junit. Junit can be accessed be adding the dependancy withim the pom.xml file. The tests are used to test the functionality of the Domain, DAO and Controller classes. However, as we have not come across Mockito yet the tests for the controllers are limited. The Junit tests use functions such as assertEquals and EqualsVerifier. These tests are implemented to ensure that all of the classes and methods are given the expected output and if they're not then we can use them to find and debug issues within the code.

### Unit Tests 


### Integration Tests 


### And coding style tests

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments
