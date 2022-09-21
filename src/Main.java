import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        int x = scanner.nextInt();
        System.out.println("enter next value");
        int y = scanner.nextInt();
        System.out.println("What do you want to do?\n1.Addition\n2.substraction\n3.Multiplication\n4.Division");

        int select = scanner.nextInt();
        switch (select) {
            case 1:
                System.out.println("");
        }
    }
}