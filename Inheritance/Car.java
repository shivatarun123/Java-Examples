package Inheritence;

public class Car extends Vehicle {
    private  int milege;
    public Car(String name,String type, int year,String color,int wheels,int milege ){
        super(name,year,color,type,wheels);
        this.milege=milege;
    }

    private String typeofVehicle(){
        return "this is car";

    }

    @Override
    public String getWheels(){
        System.out.println(super.getWheels());
        return "this is from class car";
    }
}
