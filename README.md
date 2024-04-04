# Merchant Guide to Galaxy

Este proyecto es una utilidad simple para convertir números romanos en números intergalácticos.

## Requisitos

- Java 8 o superior
- Maven (para compilar y ejecutar el proyecto)

## Uso

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/tu_usuario/merchant-guide-to-galaxy.git

2. Abre el proyecto en tu entorno de desarrollo preferido.

3. Ejecuta el siguiente comando en la terminal dentro del directorio del proyecto para compilar y ejecutar el proyecto:

   ```bash
   mvn clean compile exec:java -Dexec.mainClass=org.galaxy.MerchantGuideToGalaxy 

4. Proporciona un número romano como entrada cuando se solicite.

## Funcionalidades

Convierte números romanos en números intergalácticos.
Valida si un número es un número romano válido.

3. dentro del directorio del proyecto para compilar y ejecutar el proyecto:

   ```bash 
   String romanNumber = "XXIV";
   String intergalacticNumber = MerchantGuideToGalaxy.romanToIntergalactic(romanNumber);
   System.out.println("Número romano: " + romanNumber + ", Número intergaláctico: " + intergalacticNumber);

## Licencia
Este proyecto está bajo la licencia Apache 2.0
