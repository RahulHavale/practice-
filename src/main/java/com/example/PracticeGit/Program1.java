package com.example.PracticeGit;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program1 {
    public static void main(String[] args) {
        String sentance = "Hello Aditya! Hello how are you";
        String[] s = sentance.split(" ");
        List<String> words = new ArrayList<>();

        for(int i=0; i<s.length;i++){
            words.add(s[i]);
        }

        Map<String, Long> collect = words.stream().collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()));
        System.out.println(collect);
    }
}
