import java.util.Scanner;
public class InputStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        //setcharat() function
        sb.setCharAt(0,'v');
        System.out.println(sb);
    }
}
