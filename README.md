# Java_CS1_ObjectOrientedProgrammingJava
Maven Java Projects for code exercises and examples for Object Oriented Programming in Java (Computer Science Level 1)

These examples cover entry-level Computer Science topics, such as primitive datatypes, Standard input/output reading f
rom the console, and working with objects, methods, and flow control concepts.


# Quick Start

It is recommended that the entire project be built all at once using the modules pom
```bat
mvn clean -e install -f pom.xml
```

## pom.xml
This POM will build all of the submodules and execute unit tests so that any modifications or updates can be quickly validated.

## 01-hellomaven
This is a basic HelloWorld example using Maven.

```bat
~/> mvn clean -e package -f 01-hellomaven/pom.xml
~/> java -jar 01-hellomaven\target\hellomaven-LATEST.jar

Hello World

~/>
```
## 02-hellodave
This is "Hello World" but it asks your name first, and repeats it back to you.
```bat
~/> mvn clean -e package -f 02-hellodave\pom.xml
~/> java -jar 02-hellodave\targethellodave-LATEST.jar
What's your name?
Adam
Hello, Adam

~/>
```

## 03-diamonds
Print a diamond made of asterisks. Use a number from user Input to determine the size of the diamond.

## 04-numberguessing
Play a number guessing game with the user. How many guesses does it take?
## 05-sphere
Calculate the volume of a sphere, given radius in meters from the user.
     
# Work In Progress:

This Course and the Course Content are currently under construction. Everything here is subject to change.

## TODO:
- [X] Unit test stdio and input
- [X] Build all at once with module pom.
- [X] Need to change executable Jar config to also make uber-jar/fat-jar with dependencies included for portability
- [ ] Need to add Comments for Java Docs
- [ ] ArrayCount.java //TODO:
- [ ] Diamonds.java //TODO:
- [ ] Guessing.java //TODO:
- [ ] SerializeObjects.java //TODO: add "read" and "write" args with filenames
- [ ] SerializeObjects.java // TODO: Import GSON
- [ ] SerializeObjects.java // TODO: Create GSON instance
- [ ] SerializeObjects.java // TODO: Serialize and print Object to console (write to file)
- [ ] SerializeObjects.java // TODO: Deserialize Object from file
- [ ] Create run instructions for each one.
## Nice To Have:
- [ ] Full Markdown readmes for everyrhing.
- [ ] CS Standards citations in the Java Doc Comments with a brief justification
- [ ] Document all the modules
- [ ] Document and explain build process