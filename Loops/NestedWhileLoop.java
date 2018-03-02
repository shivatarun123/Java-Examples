public class NestedWhileLoop {

    public static void main(String srgs[]){
        int i=1;
        int j;
        while(i<=6) {
             j=1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
           i++;
        }
    }

}
