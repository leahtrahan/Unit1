package TheTimeDisplayProgram;

import java.util.Scanner;

public class TheTimeDisplayProgram {

    public static void main( String[] args ) {
        int startingseconds;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Starting Seconds :: ");
        startingseconds = keyboard.nextInt();
    
        System.out.print("Starting Seconds: ");
        System.out.println(startingseconds);
        System.out.print("Hours: ");
        System.out.println(getHours(startingseconds));
        System.out.print("Minutes: ");
        System.out.println(getMinutes(startingseconds));
        System.out.print("Seconds: ");
        System.out.println(getSeconds(startingseconds));
    }

    public static int getHours(int startingseconds) {
        return startingseconds / 3600;
    }
    public static int getMinutes( int startingseconds) {
        return (startingseconds % 3600) / 60;
    }
    public static int getSeconds( int startingseconds) {
        return (startingseconds % 3600) % 60;
    }
}    

