package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Dizi {
    public static void main(String[] args) {
        // array kopyalama
        int[] dizi1 = {1, 3, 5, 7, 9};
        int[] dizi2 = new int[5];
        System.arraycopy(dizi1, 0, dizi2, 0, 5);
        for (int i = 0; i < dizi2.length; i++)
            System.out.print(dizi2[i] + " ");

        System.out.println();

        // dizi sıralama
        int[] dizi={6,4,8,2,0,12,16};
        Arrays.sort(dizi);
        for (int j=0;j<dizi.length;j++)
        System.out.print(dizi[j] + " ");
        System.out.println();

        // istersek parametreli sıralama
        int[] dizi3={3,4,8,1,0,13,11};
        Arrays.sort(dizi3,0,5); // başlangıç indisi dahil toindex dahil değil
        for (int k=0;k< dizi3.length;k++)
        System.out.print(dizi3[k]+" ");
        System.out.println();


        // dizide eşitlik kontrolü eğer ki sıralama yapmadan eşit mi diye kontrol etseydik false dönecekti
        int[] dizi4={1,3,5};
        int[] dizi5= {3, 1,5};
        Arrays.sort(dizi5);
        System.out.println(Arrays.equals(dizi4,dizi5));

        // diziyi liste yapısına kopyalama
        String[] ciyts={"adana","ankara","mersin"};
        List lists=new ArrayList();
        lists=Arrays.asList(ciyts);
        System.out.println(lists); // cıktısı bu -> [adana, ankara, mersin]

        System.out.println("-------");

        int[] x={1,2,3,4,5,6,7};
        Iterator<Integer> itr= Arrays.stream(x).iterator();  // iteratör ile dizi gezme
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
