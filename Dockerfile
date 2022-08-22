FROM java:8
EXPOSE 8080
ADD target/pensionerDetailMicroservice.jar pensionerDetailMicroservice.jar
ENTRYPOINT ["java","-jar","pensionerDetailMicroservice.jar"]