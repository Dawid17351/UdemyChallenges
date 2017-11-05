package com.udemy.inheritance;

import java.util.Scanner;

public class Car extends Vehicle {

    private int engineSize;
    private String typeOfFuel;

    public Car(String brand, String model, int modelYear, String color, int engineSize, String typeOfFuel) {
        super(brand, model, modelYear, color);
        this.engineSize = engineSize;
        this.typeOfFuel = typeOfFuel;
    }

    private void changeGearComford(int velocity){
        if(velocity >= 0 && velocity <=9){
            System.out.println("Changed to gear 1");
        }else if(velocity >= 10 && velocity <= 40){
            System.out.println("Changed to gear 2");
        }else if(velocity >= 41 && velocity <= 65){
            System.out.println("Changed to gear 3");
        }else if(velocity >= 66 && velocity <= 95){
            System.out.println("Changed to gear 4");
        }else if(velocity >= 96 && velocity <= 120){
            System.out.println("Changed to gear 5");
        }else if(velocity >= 121){
            System.out.println("Changed to gear 6");
        }
        super.move(velocity);
    }

    private void changeGearSport(int velocity){
        if(velocity >= 0 && velocity <=9){
            System.out.println("Changed to gear 1");
        }else if(velocity >= 10 && velocity <= 65){
            System.out.println("Changed to gear 2");
        }else if(velocity >= 66 && velocity <= 100){
            System.out.println("Changed to gear 3");
        }else if(velocity >= 101 && velocity <= 140){
            System.out.println("Changed to gear 4");
        }else if(velocity >= 141 && velocity <= 180){
            System.out.println("Changed to gear 5");
        }else if(velocity >= 181){
            System.out.println("Changed to gear 6");
        }
        super.move(velocity);
    }

    private void showDrivingModeMenu(){
        System.out.println("Menu: ");
        System.out.println("* Comford mode choose 1");
        System.out.println("* Sport mode choose 2\n");
    }

    public void drive(){
        showDrivingModeMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please select driving mode: ");
        int drivingMode = scanner.nextInt();
        int velocity;
        switch(drivingMode){
            case(1):
                System.out.println("Comford mode ");
                System.out.println("Please give your speed");
                velocity = scanner.nextInt();
                changeGearComford(velocity);
                break;
            case(2):
                System.out.println("Sport mode");
                System.out.println("Please give your speed");
                velocity = scanner.nextInt();
                changeGearSport(velocity);
                break;
        }
    }
}
