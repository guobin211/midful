package stream;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * Concurrent
 */
public class Concurrent {

  public static void main(String[] args) {
    System.out.println("\r\n");
    // IntStream.range(1, 10).forEach(System.out::println);
    // 并行流
    IntStream.range(1, 100).parallel().peek(Concurrent::timeLog).count();
    // 串行流
    IntStream.range(1, 100).sequential().peek(Concurrent::timeLog).count();
    // 默认线程池为cpu核心数，可以自己修改
    System.setProperty("java.util.concurrent.ForkJoinPoll.common.parallelism", "16");
    // 自定义线程池
    ForkJoinPool pool = new ForkJoinPool(10);
    // 并行流一次10
    pool.submit(() -> IntStream.range(1, 20).forEach(System.out::println));
    // 关闭线程池
    pool.shutdown();
    synchronized (pool) {
      try {
        pool.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void timeLog(int i) {
    System.out.println("log: " + i);
    try {
      TimeUnit.SECONDS.sleep(2);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}