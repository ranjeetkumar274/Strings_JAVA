public class StringBuilderFN {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ashu bhaiya");
//        System.out.println(sb.reverse());
        //etc.
//        sb.deleteCharAt(4);
//        System.out.println(sb);

        sb.append(" kaha ho");
        System.out.println(sb);

        sb.delete(2,5);
        System.out.println(sb);
    }
}
