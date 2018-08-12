# Java_CS1_ObjectOrientedProgrammingJava
NetBeans Projects for modules in Object Oriented Programming in Java (Computer Science Level 1)

# Quick Start
This collection of maven projects all depend on the parent-pom.xml project being built in your local Maven repository if you wish to run them seperately 
```$bat
mvn clean -e install -f parent-pom.xml
```
It is recommended that the entire project be built (which will include the parent) all at once using the modules pom
```$bat
mvn clean -e install -f pom.xml
```

## pom.xml
    This POM will build all of the submodules and execute unit tests so that any modifications or updates can be quickly validated. 
## parent-pom.xml
    Controlling all the JUnit versions and Mockito versions for tests, as well as the Build Configuration used to make executable Jars. 
    The ${jar.mainClass} property must be overriden by the child project for the jar plugin declarations to work properly. 

## 01-hellomaven
    This is a basic HelloWorld example using Maven 
## 02-hellodave
    This is "Hello World" but it asks your name first, and repeats it back to you.
## 03-diamonds
    Print a diamon made of astrisks. Use a number from user Input to determine the size of the diamond.
## 04-numberguessing
    Play a number guessing game with the user. How many guesses does it take?
## 05-sphere
    Calculate the volume of a sphere, given radius in meters from the user.
     
