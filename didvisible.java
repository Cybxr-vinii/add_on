import java.io.*;
import java.util.Scanner;
public class didvisible-3 {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 3 == 0){
            System.out.println("The number is divisible by 3.");
        }
        else{
            System.out.println("The number is not divisible by 3.");
        }

    }
    
}
