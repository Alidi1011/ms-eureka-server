FROM openjdk:8
VOLUME /tmp
EXPOSE 8761
ADD ./target/ms_eureka_server-0.0.1-SNAPSHOT.jar ms-eureka-server.jar
ENTRYPOINT ["java","-jar","/ms-eureka-server.jar"]