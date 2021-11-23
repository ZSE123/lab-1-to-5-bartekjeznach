import java.util.Scanner;
public class zadanie7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wspolrzedna x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Podaj wspolrzedna y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Podaj wspolrzedna x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Podaj wspolrzedna y2: ");
        int y2 = scanner.nextInt();

        float odlegloscx = x1 - x2;
        float odlegloscy = y1 - y2;
        double odlegosc = Math.sqrt(Math.pow(odlegloscx, 2)+Math.pow(odlegloscy, 2));
        System.out.println("Odleglosc wynosi: "+odlegosc);
    }
}