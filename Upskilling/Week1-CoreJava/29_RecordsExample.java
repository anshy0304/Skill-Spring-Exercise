import java.util.List;

record Person(String name, int age) {
}

class RecordsExample {
    public static void main(String[] args) {
        Person firstPerson = new Person("Asha", 22);
        Person secondPerson = new Person("Rohan", 17);

        System.out.println(firstPerson);
        System.out.println(secondPerson);

        List<Person> people = List.of(firstPerson, secondPerson, new Person("Meera", 30));
        List<Person> adults = people.stream()
                .filter(person -> person.age() >= 18)
                .toList();

        System.out.println("Adults: " + adults);
    }
}
