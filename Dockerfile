FROM public.ecr.aws/docker/library/openjdk:latest
EXPOSE 8080
ADD target/pensionerDetailMicroservice.jar pensionerDetailMicroservice.jar
ENTRYPOINT ["java","-jar","/pensionerDetailMicroservice.jar"]
