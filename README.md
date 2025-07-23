Packer-Unpacker 
Overview
The  Packer-Unpacker is a Java-based application designed to pack multiple files from a specified directory into a single packed file with metadata (filename and size) and unpack the packed file to restore the original files. The project demonstrates file I/O operations, string parsing, and object-oriented design principles, making it a practical utility for file archiving.
Features

Packing: Combines multiple files from a directory into a single packed file, with each file preceded by a 100-byte header containing the filename and size.
Unpacking: Extracts original files from a packed file using header metadata.
User Interface: Console-based input for specifying directories and file names.

Project Structure

MarvellousPacker.java: Core class for packing files into a single file with metadata headers.
MarvellousUnpacker.java: Core class for unpacking files from a packed file.
ProgramPacker.java: Driver class to initiate the packing process via user input.
ProgramUnpacker.java: Driver class to initiate the unpacking process via user input.






