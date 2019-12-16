package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * ParamsRefs
 */
public class ParamsRefs {

  public static void main(String[] args) {
    System.out.println("\r\n");
    // 内存对象地址 Arrays.asList
    // 对象1 list -> Arrays
    List<String> list = Arrays.asList("jack", "tom", "mary");
    // 对象2 list -> 1
    Consumer<String> consumer = s -> System.out.println(s + list);
    consumer.accept("list: ");
    System.out.println(list);
  }
}