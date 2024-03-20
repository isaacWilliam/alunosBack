FROM openjdk:17-jdk-alpine
COPY target/angular-spring-backend-0.0.1-SNAPSHOT.jar angular-spring-1.0.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/angular-spring-1.0.0.jar"]