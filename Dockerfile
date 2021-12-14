FROM openjdk:8-jdk-alpine

#Criando usuario, grupo para rodar aplicação
RUN addgroup -S springdocker && adduser -S springdocker -G springdocker

#Utilizando user criado para rodar aplicação
USER springdocker:springdocker

#MAINTAINER Time Infra <ti.infraestrutura@fujioka.inf.br>

#Variavel recebendo nome arquivo
ARG JAR_FILE=*.jar

#Argumentos da JVM 
ENV JAVA_TOOL_OPTIONS ""

USER root
RUN apk update && apk add bash

#Copiando aplicação
COPY /target/${JAR_FILE} aplicacao.jar
#Execulçao da aplicação
ENTRYPOINT ["java","-jar","/aplicacao.jar"]

