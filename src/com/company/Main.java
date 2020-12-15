package com.company;

import java.awt.datatransfer.StringSelection;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        while (a.size() < 5) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            a.add(s);
        }
        System.out.println("Список А:");
        print(a);

        ArrayList<String> b = new ArrayList<>();
        while (b.size() < 5) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            b.add(s);
        }
        System.out.println("Список Б:");
        print(b);
        Collections.reverse(b);

        ArrayList<String> c = new ArrayList<>();
        System.out.println("Список С:");
        Iterator<String> iterator = b.iterator();
        while (iterator.hasNext()) {
            Iterator<String> iterator1 = a.iterator();
            while (iterator1.hasNext()) {
                String s = iterator1.next();
                c.add(s);
                System.out.println(s);
                iterator1.remove();
                break;
            }
            String p = iterator.next();
            c.add(p);
            System.out.println(p);
        }
        print(c);

        c.sort(Comparator.comparing(String::length));
        System.out.println("Отсортированный список С:");
        print(c);

    }

    public static void print(ArrayList<?> list) {
        System.out.println("______________________");
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("______________________");
    }

}