# Deployment notes

1. Build the jar

```sh
mvn clean package
```

2. Build the docker image

```sh
docker build -t charitybird2:latest .
```

3. Move the image to your server

(figure out how)

4. Run the image on the server

```sh
# stop and remove existing container
docker stop charitybird2
docker rm charitybird2
```

```sh
# run the new container
docker run --restart always --name charitybird2 -d -p 8080:8080 charitybird2
```

5. Check to see if it's running

```sh
docker ps
```

6. Check the logs

```sh
docker logs charitybird2 -f
```

7. SSH into the docker container

```sh
docker exec -it charitybird2 bash
```

8. If it's running, you can now access it at http://localhost:8080