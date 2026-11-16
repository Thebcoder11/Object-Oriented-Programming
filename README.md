# ☕ Java Object-Oriented Programming (OOP) System

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigm-OOP-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active%20Learning-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-orange?style=for-the-badge)
![GitHub repo size](https://img.shields.io/github/repo-size/Thebcoder11/Object-Oriented-Programming?style=for-the-badge&color=informational)

<p align="center">
  <b>A comprehensive, structured, and practical collection of Object-Oriented Programming (OOP) concepts in Java.</b>
  <br />
  From core fundamentals to advanced modern Java paradigms — accompanied by clean, well-commented, real-world source code examples.
</p>

[Explore Topics](#-core-modules--topics) •
[Project Structure](#-project-structure) •
[Getting Started](#-getting-started) •
[OOP Pillars Covered](#-the-four-pillars-of-oop)

</div>

---

## 📌 Overview

This repository is a curated, hands-on repository dedicated to mastering **Object-Oriented Programming (OOP) in Java**. It is architected into modular directories, each thoroughly illustrating key object-oriented concepts, language mechanics, type safety, and memory behavior.

Whether you are preparing for technical interviews, revising core Java fundamentals, or looking for clean reference implementations, this repository serves as an end-to-end guide.

---

## 🏛️ The Four Pillars of OOP

```
                   ┌─────────────────────────────────────────┐
                   │    Object-Oriented Programming (OOP)   │
                   └────────────────────┬────────────────────┘
                                        │
         ┌──────────────────┬───────────┴───────────┬──────────────────┐
         ▼                  ▼                       ▼                  ▼
  ┌──────────────┐   ┌──────────────┐        ┌──────────────┐   ┌──────────────┐
  │ Encapsulation│   │ Inheritance  │        │ Polymorphism │   │ Abstraction  │
  │ Data hiding  │   │ Code reuse & │        │ Static &     │   │ Hiding the   │
  │  & getters / │   │ hierarchical │        │ Dynamic      │   │ internal     │
  │   setters    │   │ relationships│        │ method calls │   │  complexity  │
  └──────────────┘   └──────────────┘        └──────────────┘   └──────────────┘
```

---

## 📚 Core Modules & Topics

### 1. 🧱 Java Basics & Foundations (`BASIC/`)
Fundamental Java mechanics that support object-oriented design:
- **Constructors**: Default, no-arg, and parameterized constructors for object state initialization.
- **`static` Keyword**:
  - `Static Variables`: Class-level attributes shared across all instances (e.g., instance counters).
  - `Static Methods`: Utility and factory methods operating independently of instance state.
  - `Static Blocks`: Static initialization blocks executed once when the class is loaded into the JVM.
- **`final` Keyword**:
  - Final variables (constants / immutable values).
  - Final methods (preventing method overriding).
  - Final classes (preventing inheritance).
- **Instance Variable Initialization**: Variable initialization sequences and instance initialization logic.

### 2. 🔐 Encapsulation & `this` Keyword (`ENCAPSULATION/`)
- **Data Hiding**: Protecting object state through private variables and providing controlled access via public getters and setters.
- **The `this` Keyword**:
  - Differentiating instance variables from shadowed parameters.
  - Invoking current class methods explicitly.
  - Constructor chaining using `this(...)` to reduce code duplication.

### 3. 🧬 Inheritance & `super` Keyword (`INHERITANCE/`)
- **Inheritance Models**:
  - `Single Inheritance`: Direct parent-child subclassing.
  - `Multilevel Inheritance`: Chained subclassing across multiple levels.
  - `Hierarchical Inheritance`: Multiple subclasses inheriting from a shared base class.
- **The `super` Keyword**:
  - Accessing hidden parent class attributes.
  - Invoking overridden parent class methods.
  - Calling parent class constructors via `super(...)`.

### 4. 🎭 Polymorphism (`POLYMORPHISM/`)
- **Compile-Time Polymorphism (Method Overloading)**:
  - Overloading by parameter count, differing data types, and order.
  - Type promotion mechanics in Java (`int` $\to$ `long` $\to$ `float` $\to$ `double`).
  - Overloading resolution involving `String` vs `StringBuffer` vs `Object`.
- **Runtime Polymorphism (Method Overriding)**:
  - Dynamic method dispatch resolved at runtime based on the object instance.
  - Method signature matching rules, covariant return types, and access privilege constraints.

### 5. 🛡️ Abstraction (`ABSTRACTION/`)
- **Abstract Classes & Methods**:
  - Declaring contracts using the `abstract` keyword.
  - Enforcing implementation details in concrete child classes while sharing common logic.

### 6. 🔌 Interfaces (`INTERFACESS/`)
- Full abstraction contracts using the `interface` keyword.
- Achieving **Multiple Inheritance** of type in Java.
- Utilizing Java 8+ **default methods** and **static methods** inside interfaces.

### 7. ⚠️ Exception Handling (`EXCEPTION HANDLING/`)
- Robust error management using `try`, `catch`, and `finally` blocks.
- Multiple catch blocks, nested try-catch structures, and exception propagation along the call stack.
- Distinguishing between **Checked Exceptions** and **Unchecked Exceptions (Runtime)**.
- Difference between `throw` (explicit trigger) and `throws` (method declaration).
- **Custom User-Defined Exceptions**: Extending `RuntimeException` and `Exception` for business domain validation (e.g. `YoungerAgeException`).

### 8. 📦 Packages & Modularity (`bhavya/`, Root)
- Declaring and structuring custom user-defined packages (`package bhavya;`).
- Compiling, importing (`import bhavya.*;`), and utilizing custom package members across standalone driver classes (`Aaryash.java`, `nisha.java`).

### 9. 🧬 Generics & Wrapper Classes (`GENERICS/`)
- **Generics**: Type-safe programming eliminating runtime `ClassCastException`.
  - Generic classes with single and multiple type parameters (`<T>`, `<T, V>`).
  - Generic methods and static generic methods.
  - Bounded type parameters (`<T extends Number>`).
- **Wrapper Classes**: Primitive encapsulation, Autoboxing, and Auto-unboxing (`int` $\leftrightarrow$ `Integer`).

### 10. 🔤 String Mechanics (`STRING/`)
- Memory management: **String Constant Pool (SCP)** vs Heap allocation.
- In-depth comparison: **`String`** (Immutable) vs **`StringBuffer`** (Thread-safe mutable) vs **`StringBuilder`** (High-performance mutable).
- Practical algorithms:
  - Palindrome verification.
  - Maximum occurring character frequency analysis.
  - Substring searching, replacement, and custom string operations.

### 11. λ Lambda Expressions & Functional Interfaces (`Lambdass/`)
- Introduction to functional paradigms introduced in Java 8.
- Declaring single abstract method (SAM) interfaces with `@FunctionalInterface`.
- Concise lambda syntax `(...) -> { ... }`.
- Default methods in functional interfaces and inheritance behaviors.

### 12. 🧵 Multithreading (`MULTITHREADING/`)
- Structured package ready for concurrency implementations (extending `Thread`, implementing `Runnable`, lifecycle management, and synchronization).

---

## 📂 Project Structure

```text
OOP System/
│
├── .gitignore                          # Standard Java & IDE ignore rules
├── README.md                           # Documentation & study guide
│
├── Aaryash.java                        # Package consumer driver class
├── nisha.java                          # Package consumer driver class
│
├── ABSTRACTION/                        # Abstract classes and methods
│   ├── bike.java
│   └── Naina.java
│
├── BASIC/                              # Language fundamentals
│   ├── Animal.java
│   ├── Animals.java
│   ├── Constructor/                    # Default & Parameterized constructors
│   │   ├── Employee.java
│   │   ├── Student.java
│   │   └── Test.java
│   ├── Final Keyword/                  # Final variables, methods, and classes
│   │   ├── History.java
│   │   ├── Math.java
│   │   └── Science.java
│   ├── Instance Varible Initialization/# Instance variable life cycle
│   │   ├── Bird.java
│   │   └── Birds.java
│   └── Static Keyword/                 # Static blocks, methods, and variables
│       ├── Static Block/Test.java
│       ├── Static Method/Dileep.java
│       └── Static Variable/Counter.java, Employee.java, Test.java
│
├── bhavya/                             # Custom user-defined package
│   ├── myclass.java
│   └── rahul.java
│
├── ENCAPSULATION/                      # Data hiding & getters/setters
│   ├── Company.java
│   ├── Test.java
│   └── THIS_KEYWORD/                   # Comprehensive 'this' use cases
│       ├── Aaryash.java, Animal.java, Bird.java
│       └── Rahul.java, Student.java, Vehicle.java
│
├── EXCEPTION HANDLING/                 # Robust error handling & custom exceptions
│   ├── Aarya.java, Adhya.java, Anant.java, Flow.java
│   ├── Methodp.java, Print.java, ReadWrite.java
│   └── Voting.java                     # Custom YoungerAgeException demo
│
├── GENERICS/                           # Type parameters & wrapper classes
│   ├── boundgen.java                   # Bounded type parameters
│   ├── gen.java, twogen.java           # Generic classes
│   ├── genmethod.java                  # Generic methods
│   ├── staticgenmethod.java            # Static generic methods
│   └── Wrapper/autounb.java            # Autoboxing & Unboxing
│
├── INHERITANCE/                        # Hierarchies and 'super' keyword
│   ├── Heirarchial Inheritance/Rahul.java
│   ├── Multilevel Inheritance/Aarya.java
│   ├── Single Inheritance/Aaryash.java, Nisha.java
│   └── Super Keyword/                  # Super constructor, methods, variables
│       ├── Anvi.java, Avika.java, Kashya.java
│       └── Khushi.java, Varista.java
│
├── INTERFACESS/                        # Interface contracts & multiple inheritance
│   ├── Brown.java
│   └── Devansh.java
│
├── Lambdass/                           # Java 8 Functional programming
│   ├── defmethod.java, deffmethod.java
│   ├── funinterface.java               # Functional interface syntax
│   ├── inherfuninterface.java
│   └── lamfun.java                     # Lambda expressions
│
├── MULTITHREADING/                     # Concurrency & thread lifecycle
│
├── POLYMORPHISM/                       # Overloading & Overriding
│   ├── Overloading/                    # Compile-time polymorphism
│   │   ├── Economics.java, English.java, History.java
│   │   └── Math.java, Science.java, Strbuf.java
│   └── Overriding/                     # Runtime dynamic dispatch
│       ├── Adhvik.java, Adhya.java, Kartik.java
│       └── Muzaffarnagar.java, Pranav.java, Shruti.java
│
└── STRING/                             # String immutability & utility algorithms
    ├── MaximumOccChar.java             # Character frequency calculation
    ├── Pallindrome.java                # Palindrome verification
    ├── PriyaCase.java, replace.java
    ├── searching.java, stringadd.java
    ├── Stringbuf.java                  # StringBuffer operations
    └── stringbul.java                  # StringBuilder operations
```

---

## 🚀 Getting Started

### Prerequisites
- **Java Development Kit (JDK 8 or higher)** installed on your machine.
- Verify your installation:
  ```bash
  java -version
  javac -version
  ```

### Cloning the Repository
```bash
git clone https://github.com/Thebcoder11/Object-Oriented-Programming.git
cd Object-Oriented-Programming
```

### Compiling and Running Examples

#### 1. Running a Standard Java Class:
Navigate to the directory of interest and run:
```bash
# Example: Running Palindrome verification
javac STRING/Pallindrome.java
java STRING.Pallindrome
```

#### 2. Running Code with User-Defined Packages:
From the root directory:
```bash
# Compile the custom package first
javac bhavya/*.java

# Compile and run the consumer program
javac Aaryash.java
java Aaryash
```

---

## 💡 Key Design Highlights

- **Pure Java**: Zero third-party dependencies — built purely on the core Java Standard Library (`java.lang`, `java.util`, `java.io`).
- **Clean Structure**: Every concept is isolated in its own folder to facilitate focused revision.
- **Real-World Patterns**: Covers both theoretical academic scenarios and industry-standard best practices (e.g., custom runtime exceptions, defensive encapsulation, constructor chaining).

---

## 👤 Author

**Bhavya**
- GitHub: [@Thebcoder11](https://github.com/Thebcoder11)

---

## 📄 License

This repository is licensed under the [MIT License](LICENSE). Feel free to use the code examples for learning, university coursework, or technical interview preparation.
