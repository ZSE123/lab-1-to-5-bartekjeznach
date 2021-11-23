
import java.util.Scanner;

class zadanie1 {
    public static void main(String[] args) {
       
Scanner scanner = new Scanner(System.in);
int wtablicy = scanner.nextInt();
int tab[]= new int[wtablicy];
int wartablicy = 0;
   
for(int i = 0; i < tab.length; i++)
    {

        wartablicy = scanner.nextInt();
        tab[i] = wartablicy;



    }       
    for(int i = 0; i < tab.length; i++)
    {
    
        System.out.println(tab[i]);

    }
    
    }
}