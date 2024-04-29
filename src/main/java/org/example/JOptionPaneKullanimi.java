package org.example;

import javax.swing.*;
import java.util.Random;

public class JOptionPaneKullanimi {
    public static void main(String[] args) {

        // Kullanıcan veri alma
        // girilen değer string tipinde eğer ki matematiksel işlem yapmak istiyorsak parseInt ile cast yapabilirsin
        //     String sayi= JOptionPane.showInputDialog("Bir sayı girin");
        //    int yeniSayi=Integer.parseInt(sayi); // cast işlemi yapıldı ve artık yeni sayı üzerinde matematiksel işlem yapılabilir

        // bilgi mesajı gösterme
        // sondaki paramete ikon resmidir
        // JOptionPane.showMessageDialog(null,"bilgilendirme mesajı","başlıkkk",JOptionPane.OK_OPTION);

        int i = 1;
        int hak=5;
        Random r = new Random();
        int sayi1 = r.nextInt(20);

        while (hak>0) {
            String tahmin = JOptionPane.showInputDialog("sayıyı tahmin et!!");
            int t = Integer.parseInt(tahmin);
            hak--;
            if (t == sayi1) {
                String mesaj = "tahmin doğru - " + i + ". tahminde bildiniz";
                JOptionPane.showMessageDialog(null, mesaj);
                break;
            } else if(t<sayi1){
                String mesaj1= "tahmini yükselt - " +hak+"hakkın kaldı" ;
                JOptionPane.showMessageDialog(null, mesaj1);
            } else   {
                String mesaj2 = "tahmini düşür - "+hak +"hakkın kaldı"  ;
                JOptionPane.showMessageDialog(null, mesaj2);

            }
            i++;
            ;
            if (hak==0){
                String mesaj3="kaybettin";
               JOptionPane.showMessageDialog(null,mesaj3);
            }
        }
    }
}
