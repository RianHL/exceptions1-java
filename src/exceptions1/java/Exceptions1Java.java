package exceptions1.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entitties.Reservation;

public class Exceptions1Java {
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("\nRoom Number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date check_in = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date check_out = sdf.parse(sc.next());
        Date now = new Date();
        if (check_in.before(now) || check_out.before(now)){
            System.out.println("Error in reservation: Check-out date must be before the now date");
        }
        if(!check_out.after(check_in)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else{
            Reservation reservation = new Reservation(number, check_in, check_out);
            System.out.println("Reservation: " + reservation);
            System.out.println("Enter data to update to reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date check_in_update = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date check_out_update = sdf.parse(sc.next());
            if (check_in_update.before(now) || check_out_update.before(now)){
            System.out.println("Error in reservation: Check-out date must be before the now date");
            }
            
            if(!check_out_update.after(check_in)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
            }
            else{
                reservation.updateDates(check_in_update, check_out_update);
                System.out.println("Reservation: " + reservation);
            }
        }
    sc.close();
    }   
    
}
