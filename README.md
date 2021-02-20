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

