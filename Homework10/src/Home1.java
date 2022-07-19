import java.util.Arrays;

public class Home1 {
    public static void main(String[] args) {

        String a = "I like JAVA";
        System.out.println(a);
        System.out.println("---------");
        System.out.println(a.charAt(10));
        System.out.println("---------");
        System.out.println(a.endsWith("!!!"));
        System.out.println("---------");
        System.out.println(a.startsWith("I like"));
        System.out.println("---------");
        System.out.println(a.contains("JAVA"));
        System.out.println("----------");
        System.out.println(a.indexOf("JAVA"));
        System.out.println("--------");
        System.out.println(a.replace("a", "o"));
        System.out.println("----------");
        System.out.println(a.toUpperCase());
        System.out.println("----------");
        System.out.println(a.toLowerCase());
        System.out.println("---------");
        System.out.println(a.substring(7, 10));
        System.out.println("------------");
        String palindrome = "";
        int lengthA;
        lengthA = a.length();
        for (int i = lengthA - 1; i >= 0; i--) {
            palindrome = palindrome + a.charAt(i);
        }
        System.out.println(" palindrome: " + palindrome);
        if (a.equals(palindrome)) {
            System.out.println(" is palindrome");
        } else {
            System.out.println(" is not palindrome");
        }
        System.out.println("-----------");

        // от 3 до 5 слова

        System.out.println("-----------");
        String[] words1 = new String[]{"I", "like", "JAVA"};
        String shortest = Arrays.asList(words1).stream()
                .sorted((e2, e1) -> e1.length() > e2.length() ? -1 : 1)
                .findFirst().get();
        System.out.println(shortest);

        System.out.println("-----------");
        String[] aarr = a.split(" ");
        String longest = " ";
        for (int i = 0; i < aarr.length; i++) {
            if (aarr[i].length() >= longest.length()) {
                longest = aarr[i];
            }
            System.out.println(longest);
        }
        System.out.println("----------");

        String str1 = "shih";
        String str2 = "slit";
        System.out.println("First word = " + str1);
        System.out.println("Second word = " + str2);
        String str3 = (str1.substring(0, str1.length() / 2)) + (str2.substring(str2.length() / 2, str2.length()));
        System.out.println(str3);
    }

}
