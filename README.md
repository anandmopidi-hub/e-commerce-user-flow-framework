# 🛒 E-Commerce User Flow Automation Framework

## 📌 Project Overview

This project is a **Selenium Automation Framework** built using **Java + TestNG + Maven** to automate end-to-end user flows of an e-commerce application (DemoBlaze).

The framework is designed using **Page Object Model (POM)** and includes reusable components like utilities, configuration handling, reporting, and test data management.

---

## 🚀 Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Reporting:** Extent Reports
* **Test Data:** Excel (Apache POI)

---

## 📁 Framework Structure

```text
e-commerce-user-flow-framework
│
├── src/test/java
│   ├── base
│   │   └── BaseTest.java              # WebDriver setup & teardown
│   │
│   ├── pages
│   │   ├── SignupPage.java
│   │   ├── LoginPage.java
│   │   ├── ProductPage.java
│   │   ├── CartPage.java
│   │   ├── ContactPage.java
│   │   └── AboutPage.java
│   │
│   ├── tests
│   │   └── EndToEndTest.java         # Main test flow
│   │
│   ├── utils
│   │   ├── ExtentManager.java
│   │   ├── TestListener.java
│   │   ├── ScreenshotUtil.java
│   │   └── ExcelUtil.java
│
├── src/test/resources
│   └── config.properties            # Configuration file (URL, credentials)
│
├── testdata
│   └── testdata.xlsx               # Excel test data
│
├── reports
│   └── AutomationReport.html       # Extent Report output
│
├── screenshots                     # Failure screenshots
│
├── pom.xml                         # Maven dependencies
├── testng.xml                      # TestNG suite file
```

---

## ⚙️ Key Features

* ✔ Page Object Model (POM) design
* ✔ Reusable utility classes
* ✔ Centralized configuration file
* ✔ Excel-based test data handling
* ✔ Extent Reports with screenshots
* ✔ TestNG Listener integration
* ✔ End-to-End automation flow

---

## 🧪 Test Scenarios Covered

* ✅ Verify Home Page
* ✅ User Signup
* ✅ User Login
* ✅ About Us (Video Handling)
* ✅ Contact Form Submission
* ✅ Product Selection & Add to Cart
* ✅ Cart Validation
* ✅ Place Order

---

## 📊 Reporting (Extent Reports)

* Interactive HTML report
* Pass / Fail / Skip status
* Screenshot capture on failure
* Error logs & stack traces
* Dashboard with charts

📍 Report Path:

```text
/reports/AutomationReport.html
```

---

## 📸 Screenshots

* Automatically captured on test failure
* Stored under:

```text
/screenshots/
```

---

## 📂 Configuration File

📍 Location:

```text
src/test/resources/config.properties
```

### Example:

```properties
url=https://www.demoblaze.com
username=testuser
password=test123
browser=chrome
```

---

## 📊 Test Data (Excel)

* External test data managed using Excel
* Handled via `ExcelUtil.java`

📍 Location:

```text
/testdata/testdata.xlsx
```

---

## ▶️ How to Run the Project

### 1. Clone Repository

```bash
git clone https://github.com/anandmopidi-hub/e-commerce-user-flow-framework.git
```

### 2. Navigate to Project

```bash
cd e-commerce-user-flow-framework
```

### 3. Run Tests

```bash
mvn clean test
```

---

## ⚠️ Known Issues

* Signup modal visibility issue (timing/synchronization)
* Chrome CDP warnings (non-blocking)

---

## 🔧 Future Enhancements

* 🔹 Data Driven Testing (JSON/CSV)
* 🔹 Parallel Execution
* 🔹 Cross Browser Testing
* 🔹 CI/CD Integration (Jenkins)
* 🔹 API Testing Integration

---

## 👨‍💻 Author

**Anand Mopidi**

---

## ⭐ Contribution

Contributions are welcome! Feel free to fork and enhance the framework.

---
