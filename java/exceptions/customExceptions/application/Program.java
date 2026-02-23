package exceptions.customExceptions.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import exceptions.customExceptions.model.entities.Reservation;
import exceptions.customExceptions.model.exceptions.DomainException;

import java.util.Date;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            //caso dê algum exception no try, seja na parte das datas ou no updateDates, entra nos catch
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());


            Reservation res = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + res);

            System.out.println();
            System.out.println("Enter data to update reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            res.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + res);
        }
        catch(ParseException e){
            System.out.println("Invalid date format");
        }
        catch(DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        
        sc.close();
    }
}
