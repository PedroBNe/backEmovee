# Usar uma imagem base do OpenJDK 23 (ou outra versão que suporte Java 23)
FROM openjdk:23-jdk-slim

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo JAR gerado para o contêiner (ajuste o nome do arquivo aqui)
COPY build/libs/LandingPage-0.0.1-SNAPSHOT.jar app.jar

# Define a variável de ambiente para o Spring Boot usar o profile "prod"
ENV SPRING_PROFILES_ACTIVE=prod

# Expor a porta 8080
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
