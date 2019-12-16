package lambda;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Panda
 */
class Panda {
  String name;

  Panda(String name) {
    this.name = name;
  }

  public static void eat(Panda panda) {
    System.out.print(panda.name);
    System.out.println(" 静静的 eat()...");
  }

  /**
   * 成员方法的第一个参数是this,编译器默认实现
   * @param num int
   * @return int
   */
  public int smile(int num) {
    System.out.print(this.name);
    System.out.print(" has smile ");
    return num;
  }
}

/**
 * Refs 方法引用
 */
public class Refs {
  public static void main(String[] args) {
    System.out.println("\r\n");
    Panda panda = new Panda("北京");
    // 静态方法引用
    Consumer<Panda> pConsumer = Panda::eat;
    pConsumer.accept(panda);
    // 成员方法引用
    Function<Integer, Integer> smileTimes = panda::smile;
    System.out.print(String.format("%d次", smileTimes.apply(6)));
  }

}