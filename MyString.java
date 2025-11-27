public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
       char[] transfer = new char[str.length()]; 
        for (int i = 0; i < str.length(); i++ ){
        char c = str.charAt(i);
        if ('A' >= c && c <= 'Z' ) {
            transfer[i]= (char)(c + 32);
        }
        else {transfer[i] = c;} 
       }
       String s = new String(transfer);
        return s;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length() == 0) {
        return true;
    }

    char[] s1 = str1.toCharArray();
    char[] s2 = str2.toCharArray();

    int n1 = s1.length;
    int n2 = s2.length;

    if (n2 > n1) {
        return false;
    }

    for (int i = 0; i <= n1 - n2; i++) {
        boolean match = true;

        for (int j = 0; j < n2; j++) {
            if (s1[i + j] != s2[j]) {
                match = false;
                break;
            }
        }

        if (match) {
            return true;
        }
    }

    return false;
}
    }

