import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter Years :: ");
    int years = keyboard.nextInt();
    int days = years * 360;
    int hours = days * 24;
    int minutes = hours * 60;
    System.out.println("Minutes :: " + minutes);
    }
}