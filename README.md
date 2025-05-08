# Device Manager Java

A sample Java application that registers devices to Azure IoT Hub and stores device info in Azure Cosmos DB. Designed for Azure App Service.

## Features
- Device registration in Azure IoT Hub
- Save device metadata in Azure Cosmos DB
- Ready for Azure App Service deployment

##  Prerequisites
- Azure IoT Hub connection string
- Azure Cosmos DB endpoint and key
- Java 11+ and Maven installed

## Run Locally

mvn clean compile exec:java -Dexec.mainClass="com.rifaya.DeviceManager"
