import java.util.Set;
import java.util.TreeSet;

public class Arrays {
  
  public static void main(String[] args) {
    int []num = {41,86,25,69,72};
    System.out.println(num.length);

    Set<Integer> sortedSet = new TreeSet<>();

sortedSet.add(1);
sortedSet.add(2);
sortedSet.add(3);
sortedSet.add(4);
sortedSet.add(5);
sortedSet.add(6);
sortedSet.add(7);
System.out.println(sortedSet); // Output: [1, 2, 3]

  }
}
