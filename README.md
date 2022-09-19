# SPRING SIDECAR IMPLEMENTATION

**Build using Maven and Java 18.**

---

This is a simple implementation of a sidecar service using Spring Boot.

Used for updating the Sidecar JAR File for [ruby_eureka](https://github.com/GhaniyKie/ruby-eureka) gem.

## Usage

```bash
cd sidecar-service/target
java -jar sidecar-service-v2.1.jar

# Default options:
#  Sidecar Port (this service): 9090
#  Sidecar Name (this service): sidecar-service
#  Application Port: 3000
#  Instance ID: Sidecar Port
#  Eureka Server URL: http://localhost:8761/eureka

# Use this parameters to change the default options:
--sidecar-port (Sidecar Port)
--side-app-name (Sidecar Name)
--app-port (Application Port)
--instance-id (Instance ID)
--eureka-url (Eureka Server URL)
```

## Build

```bash
mvn clean package # or
mvn clean install
```

## Implementation with non-JVM languages

Please create endpoint to show the Application Health Status. The endpoint must be accessible from the Sidecar Service. Response must be in JSON format.

Endpoint URL: `/health.json`

```json
{
  "status": "UP"
}
```

---

**Contribution is always welcome!**

Please feel free to fork and improve this project. If you think it's good, just send me a pull request. Maybe you can create other implementation like web service, restart using post request, etc. I will be happy to see your contribution.