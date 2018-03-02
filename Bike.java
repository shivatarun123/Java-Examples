package Recursion.Encapsulation;

public class Bike {
    private int wheels ;

    public void setWheels(int wheels) {
        if(wheels ==2 )
        this.wheels = wheels;
        else
            System.out.println("Bikes do not have "+ wheels+" wheels");
    }

    public int getWheels() {
        return wheels;
    }
}
