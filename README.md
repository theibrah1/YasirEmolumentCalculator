# Emolument Calculator

This Java project calculates the net salary of a staff member based on their basic salary, tax relief, and applicable deductions. 

## Features
- Calculate SSNIT contribution (3.5% of basic salary)
- Compute taxable income
- Calculate income tax with progressive tax rates
- Determine total deductions and net salary

## Classes
1. `Emolument`: Base class for basic salary and tax relief calculations.
2. `MyEmolument`: Inherits from `Emolument` and adds methods for income tax, total deductions, and net salary.
3. `TestProgram`: Main program to test the functionality.

## How to Run
1. Compile the classes using `javac`:
   ```bash
   javac Emolument.java MyEmolument.java TestProgram.java
