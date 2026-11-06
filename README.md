# Java Core Concepts, Data Structures & Algorithms Repository

Welcome to the **Java Fundamental Concepts & Data Structures** repository. This project contains a structured collection of well-documented Java programs covering Core Object-Oriented Programming (OOP) principles, Custom Data Structure implementations, Exception Handling, Algorithms, Matrix Pattern printing, and the Java Collections Framework.

---

## 📁 Repository Structure & Modules

All source files are located under the [`src/EC`](src/EC) package. Below is a categorized directory of modules:

### 1. 🏗️ Object-Oriented Programming (OOP) & Inheritance
- [`Account.java`](src/EC/Account.java): Base bank account class demonstrating encapsulation, getters/setters, and methods.
- [`Loan.java`](src/EC/Loan.java): Extends `Account` demonstrating **Single Level Inheritance** and `super()` constructor chaining.
- [`HomeLoan.java`](src/EC/HomeLoan.java): Extends `Loan` demonstrating **Multilevel Inheritance** (`Account` -> `Loan` -> `HomeLoan`).
- [`Student.java`](src/EC/Student.java) & [`StudentUser.java`](src/EC/StudentUser.java): Encapsulated bean model and driver application.
- [`Encapsulation.java`](src/EC/Encapsulation.java): Standalone encapsulation getter/setter demonstration.
- [`constructor.java`](src/EC/constructor.java): Parameterized constructors and static vs instance variables.
- [`constructor_chaining.java`](src/EC/constructor_chaining.java): Constructor chaining using `this(...)`.
- [`A.java`](src/EC/A.java), [`B.java`](src/EC/B.java), [`C.java`](src/EC/C.java), [`D.java`](src/EC/D.java): Class hierarchy, variable shadowing, and abstract class extension.

### 2. ⚡ Custom Data Structures
- [`Stack.java`](src/EC/Stack.java) & [`StackUser.java`](src/EC/StackUser.java): Custom **Stack** implementation following the **LIFO** (Last-In-First-Out) principle using dynamic arrays.
- [`Queue.java`](src/EC/Queue.java) & [`QueueUser.java`](src/EC/QueueUser.java): Custom **Queue** implementation following the **FIFO** (First-In-First-Out) principle.

### 3. ⚠️ Exception Handling & Custom Exceptions
- [`NotEligibleException.java`](src/EC/NotEligibleException.java): Custom user-defined checked exception extending `java.lang.Exception`.
- [`throw_throws.java`](src/EC/throw_throws.java): Demonstrates explicit `throw` and method signature `throws` with voting age validation.
- [`exception.java`](src/EC/exception.java): Built-in exception handling using `try-catch-finally` for `ArithmeticException` and `InputMismatchException`.

### 4. 🧮 Algorithms & String Manipulation
- [`palendrom.java`](src/EC/palendrom.java): Number reversal algorithm and palindrome validator.
- [`second_largest.java`](src/EC/second_largest.java): Finding largest and second largest array elements in $O(n)$ time.
- [`Fibono_series.java`](src/EC/Fibono_series.java): Fibonacci sequence generator.
- [`assending_order.java`](src/EC/assending_order.java): Character array conversion and ascending order sorting.
- [`String_char.java`](src/EC/String_char.java): Character array frequency counting and non-repeating character analysis.
- [`problem.java`](src/EC/problem.java): Prime number check and factorial calculation utility.
- [`Method_Example.java`](src/EC/Method_Example.java): Method declaration, parameters, and return types.

### 5. 🎨 Matrix & Pattern Printing
- [`Pattern.java`](src/EC/Pattern.java): Basic star matrix pattern printing (Square, Triangles).
- [`RealPattern.java`](src/EC/RealPattern.java): Advanced number, alphabet, and alternating matrix patterns.

### 6. 📦 Java Collections Framework
- [`Collection_non_generic.java`](src/EC/Collection_non_generic.java): Non-generic `ArrayList` raw types.
- [`Generic_no_generic.java`](src/EC/Generic_no_generic.java): Comparison of type-safe generics vs raw types.
- [`set_non_generic.java`](src/EC/set_non_generic.java): `HashSet` (unordered, unique) vs `TreeSet` (sorted).
- [`map_hashmap.java`](src/EC/map_hashmap.java): `HashMap` key-value pairs and `entrySet` iteration.
- [`library_example.java`](src/EC/library_example.java): Practical Library Catalog system using `TreeMap`.

---

## 🛠️ How to Compile and Run

### Compilation
From the root directory of the repository, compile all Java files into the `bin` directory:

```bash
javac -d bin src/EC/*.java
```

### Execution
Run any compiled class using the `EC.<ClassName>` format:

```bash
# Run HomeLoan inheritance demo
java -cp bin EC.HomeLoan

# Run Stack Data Structure demo
java -cp bin EC.StackUser

# Run Custom Exception demo
java -cp bin EC.throw_throws

# Run Palindrome Checker algorithm
java -cp bin EC.palendrom
```

---

## 🌟 Features & Code Quality
- **100% Fully Commented**: Includes comprehensive Javadoc documentation, parameter definitions, and detailed inline explanations.
- **Interconnected Design**: Clearly references relationships between superclasses, subclasses, exception definitions, and driver classes.
- **Clean & Bug-Free**: All algorithms verified for correctness with modern Java naming conventions.
# Java-Core-Data-Structures-Mastery
