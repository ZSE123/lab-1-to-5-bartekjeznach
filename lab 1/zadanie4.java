
import java.util.Scanner;

class zadanie4 {
    public static void main(String[] args) {
       
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj pierwszy bok a:");
float bok_a = scanner.nextFloat();
System.out.println("Podaj drugi bok b:");
float bok_b = scanner.nextFloat();
System.out.println("Podaj trzeci bok c:");
float bok_c = scanner.nextFloat();


    if ((bok_a+bok_b>bok_c) && (bok_a+bok_c>bok_b) && (bok_b+bok_c>bok_a))
    {
        System.out.println("tak");


    }
    else
    {

        System.out.println("Nie ");

    }
    
    }
}