import java.util.Scanner;

/*
    An object's momentum is its mass multiplied by its velocity. Write a program 
    that expects an objects mass (in kg) and velocity (meters per second) as 
    inputs and prints out its momentum. Write the output in complete sentence 
    with the correct unit behind it.
*/
public class Momentum {

    static Scanner keyboard = new Scanner(System.in);

    double mass;
    double velocity;
    double momentum;

    public static void main(String[] args) {
        System.out.print("Mass :: ");
        double mass = keyboard.nextDouble();
        System.out.print("Velocity :: ");
        double velocity = keyboard.nextDouble();
        double momentum = mass * velocity;
        System.out.print(momentum);
    }

}