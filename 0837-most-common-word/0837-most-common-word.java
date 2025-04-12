class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        //입력값 검증
        if (paragraph == null || paragraph.isEmpty()) {
            return "";
        }
        // 전처리
        List<String> ban = Arrays.asList(banned);
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");

        // 단어별 개수를 맵에 저장.
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            if (!ban.contains(word)) {
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }
        return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}