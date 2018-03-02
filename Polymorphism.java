class Car{

    boolean engine;
    String name;
    int wheels;
    int cylinders;

    public Car( String name, int cylinders) {
        this.engine = true;
        this.name = name;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public boolean getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("start() engine in car class");
    }
    public void brake(){
        System.out.println("brake() in car class");
    }
    public void accelerate(){
        System.out.println("accelerate() car class");
    }

}
class Ferrari extends Car {
    public Ferrari(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("start() engine in Ferrari class");
    }

    @Override
    public void brake() {
        System.out.println("brake() in Ferrari class");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate() Ferrari class");

    }
}

    class Audi extends Car {
        public Audi(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public void startEngine() {
            System.out.println("start() engine in audi class");
        }

        @Override
        public void brake() {
            System.out.println("brake() in audi class");
        }

        @Override
        public void accelerate() {
            System.out.println("accelerate() audi class");

        }
    }
//subclasses ferrari and audi were created
public class Polymorphism {
    public static void main(String[] args) {
        Car ferrari= new Ferrari("ferrari",4);  //super class reference for subclass object
        Car audi = new  Audi("audi",5);
        System.out.println(ferrari.getName()+" has "+ferrari.getCylinders()+" cylinders");
        ferrari.brake();
        audi.brake();
    }

        }
/*output
ferrari has 4 cylinders
brake() in Ferrari class
brake() in audi class
*/
