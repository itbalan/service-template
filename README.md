# service-template
Spring boot service template

Pre-requisites
--------------
1. Docker Engine installed and running
2. Docker Compose installed

Step1: Build project. It will create a jar file service-template-0.0.1-SNAPSHOT under ./target folder

Step2: Open command prompt and go to the directory where the 'Dockerfile" stored - Ex. C:/service-template

Step3: Run the command to build the docker image: docker build -t service-template:v1.0.0 .

1. It will build the image and stores it in local docker repo

2. Run the command docker images | grep service-template to check the docker image was built successfully 

Step4: Run the command to run the container: docker run -d --name service-template -p 9092:9092 service-template:v1.0.0

1. Run the command docker ps -a | grep service-template to check the container running 

Step5: Run the command to check the log: docker logs -f service-template



