import java.util.*;
public class JavaLibs {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("This program is meant to ask a few questions.");
        System.out.println("What is your name: ");
        String name = sc.next();
        System.out.println("What is your age: ");
        int age = sc.nextInt();
        System.out.println("How much money do you make in a week?(approximately) ");
        double money = sc.nextDouble();
        System.out.println("Hello " + name + " it is amazing you are making " + (money * 52.0) + " this year at age " + age + "!");
        System.out.println("You have " + (1999999999-age) + " years till you are 1999999999.");


    }
}
