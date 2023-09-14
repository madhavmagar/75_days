import java.util.*;

public class Hashmap {
    public static void main (String[] args) {
        
        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        
        happy.put("a", 10);
        happy.put("b", 20);
        happy.put("c", 30);
        
        happy.remove("a");
        
        System.out.println(happy);
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.putAll(happy);
        
        System.out.println(hm);
    }
}