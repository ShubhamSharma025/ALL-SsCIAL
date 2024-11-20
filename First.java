public class First {

    public static void main(String[] args) {
      /*    
        String a = "Shubham";
        String b ="Shubham";
 System.out.println(a == b);

 this == operator checks the object of the refernce variable which they are pointing to 

*/

        String a = new String("shubham");
        String b = new String("shubham");

        System.out.println(a.equals(b));
//equals method checks the value of the string that they are store inside the heap
       System.out.printf("pie :%.3f",Math.PI);
       //%3f its called the palce holder and its  also round of the numbers 
    }
}
