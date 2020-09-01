#Dockerfile contains all the commands with which
#Docker can build images reading the instructions.

FROM openjdk:11

ADD ./target/product-service.jar /usr/src/product-service.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "product-service.jar"]