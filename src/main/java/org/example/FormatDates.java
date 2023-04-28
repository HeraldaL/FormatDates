package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {

    public static void main(String[] args) {

        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();


        // Format the date in various ways

        // Format 1: MM/dd/yyyy
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = now.format(formatter1);
        System.out.println(formattedDate1);

        // Format 2: yyyy-MM-dd
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = now.format(formatter2);
        System.out.println(formattedDate2);

        // Format 3: MMMM d, yyyy
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate3 = now.format(formatter3);
        System.out.println(formattedDate3);

        // Format 4: EEEE, MMM d, yyyy
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
        String formattedDate4 = now.format(formatter4);
        System.out.println(formattedDate4);

        // Format 5: h:mm on dd-MMM-yyyy
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy");
        String formattedDate5 = now.format(formatter5);
        System.out.println(formattedDate5);
    }

}