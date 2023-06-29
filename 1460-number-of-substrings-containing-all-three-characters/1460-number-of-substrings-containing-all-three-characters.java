class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int[] charCount = new int[3]; // Track the count of 'a', 'b', 'c' characters
        int i = 0;
        int j = 0;
        int n = s.length();

        while (i < n && j < n) {
            charCount[s.charAt(j) - 'a']++;

            // If the current substring contains all three characters, increment the count
            while (charCount[0] > 0 && charCount[1] > 0 && charCount[2] > 0) {
                count += n - j;

                // Move the left pointer to the right to find the next valid substring
                charCount[s.charAt(i) - 'a']--;
                i++;
            }

            j++;
        }

        return count;
    }
}
