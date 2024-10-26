#FROM eclipse-temurin:17-jdk-focal
 
#COPY target/*.jar app.jar

#ENTRYPOINT [ "java", "-jar", "app.jar" ] 

# Use the official Tomcat base image with JDK 17
FROM tomcat:9.0.73-jdk17-temurin-focal

# Copy the WAR file to the Tomcat webapps directory
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat server
ENTRYPOINT ["catalina.sh", "run"]
