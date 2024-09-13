import java.util.Arrays;

public class longCommPre {

    public static String findLongCommPre(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "-1"; 
        }

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int mL = Math.min(first.length(), last.length());

        int i = 0;
        while (i < mL && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        String comPre = first.substring(0, i);

        return comPre.isEmpty() ? "-1" : comPre; 
    }

    public static void main(String[] args) {
        // String[] strs = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String[] strs = {"hello", "world"};

        
        String result = findLongCommPre(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}

