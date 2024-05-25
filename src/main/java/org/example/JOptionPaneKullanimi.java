package org.example;

import javax.swing.*;
import java.awt.*;
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
        int hak = 5;
        Random r = new Random();
        int sayi1 = r.nextInt(20);

        while (hak > 0) {
            String iconPath = "/png.png"; // resources klasöründeki icon.png dosyasına erişmek için kök dizinden başlayarak yolu belirtin.

            // Kaynak dosyasına erişim
            java.net.URL imgURL = Main.class.getResource(iconPath);
            if (imgURL != null) {
                // ImageIcon oluşturma ve yeniden boyutlandırma
                ImageIcon originalIcon = new ImageIcon(imgURL);
                Image originalImage = originalIcon.getImage();
                Image resizedImage = originalImage.getScaledInstance(64, 64, Image.SCALE_SMOOTH); // 64x64 boyutunda ölçeklendir
                ImageIcon resizedIcon = new ImageIcon(resizedImage);

                UIManager.put("OptionPane.okButtonText", "tamam"); // ok kısmı yerine türkçe tamam görülecek
                UIManager.put("OptionPane.cancelButtonText", "iptal");

                String tahmin = JOptionPane.showInputDialog(null, "1-20 arasında sayı tahmin et ", "tahmin oyunu", JOptionPane.INFORMATION_MESSAGE, resizedIcon, null, null).toString();
                int t = Integer.parseInt(tahmin);
                hak--;
                if (t == sayi1) {
                    String mesaj = "tahmin doğru - " + i + ". tahminde bildiniz";

                    JOptionPane.showMessageDialog(null, mesaj, "VICTORY!!!", JOptionPane.OK_OPTION);
                    break;
                } else if (t < sayi1) {
                    String mesaj1 = "tahmini yükselt - " + hak + "hakkın kaldı";
                    JOptionPane.showMessageDialog(null, mesaj1, "BİL BAKALIM!!!", JOptionPane.OK_OPTION);
                } else {
                    String mesaj2 = "tahmini düşür - " + hak + "hakkın kaldı";
                    JOptionPane.showMessageDialog(null, mesaj2, "BİL BAKALIM!!!", JOptionPane.OK_OPTION);

                }
                i++;
                if (hak == 0) {
                    String mesaj3 = "kaybettin";
                    JOptionPane.showMessageDialog(null, mesaj3, "Pes etme", JOptionPane.OK_OPTION);
                }
            }
        }
    }}
