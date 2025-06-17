import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java DSA!");

        Person person1=getInfo();
        person1.printDetails();
        System.out.println( person1.checkAgeStatus());
        person1.addValues();
        System.out.println("Sum is "+person1.getSum());
        System.out.println("Maximum number is "+person1.getMax());
        System.out.println("Minimum number is "+person1.getMin());
        person1.printArrayData();
        person1.stringOperations();
        person1.HashMapOperations();
    }

   

    public static Person getInfo()
    {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter your Name");
      String name=scanner.nextLine();
      System.out.println("Enter your Age");
      int age=scanner.nextInt();
      scanner.nextLine();
      System.out.println("Enter Father Name");
      String fatherName=scanner.nextLine();
      Person person=new Person(age, name, fatherName);
 
      return person;
    }
}