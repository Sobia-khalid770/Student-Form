# 🎓 Student Enrollment Form

A lightweight desktop GUI application built with **Java Swing** that allows users to enter, view, and manage student enrollment details through a clean and colorful interface.

---

## 📌 Description

The **Student Enrollment Form** is a beginner-friendly Java Swing project that demonstrates core GUI concepts such as text fields, text areas, radio buttons, checkboxes, and event handling. It provides a simple form where students can enter their personal details — name, roll number, email, nationality, address, gender, and skills — and instantly view a neatly formatted summary of the submitted information.

This project is ideal for anyone learning **Java Swing**, **event-driven programming**, or looking for a foundational template to build more advanced desktop applications.

---

## ✨ Features

- 📝 **Input Fields** — Name, Roll No, Email, Nationality, and a multi-line Address box
- ⚧ **Gender Selection** — Radio buttons for Male/Female
- 💻 **Skills Selection** — Checkboxes for Java and Python
- ✅ **Submit Button** — Validates input and displays a formatted summary in the output box
- 🔄 **Clear Button** — Instantly resets the entire form
- ⚠️ **Input Validation** — Prompts the user if the Name field is left empty
- 🎨 **Custom Styling** — Pleasant color palette, custom fonts, and organized layout using `GridLayout`

---

## 🖥️ Preview

```
┌────────────────────────────────────────────┐
│           Student Enrollment Form          │
├────────────────────────────────────────────┤
│ Name          [____________________]       │
│ Roll No       [____________________]       │
│ Email         [____________________]       │
│ Nationality   [____________________]       │
│ Address       [____________________]       │
│ Gender        ( ) Male   ( ) Female        │
│ Skills        [ ] Java   [ ] Python        │
│                                            │
│   [ Submit ]        [ Clear ]              │
│                                            │
│ Output:                                    │
│ ┌─────────────────────────────────────┐    │
│ │                                          │
│ └─────────────────────────────────────┘    │
└────────────────────────────────────────────┘
```

---

## ⚙️ Requirements

- Java Development Kit (JDK) 8 or higher
- Any Java-compatible IDE (optional) — IntelliJ IDEA, Eclipse, VS Code, etc.

---

## 🚀 Getting Started

### 1. Clone or download the project
```bash
git clone https://github.com/Sobia-khalid770/Student-Form.git
cd Student-Form
```

### 2. Compile the source code
```bash
javac GUI/Student.java
```

### 3. Run the application
```bash
java GUI.Student
```

> **Note:** Make sure you run the command from the directory that contains the `GUI` folder, since the class belongs to the `GUI` package.

---

## 🧭 How to Use

1. Fill in the required fields — **Name** is mandatory.
2. Select the appropriate **Gender** using the radio buttons.
3. Check any applicable **Skills**.
4. Click **Submit** to generate a formatted summary in the Output section.
5. Click **Clear** to reset all fields and start over.

---



## 🛠️ Built With

- **Java Swing** — for building the graphical user interface
- **AWT** — for layout management, colors, and fonts

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome! Feel free to fork the repository and submit a pull request.

---

## 📄 License

This project is free to use and modify for educational and personal purposes.
