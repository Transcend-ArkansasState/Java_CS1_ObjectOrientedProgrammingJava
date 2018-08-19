# Object Serialization Example with Gson Library

Requirements
1) Create JSON Files from Java Objects created in memory
2) Create and Print Java Objects to Console from JSON Files
3) Use GSon Library for serialization/deserializatioon
4) Will use "args" parameter to run from the command line.
5) Will build with Maven to an Executable Jar
Maven Configuration is provided, just add this to your POM.xml file before the ```</project>``` tag.
This Maven configuration uses an alternative "fat jar" configuration using the Maven Assembly Plugin. This approach is taken from this tutorial
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
Properties
```
<properties>
...
<jar.mainClass>NAME.OF.YOUR.MAIN.CLASS.HERE</jar.mainClass>
...
</properties>
```

