# MicroServices-Application-Using-SpringBoot
Implementing MicroServices Application Using SpringBoot Framework, API-Gateway, Eureka Server and Discovery Client, Hystrix DashBoard, Zipkin Server,Slueth, Slf4j etc.

## API-GATEWAY
An API gateway is an API management tool that sits between a client and a collection of backend services. An API gateway acts as a reverse proxy to accept all application programming interface (API) calls, aggregate the various services required to fulfill them, and return the appropriate result.

## Eureka Server and Discovery Client
Eureka Server is an application that holds the information about all client-service applications. Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. Eureka Server is also known as Discovery Server. And all the Microservices that register into the discovery are called Discovery Clients.
### Application.properties

eureka.client.registerWithEureka = false
eureka.client.fetchRegistry = false
server.port = 8761

#### Use the URL http://localhost:8761/ in your web browser and you can find the Eureka Server running on the port 8761 as shown below −
![Eureka Server](https://github.com/thoomyashwanthreddy/MicroServices-Application-Using-SpringBoot/blob/main/Images/eureka_server_running_on_port_8761.jpg)

## Hystrix
Hystrix is a library from Netflix. Hystrix isolates the points of access between the services, stops cascading failures across them and provides the fallback options.The @EnableHystrix annotation is used to enable the Hystrix functionalities into your Spring Boot application. And also we need to write a fallbackmethod inorder to give the appropriate message if the service is not up. And also you need to write configuration in application.yml file for the fallback and hystrix stream
### Maven users can add the following dependency in the pom.xml file −
<dependency>
   <groupId>org.springframework.cloud</groupId>
   <artifactId>spring-cloud-starter-hystrix</artifactId>
</dependency>

## ZIPKIN SERVICE and SLUETH
Zipkin service will serve as the store for all our spans. Each span is sent to this service and collected into traces for future identification.Sleuth integrates effortlessly with logging frameworks like Logback and SLF4J to add unique identifiers that help track and diagnose issues using logs. Using Slueth the log information is shown the format of:    [application name, traceId, spanId, export]
Note: You need to manually download the Zipkin Server jar and then run in the command prompt which runs on the http://localhost:9411 Then navigate to the http://localhost:9411 using the web browser and after the services are up and running you can see the log traces of each rest end point.
