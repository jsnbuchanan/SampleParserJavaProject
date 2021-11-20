# Sample Parser Kotlin Project
@author [*Jason Buchanan*](https://github.com/jsnbuchanan)

## Developers 

### Prerequisites
- [Maven 3.8.3](https://maven.apache.org/install.html) 
- [JDK 11 or higher](https://www.oracle.com/java/technologies/java-se-glance.html)
- An IDE that supports Kotlin like [IntelliJ](https://www.jetbrains.com/idea/) or the [Kotlin command-line compiler](https://kotlinlang.org/docs/command-line.html)

### Setup
Install dependencies by running the following from the command line.
```
mvn clean install
```

### Build
To build the project run the command:
```
mvn compile
```

### Test
To test the project run the command:
```
mvn test
```

### Package
Create a runnable jar with all dependencies included using the following command.
```
mvn package
```

### Run
Run the application with the following command.
```
java -jar target/sampleparserjavaproject-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Useful Tools
- **Semantic Commit Messages** For git commits I like to use the [Karma convention for commit messages](http://karma-runner.github.io/1.0/dev/git-commit-msg.html).