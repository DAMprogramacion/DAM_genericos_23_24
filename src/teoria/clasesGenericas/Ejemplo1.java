package teoria.clasesGenericas;

public class Ejemplo1 {
    public static void main(String[] args) {
        Integer[] arrayEnteros1 = {1, 2, 3, 4, 5, 6};
        mostrarEnteros(arrayEnteros1);
        System.out.println("=================");
        Integer[] arrayEnteros2 = {4, 5, 6, 7, 7};
        mostrarEnteros(arrayEnteros2);
        System.out.println("=================");

        String[] arrayString = {"uno", "dos", "tres"};
        mostrarCadenas(arrayString);
        System.out.println("======usando método genérico==============");
        mostrarGenerico(arrayString);
        mostrarGenerico(arrayEnteros1);
        System.out.println("=====buscando posiciones========");
        String cadenaPosicion1 = mostrarElementoGenerico(arrayString, 1);
        System.out.println("Elemento 1: " + cadenaPosicion1);
        int enteroPosicion2 = mostrarElementoGenerico(arrayEnteros2, 2);
        System.out.println("Elemento 2: " + enteroPosicion2);
        System.out.println("==========método genérico Number==========");
        double suma1 = sumarValores(arrayEnteros1);
        System.out.printf("Suma de valores: %.2f%n", suma1);
       // sumarValores(arrayString); solo para objetos Number
        Double[] arrayDoubles = {1.1, 1.2, 1.3, 1.4};
        double suma2 = sumarValores(arrayDoubles);
        System.out.printf("Suma de valores: %.2f%n", suma2);


    }
    private static <E extends Number> double sumarValores(E[] elementos) {
        double suma = 0;
        for (E elemento : elementos) {
            suma += elemento.doubleValue();
        }
        return suma;
    }
    private static <E> E mostrarElementoGenerico(E[] elementos, int index){
        if (elementos.length < index)
            return null;
        return elementos[index];
    }
    private static <E> void mostrarGenerico(E[] elementos) {
        for (E elemento : elementos)
            System.out.println(elemento);
    }
    private static void mostrarCadenas(String[] arrayString) {
        for (String cadena : arrayString)
            System.out.println(cadena);
    }

    private static void mostrarEnteros(Integer[] arrayEnteros) {
        for (int entero : arrayEnteros)
            System.out.println(entero);
    }
}
