class Solution {
    public int hIndex(int[] citations) {
    
        // Sort citations in ascending order
        java.util.Arrays.sort(citations);
        
        int n = citations.length;
        int h = 0;
        
        // Scan from left to right
        // For each i, there are (n - i) papers with at least citations[i] citations
        for (int i = 0; i < n; i++) {
            int papersWithAtLeastThisManyCitations = n - i;
            if (citations[i] >= papersWithAtLeastThisManyCitations) {
                h = papersWithAtLeastThisManyCitations;
                break; // first valid h from left is the maximum
            }
        }
        
        return h;
    }
}