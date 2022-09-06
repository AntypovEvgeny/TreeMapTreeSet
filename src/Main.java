import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        int yearPeople = 18;
        List<Person> people = new ArrayList<>();
        people.add(new Person("Roma", "Ivlev", 15));
        people.add(new Person("Kolya", "Davydov Glebov", 17));
        people.add(new Person("Foma", "Ivlev Lobov Znatokov", 18));
        people.add(new Person("Tolya", "Muhov", 21));
        people.add(new Person("Sveta", "Vegan Mari", 18));

        Predicate<Person> predicate = person -> person.getAge() <= yearPeople;

        people.removeIf(predicate);

        System.out.println(people);
    }
}
