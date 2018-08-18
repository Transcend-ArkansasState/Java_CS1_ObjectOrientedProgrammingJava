# Java_CS1_ObjectOrientedProgrammingJava
Maven Java Projects for code exercises and examples for Object Oriented Programming in Java (Computer Science Level 1)

These examples cover entry-level Computer Science topics, such as primitive datatypes, Standard input/output reading f
rom the console, and working with objects, methods, and flow control concepts.


# Quick Start

It is recommended that the entire project be built all at once using the modules pom
```bat
mvn clean -e install -f pom.xml
```

Some modules have unit tests to ensure that any changes made still pass certain test cases.
These test cases model some of the grading test cases that would be used to grade student work.

This project is built using Java JDK 8. JDK 11 is coming out soon (at the time of writing) and this code may be updated later to work with JDK11,
but until this README declares otherwise, this code is not tested with any Java Development Kit Higher than 8.

###NOTE:
All of the "shell" scripts shown in the readme are oriented towards Windows users. If you are on a Mac or a Linux PC,
some adjustments may need to be made to use the commands as is.

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

# Making an Executable Jar
Any of the sub-module projects can be made to build an executable JAR by making the following changes to the ```pom.xml``` file within that project.

Add the following Section to the bottom of the ```pom.xml``` just before the ```</project>``` tag.
```xml
<!-- taken from this StackOverflow Answer: https://stackoverflow.com/a/574650 -->
<build>
    <plugins>
        <build>
          <plugins>
            <plugin>
              <artifactId>maven-assembly-plugin</artifactId>
              <configuration>
                <archive>
                  <manifest>
                  <!-- Be sure to specify this property in the <properties/> section of the pom.xml -->
                    <mainClass>${jar.mainClass}</mainClass>
                  </manifest>
                </archive>
                <descriptorRefs>
                  <descriptorRef>jar-with-dependencies</descriptorRef>
                </descriptorRefs>
              </configuration>
               <executions>
                  <execution>
                    <id>make-assembly</id> <!-- this is used for inheritance merges -->
                    <phase>package</phase> <!-- bind to the packaging phase -->
                    <goals>
                      <goal>single</goal>
                    </goals>
                  </execution>
                </executions>
            </plugin>
          </plugins>
        </build>
    </plugins>
</build>
```
And add the folowing just below the ```<artifactId>...</artifactId>```. NOTE: If you
already have properties, you'll just add this one property to the existing ```<properties>```
node, but if not, you will need to insert a new ```<properties>``` node without the '...'

For the Name of your Main Class, you can use the Fully Qualified Name, which is the package name, followed by the class name.
    Example: ```edu.asu.trascend.hellomaven.HelloMaven```
    Where: the package name is ```edu.asu.transcend.hellomaven``` and the Main Class file name is ```HelloManve.java```
```xml
<properties>
...
<jar.mainClass>NAME.OF.YOUR.MAIN.CLASS.HERE</jar.mainClass>
...
</properties>
```
# Work In Progress:

This Course and the Course Content are currently under construction. Everything here is subject to change.

## TODO:
- [X] Unit test stdio and input
- [X] Build all at once with module pom.
- [X] Need to change executable Jar config to also make uber-jar/fat-jar with dependencies included for portability
- [ ] Need to add Comments for Java Docs
    - [X] helloMaven
    - [X] helloDave
    - [ ]  diamonds
    - [X] numberGuessingGame
    - [ ] sphere
    - [X]  arrays and counting
    - [ ] object serializing
    - [ ]  web-scraper
    - [ ] rockPaperScissors.jar
    - [ ]  method examples
    - [ ]  flow chart
    - [ ] order of operations

- [ ] ArrayCount.java //TODO:
- [ ] Diamonds.java //TODO:
- [X] Guessing.java //TODO:
- [ ] SerializeObjects.java //TODO: add "read" and "write" args with filenames
- [ ] SerializeObjects.java // TODO: Import GSON
- [ ] SerializeObjects.java // TODO: Create GSON instance
- [ ] SerializeObjects.java // TODO: Serialize and print Object to console (write to file)
- [ ] SerializeObjects.java // TODO: Deserialize Object from file
- [ ] Create run instructions for each one.
- [ ] Re-order modules with numeric names to match their Course module numbers.
- [ ] Add Code Modules to Course Module Outlines in blackboard


## Nice To Have:
- [ ] Full Markdown readmes for everyrhing.
- [ ] CS Standards citations in the Java Doc Comments with a brief justification
- [ ] Document all the modules
- [ ] Document and explain build process
- [ ] Mac/Linux commands in Readme alongside Windows commands
- [ ] Windows/Linux/Mac Maven Setup Documentation (or links)
- [ ] Windows/Linux/Mac Java Installation Documentation (or links)
