import java.util.Scanner;

public class Assinment {
    public static void main(String[] args) {
        // Write a program to get a number from the user and print whether it is positive or negative
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        if(d>0)
            System.out.println("Number is positive");
        else if(d<0)
            System.out.println("The number is negitive");
        else
            System.out.println("The number is zero.");
    }
}
