# README: Trading Application
This is simple RESTful application developed using Spring & SpringBoot.
Trading application acts on trading signal, processes the signal and responds.


## Requirements

The fully fledged server uses the following:

* Spring Framework
* SpringBoot
* jUnit

## Dependencies
The library Algo is used for responding signal.

## Building the project
You will need:

*	Java:JDK 17
*	Maven 4.0 or higher
*	Git


## Launch
* The project can be booted by spring with entry point class TradingApplication.java
  This class will launch the application using embedded tomcat server.
* The test case SignalControllerTests can be executed using jUnit for all the test cases.

## Example
The developed API can be called with URL localhost:8080/processSignal?signal=x
PS: You can configure different host and port in project. x stands for signal number.

## Project status
The current project state involves capability to respond till 3 signal.
Later, That can be expanded using Signal.java configuration class. 
The project has also capacity to add views and relative basic dependency is already part of project. 


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.4/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.4/reference/htmlsingle/#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.4/reference/htmlsingle/#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.0.4/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

