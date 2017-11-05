package com.udemy.inheritance;

public class AlfaRomeo extends Car{

    private int keyNumber;

    public AlfaRomeo(String brand, String model, int modelYear, String color,
                     int engineSize, String typeOfFuel) {
        super(brand, model, modelYear, color, engineSize, typeOfFuel);
        this.keyNumber = 1235;
    }

    public void checkKeyNumber(){
        int keyNumber = 1235;
        if(this.keyNumber == keyNumber) {
            System.out.println("Starts car");
        }
    }

    @Override
    public void drive() {
        try{
            System.out.println("Checking key number...");
            Thread.sleep(1500);
            checkKeyNumber();
            super.drive();

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
