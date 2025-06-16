FROM maven:3.9.8-amazoncorretto-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM amazoncorretto:17
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

ARG AWS_ACES_KEY_ID
ARG AWS_ACES_SECRET_KEY

ENV AWS_REGION=us-east-1
ENV AWS_S3_BUCKET_NAME=smart-assets-dev-leo-fulco

ENTRYPOINT ["java", "-jar", "app.jar"]