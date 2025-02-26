package Week5_program;

import java.util.Random;
import java.util.Scanner;

class Vehicle {
    protected int speed;
    public Vehicle(int speed){
        this.speed = speed;
    }

    public Vehicle(){
        this.speed = 5;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void starts(){
        System.out.println("Week5_program.Vehicle is starting...");
    }
}
class Car extends Vehicle{
    private boolean running;
    public Car(){
        this.speed = 2;
        this.running = false;
    }

    public Car(boolean running){
        super();
        this.running = running;
    }



    public Car(int speed, boolean running){
        this.speed = (speed == -1) ? 2: speed;
    }

    public boolean getRunning(){
        return this.running;
    }

    public void setRunning(boolean running){
        this.running = running;
    }
    void drive(){
        super.starts();
        this.setRunning(true);
        System.out.println("Week5_program.Car is now driving");
    }
}




public class CIS332_Car {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        System.out.println(myCar.getSpeed());
        System.out.println(myCar.getRunning());

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean exit = false;
        while(!exit){
            System.out.println("Enter your choice\n" +
                    "1 - jump\n" +
                    "0 - exit");
            int selection = scanner.nextInt();
            scanner.nextLine();

            switch(selection){
                case 0:
                    exit = true;
                    break;
                case 1:
                    System.out.println("The car jumped");
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }
}