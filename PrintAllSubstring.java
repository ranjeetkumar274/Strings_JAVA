public class PrintAllSubstring {
    public static void main(String[] args) {
        String s = "abcde";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.print(s.substring(i, j) + " ");
            }
            System.out.println();
        }
    }
}
