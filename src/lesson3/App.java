package lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        ArrayList<String> massivSlov = new ArrayList<>();
        massivSlov.add("Печанька");
        massivSlov.add("Булочка");
        massivSlov.add("Хлеб");
        massivSlov.add("Ватрушка");
        massivSlov.add("Хлеб");
        massivSlov.add("Печанька");
        massivSlov.add("Кекс");
        massivSlov.add("Пицца");
        massivSlov.add("Бублик");
        massivSlov.add("Кекс");
        massivSlov.add("Пицца");

        Set<String> uniqueList = new LinkedHashSet<>(massivSlov);
        System.out.println(uniqueList);

        HashMap<String, Integer> doubleSlova = new HashMap<>();
        Integer doubleSlova1 = null;
        for (String i : massivSlov) {
            doubleSlova1 = doubleSlova.get(i);
            doubleSlova.put(i, doubleSlova1 == null ? 1 : doubleSlova1 + 1);
        }
        System.out.println(doubleSlova);
    }
}
