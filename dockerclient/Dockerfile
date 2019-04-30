FROM java:8
VOLUME /tmp
EXPOSE 38080
ADD ./target/jenkintest-0.0.1-SNAPSHOT.jar app/app.jar
ENTRYPOINT ["java","-jar","app/app.jar"]