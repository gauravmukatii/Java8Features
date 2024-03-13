import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fibonacci {

    public static void main(String args[]){


        String myStr = "Lets discuss java 8";

//        Character ch = myStr.chars()
//                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() == 1L)
//                .map(entry -> entry.getKey())
//                .findFirst()
//                .get();
//
//        System.out.println(ch);

//       List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
//
//       //duplicate or not
//       HashSet<Integer> set = new HashSet<>(list);
//       if(list.size() == set.size()){
//           System.out.println("It doesnt contain repeated elements");
//       }else{
//           System.out.println("Duplicate elements present!!");
//       }


//       //Local Date and Time api
//       System.out.println("Current Date and time == ");
//       System.out.println(LocalDateTime.now());
//       System.out.println(LocalTime.now());
//       System.out.println(LocalDate.now());

       //sort the list
//        list.stream().sorted().forEach(System.out::println);

        //sort the list in desc order
//        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

       List<Integer> myList = Arrays.asList(5,10,15,8,49,25,98,98,32,15);
//       HashSet<Integer> set = new HashSet<>();
//       //duplicate elements
//        myList.stream()
//                .filter(n -> !set.add(n))
//                .forEach(System.out::println);
//
//      //find first
//        myList.stream()
//                .findFirst()
//                .ifPresent(System.out::println);

        //find total elements present in stream
//        System.out.println(myList.stream().count());

        //maximum value in list
//        System.out.println(myList.stream().max(Integer::compare).get());



//       //find numbers starts with 1
//       list.stream()
//               .map(s -> s + "")
//                       .filter(s -> s.startsWith("1"))
//                               .forEach(System.out::println);

       //find even numbers
//       list.stream()
//               .filter(n -> n%2 == 0)
//               .forEach(System.out::println);

        //cube of numbers in list
        List<Integer> newList = Arrays.asList(1, 5, 3, 7);
        newList.stream()
                .map(s -> s*s*s)
                .filter(s -> s > 50)
                .forEach(System.out::println);

    }
}
