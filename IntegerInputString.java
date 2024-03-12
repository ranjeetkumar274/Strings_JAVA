import java.util.Scanner;
public class IntegerInputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer : ");
        int n = sc.nextInt();
        String s = "";
        s += n;
        System.out.println(s);
        System.out.println(s.length());

    }

}
