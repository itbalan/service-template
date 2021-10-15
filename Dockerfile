FROM adoptopenjdk/openjdk14
ENV APP_HOME=/usr/app
WORKDIR $APP_HOME
COPY target/*.jar app.jar
EXPOSE 9092
CMD ["java", "-jar", "app.jar"]