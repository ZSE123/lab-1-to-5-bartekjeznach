
import java.util.Scanner;

class zadanie3 {
    public static void main(String[] args) {
       
	   Scanner scanner = new Scanner(System.in);
         System.out.println("Temperatura w celsjuszach:");
        float celsjusze = scanner.nextFloat();
		
       
	
		double farenheit=(9.0/5) * celsjusze + 32;
       System.out.println("Stopnie w farenheitach"+farenheit+" .");
	
	}
}

