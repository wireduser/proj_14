package com.education_wired_.lambda.work4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public void run(){
        List list = Stream.iterate (10, n -> n + 10)
                .limit(10)
                .map(x -> x / 2 )
                .collect(Collectors.toList());

        list.forEach(System.out::println);

        List strList = Arrays.asList(makeStrArr());
        Predicate<String> stringPredicate = str -> str.substring(0,1).toUpperCase().equals("B");
        strList.stream()
                .filter(stringPredicate)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);



    }

    private String[] makeStrArr(){
        String array[] = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("enter string ->");
            array[i]= sc.nextLine();
        }
        return array;
    }
}
