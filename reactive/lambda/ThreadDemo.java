package lambda;

public class ThreadDemo {
  public static void main(String[] args) {
    System.out.println("\r\n");
    Thread mThread = new Thread(new Runnable(){
      @Override
      public void run() {
        System.out.println("命令式创建线程");
      }
    });
    mThread.start();

    new Thread(() -> System.out.println("箭头函数<lambda>创建线程")).start();
  }
  
}