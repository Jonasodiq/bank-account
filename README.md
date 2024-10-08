# Bank Account Management System

This project contains a simple implementation of a `Bank Account` class that represents a bank account. The class includes functions to set and get the account holder's name, set and get the account balance, and methods for deposits, withdrawals, and transfers.

## Features

- **Instance Variables**:
  - `name`: The account holder's name.
  - `balance`: The account balance.

- **Constructors**:
  - `Account()`: Sets `balance` to 0.
  - `Account(String name)`: Sets `name` and `balance` to 0.
  - `Account(double balance)`: Sets `balance` and `name` to an empty string.
  - `Account(String name, double balance)`: Sets both `name` and `balance`.

- **Methods**:
  - `deposit(double amount)`: Increases the balance by the specified amount.
  - `withdraw(double amount)`: Decreases the balance by the specified amount if sufficient funds are available.
  - `transferAmount(Account toAccount, double amount)`: Transfers the specified amount to another account if sufficient funds are available.
  - `getName()`: Returns the account holder's name.
  - `setName(String name)`: Sets the account holder's name.
  - `getBalance()`: Returns the account balance.
  - `toString()`: Returns a string with the account holder's name and balance.

## Usage

### Creating an Account

```Java
Account savingsAccount = new Account();
Account checkingAccount = new Account("Bob");
Account businessAccount = new Account("Charlie", 1500);
```
# Deposits and Withdrawals
```Java
savingsAccount.deposit(1000);
checkingAccount.withdraw(200);
```
# Transfers
```Java
savingsAccount.transferAmount(checkingAccount, 200);
```
# The output menu
```Java
1. Deposit
2. Withdraw
3. Transfer
4. Show Balance
5. Exit

Choose an option:
```
# Author

    Jonas N

# License

- This project is licensed under the MIT License - see the LICENSE file for details.
```

This `README.md` file provides an overview of the project, describes the features of the `Account` class, and shows examples of how the class can be used.
You can customize it further to suit your needs. 😊