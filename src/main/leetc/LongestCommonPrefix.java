package leetc;

public class LongestCommonPrefix {


    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        String prefix = "";
        boolean hasSuffix = true;
        int smallStrLength = Integer.MAX_VALUE;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() <= smallStrLength) {
                smallStrLength = strs[i].length();
            }
        }

        int lastChar = 1;
        String initialPrefix = "";
        while (lastChar <= smallStrLength) {
            initialPrefix = strs[0].substring(0, lastChar);
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].substring(0, lastChar).equals(initialPrefix)) {
                    hasSuffix = false;
                }
            }
            if (!hasSuffix) {
                break;
            }
            lastChar++;
            prefix = initialPrefix;
        }
        return prefix;

    }
}
