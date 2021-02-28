# docker
### Virtualization vs Containarization
![virtualization vs containarization](https://github.com/marun790/docker/blob/main/images/virtualizatin_vs_containarization.png?raw=true)

k8s install with minikube https://www.howtoforge.com/how-to-install-kubernetes-with-minikube-ubuntu-20-04/
### Commands

 Commends 							        |  Discription 
----------------------------------------------------------------------|---------------------------------
docker ps -a								|to list all image
docker image build . -t arun-employee:0.0.01				|to build image
docker image ls							|list all image
docker rmi arun-employee:0.0.01					|to remove image
docker run --name arun-emp -p 8080:8080 -d arun-employee:0.0.03 	|create and run a container 
docker container start 02a7fa8dc66e 					|start container
docker container stop 02a7fa8dc66e 					|stop container
curl localhost:8080/employee/all					|to check the service
docker container rm 02a7fa8dc66e 					|remove/delete container
docker container prune							|remove all stoped containers
docker exec -it department bash					| loginto container



#### Comment explanations
```
 docker image build . -t arun-employee:0.0.01	
 
 ```
* '.' -> if we in the same filder and the filename is Dockerfile we can use otherwise have to use -f.
* '-t' -> tag name.
 
``` 
docker run --name arun-emp -p 8080:8080 -d arun-employee:0.0.03
```
* '-name'-> name of the process in the container.
* '-d' -> will run the process in detached mode otherwise will run like weserver in command prompt, container will stop if we close the command prompt..

```
docker run --name arun-emp -p 8080:8080 -d arun-employee
```
* Note that we didnt mentioned tag version, if we give arun-employee:latest we can run the container without tag name




#### Simple Docker file to build image
```
FROM openjdk:8-jdk-alpine 			(alpine)-> smallet process which having minimal future and small size
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
```
* FROM -> base image from which the process image will be created
* EXPOSE -> just an info



by network configuration we can acchive the process running in same network can be communicate locally


