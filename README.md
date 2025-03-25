# Vehicle Rental System

## Description

This is a simple Java program that calculates the rental fee for a vehicle based on its category and rental duration.  It provides a graphical user interface (GUI) built using AWT components.

## Prerequisites

*   **Java Development Kit (JDK):** You need to have the JDK installed on your system.  Version 8 or later is recommended. You can download it from [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html).
*   **Text Editor or IDE:**  You'll need a text editor (like Notepad++, Sublime Text, VS Code) or an Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or NetBeans to compile and run the code.

## How to Run

1.  **Save the Code:** Save the Java code as `VehicleRentalSystem.java`.

2.  **Compile the Code:** Open a command prompt or terminal and navigate to the directory where you saved `VehicleRentalSystem.java`.  Then, compile the code using the following command:

    ```bash
    javac VehicleRentalSystem.java
    ```

    This will create a `VehicleRentalSystem.class` file.

3.  **Run the Program:**  Execute the compiled program using the following command:

    ```bash
    java VehicleRentalSystem
    ```

    This will launch the GUI application.

## Usage

The GUI will appear with the following fields:

*   **Vehicle Registration Plate:** Enter the vehicle's registration plate number.
*   **Vehicle Category:** Select the vehicle category from the dropdown (Car, Motorcycle, Truck).
*   **Vehicle Model:** Enter the vehicle model.
*   **Rental Duration (days):** Enter the number of days for the rental.
*   **Submit:** Click the "Submit" button to calculate the rental fee.

The calculated rental fee will be displayed below the "Submit" button.

## Important Notes

*   **Error Handling:** The program currently has minimal error handling.  It assumes the user enters a valid integer for the rental duration.  In a production environment, you should add error handling to handle invalid input (e.g., non-numeric input for rental duration).
*   **GUI Framework:** This program uses AWT for the GUI.  AWT is an older GUI toolkit.  For more modern Java GUI development, consider using Swing or JavaFX.
*   **Rental Fee Calculation:** The rental fee calculation is hardcoded based on the vehicle category.  You can modify the `actionPerformed` method to implement more complex rental fee calculations.
*   **Window Closing:** The program exits when the window is closed.
