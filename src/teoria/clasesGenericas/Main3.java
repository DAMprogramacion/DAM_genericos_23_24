package teoria.clasesGenericas;

import java.time.LocalDate;

public class Main3 {
    public static void main(String[] args) {
        Generica3<String, LocalDate> persona1 =
                new Generica3<>("javier", LocalDate.of(2000,8,25));
        persona1.setAtributo1("luisa");
        System.out.printf("%s, %d/%d/%d%n", persona1.getAtributo1(),
                persona1.getAtributo2().getDayOfMonth(),
                persona1.getAtributo2().getMonthValue(),
                persona1.getAtributo2().getYear());

        Generica3<String, String> persona2 = new Generica3<>("juan", "12345678a");
        persona2.setAtributo1("francisco");
        System.out.println(persona2);

        Generica3<String, Integer> persona3 = new Generica3<>("felipe", 45);
        System.out.println("=========================");
        Persona persona = new Persona("gabriel", 25);
        Generica3<Persona, String> personaDNI = new Generica3<>(persona, "12345678s");
        System.out.println(personaDNI);
        personaDNI.setAtributo2("12345678a");
        persona.setEdad(55);
        System.out.println(personaDNI);

    }
}













