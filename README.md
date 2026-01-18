Azure-Integrated Task Management System (Full-Stack)

A production-ready Full-Stack application built with Java (Spring Boot 3) and React, architected specifically for the Azure Ecosystem. This project demonstrates modern "Service Ownership," where the developer manages both the application code and the cloud infrastructure.
 Key Features & Azure Integration

    Spring Cloud Azure: Utilizes Spring Cloud Azure starters for seamless integration with cloud services.

    Identity & Security: Implements Azure Managed Identity to eliminate hardcoded credentials. All secrets are retrieved at runtime via Azure Key Vault.

    Data Persistence: Uses Spring Data JPA connected to an Azure SQL Database with connection pooling.

    Cloud Observability: Integrated with Azure Application Insights for distributed tracing and performance monitoring.

    Automated DevOps: Includes a GitHub Actions pipeline for automated containerization and deployment to Azure App Service.

 Technical Stack

    Backend: Java 17+, Spring Boot 3.x, Hibernate, Maven.

    Frontend: React.js, Tailwind CSS (hosted on Azure Static Web Apps).

    Cloud: Azure App Service, Azure SQL, Azure Key Vault, Azure Container Registry (ACR).

 Architecture

    Frontend: A React SPA sends requests to the Spring Boot REST API.

    Security: The API authenticates via Entra ID (formerly Azure AD).

    Secrets: On startup, Spring Boot connects to Azure Key Vault using the system-assigned Managed Identity to fetch the database password.

    Database: Tasks are stored in Azure SQL, accessible only through a Virtual Network (VNet) for security.

 Configuration (Cloud-Native)

Instead of a sensitive application.properties file, this project uses Externalized Configuration:
Properties

# Managed by Azure App Service Environment Variables
spring.datasource.url=${AZURE_SQL_CONNECTION_STRING}
spring.cloud.azure.keyvault.secret.endpoint=${KEYVAULT_ENDPOINT}

# Actuator for Azure Health Checks
management.endpoints.web.exposure.include=health,info,prometheus
 
Getting Started
Prerequisites

    Azure CLI

    JDK 17 or 21

    Maven

# Login to Azure
az login

# Create a Resource Group
az group create --name MyTaskAppRG --location eastus

# Deploy the Spring Boot JAR to App Service
az webapp up --runtime "JAVA:17-java17" --sku B1 --name my-task-manager-api