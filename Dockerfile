FROM openjdk:17-alpine
WORKDIR /app
COPY target/spring-boot-docker.jar /app/dockerassignment.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","dockerassignment.jar"]