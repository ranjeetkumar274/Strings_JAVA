import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("what is your name : ");
        String str = sc.nextLine();

        System.out.print("my name is "+str);
    }
}

