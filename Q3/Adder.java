import java.util.*;
import java.io.*;

public class Adder {
    public static int readNumber(Scanner sc, int number){
        while (true){
            try{
                System.out.print("Enter num " + number + "> ");
                int num = sc.nextInt();
                System.out.println();
                return num;
            } catch (InputMismatchException e){
                System.out.println("Please enter a number!");
                sc.nextLine();
            }
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1 = readNumber(sc, 1);
        int num2 = readNumber(sc, 2);

        int sum = num1 + num2;

        System.out.println("The answer is " + sum);
    }
}