package ClassAndObjects;


public class Instance {
  public static void main(String args[]){
      Employee Tarun =new Employee();
      Tarun.setAge(36);
      Tarun.setName("M.S Dhoni");
      Tarun.setCoutry("India");
   System.out.println("age: "+Tarun.getAge());
   System.out.println("name: "+Tarun.getName());
   System.out.println("country: "+Tarun.getCoutry());
  }
}
