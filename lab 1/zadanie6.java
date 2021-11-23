

import java.util.Scanner;


class zadanie6 {

   public static void main(String args[])
   {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj pierwsza liczbe:");
       float a = scanner.nextFloat();
       System.out.println("Podaj druga liczbe:");
       float b = scanner.nextFloat();
       System.out.println("Podaj trzecia liczbe c:");
       float c = scanner.nextFloat();
       

      
       if((a>b)&&(b>c)&&(a>c))
       {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
       }
      
       else if((b>a)&&(b>c)&&(a>c))
       {
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
       }
      
      else if((c>b)&&(c>a)&&(b>a))
       {
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
       }
      
       else if((c>b)&&(c>a)&&(a>b))
       {
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
       }
   }
}

