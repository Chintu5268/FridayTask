import java.util.ArrayList;
import java.util.List;

public class MyCLass {
  
  // private list 
  private List<String> myList;

 
  // Constructor

  public MyCLass() {
    myList = new ArrayList<>();
  }

  public void addElment(String element){
    myList.add(element);
  }
  // public method to get the list
  public List<String> geList(){
    return new ArrayList<>(myList);
  }

  public static void main(String[] args) {
    MyCLass object = new MyCLass();
    object.addElment("Hello");
    object.addElment("Sandesh");
    System.out.println(object.geList());
  }
}
