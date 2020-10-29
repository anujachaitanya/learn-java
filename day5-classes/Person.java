public class Person {
  public String name;
  public int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public boolean isEligibleToVote() {
    return this.age >= 18;
  }

  public StringBuilder display() {
    StringBuilder info = new StringBuilder("Person { \n")
      .append(" name : " + this.name + "\n")
      .append(" age  : " + this.age + "\n")
      .append("}");
    return info;
  }

  public static void main(String[] args) {
    Person p1 = new Person("Anuja", 19);
    System.out.println(p1.display());
    System.out.println(p1.isEligibleToVote());
  }
}
