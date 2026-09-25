class Solution {
    public String intToRoman(int num) {
        // Values in descending order
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40,  10,  9,   5,  4,  1};
        String[] symbols = {"M",  "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            // While num is big enough to use this symbol
            while (num >= values[i]) {
                num -= values[i];
                sb.append(values[i] == 1000 ? "M" :
                          values[i] == 900  ? "CM" :
                          values[i] == 500  ? "D"  :
                          values[i] == 400  ? "CD" :
                          values[i] == 100  ? "C"  :
                          values[i] == 90   ? "XC" :
                          values[i] == 50   ? "L"  :
                          values[i] == 40   ? "XL" :
                          values[i] == 10   ? "X"  :
                          values[i] == 9    ? "IX" :
                          values[i] == 5    ? "V"  :
                          values[i] == 4    ? "IV" : "I");
            }
        }

        return sb.toString();
    }
}