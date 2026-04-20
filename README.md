# 🛒 End-to-End Automation Testing of SauceDemo using Selenium & TestNG

## 📌 Project Overview

This project is a test automation framework developed using Selenium WebDriver and TestNG to automate the SauceDemo web application. It simulates real user behavior and validates critical functionalities such as login, product selection, cart management, and checkout process.

The framework follows industry-standard practices like Page Object Model (POM) to ensure scalability, maintainability, and reusability of test code.

---

## 🎯 Objectives

* Automate complete user workflow from login to checkout
* Validate application behavior under multiple test scenarios
* Ensure reliable execution using proper synchronization
* Generate reports for test execution analysis

---

## 🧰 Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Tool:** Maven

---

## 📂 Project Structure

```
src/test/java/
   ├── base/          → WebDriver setup and configuration
   ├── pages/         → Page Object Model classes
   ├── tests/         → Test scripts
   ├── utils/         → Utilities (DataProvider, helpers)
```

---

## 🔥 Key Features

* ✅ End-to-End automation of SauceDemo workflows
* ✅ Page Object Model (POM) implementation
* ✅ Data-driven testing using TestNG DataProvider
* ✅ Multiple test scenarios (valid & invalid login)
* ✅ Reusable and modular test design
* ✅ TestNG report generation

---

## 🧪 Test Scenarios Covered

1. Login with valid credentials
2. Login with invalid credentials
3. Add product to cart
4. Navigate to cart and validate items
5. Complete checkout process
6. Validate successful order placement

---

## 📊 Test Execution

* Tests are executed using TestNG framework
* DataProvider enables execution with multiple input sets
* Assertions validate expected outcomes

---

## 📁 Test Reports

TestNG automatically generates execution reports after running the tests.

📍 Location:

```
test-output/index.html
```

The report includes:

* Test execution summary
* Passed/Failed test cases
* Execution time
* Detailed logs

---

## ▶️ How to Run the Project

1. Clone the repository:

```
git clone https://github.com/Nitish7534/saucedemo-automation-testing.git
```

2. Open the project in Eclipse or IntelliJ

3. Update Maven dependencies:

```
Right click project → Maven → Update Project
```

4. Run the test:

* Right click `testng.xml`
* Click **Run As → TestNG Suite**

---

## 💡 Key Highlights

* Implemented Page Object Model for structured test design
* Automated real-world e-commerce scenarios
* Used TestNG for efficient test execution and reporting
* Designed reusable and maintainable automation framework

---

## 🚀 Future Enhancements

* Add screenshot capture on test failure
* Integrate Extent Reports for advanced reporting
* Implement cross-browser testing
* Integrate CI/CD (Jenkins or GitHub Actions)

---

## 👨‍💻 Author

**Nitish**
