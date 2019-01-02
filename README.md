# microlith
A skeleton web app in clojure using maven

# Usage

## Uberjar
To build a and run jar with all dependencies:

    mvn clean compile assembly:single
    java -jar target/microlith-1.0.0-SNAPSHOT-jar-with-dependencies.jar

## To build and individual jar and run it with a classpath
After cloning/downloading the source, build it with:

    mvn package
    
Then generate the classpath with:

    mvn dependency:build-classpath

Copy and paste the output below, before :target in the quotes:

    java -cp "paste-here:target/microlith-1.0.0-SNAPSHOT.jar" ashikasoft.microlith.core

This runs the server on port 3000.

# License

Public domain. This is project may be used and distributed freely for any purpose, with no guarantee whatsoever.
