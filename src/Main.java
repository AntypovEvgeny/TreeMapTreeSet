import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Roma", "Ivlev", 15));
        people.add(new Person("Kolya", "Davydov Glebov", 17));
        people.add(new Person("Foma", "Ivlev Lobov Znatokov", 18));
        people.add(new Person("Tolya", "Muhov", 21));

        Collections.sort(people, new PersonsSurnameComparator(2));
        System.out.println(people);
    }
}
