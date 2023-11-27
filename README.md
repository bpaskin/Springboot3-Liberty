# Springboot3 running on Liberty

This is a simple example of a Springboot 3.x application running on Liberty

---

### NOTE: Requires Java 17.

1. create a Liberty server (wlp is the home of Liberty)
```
wlp/bin/server create sb3
```
2. create the proper dropins directory
```
mkdir -p wlp/usr/servers/sb3/dropins/spring
```
3. compile the application
```
mvn clean package
```
4. copy the compiled application to the Liberty dropins
```
cp target/SB3Example-1.0.0.jar wlp/usr/servers/sb3/dropins/spring/
``
5. Copy the server.xml to server directory
```
cp liberty/server.xml wlp/usr/server/sb3/
```
6. start the application server
```
wlp/bin/server start sb3
```
7. in a browser go to [http://localhost:9080/swagger-ui/index.html](http://localhost:9080/swagger-ui/index.html)
