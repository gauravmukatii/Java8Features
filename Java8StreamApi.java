import javax.xml.crypto.Data;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamApi {

    public static void main(String... args){

        List<Integer> list = Arrays.asList(1, 5, 7, 8, 9, 6);

        //odd numbers from list
        list.stream()
                .filter(odd -> odd % 2 == 1)
                .forEach(System.out::println);

        System.out.println("-------------------------------");

        //multiply by 10
        list.stream()
                .map(ls -> ls * 10)
                .forEach(System.out::println);

        System.out.println("-------------------------------");

        List<Person> people = Arrays.asList(
                new Person("Gaurav", 25, "Bhopal"),
                new Person("Aj", 40, "Bangalore"),
                new Person("Cz", 31, "Delhi"),
                new Person("Akash", 20, "Mumbai")
        );


        //age greater than 30
        people.stream()
                .filter(e -> e.getAge() > 30)
                .forEach(e -> System.out.println(e));

        System.out.println("-------------------------------");

        //name starts with "A"
        people.stream()
                .filter(person -> person.getName().substring(0,1).equals("A"))
                .forEach(e -> System.out.println(e));

        System.out.println("-------------------------------");

        List<String> animals = Arrays.asList("tiger", "elephant", "fox", "lion", "zebraa");

        //sorted in reverse order
        animals.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        System.out.println("-------------------------------");

        //no of strings length more than 5
        Long cnt = animals.stream()
                .filter(animal -> animal.length() > 5)
                .count();
        System.out.println(cnt);

        System.out.println("-------------------------------");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(50.0, "purchase"),
                new Transaction(25.0, "refund"),
                new Transaction(100.0, "purchase"),
                new Transaction(15.5, "refund"),
                new Transaction(75.0, "purchase")
        );


        //summing purhcase and refund separately
        Double sumPurchase = transactions.stream()
                .filter(e -> e.getInput().equals("purchase"))
                .collect(Collectors.summingDouble(Transaction::getAmount));
        Double sumRefund = transactions.stream()
                .filter(e -> e.getInput().equals("refund"))
                .collect(Collectors.summingDouble(Transaction::getAmount));

        System.out.println(sumPurchase + ",," + sumRefund);

        System.out.println("-------------------------------");

        //groupingBy
        Map<String, List<Transaction>> transactionsGrouping =
                transactions
                        .stream()
                        .collect(Collectors.groupingBy(Transaction::getInput));

        System.out.println(transactionsGrouping);

        System.out.println("-------------------------------");

        List<String> emails = Arrays.asList("gaurav.mukati99@gmail.com", "gaurav.mukati@netmeds.com", "gaurav.mukati02@outlook.com");

        List<String> username = emails.stream()
                .map(email -> email.substring(0, email.indexOf("@")))
                .collect(Collectors.toList());

        System.out.println(username);

        System.out.println("-------------------------------");

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);

        //even number from both list
        Stream.concat(list1.stream(), list2.stream())
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);


    }
}















