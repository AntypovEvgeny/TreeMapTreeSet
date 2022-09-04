import java.util.Comparator;

public class PersonsSurnameComparator implements Comparator<Person> {
    private final int maxWordSurname;

    public PersonsSurnameComparator(int maxWordSurname) {
        this.maxWordSurname = maxWordSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int quantityWordSurname1 = o1.getSurname().split(" +").length;
        int quantityWordSurname2 = o2.getSurname().split(" +").length;

        if (quantityWordSurname1 == quantityWordSurname2 || quantityWordSurname1 >= maxWordSurname) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else return Integer.compare(quantityWordSurname1, quantityWordSurname2);
    }
}
