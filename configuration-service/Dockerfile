#Dockerfile contains all the commands with which
#Docker can build images reading the instructions.

FROM openjdk:11

ADD ./target/configuration-service.jar /usr/src/configuration-service.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "configuration-service.jar"]