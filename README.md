# Pascal Triangle Simulator (Java)

This is a Java-based simulator for the creation and validation of Pascal's Triangle structures using a custom file format. The project validates the triangle using the **Stifel relation** and supports both generating new triangle files and verifying existing ones.

---

## Features

- **Custom File Format**: Stores triangle data in a centered, equilateral-like format using hyphens (`-`) as spacers.
- **Stifel Relation Validation**: Ensures the triangle obeys the binomial coefficient rule.
- **Classic Matrix Representation**: Internally uses a 2D integer array for Pascal's Triangle.
- **Swing GUI (JOptionPane)**: Intuitive user prompts and feedback via graphical dialogs.
- **Execution Control**: Handles interaction logic and delegates tasks.
- **File Abstraction**: Simplified file operations using a custom `Arquivo` class.

---

## Project Structure

```
├── Main.java           # Application entry point with menu navigation
├── Execucao.java       # Executes creation/validation routines
├── TrianguloPascal.java# Core logic for triangle manipulation
├── Exibicao.java       # GUI prompts and messages
├── Arquivo.java        # File read/write handler
```

---

## How to Run

1. Clone this repository:
```bash
git clone https://github.com/yourusername/pascal-triangle-simulator.git
cd pascal-triangle-simulator
```

2. Compile the Java files:
```bash
javac *.java
```

3. Run the program:
```bash
java Main
```

---

## File Format Example

Example of a 4-line triangle in the file:
```
---1---
--1-1--
-1-2-1-
1-3-3-1
```

---

## License

This project is licensed under the MIT License.

---

## Author

Developed by Cauã Pereira

---

## Contributions

Feel free to fork the project and submit pull requests! Suggestions and improvements are welcome.

