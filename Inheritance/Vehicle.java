package Inheritence;

public class Vehicle {

    protected String name;
    private int year;
    private String color;
    private String type;
    protected int wheels;
    public Vehicle(String name, int year, String color, String type,int wheels){
        this.color=color;
        this.name=name;
        this.type=type;
        this.year=year;
        this.wheels=wheels;
    }

    public String getWheels(){
        return "this is from vehicle class";
    }

}
