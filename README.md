# Java_CS1_ObjectOrientedProgrammingJava
Maven Java Projects for code exercises and examples for Object Oriented
Programming in Java (Computer Science Level 1)

These examples cover entry-level Computer Science topics, such as
primitive datatypes, Standard input/output reading from the console,
and working with objects, methods, and flow control concepts.


# Quick Start

It is recommended that the entire project be built all at once using the
 modules pom
```bat
mvn clean -e install -f pom.xml
```

Some modules have unit tests to ensure that any changes made still pass
 certain test cases.
These test cases model some of the grading test cases that would be used
 to grade student work.

This project is built using Java JDK 8. JDK 11 is coming out soon (at
the time of writing) and this code may be updated later to work with
JDK11, but until this README declares otherwise, this code is not tested
 with any Java Development Kit Higher than 8.

###NOTE:
All of the "shell" scripts shown in the readme are oriented towards
Windows users. If you are on a Mac or a Linux PC, some adjustments may
need to be made to use the commands as is.

## pom.xml
The root pom.xml is an aggregating pom that when invoked with Maven, will
test, compile, and package each sub-module in this project.

Each submodule also contains a pom.xml file. Each submodule can be
removed from the greater project structure and worked on separately, or
"standalone." The Aggregate pom is mostly intended for instructors or
code maintainers to be able to quickly validate the course code base
without manually building and running each submodule.



# Making an Executable Jar From Any SubModule
Any of the sub-module projects can be made to build an executable JAR
by making the following changes to the ```pom.xml``` file within that
project.

Add the following Section to the bottom of the ```pom.xml``` just before
 the ```</project>``` tag.
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
And add the following just below the ```<artifactId>...</artifactId>```.
NOTE: If you
already have properties, you'll just add this one property to the
existing ```<properties>``` node, but if not, you will need to insert a
new ```<properties>``` node without the '...'

For the Name of your Main Class, you can use the Fully Qualified Name,
which is the package name, followed by the class name.
    Example: ```edu.asu.trascend.hellomaven.HelloMaven```
    Where: the package name is ```edu.asu.transcend.hellomaven``` and
    the Main Class file name is ```HelloManve.java```
```xml
<properties>
...
<jar.mainClass>NAME.OF.YOUR.MAIN.CLASS.HERE</jar.mainClass>
...
</properties>
```
# Work In Progress:
This Course and the Course Content are currently under construction.
Everything here is subject to change.

