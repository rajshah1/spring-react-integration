FROM openjdk:8
ADD target/spring-docker-test.jar  app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]