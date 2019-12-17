package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * MapDemo
 */
public class MapDemo {

    public static void main(String[] args) {
      System.out.println("\r\n");
      int[] nums = {1,2,3,4,5,6};
      // 中间操作符map，结束操作符sum
      int res = IntStream.of(nums).map(i -> i * 2).sum();
      System.out.println(res);
      String hello = "hello i'm jack";
      Stream.of(hello.split(" ")).forEach(System.out::println);
      // 并行流，随机
      hello.chars().parallel().forEach(i -> System.out.print((char)i));
      // 保证顺序
      hello.chars().parallel().forEachOrdered(i -> System.out.print((char)i));
    }
}