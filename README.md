# microlith
A small clojure webstack using maven

# Usage
After cloning/downloading the source, build it with:

    mvn package
    
Then generate the classpath with:

    mvn dependency:build-classpath

Copy and paste the output below, before :target in the quotes:

    java -cp "paste-here:target/microlith-1.0.0-SNAPSHOT.jar" ashikasoft.microlith.core

This runs the server on port 3000.

# License

Public domain. This is project may be used and distributed freely for any purpose, with no guarantee whatsoever.
