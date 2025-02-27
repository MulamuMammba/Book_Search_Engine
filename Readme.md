# Book Search Engine 

## Overview

This is a Java-based Library Management System that allows users to manage a collection of books. The system provides functionalities such as searching, sorting, viewing, and saving book data, ensuring ease of access and efficient management. This was my final project for a Coursera Data structures and algorithm course.

## Features

### 📖 Book Management
- Reads and parses book data from a file.
- Stores book details (Title, Author, Year) as Book objects.

### 🔍 Search Functionality
Users can search for books by:
- Title
- Author
- Publication Year

### 🔢 Sorting Options
Implements Bubble Sort to organize books by:
- Title (A-Z)
- Author (A-Z)
- Publication Year (Ascending/Descending)

### 📂 Data Persistence (Serialization)
- Saves the book list to a file.
- Reloads data when the program restarts.

### 📝 User Activity Logging
- Logs user actions such as:
  - Search queries
  - Sorting actions
- Helps with monitoring and debugging.

### 🖥️ Interactive Text-Based Menu
Users can:
- View book list
- Search for a book
- Sort books
- Exit the program

## How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/your-repo/library-management.git
    cd library-management
    ```

2. Open the project in IntelliJ IDEA or any Java IDE.

3. Run `Main.java`.

4. Follow the on-screen menu to interact with the system.
