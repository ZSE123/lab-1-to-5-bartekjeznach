public class zadanie4{

public static void main(String[]args) {


    int [][] tablicaw = new int[10][10];

    for(int i = 1; i<tablicaw.length; i++){

        int[]tablicaj = tablicaw[i];
        for(int j = 1; j < tablicaj.length; j++){

            System.out.print(tablicaw[i][j] + " ");

         }
            System.out.println();
        }
    }
}