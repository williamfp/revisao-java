# Projeto MongoDB com Spring Boot

## Objetivo
+ Compreender as principais diferenças entre paradigma orientado a documentos e relacional
+ Implementar operações de CRUD
+ Refletir sobre decisões de design para um banco de dados orientado a documentos
+ Implementar associações entre objetos
	+ Objetos aninhados
	+ Referências
+ Realizar consultas com Spring Data e MongoRepository

## Instalação MongoDB
+ Para a realização das tarefas envolvendo o banco de dados MongoDB será utilizada a imagem docker `mongo:4` disponibilizada através do [Docker Hub](https://hub.docker.com/_/mongo)
+ Comando utilizado para execução do container:
```console
docker run  --name mongodb-sb-dev --network host -d mongo:4
```