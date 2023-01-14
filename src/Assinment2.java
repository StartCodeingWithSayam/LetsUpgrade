import java.util.Scanner;
class Assinment2 {
    public static void main(String[] args) {
        // Write a program to find the sum of 5 integers.
        Scanner in = new Scanner(System.in);
        int n = 0, s = 0;
        System.out.println("Input the 5 numbers : ");
        for (int i = 0; i < 5; i++) {
            n = in.nextInt();
            s += n;
        }
        System.out.println("The sum is: "+s);
    }
}