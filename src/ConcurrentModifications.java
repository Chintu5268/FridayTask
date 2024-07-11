import java.util.ArrayList;
import java.util.List;

public class ConcurrentModifications {
  public static void main(String[] args) {
    List list = new ArrayList<>(5);
    list.add(5);
    list.add(3);
    list.add(4);
    list.add(8);
    list.add(15);

    for (Object itemObject : list) {
      if (itemObject.equals(15)) {
        list.remove(itemObject);
      }
      System.out.println(itemObject);
    }
    
    
  }
}
