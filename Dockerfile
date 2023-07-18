FROM openjdk:8

COPY ./target/charitybird2-jar-with-dependencies.jar /app/charitybird2.jar
WORKDIR /app

CMD ["java", "-jar", "charitybird2.jar"]