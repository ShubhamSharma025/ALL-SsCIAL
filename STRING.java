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
    }


}
