class Solution {
    public String longestPalindrome(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = s.length() - 1; j >= i; j--) {

                int start = i;
                int end = j;
                boolean palindrome = true;

                while (start < end) {

                    if (s.charAt(start) != s.charAt(end)) {
                        palindrome = false;
                        break;
                    }

                    start++;
                    end--;
                }

                if (palindrome && (j - i + 1) > ans.length()) {
                    ans = s.substring(i, j + 1);
                }
            }
        }

        return ans;
    }
}