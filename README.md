# Docker Assignment

## Prerequisites

- **Docker** (already installed by IT team)
- **Docker Compose**
- **Github**

### Installing Docker Compose
* sudo curl -L "https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
* sudo chmod +x /usr/local/bin/docker-compose

#### To Verify installation,run:
* docker --version
* docker-compose --version

##### Build and run docker images
* docker build -t docker-assignment-web .
* docker run -p 8080:8080 docker-assignment-web

###### To check docker images
* docker images

####### To use Docker Compose for the multi-container setup:
* docker-compose up --build

######## To verify running containers
* docker ps

######## To check all containers
* docker ps -a

######### To stop container
* docker stop <container_name_or_id>
* docker-compose down

########## To start container
* docker start <container_name_or_id>

########### To remove container
* docker rm <container_name_or_id>

############ To remove all stopped containers
* docker container prune

############# To inspect a container
* docker inspect <container_name_or_id>

############## To view the logs for a specific container
* docker logs <container_name_or_id>

############### To push image to docker hub
* docker login
* docker tag docker-assignment-web atulsharma18/docker-assignment-web:latest
* docker push atulsharma18/docker-assignment-web:latest

################ To pull and run docker image locally
* docker pull atulsharma18/docker-assignment-web:latest
* docker run -d -p 8080:8080 atulsharma18/docker-assignment-web:latest





















