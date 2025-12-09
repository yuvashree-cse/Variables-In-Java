Java Variables Practice

This repository contains simple Java programs demonstrating different types of variables in Java: local, instance, and static variables. These programs are ideal for beginners to understand how variable types work and how they behave in different contexts.

🗂 Repository Structure
variables-in-java/
├── Datatypes.java        # Demonstrates Local Variables
├── EmployeeDetails.java  # Demonstrates Instance Variables
├── College.java          # Demonstrates Static Variables
└── README.md             # Project documentation

💻 Programs Overview
1. Datatypes.java – Local Variables

Concept: Local variables are declared inside a method or block and are accessible only within that method or block. They are created when the method is called and destroyed when the method ends.

What the program does:

Demonstrates taking user input for different variable types.

Performs simple operations like addition, subtraction, multiplication, division, and modulus.

Key takeaway: Local variables exist temporarily and cannot be accessed outside the method.

2. EmployeeDetails.java – Instance Variables

Concept: Instance variables are declared inside a class but outside any method. They belong to an object of the class, so each object has its own copy of instance variables.

What the program does:

Creates an EmployeeDetails class.

Initializes instance variables like employee name, ID, and salary.

Demonstrates how each object of the class can have unique values for these variables.

Key takeaway: Instance variables help store data specific to each object.

3. College.java – Static Variables

Concept: Static variables (also called class variables) are declared using the static keyword. They are shared among all objects of a class.

What the program does:

Demonstrates the use of static variables to store common information like college name or address.

Shows how changing a static variable affects all objects of the class.

Key takeaway: Static variables are shared across all objects and exist as long as the class is loaded.
