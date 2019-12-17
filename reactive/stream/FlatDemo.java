package stream;

import java.util.stream.Stream;

/**
 * FlatDemo
 */
public class FlatDemo {

  public static void main(String[] args) {
    String str = "my name is jack";
    System.out.println("\r\n");
    // filter
    Stream.of(str.split(" ")).filter(s -> s.length() > 2).map(s -> s.length()).forEach(System.out::print);
    System.out.println();
    // flatmap boxed装箱
    Stream.of(str.split(" ")).flatMap(s -> s.chars().boxed()).forEach(c -> System.out.println(c));
  }
}