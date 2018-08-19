# Object Serialization Example with Gson Library
This demonstration is meant to show another way programs can create
content for humans, and consume input from humans. This also helps students
understand the separation between data constructs and logical/control
constructs within a language, and builds up to Communications protocols,
and how data is formatted for communication.


This can lead to discussions on Web Services, Messaging Queueus, and
other concepts.

## Requirements
1) Create JSON Files from Java Objects created in memory
2) Create and Print Java Objects to Console from JSON Files
3) Use GSon Library for serialization/deserialization. Show how to include Maven Dependencies
4) Will use "args" parameter to run from the command line. Show how to test these with NetBeans Custom Runner
5) Will build with Maven to an Executable Jar, so we can run these 'args' commands outside of NetBeans
6) Use the java.util.Scanner to read a FileReader object. Scanner is already familiar, from the other demos.
7) Use a "while" loop to read all of the file in before

TODO: Maybe Write a List of Objects


## Objects To Be Modeled
As a practice in modeling data with Objects and primitive Data Types,
we'll be modeling a Book and Author object, as though for a library
 catalog.

 Here is a sample of one of each Object Type. Notice how Book contains a
  field of "Author". We will be serializing nested objects.  This will
  show students a generalized way they can save state of their program
  to a file, and even begin interacting with external services via JSON
  and sockets.
 ```json
 // Serialized Author as JSON
 {
    "firstName":"Jane",
    "lastName":"Austen"
 }

 // Serialized Book as JSON
 {
    "Title":"Tom Sawyer",
    "published":"Aug 19, 2018 9:23:01 AM",
    "author":{
        "firstName":"Mark",
        "lastName":"Twain"
    }
 }
 ```
## Dependencies in Maven
Because use of the GSon library is a Requirement, it would be nice if
we knew what version to use.
This is another Maven configuration we can add to make sure we have GSon
in our project to import in our classes.

Create a ```<dependencies></dependencies>``` section in your POM, if you don't
 already have one. This is the latest stable version of Gson at the
 time of writing. You can look on Maven Central to see if there
 are newer releases available by checking the Maven Index here -
https://mvnrepository.com/artifact/com.google.code.gson/gson
```xml
<dependencies>

    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.5</version>
    </dependency>

</dependencies
```

## Build Configuration in Maven
Maven Configuration is provided, just add this to your POM.xml file
before the ```</project>``` tag. This Maven configuration uses an
alternative "fat jar" configuration using the Maven Assembly Plugin.
This approach is taken from this tutorial
[https://www.mkyong.com/maven/create-a-fat-jar-file-maven-assembly-plugin/]()
```xml
<build>
    <plugins>
        <!-- Maven Assembly Plugin -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-assembly-plugin</artifactId>
            <version>2.4.1</version>
            <configuration>
                <!-- get all project dependencies -->
                <descriptorRefs>
                    <descriptorRef>jar-with-dependencies</descriptorRef>
                </descriptorRefs>
                <!-- MainClass in mainfest make a executable jar -->
                <archive>
                    <manifest>
                        <mainClass>${jar.mainClass}</mainClass>
                    </manifest>
                </archive>
            </configuration>
            <executions>
                <execution>
                    <id>make-assembly</id>
                    <!-- bind to the packaging phase -->
                    <phase>package</phase>
                    <goals>
                    <goal>single</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>

```
Properties Needed in POM
```xml
<properties>
...
<jar.mainClass>NAME.OF.YOUR.MAIN.CLASS.HERE</jar.mainClass>
...
</properties>
```



