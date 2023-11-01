User Documentation for Library Management System

1. Introduction

The Library Management System is a Java application designed to help librarians manage books, authors, and patrons efficiently. This documentation provides an overview of the application's functionality, explains the main classes, and guides you on how to access and use the system.

2. Functionality

The Library Management System offers the following key features:

    Book Management:
        Add new books to the library.
        Edit existing book information.
        Delete books from the library.
        Track book details such as title, author, ISBN, publisher, and the number of copies available.

    Author Management:
        Add new authors to the system.
        Edit author information.
        Delete authors from the system.
        Keep author details, including name, date of birth, and the list of books they have written.

    Patron Management:
        Add new patrons to the system.
        Edit patron information.
        Delete patrons from the system.
        Maintain patron information like name, address, phone number, and the list of borrowed books.

    Book Borrowing:
        Allow patrons to search for books by title, author, or ISBN.
        Borrow specific copies of books.
        Display a message if a book is not available.

    Book Returning:
        Enable patrons to return borrowed books.

3. Class Descriptions

The Library Management System consists of the following main classes:

    Book: Represents a book with properties like title, author, ISBN, publisher, and the number of copies. Implements the Borrowable interface.

    Author: Represents an author with properties such as name, date of birth, and a list of books they have written.

    Patron: Represents a patron with properties like name, address, phone number, and a list of borrowed books.

    Library: Manages books, authors, and patrons. Provides methods for managing the library, book borrowing, book returning, and book searching.

    Borrowable (Interface): Defines methods to borrow and return books. The Book class implements this interface.

    Status (Enum): Represents the status of a book, including values like AVAILABLE, CHECKED_OUT, and OVERDUE.

4. How to Access the System

To access and run the Library Management System:

    Clone or download the project from the repository (if available).

    Compile the Java files using a Java compiler or integrated development environment (IDE) of your choice.

    Run the MainLibraryTest class, which is a sample main class for testing the system's features.
