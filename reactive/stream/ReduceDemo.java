package stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * ReduceDemo
 */
public class ReduceDemo {

  public static void main(String[] args) {
    String book = "Pride and Prejudice";
    System.out.println("\r\n");
    // 可为null
    Optional<String> res = Stream.of(book.split(" ")).reduce((s1, s2) -> s1 + "-" + s2);
    System.out.println(res.orElse("无数据"));
    // 初始值
    String res2 = Stream.of(book.split(" ")).reduce("", (s1, s2) -> s1 + "-" + s2);
    System.out.println(res2);
  }
}