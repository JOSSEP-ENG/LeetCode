class Solution {
    public boolean isPalindrome(String s) {
        String lowerString = s.toLowerCase();
        String replaceAll = lowerString.replaceAll("[^a-zA-Z0-9]", "");

        char[] charArray = replaceAll.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
