class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = words.length;

        while (i < n) {
            // Greedily pack as many words as possible on this line
            int j = i + 1;
            int lineLength = words[i].length(); // total chars of words (without spaces)

            while (j < n && lineLength + 1 + words[j].length() <= maxWidth) {
                lineLength += words[j].length() + 1; // +1 for at least one space
                j++;
            }

            // Words for this line are from i to j-1
            int numWords = j - i;
            StringBuilder line = new StringBuilder();

            // Last line OR line with single word: left-justify
            if (j == n || numWords == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        line.append(" ");
                    }
                }
                // Pad with spaces to maxWidth
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                // Fully justify: distribute extra spaces evenly
                int totalChars = 0;
                for (int k = i; k < j; k++) {
                    totalChars += words[k].length();
                }
                int totalSpaces = maxWidth - totalChars;
                int gaps = numWords - 1;

                int spacePerGap = totalSpaces / gaps;
                int extraGaps = totalSpaces % gaps; // first 'extraGaps' gaps get one extra space

                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        // Base spaces
                        for (int s = 0; s < spacePerGap; s++) {
                            line.append(" ");
                        }
                        // Extra space for leftmost gaps
                        if (extraGaps > 0) {
                            line.append(" ");
                            extraGaps--;
                        }
                    }
                }
            }

            result.add(line.toString());
            i = j; // move to next set of words
        }

        return result;
    }
}