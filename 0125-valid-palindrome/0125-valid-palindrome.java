class Solution {
    public boolean isPalindrome(String s) {

        // 1. Remove non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        // 2. Convert to lowercase
        s = s.toLowerCase();

        // 3. Reverse
        String rev = new StringBuilder(s).reverse().toString();

        // 4. Compare
        return s.equals(rev);
    }
}