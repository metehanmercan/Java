package org.example.collections.list;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        // değerler tekrar edebilir
        List<Integer> liste = new java.util.ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(4);
        liste.add(10);
        liste.add(5);
        liste.add(null);

        System.out.println(liste);
        System.out.println(liste.size()); // boyutunu verir
        System.out.println(liste.get(0)); // indexteki elemanı getirir
        System.out.println(liste.indexOf(10)); // 10 ilk olarak hangi indexte onu verir
        liste.add(2, 7); //  burası istediğmiz indexe bir değer ekleyebilir yani sona atmaz araya girer
        System.out.println(liste.contains(4)); // aranan elaman var mı yok mu true false döner
        System.out.println("-------");

        for (Integer element : liste) {
            System.out.println(element);
        }
        System.out.println("-----------");

        Iterator<Integer> itr = liste.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("-----------");

        List<String> citys=new java.util.ArrayList<>();
        citys.add("adana");
        citys.add("mersin");
        citys.add("aydın");

        List<String> city2=new java.util.ArrayList<>();
        city2.addAll(citys);   // listeyi başka liste atama
        System.out.println(city2);

    }
}
