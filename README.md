# 🚀 Hybrid Test Automation Framework

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-green?style=for-the-badge)
![TestNG](https://img.shields.io/badge/TestNG-Framework-red?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge)
![Jenkins](https://img.shields.io/badge/Jenkins-CI/CD-darkred?style=for-the-badge)
![Docker](https://img.shields.io/badge/Docker-Containerization-2496ED?style=for-the-badge)

### Enterprise-Grade Hybrid Automation Framework using Selenium WebDriver, Java, TestNG, and Page Object Model (POM)

Designed for **scalability, maintainability, cross-browser testing, CI/CD integration, and data-driven automation**.

</div>

---

# 📌 Overview

This project is a robust **Hybrid Test Automation Framework** built using **Java, Selenium WebDriver, TestNG, Maven, and Page Object Model (POM)** architecture.

The framework follows automation best practices such as:

✅ Page Object Model (POM)

✅ Data-Driven Testing

✅ Reusable Components

✅ Cross-Browser Execution

✅ CI/CD Integration

✅ Docker Support

✅ Detailed Reporting

✅ Scalable Test Design

The goal of this framework is to reduce manual regression effort, improve release confidence, and accelerate software delivery through automated testing.

---

# 🏗 Framework Architecture

```text
Test Layer
    │
    ▼
Page Object Model (POM)
    │
    ▼
Utility Layer
(Waits, Drivers, Configs)
    │
    ▼
Selenium WebDriver
    │
    ▼
Browser Layer
(Chrome / Firefox / Edge)
```

---

# 🛠 Technology Stack

| Category         | Technology              |
| ---------------- | ----------------------- |
| Language         | Java                    |
| Automation Tool  | Selenium WebDriver      |
| Test Framework   | TestNG                  |
| Build Tool       | Maven                   |
| Design Pattern   | Page Object Model (POM) |
| Reporting        | Extent Reports / Allure |
| Logging          | Log4j                   |
| CI/CD            | Jenkins                 |
| Version Control  | Git                     |
| Repository       | GitHub                  |
| Containerization | Docker                  |
| Data Management  | Excel / CSV / JSON      |
| Browser Support  | Chrome, Firefox, Edge   |

---

# 📂 Project Structure

```text
automation-framework/
│
├── src
│   ├── main/java
│   │   ├── base
│   │   ├── pages
│   │   ├── utilities
│   │   ├── listeners
│   │   └── config
│   │
│   └── test/java
│       ├── tests
│       └── dataProviders
│
├── testdata
│
├── reports
│
├── screenshots
│
├── docker
│
├── pom.xml
│
└── testng.xml
```

---

# 🎯 Automated Test Coverage

| Module   | Test Scenarios                           |
| -------- | ---------------------------------------- |
| Login    | Valid Login, Invalid Login, Empty Fields |
| Search   | Product Search, Invalid Search           |
| Cart     | Add Item, Update Quantity, Remove Item   |
| Checkout | Address Validation, Payment Flow         |
| Logout   | Session Validation, Logout Verification  |

---

# 🔥 Key Features

### ✅ Page Object Model (POM)

* Centralized page locators
* Reusable page methods
* Easy maintenance

### ✅ Data-Driven Testing

* Excel-based test data
* TestNG DataProviders
* Multiple test scenarios with minimal code

### ✅ Cross-Browser Testing

* Chrome
* Firefox
* Edge

### ✅ Detailed Reporting

* Extent Reports
* Execution logs
* Screenshots on failure

### ✅ CI/CD Ready

* Jenkins integration
* Automated build triggers
* Scheduled executions

### ✅ Docker Support

* Consistent execution environment
* Containerized test runs
* Easy scaling

---

# 📊 Framework Benefits

| Metric                    | Improvement                |
| ------------------------- | -------------------------- |
| Regression Execution Time | Reduced significantly      |
| Manual Testing Effort     | Reduced through automation |
| Test Coverage             | Increased                  |
| Release Confidence        | Improved                   |
| Defect Detection          | Faster feedback cycle      |

---

# 📑 Sample Data-Driven Test Cases

| Username    | Password    | Expected Result  |
| ----------- | ----------- | ---------------- |
| validUser   | Password123 | Success          |
| validUser   | WrongPass   | Failure          |
| NULL        | Password123 | Validation Error |
| validUser   | NULL        | Validation Error |
| special@123 | ####        | Failure          |

---

# ⚙️ Getting Started

## Clone Repository

```bash
git clone https://github.com/your-username/automation-framework.git
```

```bash
cd automation-framework
```

---

## Install Dependencies

```bash
mvn clean install
```

---

## Run Complete Test Suite

```bash
mvn test
```

---

## Run Specific TestNG Suite

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

# 🐳 Docker Execution

## Build Docker Image

```bash
docker build -t automation-framework .
```

## Run Tests

```bash
docker run automation-framework
```

## Docker Compose

```bash
docker-compose up
```

---

# 🔄 CI/CD Workflow

```text
Developer Pushes Code
          │
          ▼
      GitHub
          │
          ▼
 Jenkins Webhook Trigger
          │
          ▼
      Build Stage
          │
          ▼
 Maven Test Execution
          │
          ▼
 Docker Test Execution
          │
          ▼
 Report Generation
          │
          ▼
 Email/Slack Notification
```

---

# 📸 Reporting

The framework automatically generates:

* Test Execution Reports
* Pass/Fail Statistics
* Execution Logs
* Failure Screenshots
* Historical Trends

---

# 🎨 Design Principles

## Page Object Model (POM)

Encapsulates web page elements and actions into reusable page classes.

## DRY (Don't Repeat Yourself)

Reduces duplicate code through utility classes and reusable methods.

## Separation of Concerns

Clearly separates:

* Test Logic
* Page Actions
* Utilities
* Test Data
* Reporting

This makes the framework highly maintainable and scalable.

QA Automation Engineer | Selenium | Java | TestNG | Jenkins | Docker

If you found this project useful, consider giving it a ⭐ on GitHub.
