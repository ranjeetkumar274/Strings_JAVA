import java.util.Scanner;
public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        for(int i = 0; i < n; i++){
            char ch = sb.charAt(i);
            int a = (int)ch;
            if(a >= 65 && a <= 90) {
                //for capital
                a += 32;
            }
            else if(a >= 97 && a <= 122) {
                //for small
                a -= 32;
            }
                ch = (char)a;
                sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}
