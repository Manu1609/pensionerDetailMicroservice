FROM openjdk:17-jdk-slim-buster AS builder
EXPOSE 8080
ADD target/pensionerDetailMicroservice.jar pensionerDetailMicroservice.jar
ENTRYPOINT ["java","-jar","/pensionerDetailMicroservice.jar"]
