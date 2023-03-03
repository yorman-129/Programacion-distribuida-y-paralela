#!/bin/sh
mvn clean package && docker build -t com.mycompany/Ecommerce .
docker rm -f Ecommerce || true && docker run -d -p 9080:9080 -p 9443:9443 --name Ecommerce com.mycompany/Ecommerce