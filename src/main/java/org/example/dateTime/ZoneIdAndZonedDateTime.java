package org.example.dateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdAndZonedDateTime {
    public static void main(String[] args) {
        ZoneId timeZone = ZoneId.of("Asia/Hong_Kong");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(timeZone);
        System.out.println(zonedDateTime);
    }
}
