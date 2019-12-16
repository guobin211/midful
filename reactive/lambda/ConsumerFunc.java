 package lambda;

import java.util.function.Consumer;
import java.util.function.IntPredicate;

public class ConsumerFunc {

  public static void main(String[] args) {
    System.out.println("\r\n");
    // JDK8系统自带的消费函数接口
    Consumer<String> strConsumer = s -> System.out.println(s);
    strConsumer.accept("Consumer输入的数据");
    // 断言函数接口
    IntPredicate bigTen = i -> i > 10;
    System.out.println(bigTen.test(11));
  }
}
