package stream;

import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

/**
 * FlowDemo
 */
public class FlowDemo {

  public static void main(String[] args) {
    int data = 1001;
    // 发布者
    SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
    // 订阅者
    Subscriber<Integer> subscriber = new Subscriber<Integer>() {

      private Subscription subscription;

      @Override
      public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
      }

      @Override
      public void onNext(Integer item) {
        System.out.println("收到消息");
        System.out.println(item);
        // 请求一条数据
        this.subscription.request(1);
      }

      @Override
      public void onError(Throwable throwable) {
        throwable.printStackTrace();

      }

      @Override
      public void onComplete() {
        System.out.println("数据全部处理完了");
      }

    };
    publisher.subscribe(subscriber);
    System.out.println("\r\n");
    publisher.submit(data);
    publisher.submit(1002);
    publisher.submit(1003);
    publisher.close();
    try {
      Thread.currentThread().join(1000);
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
  }
}