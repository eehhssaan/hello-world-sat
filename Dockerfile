FROM openjdk:11
COPY target/*.jar /
EXPOSE 8080
ENTRYPOINT ["java", "jar", "hello-world-sat.jar"]