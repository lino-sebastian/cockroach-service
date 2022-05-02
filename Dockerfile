FROM openjdk:8
EXPOSE 9080
ADD cockroach-service.jar cockroach-service.jar
ENTRYPOINT ["java","-jar","/cockroach-service.jar"]