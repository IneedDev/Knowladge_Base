package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stream {

    public static void main(String[] args) {


        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        Arrays.asList("01", "02")
                .stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        IntStream.range(1,10)
                .average()
                .ifPresent(System.out::println);

    }
}
