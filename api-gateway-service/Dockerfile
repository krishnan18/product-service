#Dockerfile contains all the commands with which
#Docker can build images reading the instructions.

FROM openjdk:11

ADD ./target/api-gateway-service.jar /usr/src/api-gateway-service.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "api-gateway-service.jar"]