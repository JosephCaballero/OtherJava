import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        System.out.println("Please type three numbers: ");
        int hi = sc.nextInt();
        int hey = sc.nextInt();
        System.out.println(sc.nextInt());
        System.out.println(hey);
        System.out.println(hi);



        //Remember to close the Scanner
        sc.close();
    }
}
