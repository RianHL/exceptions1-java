package exceptions1.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entitties.DomainException;
import model.entitties.Reservation;

public class Exceptions1Java {
    public static void main(String[] args){
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try{     
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("\nRoom Number: ");
            int number = sc.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date check_in = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date check_out = sdf.parse(sc.next());
            Date now = new Date();
            Reservation reservation = new Reservation(number, check_in, check_out);
            System.out.println("Reservation: " + reservation);
            System.out.println("Enter data to update to reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date check_in_update = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date check_out_update = sdf.parse(sc.next());
            reservation.updateDates(check_in_update, check_out_update);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch(DomainException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
        sc.close();
    }   
    
}
