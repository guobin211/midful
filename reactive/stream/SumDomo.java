package stream;

import java.util.stream.IntStream;

/**
 * SumDomo
 */
public class SumDomo {

  private static void outIterate(int[] nums) {
    int sum = 0;
    // 手动线程池
    for (int i : nums) {
      sum += i;
    }
    System.out.println("外部迭代结果为: " + sum);
  }

  private static void innerIterate(int[] nums) {
    // 并行流，惰性求值，短路操作
    int sum = IntStream.of(nums).sum();
    System.out.println("内部迭代结果: " + sum);
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };
    System.out.println("\r\n");
    outIterate(nums);
    innerIterate(nums);
  }
}