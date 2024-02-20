package teoria.clasesGenericas;

public class Main1_2 {
    public static void main(String[] args) {
        Generico1 generico1 = new Generico1("hola");
        generico1.setAtributo("hello");
        System.out.println(generico1);
        String cadena = (String) generico1.getAtributo();
        System.out.println("Valor obtenido: " + cadena);
        System.out.println("==============================");
        Generico1 generico11 = new Generico1(11);
        generico11.setAtributo(5);
        System.out.println(generico11);
        int entero = (int) generico11.getAtributo();
        System.out.println("Valor obtenido: " + entero);
        System.out.println("==============================");
        Generica2<String> generica2 = new Generica2<>("adios");
        generica2.setAtributo("bye bye");
        System.out.println(generica2);
        String cadena2 = generica2.getAtributo();
        System.out.println("Valor obtenido: " + cadena2);
        System.out.println("==============================");
        Generica2<Integer> generica21 = new Generica2<>(23);
        generica21.setAtributo(12);
        System.out.println(generica21);
        int entero2 = generica21.getAtributo();
        System.out.println("Valor obtenido: " + entero2);
        System.out.println("==============================");
        Generica2<Persona> persona = new Generica2<>(new Persona("damian", 33));
        persona.setAtributo(new Persona("jacinto", 15));
        System.out.println(persona);
        persona.getAtributo().setNombre("wenceslao");
        System.out.println(persona);

    }

}
