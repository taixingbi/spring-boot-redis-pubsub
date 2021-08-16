package com.stackfortech.redispubsub.configuration;

//An interface is a reference type in Java. It is similar to class. 
//It is a collection of abstract methods
public interface MessagePublisher {
    void publish(String message);
}
