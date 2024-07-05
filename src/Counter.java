public class Counter {
  
  private int count = 0;

  public void increment (){
    synchronized (this){
      count++;
    }
  }

  public int getCount() {
    return count;
  }

  public static void main(String[] args) {
    Counter counter = new Counter();

    // create thread that increment method 
    Thread thread1 = new Thread(()->{
      for(int i=0; i<1000;i++){
        counter.increment();
      }
    });

    Thread thread2 = new Thread(()->{
      for(int i=0; i<1000; i++){
        counter.increment();
      }
    });

    // statring the thfrte that increimenting the method 
    thread1.start();
    thread2.start();

  // wait foe the both thread for finish 
  try {
    thread1.join();
    thread2.join();
  } catch (Exception e) {
    e.getMessage();
  }

  System.out.println(counter.getCount());
    
  }


   
}
