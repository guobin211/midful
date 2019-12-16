package lambda;

import java.util.stream.IntStream;

public class StreamDemo {
  public static void main(final String[] args) {
    System.out.println("\r\n");
    final int[] ints = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    // 命令式编程，单线程
    int min = Integer.MAX_VALUE;
    for (final int item : ints) {
      if (item < min) {
        min = item;
      }
    }
    System.out.println(String.format("最小值%d", min));
    // 函数式编程，多线程
    final int min2 = IntStream.of(ints).min().getAsInt();
    System.out.println(String.format("最小值%d", min2));
  }
}
