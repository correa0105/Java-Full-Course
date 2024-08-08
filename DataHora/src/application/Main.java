package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now(); //Data Local
        LocalDateTime d02 = LocalDateTime.now(); //Data Hora Local
        Instant d03 = Instant.now(); //Data Hora Londres GMT

        LocalDate d04 = LocalDate.parse("2022-07-20"); //Conveter Texto p Data
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); //Converte Texto p Data Hora
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); //Subtraindo 3H

        LocalDate d08 = LocalDate.parse("20/07/2024", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2024 04:23", fmt2);

        LocalDate d10 = LocalDate.of(2021, 4, 25);
        LocalDateTime d11 = LocalDateTime.of(2021, 4, 25, 1, 40);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }
}