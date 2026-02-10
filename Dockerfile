FROM eclipse-temurin:17-jdk-jammy

WORKDIR /src

# copy jar from target folder
COPY target/*.jar SampleApp.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","SampleApp.jar"]
