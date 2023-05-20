all: clean

clean:
	mvn clean

compile:
	mvn compile

run: compile
	mvn spring-boot:run

build:
	mvn package

run-jar: build
	java -jar target/spring-cashier-1.0.jar

# Docker

docker-build: build
	docker build --platform=linux/amd64 -t spring-cashier .
	docker images

docker-run: docker-build
	docker run --platform=linux/amd64 --name spring-cashier -td -p 80:8080 spring-cashier	
	docker ps

docker-clean:
	docker stop spring-cashier
	docker rm spring-cashier
	docker rmi spring-cashier


# Compose

network-ls:
	docker network ls 

network-create:
	docker network create --driver bridge ${network}

network-prune:
	docker network prune

compose-up:
	docker-compose up --scale gumball=2 -d

compose-down:
	docker-compose down 	

lb-stats:
	echo "user = admin | password = admin"
	open http://localhost:1936

lb-test:
	open http://localhost



