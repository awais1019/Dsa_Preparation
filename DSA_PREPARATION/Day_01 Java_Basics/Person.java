
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Person {
    private int age;
    private String name;
    private String fatherName;
    private int[] arr = new int[5];

    Person(int age, String name, String fatherName) {
        this.age = age;
        this.name = name;
        this.fatherName = fatherName;
    }

    Person() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Father's Name: " + getFatherName());
    }

    public String checkAgeStatus() {
        if (getAge() >= 18) {
            return "Adult";
        } else if (age < 18) {
            return "UnderAge";
        } else {
            return "Child";
        }
    }

    public void addValues() {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter  number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();

        }
        scanner.close();

    }

    public int getSum() {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public int getMax() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int getMin() {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public void printArrayData() {
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public void stringOperations() {
        if (name.length() < 5) {
            return;
        }
        System.out.println("Length is " + name.length());
        System.out.println("First Charcter is " + name.charAt(0));
        System.out.println("First three Characters are " + name.substring(0, 3));
        System.out.println("Last Characters are " + name.substring(2));
        System.out.println("Lower Case " + name.toLowerCase());
        System.out.println("Name contains a " + name.contains("a"));
    }
    public void HashMapOperations()
    {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("age",12);
        map.put("Salary",13000);
        map.put("age",14);
        System.out.println(map.get("age"));
        System.out.println(map.containsKey("Salary"));
    }

}
