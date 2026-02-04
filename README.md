#  Multithreaded File Search Engine (Core Java)

A high-performance command-line file search application built using pure Java.  
This tool scans directories recursively and searches for a keyword inside files using multithreading for faster execution.

---

##  Features

- Recursive directory scanning  
- Keyword search within file contents  
- Multithreaded processing using ExecutorService  
- Displays file path, line number, and matched line  
- Efficient handling of large folders  
- No external libraries — built with core Java only  

---

##  Concepts Demonstrated

This project showcases strong understanding of:

- Java Multithreading  
- Executor Framework  
- Callable and Future  
- Java NIO (Files, Paths, Directory Walking)  
- File I/O with BufferedReader  
- Collections and Streams  
- Object-Oriented Programming  

---

##  Project Structure

file-search-engine  
┣ model  
┃ ┗ SearchResult.java  
┣ service  
┃ ┣ SearchService.java  
┃ ┗ SearchTask.java  
┣ util  
┃ ┗ FileScannerUtil.java  
┗ Main.java  

---

##  How It Works

1. The program takes a directory path and a keyword as input.  
2. All files inside the directory (including subfolders) are collected.  
3. Each file is processed in a separate thread.  
4. Threads search line-by-line for the keyword.  
5. Matching results are returned with file path and line number.

---

##  How to Compile and Run

### Step 1: Compile

```bash
javac Main.java model/*.java service/*.java util/*.java
```

### Step 2: Run

```bash
java Main
```

---

## 🖥 Example Usage

```
Enter directory path: C:\Projects
Enter keyword to search: java

Results Found: 2
C:\Projects\App.java [Line 18]: Java concurrency utilities are powerful
C:\Projects\Test.java [Line 6]: Learning Java threads
```

---

##  Requirements

- Java 8 or higher  
- Works on Windows, macOS, and Linux  

---

##  Learning Outcome

This project demonstrates how to build a performance-focused tool using core Java features. It reflects practical knowledge of concurrency, file handling, and clean program design without relying on frameworks.
