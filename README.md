# 📦 Packer-Unpacker

The **Packer-Unpacker** is a Java-based application designed to pack multiple files from a specified directory into a single packed file with embedded metadata (filename and size). It also supports unpacking the file to restore the original contents.

This project demonstrates:
- Efficient file I/O handling in Java
- String parsing techniques
- Object-oriented design principles  
It is a practical tool for basic file archiving and decompression use cases.

---

## ✨ Features

- **📁 Packing**:  
  Combines multiple files from a directory into a single file.  
  Each file is preceded by a **100-byte custom header** containing:
  - Filename
  - File size in bytes

- **📂 Unpacking**:  
  Reads the packed file and reconstructs all original files using the header information.

- **🖥️ Console Interface**:  
  Simple command-line usage to specify directories and filenames.

---

## 📂 Project Structure

| File Name              | Description                                                             |
|------------------------|-------------------------------------------------------------------------|
| `MarvellousPacker.java`   | Core class for packing files with headers into a single binary file     |
| `MarvellousUnpacker.java` | Core class for unpacking files using metadata from the packed file     |
| `ProgramPacker.java`      | Driver class to initiate the **packing** process using user input       |
| `ProgramUnpacker.java`    | Driver class to initiate the **unpacking** process using user input     |


