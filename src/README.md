# Human Body System MVP

## How to Compile and Run
1. Open IntelliJ IDEA.
2. Select **File > Open** and choose this project folder.
3. Wait for the project environment and dependencies to sync.
4. Locate the main runner class (e.g., `src/Main.java`) in the project tree.
5. Right-click the file and select **Run 'Main.main()'**.

## Core OOP Concept References

### V1.0 Encapsulation
* **File:** `src/Organ.java`
* **Line:** Organ.java: 3-6, 15-45 
* **Description:** Instance variables such as `organName`, `systemType`, and `bodyLocation` are declared as private. They are accessed and modified using public getter and setter methods to protect and control data access.

### V2.0 Classes and Objects
* **File:** `src/Main.java`, `src/Organ.java`, `src/Heart.java`, `src/Lung.java`, `src/Brain.java`, `src/Kidney.java`
* **Line:** Main.java: 10-16
* **Description:** Classes are used to model real-world organs. Objects are created from the `Heart`, `Lung`, `Brain`, and `Kidney` classes and stored in an `ArrayList<Organ>` to represent a working system simulation.

### V3.0 Inheritance
* **File:** `src/Heart.java`, `src/Lung.java`, `src/Brain.java`, `src/Kidney.java`
* **Line:** Heart.java: 1, Lung.java: 1, Kidney.java: 1, Brain.java: 1
* **Description:** All organ classes use the `extends Organ` keyword to inherit shared properties and methods from the `Organ` superclass, demonstrating code reusability through inheritance.

### V4.0 Polymorphism
* **File:** `src/Main.java`, `src/Organ.java`, `src/Heart.java`, `src/Lung.java`, `src/Brain.java`, `src/Kidney.java`
* **Line:** Main.java: 37-40, 46-51, 57-60, 70-75, 89-103 Heart.java: 20-30 Lung.java: 19-28 Kidney.java: 18-27 Brain.java: 19-28
* **Description:** Method overriding is used where each organ class provides its own implementation of `performFunction()` and `displayInfo()`. Method overloading is shown in `displayInfo()` and `displayInfo(boolean detailed)`. Runtime polymorphism is demonstrated using an `ArrayList<Organ>` where superclass references call overridden methods dynamically.

## Compile-Time Polymorphism (Method Overloading)
* **File:** Organ.java
* **Location:** Organ.java: 47-62
* **Description:** Compile-time polymorphism is demonstrated through method overloading. The Organ class contains two methods with the same name (displayInfo) but different parameter lists. The compiler determines which version of the method to call based on the arguments provided.

## Runtime Polymorphism (Method Overriding)
* **Files:** `src/Heart.java`, `src/Lung.java`, `src/Kidney.java`, `src/Brain.java`
* **Location:** Heart.java: 20-29, Lung.java: 19-28, Kidney.java: 18-27, Brain.java: 19-28
* **Description:** Runtime polymorphism is demonstrated through method overriding. Each subclass provides its own implementation of performFunction() and displayInfo(). When these methods are called, Java determines at runtime which version of the method should execute.

## Superclass References
* **File:** `src/Main.java`
* **Location:** Main.java: 8, 36-39, 5-50, 56-59, 69-77
* **Description:** Objects of different subclasses (Heart, Lung, Kidney, and Brain) are stored using superclass references (Organ). When methods such as performFunction() and displayInfo() are called, the correct subclass implementation is executed dynamically, demonstrating runtime polymorphism.Organ.java.

