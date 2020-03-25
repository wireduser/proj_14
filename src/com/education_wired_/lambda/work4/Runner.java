package com.education_wired_.lambda.work4;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public void run(){

        System.out.println("----person----");
        List <Person> people = Arrays.asList(
                new Person ("oleg",23,"M"),
                new Person ("Alex",14,"W"),
                new Person ("Sweta",44,"W"),
                new Person ("Ivan",16,"M"),
                new Person ("Olex",26,"M"),
                new Person ("Anna",60,"w"),
                new Person ("Vasia",43,"M"),
                new Person ("Andrey",28,"M")
        );
        people.stream()
                .filter(p->p.getGender().equals("M") && p.getAge()>=18&&p.getAge()<=27)
                .forEach(System.out::println);

        OptionalDouble average = people.stream()
                .filter(p->p.getGender().equals("W"))
                .mapToInt(p->p.getAge())
                .average();

        if (average.isPresent()) {
            System.out.printf("avr =%.1f\n",average.getAsDouble());
        }


        List list = Stream.iterate (10, n -> n + 10)
                .limit(10)
                .map(x -> x / 2 )
                .collect(Collectors.toList());

        list.forEach(System.out::println);

        List<String> strList = Arrays.asList(makeStrArr());
        //Predicate<String> stringPredicate = str -> str.substring(0,1).toUpperCase().equals("B");
        strList.stream()
                .filter(s -> s.startsWith("b"))
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
