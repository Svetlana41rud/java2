package lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class MainTelephoneDirectory {
    public static void main(String[] args) {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("Ваня", 451223);
        telephoneDirectory.add("Сергей", 526142);
        telephoneDirectory.add("Андрей", 361542);
        telephoneDirectory.add("Ваня", 852147);
        telephoneDirectory.add("Андрей", 96321);
        telephoneDirectory.add("Настя", 147896);
        telephoneDirectory.add("Оксана", 521493);


telephoneDirectory.get("Ваня");
    }

}
class TelephoneDirectory{
HashMap<String, HashSet<Integer>> telephoneDirectory1;
    TelephoneDirectory (){
        this.telephoneDirectory1 = new HashMap<>();
    }

    void add(String name, int num) {
        HashSet<Integer> telephoneDirectory = telephoneDirectory1.getOrDefault(name, new HashSet<>());
        telephoneDirectory.add(num);
        telephoneDirectory1.put(name, telephoneDirectory);
    }

    void get(String name) {

        System.out.printf(name+ ": "+ telephoneDirectory1.getOrDefault(name, new HashSet<>()));
    }
}
