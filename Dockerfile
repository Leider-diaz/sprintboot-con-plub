FROM openjdk:17-jdk-alpine
EXPOSE 8080
COPY target/sprint-boot-publisher.jar sprint-boot-publisher.jar
ENTRYPOINT ["java","-jar","/sprint-boot-publisher.jar"]