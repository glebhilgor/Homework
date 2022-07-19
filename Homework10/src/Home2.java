public class Home2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = createSomeStrings(3, 56);
        System.out.println(stringBuilder1);
    }

    private static StringBuilder createSomeStrings(int i, int i1) {
        StringBuilder result = new StringBuilder();
        result.append(i).append(" + ").append(i1).append(" = ").append(i+i1).append("\n")
                .append(i).append(" - ").append(i1).append(" = ").append(i-i1).append("\n")
                .append(i).append(" * ").append(i1).append(" = ").append(i*i1).append("\n");
        return result;

    }
}

