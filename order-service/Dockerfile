#Dockerfile contains all the commands with which
#Docker can build images reading the instructions.

FROM openjdk:11

ADD ./target/order-service.jar /usr/src/order-service.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "order-service.jar"]