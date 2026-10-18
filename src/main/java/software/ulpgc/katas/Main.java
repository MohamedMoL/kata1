package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person = new Person("Marcos", LocalDate.of(2000, 1, 1));
        System.out.println(person.age());
    }
}
