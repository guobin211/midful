package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * CollectDemo
 */
public class CollectDemo {

  public static void main(String[] args) {
    System.out.println("\r\n");
    List<Student> students = Arrays.asList(new Student(18, "jack", Gender.FEMALE),
        new Student(19, "tom", Gender.FEMALE), new Student(17, "mary", Gender.MALE));
    // 收集器
    List<Integer> ages = students.stream().map(student -> student.age).collect(Collectors.toList());
    System.out.println(ages);
    // 分组
    Map<String, List<Student>> group = students.stream().collect(Collectors.groupingBy(Student::getSex));
    System.out.println(group);
  }
}

enum Gender {
  MALE(0, "女性"), FEMALE(1, "男性");

  private int sex;
  private String desc;

  Gender(int sex, String desc) {
    this.sex = sex;
    this.desc = desc;
  }

  public int getSex() {
    return sex;
  }

  /**
   * @return the desc
   */
  public String getDesc() {
    return desc;
  }
}

/**
 * InnerCollectDemo
 */
class Student {
  int age;
  String name;
  Gender gender;

  Student(int age, String name, Gender gender) {
    this.age = age;
    this.name = name;
    this.gender = gender;
  }

  public String getSex() {
    return this.gender.getDesc();
  }

  @Override
  public String toString() {
    return "{name: " + this.name + ", age: " + this.age + "}";
  }
}
