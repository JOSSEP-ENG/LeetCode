class Solution {
    public int[] twoSum(int[] nums, int target) {
        // nums = 2,7,11,15
        // target = 9
        // 2+7 = 9
        // results = {2,7}
        List<Integer> results = new ArrayList<>();

        // 1. 완전 탐색 방법
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    results.add(i);
                    results.add(j);
                }
            }

        }
        return results.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}