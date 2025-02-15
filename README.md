# Java Design Patterns: Factory and Singleton

This repository contains simple Java examples demonstrating the Factory and Singleton design patterns.  These are intended for educational purposes and to provide a clear, concise understanding of these fundamental creational patterns.

## Patterns Included

*   **Factory Pattern:**  This pattern provides an interface for creating objects without specifying their concrete classes.  The examples show how to create different types of notifications (Email, SMS, Push) and shapes (Circle, Rectangle, Square) using a Factory.

*   **Singleton Pattern:**  This pattern ensures that a class has only one instance and provides a global point of access to it.  The examples demonstrate this with a simple Singleton class and a ConfigurationManager.

## Usage

Each pattern has its own package with a demo class containing a `main` method to run the example.

1.  **Clone the repository:**

    ```bash
    git clone [repository URL]
    ```

2.  **Navigate to the project directory:**

    ```bash
    cd [project directory]
    ```

3.  **Compile and run the examples (using a Java IDE like IntelliJ IDEA or Eclipse, or from the command line):**

    **Command line:**
    ```bash
    javac <package name>/<file name>.java
    java <package name>/<file name>
    ```

    **Example:**
    ```bash
    javac factorypatterndemoo/FactoryPatternDemoo.java
    java factorypatterndemoo/FactoryPatternDemoo
    ```
    or
    ```bash
    javac singletonpatterndemoo/SingletonPatternDemoo.java
    java singletonpatterndemoo/SingletonPatternDemoo
    ```

## Structure

*   `Factory_Pattern/`: Contains Factory Pattern implementation.
*   `Singleton_Pattern/`: Contains Singleton Pattern implementation.

## Contributing

Contributions are welcome!  If you find any issues or have suggestions for improvements, please feel free to open an issue.
