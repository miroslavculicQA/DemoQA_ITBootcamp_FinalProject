# DemoQA

DemoQA offers a platform for testing a wide range of functionalities using the Selenium framework and Java.

This project serves as my personal practice in automating the testing of various functionalities on the DemoQA website, using the Page Object Model (POM) and Data-Driven Testing (DDT) methodologies.

## Dependencies
* Run on Windows 10 OS
* IDE for this project is IntelliJ Idea Community Eddtion 2023.3.3
* Mandatory Browser is Chrome

## Installation
Open terminal in IDE and git clone the repository

```
git clone https://github.com/miroslavculicQA/DemoQA_ITBootcamp_FinalProject.git

```

* Java version: 21.0.1
* Apache Maven 3.9.5

## Executing program
Run all tests from terminal with:

```
mvn test
```
Run specific class from terminal with (replace CLASS_NAME with test class name)
```
mvn test -Dtest="CLASS_NAME"
```

## Framework Walkthrough

Packages
* Base - Contains classes used through the app
* Pages - Contains classes for each page
* Tests - Contains test classes

Files
* pom.xml - Contains all dependencies used in the project (last updated: 4.2.2024.)
* TestData.xlsx - Excel file used to read data for DDT
* .gitignore - File used to store all items that are not published to Github
