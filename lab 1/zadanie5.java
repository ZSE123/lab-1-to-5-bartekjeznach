import java.util.Scanner;

class zadanie5 {
    public static void main(String[] args) throws Exception {
	Scanner scanner = new Scanner(System.in);
	int Liczba = scanner.nextInt();
        
		switch (Liczba) {
            case 1:
                System.out.println("poniedzialek");
                break;
            case 2:
                System.out.println("wtorek");
                break;

            case 3:
                System.out.println("sroda");
                break;

            case 4:
                System.out.println("czwartek");
                break;

            case 5:
                System.out.println("piatek");
                break;

            case 6:
                System.out.println("sobota");
                break;

            case 7:
                System.out.println("niedziela");
                break;

       



          default:

        }
    }
}