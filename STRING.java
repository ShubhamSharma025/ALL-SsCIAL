
public class STRING {
    public static void main(String[]args){
        String  st ="java";
        String st2 ="java";

        System.out.println("str == st2 " + (st == st2));

        String st3= new String("java");
        String st4= new String("java");

        System.out.println("st3 == st4 " + (st3  == st4));

        String st5 = st3.intern();
        System.out.println(st==st5);

        String st6 = new String("java").intern();
        System.out.println(st==st6);

        String ss1="hello";  
String ss2="hello";  
String ss3="meklo";  
String ss4="hemlo";  
String ss5="flag";  
System.out.println(ss1.compareTo(ss2));//0 because both are equal  
System.out.println(ss1.compareTo(ss3));//-5 because "h" is 5 times lower than "m"  
System.out.println(ss1.compareTo(ss4));//-1 because "l" is 1 times lower than "m"  
System.out.println(ss1.compareTo(ss5));//2 because "h" is 2 times greater than "f" 
    }


}

   
