package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o numero do quarto: ");
            int roomNumber = sc.nextInt();

            System.out.print("Check-In (dd/mm/aaaa): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), formatter);

            System.out.print("Check-Out (dd/mm/aaaa): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), formatter);

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);

            System.out.println("Atualizo dos dados da reserva:");

            System.out.print("Check-In (dd/mm/aaaa): ");
            checkIn = LocalDate.parse(sc.next(), formatter);

            System.out.print("Check-Out (dd/mm/aaaa): ");
            checkOut = LocalDate.parse(sc.next(), formatter);

            reservation.updateDates(checkIn, checkOut);
        } catch (DateTimeParseException e) {
            System.out.println("Data Inválida!");
        } catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado!");
        }
    }
}