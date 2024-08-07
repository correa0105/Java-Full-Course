package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Morgana");
        list.add("Bob");
        list.add("Iuri");
        list.add("Israel");
        list.add("Ana");
        list.add(2, "Igor");
        list.add("Maicon");
        list.add("Marcio");

        System.out.println("Lista Original @@");

        for(String name : list) {
            System.out.println(name);
        }

        System.out.println("Tamanho da Lista: " + list.size());

        list.remove("Ana");
        list.remove(1);

        System.out.println(" ");
        System.out.println("Lista Mod1 @@");

        for(String name : list) {
            System.out.println(name);
        }

        System.out.println("Tamanho da Lista: " + list.size());

        list.remove("Ana");
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println(" ");
        System.out.println("Lista Mod2 @@");
        for(String name : list) {
            System.out.println(name);
        }

        System.out.println("Tamanho da Lista: " + list.size());

        System.out.println(" ");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bob: " + list.indexOf("Antonio"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'I').toList();

        System.out.println(" ");
        System.out.println("Lista Mod3 @@");
        for(String name : result) {
            System.out.println(name);
        }

        System.out.println(" ");
        String name = list.stream().filter(x -> x.charAt(0) == 'I').findFirst().orElse(null);
        System.out.println(name);

    }
}