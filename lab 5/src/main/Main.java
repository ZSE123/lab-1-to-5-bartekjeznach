package main;

public class Main {

    public static void main(String[] args) {
        Vechicle name = new Vechicle();
        Engine model = new Engine();
        Color kolor  = new Color();


        System.out.println("Nazwa pojazdu:");
        name.name_1();
        System.out.println("Silnik: ");
        Engine.model_1();
        System.out.println("Kolor :");
        Color.kolor_1();
    }

}