# Project Statement: ExpenseWise

## Problem Statement
Many individuals, especially students and young professionals, struggle to keep track of their daily expenses and adhere to a monthly budget. Existing personal finance applications are often overly complex, require internet connectivity, or force users to link their bank accounts. There is a need for a simple, fast, and offline tool to manually track expenses and analyze spending habits.

## Scope of the Project
ExpenseWise is designed as a standalone, console-based desktop application. The scope is limited to:
- Single-device execution with local file-based storage (CSV).
- User authentication (login/registration).
- Basic CRUD operations for financial transactions.
- Generation of simple text-based analytical reports.
It does not include web/cloud syncing, multi-user simultaneous access, or direct banking API integrations.

## Target Users
- **Students**: To track pocket money and daily expenditures (food, transport, books).
- **Young Professionals**: To monitor monthly salaries against living costs.
- **Budget-Conscious Individuals**: Anyone seeking a simple, offline way to monitor their finances without complex software.

## High-Level Features
1. **User Profile Creation**: Setup an account with a starting balance and a monthly spending limit.
2. **Transaction Logging**: Record income and expenses with predefined categories (e.g., Food, Rent, Utilities, Entertainment, Salary).
3. **Data Persistence**: Automatically save all transactions to a local `.csv` file ensuring no data loss between sessions.
4. **Summary Reports**: Generate monthly summaries showing total income, total expenses, and remaining budget.
5. **Input Validation**: Robust error handling to prevent application crashes from invalid user inputs.
