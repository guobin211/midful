package lambda;

/**
 * InnerFunctionalInterface
 */
@FunctionalInterface
interface BaseMath {
  int doubleNumber(int x);

  default int add(int x, int y) {
    return x + y;
  }
}

/**
 * InnerFunctionDemo
 */
public class FunctionDemo {
  public static void main(String[] args) {
    System.out.println("\r\n");
    BaseMath myMath = (int x) -> x * 2;
    functionParams(myMath, 2);
  }

  /**
   * 函数作为函数的参数
   * @param func
   * @param x
   */
  public static void functionParams(BaseMath func, int x) {
    int res = func.doubleNumber(x);
    res = func.add(res, x);
    System.out.println(String.format("自定义函数%d", res));
  }
}
