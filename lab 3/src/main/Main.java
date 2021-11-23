package main;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wielkosc tablicy:");
        int wielkosc = scan.nextInt();
        int arr[] = new int[wielkosc];
        System.out.println("Pierwszy element:");
        int pelement = scan.nextInt();
        arr[0] = pelement;

        for (int i = 1;i<wielkosc ;i++)
        {

            if (pelement % 2 == 0) {

                pelement += 2;

            } else {

                pelement += 1;

            }
            arr[i] = pelement;

        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Minimalna: " + a_min(arr));
        System.out.println("Maksymalna: " + b_max(arr));
        System.out.println("Suma: " + c_suma(arr));
        System.out.println("Srednia: " + d_sred(arr));

    }

    public static int a_min(int[] min) {
        int min_value = Integer.MAX_VALUE;
        for (int i = 0; i < min.length; i++) {
            if (min[i] < min_value) {
                min_value = min[i];
            }
        }
        return min_value;
    }

    public static int b_max(int[] max) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < max.length; i++) {
            if (max[i] > maxValue) {
                maxValue = max[i];
            }
        }
        return maxValue;
    }

    public static int c_suma(int[] suma) {
        int s = 0;
        for (int i = 0; i < suma.length; i++) {
            s += suma[i];
        }
        return s;
    }

    public static float d_sred(int[] sred) {
        return (float) c_suma(sred) / sred.length;
    }
}
