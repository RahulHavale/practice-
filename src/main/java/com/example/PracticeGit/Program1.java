package com.example.PracticeGit;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Program1 {
    public static void main(String[] args) {
        String word = "amfnvmckdal";
        Set<Character> words = new HashSet<>();
        Optional<Character> first = word.chars().mapToObj(c -> (char) c).filter(c -> !words.add(c)).findFirst();
        System.out.println(first.get());
    }
}
