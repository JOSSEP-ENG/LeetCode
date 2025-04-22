class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();

        // 예외 처리: 문자열이 비거나 1글자일 경우, 그 자체가 팰린드롬
        if (n < 2) return s;

        boolean[][] dp = new boolean[n][n]; // dp[i][j]는 s[i..j]가 팰린드롬이면 true
        int start = 0;  // 가장 긴 팰린드롬의 시작 인덱스
        int maxLen = 1; // 가장 긴 팰린드롬의 길이

        // 길이 1: 모든 단일 문자는 팰린드롬
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // 길이 2 이상인 부분 문자열을 순차적으로 검사
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1; // 끝 인덱스

                if (s.charAt(i) == s.charAt(j)) {
                    if (len == 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;

                        if (len > maxLen) {
                            maxLen = len;
                            start = i;
                        }
                    }
                }
                // else 생략: 어차피 기본값은 false
            }
        }

        // 가장 긴 팰린드롬 부분 문자열 반환
        return s.substring(start, start + maxLen);
    }
}
