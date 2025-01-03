# TASK-1-FILE-HANDLING-UTILITY
Name:MENDA NAGAMANI

company:CODTECH IT SOLUTIONS

ID:CT08EKW

DOMAIN:Java Programming

DURATION:DECEMBER 17 2024 TO JANUARY 17 2025

OVERVIEW OF THE PROJECT:

PROJECT: FileHandlingUtility using Java Programming

![image alt](https://github.com/NagamaniMenda/TASK-1-FILE-HANDLING-UTILITY/blob/459140f1bd331f935a4ca034f1b2e34dbc22659a/FileHandlingUtlity.png)



 **Overview of the Project**  
The **File Handling Utility** project is a Java-based application designed to demonstrate core file handling operations such as reading, writing, appending, and modifying text files. The project highlights the use of Java's file handling classes and methods while incorporating robust error handling and user-friendly functionality. The program is ideal for both educational purposes and practical applications requiring file management.

 **Objective**  
The objective of the project is to:
1. Demonstrate the implementation of basic file handling operations in Java.
2. Enable users to manage file content programmatically through operations such as writing, reading, appending, and modifying text files.
3. Showcase Java's file handling capabilities while ensuring efficient and error-resilient functionality.

 **Key Activities**  
1. **File Writing**:
   - Creating a new file or overwriting an existing file with specified content.  
2. **File Reading**:
   - Reading and displaying the content of a file.  
3. **File Appending**:
   - Adding new data to the end of the file without altering existing content.  
4. **File Modification**:
   - Replacing specific content in the file with new content.  
5. **Error Handling**:
   - Managing file-related exceptions such as missing files, I/O errors, and permission issues gracefully.  

**Technologies Used**  
- **Programming Language**: Java  
- **Core Libraries**:  
  - `java.io.File`: For file representation and manipulation.  
  - `FileWriter` and `BufferedWriter`: For writing to and appending data to files.  
  - `FileReader` and `BufferedReader`: For reading file content.  
- **Development Environment**: Any Java-supported IDE or text editor (e.g., IntelliJ IDEA, Eclipse, NetBeans).  

 **Key Insights**  
1. **Practical Understanding of File Operations**:  
   - Learned how to manage text files programmatically using Java's built-in classes.  

2. **Error Handling Best Practices**:  
   - Implemented mechanisms to handle common file-related issues gracefully, improving program robustness.  

3. **Efficiency in File Handling**:  
   - Utilized buffered I/O streams for optimized file read and write operations.  

4. **Real-world Relevance**:  
   - Gained insights into how file handling is critical in applications such as data logging, file management tools, and configuration management.  

5. **Code Reusability**:  
   - Designed a modular and reusable utility that can be adapted to various projects requiring file manipulation.
  
***A SCRIPT DEMONSTRATING FILE OPERATIONS WITH CLEAR DOCUMENTATION***

 ** This program demonstrates basic file operations in Java:
 * 1. Writing to a file.
 * 2. Reading from a file.
 * 3. Appending data to a file.
 * 4. Modifying specific content in a file.
 * The operations are performed on a file named 'example.txt'.

  The file on which operations will be performed

 1. Write data to a new file or overwrite existing data
 2. Read data from the file and display it
 3. Append new data to the file (adds data at the end)
  4. Modify content in the file (replace a word or phrase)
   5. Display the final content of the file
     

   
 * Writes the provided data to a file.
    * If the file already exists, it will be overwritten.
     * @param fileName The name of the file to write to.
     * @param data The data to write to the file.
     * @throws IOException If an error occurs while writing to the file.

     * Reads and returns the content of the specified file.
     * 
     * @param fileName The name of the file to read from.
     * @return The content of the file as a String.
     * @throws IOException If an error occurs while reading from the file.

    
     * Appends new data to the end of the file.
     * If the file does not exist, it will be created.
     * 
     * @param fileName The name of the file to append data to.
     * @param data The data to append to the file.
     * @throws IOException If an error occurs while appending to the file.

     * Modifies the content of the file by replacing specific old content with new content.
     * 
     * @param fileName The name of the file to modify.
     * @param oldContent The content to be replaced.
     * @param newContent The content to replace the old content with.
     * @throws IOException If an error occurs while modifying the file.
    Read the content of the file
   Replace the old content with new content
  Write the updated content back to the file

*Explanation of the Program*:

#### *Main Operations*:

1. *Write to a file*: 
   - The program writes an initial message to the file using writeToFile(). If the file doesn't exist, it is created.
   
2. *Read from the file*: 
   - The content of the file is read and displayed to the user with readFromFile(). If the file doesn't exist, a "File not found!" message is shown.

3. *Append to the file*: 
   - The program appends new data to the file using appendToFile(), ensuring that new content is added to the end of the file without overwriting existing data.

4. *Modify content in the file*: 
   - The modifyFileContent() method is used to replace specific text in the file with new text. For example, replacing "File Handling" with "Java File Operations".

#### *Methods*:

- **writeToFile(String fileName, String data)**: Writes the provided data to the file. If the file exists, it overwrites the current content.
- **readFromFile(String fileName)**: Reads and returns the content of the file.
- **appendToFile(String fileName, String data)**: Appends new data to the file without overwriting existing content.
- **modifyFileContent(String fileName, String oldContent, String newContent)**: Modifies specific content in the file by replacing old content with new content.

