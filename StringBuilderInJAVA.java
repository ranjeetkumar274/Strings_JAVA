public class StringBuilderInJAVA {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb.length());
        StringBuilder s = new StringBuilder(10);
        System.out.println(s.capacity());

    }
}
