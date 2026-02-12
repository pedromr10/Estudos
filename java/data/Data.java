package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args){
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);

        Instant d03 = Instant.now(); //gera com gmt de Londres
        System.out.println(d03);

        //o parse converte a string no tipo data
        LocalDate d04 = LocalDate.parse("2025-05-20");
        System.out.println(d04);

        LocalDateTime d05 = LocalDateTime.parse("2025-05-20T01:30:24");
        System.out.println(d05);

        Instant d06 = Instant.parse("2025-05-20T01:30:24Z");
        System.out.println(d06);

        Instant d07 = Instant.parse("2025-05-20T01:30:24-03:00");
        System.out.println(d07);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("12/02/2025", fmt1);
        System.out.println(d08);
    }
}
