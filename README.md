# Java_CS1_ObjectOrientedProgrammingJava
NetBeans Projects for modules in Object Oriented Programming in Java (Computer Science Level 1)

# Quick Start
This collection of maven projects all depend on the parent-pom.xml project being built in your local Maven repository if you wish to run them seperately 
```sh
mvn clean -e install -f parent-pom.xml
```
It is recommended that the entire project be built (which will include the parent) all at once using the modules pom
```sh
mvn clean -e install -f pom.xml
```

## pom.xml
This POM will build all of the submodules and execute unit tests so that any modifications or updates can be quickly validated.
## parent-pom.xml
This POM controls all the JUnit versions and Mockito versions for tests, as well as the Build Configurations used to make executable Jars.
The ${jar.mainClass} property must be overriden by the child project for the jar plugin declarations to work properly.

This project will likely go away after test configurations have been finalized.
## 01-hellomaven
This is a basic HelloWorld example using Maven.

```sh
~/> mvn clean -e package -f 01-hellomaven/pom.xml
~/> java -jar 01-hellomaven/target/hellomaven-LATEST.jar

Hello World

~/>
```
## 02-hellodave
This is "Hello World" but it asks your name first, and repeats it back to you.
```sh
~/> mvn clean -e package -f 02-helodave/pom.xml
~/> java -jar 02-hellodave/targethellodave-LATEST.jar
What's your name?
Adam
Hello, Adam

~/>
```

## 03-diamonds
Print a diamon made of astrisks. Use a number from user Input to determine the size of the diamond.
## 04-numberguessing
Play a number guessing game with the user. How many guesses does it take?
## 05-sphere
Calculate the volume of a sphere, given radius in meters from the user.
     
# Work In Progress:

This Course and the Course Content are currently under construction. Everything here is subject to change.

##TODO:
- [X] Unit test stdio and input
- [X] Build all at once with module pom.
- [ ] Need to un-abstract POMs after finalizing the settings.
- [ ] Need to change executable Jar config to also make uber-jar/fat-jar with dependencies included for portability
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
- [ ] add maven goals to parse Java Docs and Help Text
- [ ] unit-test coverage, and unit-tests for grading homework
- [ ] Java Doc Publishing site (can this be built to gitHub?)
- [ ] Full Markdown readmes for everyrhing.
- [ ] CS Standards citations in the Java Doc Comments with a brief justification
- [ ] Document all the modules
- [ ] Document and explain build process