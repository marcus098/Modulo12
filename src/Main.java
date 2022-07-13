import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final double IVA = 22;
        List<String> stringList = Arrays.asList("c", "Z", "a", "b");

        //1) Ordinare una lista di stringhe senza modificarla
        stringList.stream().map(str -> str.toLowerCase()).sorted().forEach(System.out::println);
        System.out.println("---------------");

        //2) Convertire in maiuscolo le stringhe in una lista
        stringList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("--------------");

        /*3) Vogliamo scrivere un metodo che aggiunga l’IVA ad ogni prezzo contenuto
        ad una lista di prezzi e li stampi*/
        List<Double> priceList = Arrays.asList(10.0,120.0,200.0);
        List<Double> priceWithIva = priceList
                .stream()
                .map(price -> price * (1 + (IVA / 100)))
                .collect(Collectors.toList());
        priceWithIva.forEach(System.out::println);

        //4) Stampa i numeri dispari da 1 a 10
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
            numberList.add(i);

        numberList.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    //4) metodo rapido
        IntStream.range(0,10).filter(x -> x % 2 != 0).forEach(System.out::println);
    }
}
