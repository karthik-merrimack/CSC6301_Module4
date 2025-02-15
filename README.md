# SortedLinkedList

## Overview
This Java program reads a series of integers from user input, stores them in a **LinkedList**, sorts them in ascending order, and then prints the sorted list. The program stops reading input when a non-integer is encountered.

## Features
- Utilizes **LinkedList** from the Java Collections Framework for dynamic data storage.
- Uses **Scanner** for efficient input handling.
- Implements **Collections.sort()** for sorting instead of a custom algorithm.
- Handles non-integer inputs gracefully, stopping input collection when a non-integer is entered.

## How It Works
1. The user enters a series of integers separated by spaces.
2. The program reads and stores the integers in a **LinkedList**.
3. Sorting is performed using **Collections.sort()**.
4. The sorted list is displayed in the console.
5. Input collection stops when a non-integer is entered.

## Sample Input and Output
### Example 1:
**Input:**  
5 3 8 1 2 a

**Output:**  
Sorted list: 1 2 3 5 8


### Example 2:
**Input:**  
10 20 5 15 stop

**Output:**  
Sorted list: 5 10 15 20


## Prerequisites
- Java Development Kit (JDK) installed.
- Basic knowledge of Java.

## How to Compile and Run
1. **Compile the Java program**  
javac SortedLinkedList.java

2. **Run the program**  
java SortedLinkedList


## Technologies Used
- **Java**
- **Java Collections Framework**
- **Scanner for input handling**
