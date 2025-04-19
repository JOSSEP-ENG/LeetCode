class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 키: 정렬된 단어, 값: 정렬 전 단어들
        Map<String, List<String>> sortedMap = new HashMap<>();

        // "eat", "tea", "tan", "ate", "nat", "bat"
        // String 배열의 각 인덱스들 하나씩 꺼낸다.
        // 단어를 알파벳 순으로 정렬 한다.
        // 복사된 String 배열을 다시 변환 한다.
        // 정렬된 문자가 저장되어 있는 리스트에서 같은 문자를 찾는다.
        // 찾으면 그룹 리스트를 생성해서 넣는다.
        for (String str : strs) {
            char[] charArray = str.toLowerCase().toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);
            sortedMap.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        // 최종 결과 반환
        return new ArrayList<>(sortedMap.values());
    }
}