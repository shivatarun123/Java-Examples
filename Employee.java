package ClassAndObjects;


public class Employee {

    private String name;
    private String country;
    private int age;
    private String role;

    public void setName( String name){
        this.name=name;
    }
    public void setCoutry( String country){
        this.country=country;
    }
    public  void setAge( int age){
        this.age=age;
    }

    public String getName( ){
        return name;
    }
    public  String getCoutry( ){
        return country;
    }
    public  int getAge( ){
        return age;
    }
}
