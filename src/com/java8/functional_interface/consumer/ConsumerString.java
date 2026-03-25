package com.java8.functional_interface.consumer;

import java.util.function.Consumer;

public class ConsumerString {
    public static void main(String[] args) {

        //declaring a consumer which accepts and displays uppercase string
        Consumer<String> stringConsumer = (s -> System.out.println(s.toUpperCase()));

        Consumer<String> addressConsumer = (ConsumerString::removeSpaces);

        //testing the consumer with input
        stringConsumer.accept("harikrishna");
        addressConsumer.accept("This address contains spaces");
    }

    private static void removeSpaces(String s) {
        System.out.println(s.replaceAll(" ",""));
    }
}
