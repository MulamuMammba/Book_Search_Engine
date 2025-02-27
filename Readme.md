Library Management System

Overview

This is a Java-based Library Management System that allows users to manage a collection of books. The system provides functionalities such as searching, sorting, viewing, and saving book data, ensuring ease of access and efficient management.

Features

📖 Book Management

Reads and parses book data from a file.

Stores book details (Title, Author, Year) as Book objects.


🔍 Search Functionality

Users can search for books by:

Title

Author

Publication Year



🔢 Sorting Options

Implements Bubble Sort to organize books by:

Title (A-Z)

Author (A-Z)

Publication Year (Ascending/Descending)



📂 Data Persistence (Serialization)

Saves the book list to a file.

Reloads data when the program restarts.


📝 User Activity Logging

Logs user actions such as:

Search queries

Sorting actions


Helps with monitoring and debugging.


🖥️ Interactive Text-Based Menu

Users can:

View book list

Search for a book

Sort books

Exit the program



Project Structure

📂 src  
 ├── 📄 Main.java                 # Entry point of the application  
 ├── 📄 Book.java                 # Book class (title, author, year)  
 ├── 📄 Library.java              # Manages the book collection  
 ├── 📄 SortUtil.java             # Sorting algorithms  
 ├── 📄 LibraryMenu.java          # Handles user interactions  
 ├── 📄 UserInteractionLogger.java # Logs user activities  
 ├── 📄 LibrarySerializer.java    # Handles data serialization

How to Run

1. Clone the repository:

git clone https://github.com/your-repo/library-management.git
cd library-management


2. Open the project in IntelliJ IDEA or any Java IDE.


3. Run Main.java.


4. Follow the on-screen menu to interact with the system.





