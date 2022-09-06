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

        people.sort((o1, o2) -> {
            int quantityWordSurname1 = o1.getSurname().split(" +").length;
            int quantityWordSurname2 = o2.getSurname().split(" +").length;

            if (quantityWordSurname1 == quantityWordSurname2 || quantityWordSurname1 >= 2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                return Integer.compare(quantityWordSurname1, quantityWordSurname2);
            }
        });
        System.out.println(people);
    }
}
