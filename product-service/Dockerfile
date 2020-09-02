FROM maven:3.6.0-jdk-11-slim AS build
WORKDIR /app
COPY /product-service/pom.xml pom.xml
RUN mvn dependency:go-offline -B
COPY /product-service/src src
RUN mvn clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/product-service.war ./app.war
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.war"]
