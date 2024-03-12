public class BuiltinStringMethods {
    public static void main(String[] args) {
        String s = "Ashu bhaiya";
        int n = s.length();
        String a = "abc";
        String b = "azc";
        System.out.println("Length of the string is : "+n);
        //pointing a character in the string

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(5));

        //indexOf() method
        System.out.println(s.indexOf('u'));

        //compare
        System.out.println(a.compareTo(b));

    }
}
