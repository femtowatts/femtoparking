# Java Application Deployment Guide (Windows, No Maven/Gradle)
## Overview

This repository contains a Java application. This guide explains how to set up, compile, and run the application for the first time on Windows, without any build tools like Maven or Gradle.

## Prerequisites

Before deploying, make sure you have installed:

Java JDK 17+

Git (for cloning the repository)

Optional: IDE such as IntelliJ IDEA, Eclipse, or VS Code

Check versions in Command Prompt:

java -version
javac -version
git --version

## Step 1: Clone the Repository
git clone https://github.com/femtowatts/femtoparking.git
cd femtoparking

## Step 2: Compile the Application

Navigate to the folder containing your .java files. For example:

cd src


Compile all Java files:

javac *.java


This will generate .class files in the same directory.

Optionally, you can specify an output directory:

javac -d ../bin *.java


This creates compiled files in a bin folder.

## Step 3: Run the Application

From the folder containing the .class files (or the bin directory if you used -d):

java MainClassName


Replace MainClassName with the class containing the public static void main(String[] args) method.

If your app requires arguments:

java MainClassName arg1 arg2

## Step 4: Configuration (Optional)

Configure your app using:

Environment variables in CMD:

set APP_PORT=8080
java MainClassName


Command-line arguments (as above).

## Step 5: Verify Deployment

Open your browser or use curl (Windows 10+ with curl) to test:

curl http://localhost:8080

## Step 6: Troubleshooting
Issue	Solution
java: command not found	Ensure Java JDK is installed and added to PATH
javac: command not found	Ensure Java JDK’s bin directory is in PATH
Application fails to run	Check that you are in the correct folder with .class files
Port already in use	Change the port using environment variables or command-line arguments

## References

Java Documentation
