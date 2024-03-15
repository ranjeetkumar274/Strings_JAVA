import java.util.Scanner;
public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int n = arr.length;
        StringBuilder sb = new StringBuilder("");
        int i = 0, j = 0;
        while(j < n){
            if(arr[i] == arr[j]) j++;
            else{
                sb.append(arr[i]);
                int len = j - i;
                if(len > 1)sb.append(len);
                i = j;
            }
        }
        sb.append(arr[i]);
        int len = j - i;
        if(len > 1)sb.append(len);
        System.out.println(sb);
        }
    }
