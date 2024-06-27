# Utiliser une image de base Java 11
FROM openjdk:24-slim
LABEL authors="Nassim"

# Variables d'environnement pour le nom de l'application et le port
ARG JAR_FILE=target/*.jar
ENV APP_PORT=8080

# Copier le fichier JAR de l'application dans le conteneur
COPY ${JAR_FILE} app.jar

# Exposer le port de l'application
EXPOSE ${APP_PORT}

# Commande pour démarrer l'application
ENTRYPOINT ["java","-jar","/app.jar"]