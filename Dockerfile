FROM openjdk:17
ADD target/mysql_spring.jar mysql_spring.jar
ENTRYPOINT ["java","-jar", "/mysql_spring.jar"]