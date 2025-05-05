package chainOfCommand;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Reads a full line of input

        System.out.print("Enter your age: ");
        int age = sc.nextInt();       // Reads an integer

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
