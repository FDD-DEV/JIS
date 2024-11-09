# Usa una imagen base alternativa para Maven y Java
FROM maven:3.8-openjdk-17 AS build

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo pom.xml y descarga las dependencias
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia todo el proyecto y construye el archivo JAR
COPY . .
RUN mvn clean package -DskipTests

# Usa una imagen de Java ligera para ejecutar la aplicación
FROM eclipse-temurin:17-jre

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo JAR desde la etapa de compilación
COPY --from=build /app/target/*.jar app.jar

# Expone el puerto en el que escucha tu aplicación (por ejemplo, 8080)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]