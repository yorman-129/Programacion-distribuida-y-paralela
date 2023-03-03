@echo off
call mvn clean package
call docker build -t com.mycompany/Ecommerce .
call docker rm -f Ecommerce
call docker run -d -p 9080:9080 -p 9443:9443 --name Ecommerce com.mycompany/Ecommerce