package org.example;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        String iconPath = "/png.png";

        // ImageIcon oluşturma
        ImageIcon customIcon = new ImageIcon(Main.class.getResource(iconPath));



        // UIManager kullanarak bilgi mesajı simgesini değiştirme
        UIManager.put("OptionPane.informationIcon", customIcon);

        // Örnek bir bilgi mesajı gösterme
        JOptionPane.showMessageDialog(null, "Bu bir bilgi mesajıdır.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
    }
    }
