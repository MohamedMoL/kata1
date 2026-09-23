package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person = new Person("Lucia", LocalDate.of(2005, 3, 2));
        System.out.println(person.age());
    }
}
