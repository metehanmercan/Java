package org.example;

import javax.swing.*;
import java.util.NoSuchElementException;
import java.util.Random;

public class JOptionPaneKullanimi {
    public static void main(String[] args) {

        // Kullanıcan veri alma
        // girilen değer string tipinde eğer ki matematiksel işlem yapmak istiyorsak parseInt ile cast yapabilirsin
        //     String sayi= JOptionPane.showInputDialog("Bir sayı girin");
        //    int yeniSayi=Integer.parseInt(sayi); // cast işlemi yapıldı ve artık yeni sayı üzerinde matematiksel işlem yapılabilir

        // bilgi mesajı gösterme
        // sondaki paramete ikon resmidir
//        JOptionPane.showMessageDialog(null,"bilgilendirme mesajı","başlıkkk",JOptionPane.OK_OPTION);

        int i = 1;
        Random r = new Random();
        int sayi1 = r.nextInt(10);

        while (true) {
            String tahmin = JOptionPane.showInputDialog("Tahmin gir");
            int t = Integer.parseInt(tahmin);
            if (t == sayi1) {
                String mesaj = "tahmin doğru - " + i + ".tahminde bildiniz";
                JOptionPane.showMessageDialog(null, mesaj);
                break;
            } else {
                i++;
            }
        }
    }
}
