#Dockerfile contains all the commands with which
#Docker can build images reading the instructions.

FROM openjdk:11

ADD ./target/service-registry.jar /usr/src/service-registry.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "service-registry.jar"]