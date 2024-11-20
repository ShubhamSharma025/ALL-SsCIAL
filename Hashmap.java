import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmap {

    public static void main(String args[]){  
        
        HashMap<String,String> Hey = new HashMap<>();
   
    Hey.put("how are ","you" );
    Hey.put("platform", "vscode");
 
    System.out.println(Hey);
    System.out.println(Hey.size());

    String Lang = Hey.get("how are ");
    System.out.println("how are :" + Lang);

    boolean containsKey = Hey.containsKey("platform");
    System.out.println("id the platform vscode?"+ containsKey);


    Set<String> keySet = Hey.keySet();
        System.out.println("Key Set: " + keySet);

        Collection<String> values = Hey.values();
        System.out.println("Values: " + values);

        String removeval = Hey.remove("platform");
        System.out.println(removeval);
        Hey.clear();
        System.out.println("after clearing hashmap" + Hey);

        boolean isEmpty =Hey.isEmpty();
        System.out.println("iS EMPTY?"   +isEmpty);
    }
    
}
