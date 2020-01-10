package TheTimeDisplayProgram;

public class TheTimeDisplayProgram2 {

    public static void main( String[] args ) {

        int startingmiliseconds = 1000123;
        System.out.print("Starting Miliseconds: ");
        System.out.println(startingmiliseconds);
        System.out.print("Hours: ");
        System.out.println(getHours(startingmiliseconds));
        System.out.print("Minutes: ");
        System.out.println(getMinutes(startingmiliseconds));
        System.out.print("Seconds: ");
        System.out.println(getSeconds(startingmiliseconds));
        System.out.print("Miliseconds: ");
        System.out.println(getMiliSeconds(startingmiliseconds));
    }

    public static int getSeconds(int startingmiliseconds) {
        return startingmiliseconds/1000;
    }
    public static int getHours(int startingmiliseconds) {
        return (startingmiliseconds/1000)/3600;
    }
    public static int getMinutes( int startingmiliseconds) {
        return ((startingmiliseconds/1000) % 3600) / 60;
    }
    public static int getMiliSeconds( int startingmiliseconds) {
        return ((startingmiliseconds/1000) % 3600) % 60;
    }
}    
