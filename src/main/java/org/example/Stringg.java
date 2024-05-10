package org.example;

public class Stringg {
    public static void main(String[] args) {
        String dizge = "adana";
        int a = dizge.length();
        System.out.println("karakter katarının uzunluğu : " + a);

        // concat metodu ile string ifadeleri birleştirme bunun "+" operatöründen farkı sadece string ifadeleri birleştirebilir
        String city1="mersin";
        String city2="adana";
        String city3=city1.concat(city2);
        System.out.println(city3);

        // eşitlik kontrolü
        String a1="Edirne";
        String a2="edirne";
        System.out.println(a1.equals(a2));   // burası false döndürür çünkü bu metotta küçük büyük harf duyarlılığı vardır
        System.out.println(a1.equalsIgnoreCase(a2)); // burası true döndürür çünkü bu metotta küçük büyük harf duyarlılığı yoktur

        // REGIONMATCHES belirli bölgenin karşılaştırılması
        String d1="Ankara Türkiye'nin başkentidir.";
        String d2="Türkiye";
        boolean b;
        b=d1.regionMatches(7,d2,0,d2.length()); // ilk parametre karşılaştır hangi indisten başlicak,
        // ikici parametre hangi string ile karşılaştırılacak,
        // üçüncü parametre ise parametre olarak verilen string ifadenin kaçıncı indisi ile başlicak,
        // dördüncü parametre ise karşılaştırmanın kaç karakter devam edeceğidir

        if (b==true){
            System.out.println("aranan bölgede ---" +d2+ "--- bulundu");
        }else {
            System.out.println("aranan bölgede ---"+ d2+"--- bulunamadı");
        }

        // startWith ve endsWith ile bir fadenin başlangıç ve bitiş kontrolü
        String dizge1="JAVA Programlama Dili";
        boolean kontrol;

        kontrol=dizge1.startsWith("JAVA");
        System.out.println(kontrol);
        kontrol=dizge1.endsWith("Dili");
        System.out.println(kontrol);

        // substring ile bölüm seçme
        String n1="adana";
        System.out.println(n1.substring(0,2));
        String n2;
        n2=n1.substring(0,3);
        System.out.println(n2);

        // trim ile boşluk silme

        String m1="  JaVA   ";
        System.out.println(m1.trim());
        // toUpperCase ve tuLowerCase ile hepsini büyük ve küçük yapma
        System.out.println(m1.toLowerCase());
        System.out.println(m1.toUpperCase());


        // kelime atama
        String c1="Learn  1 Java earn  123 money";
        String c2=c1.replace("money","dollar"); // Learn Java earn dollar
        System.out.println(c2);
        String c3=c1.replace("e","");
        System.out.println(c3);
        String c4=c1.replaceAll("[0-9]","*");  // tüm rakamları yıldıza cevirir
        System.out.println(c4);


    }
}
