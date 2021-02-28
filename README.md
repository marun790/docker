# docker
### Commands

Commends								| Discription
---------------------------------------------------------------------------------------------------
docker ps -a								|to list all image
docker image build . -t arun-employee:0.0.01				|to build image
docker image ls							| list all image
docker rmi arun-employee:0.0.01					|to remove image
docker run --name arun-emp -p 8080:8080 -d arun-employee:0.0.03 	|create and run a container 
docker container start 02a7fa8dc66e 					|start container
docker container stop 02a7fa8dc66e 					|stop container
curl localhost:8080/employee/all					|to check the service
docker container rm 02a7fa8dc66e 					|remove/delete container
docker container prune							|remove all stoped containers


FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
