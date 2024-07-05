import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class HashmapDemo {
  
  public static void main(String[] args) {
    HashMap<Integer, String>  hashmap = new HashMap<>();
    hashmap.put(1, "Sandesh");
    hashmap.put(2, "Piyush");
    hashmap.put(3, "Ram");
    hashmap.put(4, "Vaibhav");

  // Set<Integer> s= hashmap.keySet();
   /*for(int i:s){
    System.out.println("Keys "+i);
    System.out.println("Key Values "+hashmap.get(i));
   }*/
    Set<Integer> slm= hashmap.keySet();
   Iterator <Integer> itr=slm.iterator();
   while (itr.hasNext()) {
    int i =itr.next();
    System.out.println("Key is "+i+ " and its value is "+ hashmap.get(i));
   }
  }
}
