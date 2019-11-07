FROM openjdk:8-jdk-alpine
COPY target/dockerTest-0.0.1-SNAPSHOT.jar dockertest.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","dockertest.jar"]