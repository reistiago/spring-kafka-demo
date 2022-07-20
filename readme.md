### Kafka Demo

Simple project to show kafka and springboot integration.

Compile with `$ .mvnw clean package`

Run with `$ java -jar target/kafka-demo-0.0.1-SNAPSHOT.jar`,
or to enable the producer also `$ java -Dspring.profiles.active=producer -jar target/kafka-demo-0.0.1-SNAPSHOT.jar`

The producer will publish a message every 5 seconds. Since we have 2 consumer groups both groups will get all messages

**Disclaimer** this is in no way shape or form ready for production, in the end it will probably use a different library 
for kafka communication, this was just a simple way to do it to show how messages propagate with different consumer groups