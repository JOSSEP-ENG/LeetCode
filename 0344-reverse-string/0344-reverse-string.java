// class Solution {
//     public void reverseString(char[] s) {
//         char[] output = new char[s.length];
//         for (int i = 0; i < s.length; i++) {
//             output[s.length - 1 - i] = s[i];
//         }
//         for (int i = 0; i < s.length; i++) {
//             s[i] = output[i];
//         }
//     }
// }

class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            
            start++;
            end--;
        }
    }
}
