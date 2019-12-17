package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * ListDemo
 */
public class ListDemo {

  public static void main(String[] args) {
    System.out.println("\r\n");
    List<String> list = new ArrayList<>();
    list.add("jack");
    list.add("tom");
    list.add("mary");
    // 创建流
    list.stream().map(s -> s + "...").forEach(System.out::print);
    System.out.println();
    // 迭代
    for (String name : list) {
      System.out.println(name);
    }
  }
}