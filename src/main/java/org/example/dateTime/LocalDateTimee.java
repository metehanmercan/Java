package org.example.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimee {
    public static void main(String[] args) {
        // sadece tarihi bilgisini tutar
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);



        // sadece saat bilgisini tutar
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        //  hem tarih hem saat bilgilerini tutar
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("----------");

        System.out.println(localDateTime); // varsayılan format
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("d.MMMM.yyyy"))); // cıktısı -> 29.Nisan.2024
        System.out.println(localDateTime.plusHours(1)); // saati  arttırır
        System.out.println(localDateTime.plusDays(1));  // günü arttırır
        System.out.println(localDateTime.plusMinutes(5));  // dkyı arttırır
        
    }
}
