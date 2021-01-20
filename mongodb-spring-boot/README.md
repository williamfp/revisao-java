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

## Neste projeto foram utilizados
![Spring boot](https://img.shields.io/badge/Spring_boot-%236DB33F.svg?&style=flat-square&logo=spring&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/Apache_Tomcat%20-%23F8DC75.svg?&style=flat-square&logo=Apache%20Tomcat&logoColor=black)
![Apache Maven](https://img.shields.io/badge/Apache_Maven%20-%23C71A36.svg?&style=flat-square&logo=Apache%20Maven&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB%20-%2347A248.svg?&style=flat-square&logo=MongoDB&logoColor=white)
![Docker](https://img.shields.io/badge/Docker_&_Docker_compose%20-%232496ED.svg?&style=flat-square&logo=Docker&logoColor=white)
![Postman](https://img.shields.io/badge/Postman%20-%23FF6C37.svg?&style=flat-square&logo=Postman&logoColor=white)