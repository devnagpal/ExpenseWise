# ExpenseWise

## Overview
ExpenseWise is a lightweight, console-based personal finance tracker and budget analyzer built entirely in Core Java. It allows users to track their incomes and expenses, categorize transactions, and view statistical reports to maintain healthy financial habits without the need for a complex database setup. Data is securely persisted locally using CSV files.

## Features
- **User Management**: Secure login and profile creation.
- **Transaction Tracking**: Add, view, and categorize incomes and expenses.
- **Budget Alerts**: Set a monthly budget and receive warnings if expenses exceed limits.
- **Analytics & Reporting**: View transaction history and expense breakdowns by category.
- **Data Persistence**: Automatic saving and loading of data using CSV files.

## Technologies Used
- **Language**: Core Java (JDK 8 or higher)
- **Storage**: File-based storage (CSV)
- **Architecture**: Object-Oriented Design (MVC pattern principles)

## Installation & Setup
1. Clone the repository:
   ```bash
   git clone <your-repo-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd ExpenseWise/src
   ```
3. Compile the Java files:
   ```bash
   javac ExpenseWiseApp.java
   ```
4. Run the application:
   ```bash
   java ExpenseWiseApp
   ```

## Testing
- Unit testing is performed on core logic (e.g., balance calculations and input validation).
- Functional testing is done via console input simulations.
