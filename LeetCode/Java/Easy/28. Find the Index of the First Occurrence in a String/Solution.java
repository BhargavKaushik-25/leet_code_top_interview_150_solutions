class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }

        // Try every possible starting position in haystack
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            // Compare needle with substring of haystack starting at i
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // If we matched all characters of needle
            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}