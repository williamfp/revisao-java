# Revisão JDBC

## Objetivo
+ Revisar os conhecimentos existentes sobre JDBC

## Instalação MySQL
+ Para a realização das tarefas envolvendo o banco de dados MySQL será utilizada a imagem docker `mysql:8` disponibilizada através do [Docker Hub](https://hub.docker.com/_/mysql)
+ Comando utilizado para execução do container:
```console
docker run -d -p 3306:3306 --name jdbc-review-db \
-e MYSQL_ROOT_PASSWORD=1234567 \
-e MYSQL_USER=developer \
-e MYSQL_PASSWORD=1234567 \
-e MYSQL_DATABASE=coursejdbc \
mysql:8
```