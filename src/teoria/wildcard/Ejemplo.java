package teoria.wildcard;

import java.util.Arrays;
import java.util.List;

public class Ejemplo {
    public static void main(String[] args) {
        List<Number> listNumbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> listIntege = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> listDoubles = Arrays.asList(1.1, 2.2, 3.3, 4.4);
        List<String> cadenas     = Arrays.asList("uno", "dos", "tres", "cuatro");
        System.out.println("====List<? extends Number>====");
        printList1(listNumbers); printList1(listIntege); printList1(listDoubles);
        //printList(cadenas);
        System.out.println("====List<? extends Integer>====");
        printList2(listNumbers); printList2(listIntege);
        //printList2(listDoubles); //printList(cadenas);
        System.out.println("====List<?>====");
        printList3(listNumbers); printList3(listIntege); printList3(listDoubles);
        printList3(cadenas);
    }
    public static void printList1(List<? extends Number> list) {
        list.forEach(System.out::println);
        System.out.println("**********");
    }
    public static void printList2(List<? super Integer> list) {
        list.forEach(System.out::println);
        System.out.println("**********");
    }
    public static void printList3(List<?> list) {
        list.forEach(System.out::println);
        System.out.println("**********");
    }
}
