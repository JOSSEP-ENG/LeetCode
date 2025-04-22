// 투포인터, 슬라이드 윈도우 방식으로 해결
// 직접 해결한 방식으로는 성능 문제 발생 (완전 탐색 방식 : (On3제곱))
// 풀이 참고하여 문제 해결.
class Solution {
    int left, maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();

        if (len < 2) {
            return s;
        }

        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(s, i, i + 1);
            extendPalindrome(s, i, i + 2);
        }

        return s.substring(left, left + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }

        if (maxLen < k - j - 1) {
            left = j + 1;
            maxLen = k - j - 1;
        }
    }
}

// // 가장 긴 팰린드룸 (LeetCode 5번 문제)
// // 내가 풀었던 방식은 완전 탐색 방식(Brute Force)
// // 시간 복잡도 O(n3)
// // 동작은 가능하지만 문자열이 길수록 성능에 매우 안좋음
// class Solution {
//     public String longestPalindrome(String s) {
//         char[] chars = s.toCharArray();
//         Set<String> palindromeSet = new HashSet<>();

//         if (s.length() < 2) {
//             return s;
//         }

//         for (int i = 0; i < chars.length; i++) {
//             for (int j = i + 1; j <= chars.length; j++) {
//                 String substr = s.substring(i, j);
//                 if (isPalindrome(substr)) {
//                     palindromeSet.add(substr);
//                 }
//             }
//         }

//         return palindromeSet.stream()
//                 .max(Comparator.comparingInt(String::length))
//                 .orElse("");
//     }

//     private boolean isPalindrome(String s) {
//         int left = 0;
//         int right = s.length() - 1;
//         while (left < right) {
//             if (s.charAt(left++) != s.charAt(right--)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }