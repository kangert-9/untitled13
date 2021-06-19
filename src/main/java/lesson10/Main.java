package lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //первое задание
        Set <String> setFruit = new HashSet<>();
        setFruit.add("яблоко");
        setFruit.add("персик");
        setFruit.add("ананас");
        setFruit.add("яблоко");
        setFruit.add("банан");
        setFruit.add("мандарин");
        setFruit.add("манго");
        setFruit.add("манго");
        setFruit.add("апельсин");
        setFruit.add("апельсин");
        setFruit.add("персик");
        setFruit.add("киви");
        setFruit.add("маракуйя");
        setFruit.add("персик");
        setFruit.add("банан");
        setFruit.add("киви");
        setFruit.add("груша");
        setFruit.add("апельсин");
        setFruit.add("грейпфрут");
        setFruit.add("ананас");
        System.out.println(setFruit);

        //второе задание
        //к сожалению, не получилось через мап
        List <String> listFruit = new ArrayList<>();
        listFruit.add("яблоко");
        listFruit.add("персик");
        listFruit.add("ананас");
        listFruit.add("яблоко");
        listFruit.add("банан");
        listFruit.add("мандарин");
        listFruit.add("манго");
        listFruit.add("манго");
        listFruit.add("апельсин");
        listFruit.add("апельсин");
        listFruit.add("персик");
        listFruit.add("киви");
        listFruit.add("маракуйя");
        listFruit.add("персик");
        listFruit.add("банан");
        listFruit.add("киви");
        listFruit.add("груша");
        listFruit.add("апельсин");
        listFruit.add("грейпфрут");
        listFruit.add("ананас");
        System.out.println(listFruit);


        for (String item: setFruit) {
            int countF=Collections.frequency(listFruit, item);
            System.out.println(item + " "+ countF);
        }

        //третье задание, к сожалению не успела(((
    }
}



