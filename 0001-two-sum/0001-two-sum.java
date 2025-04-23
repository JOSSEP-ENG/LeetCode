class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> results = new ArrayList<>();
				// 2. target에서 뺀 수가 입력값에 있는지 조회 (Running Time : 38ms) 
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (value == nums[j]) {
                    results.add(i);
                    results.add(j);
                    break;
                }
            }
        }

        return results.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         List<Integer> results = new ArrayList<>();

//         // 1. 완전 탐색 방법 (Running Time : 64ms)
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (target == nums[i] + nums[j]) {
//                     results.add(i);
//                     results.add(j);
//                 }
//             }
//         }
//         return results.stream()
//                 .mapToInt(Integer::intValue)
//                 .toArray();
//     }
// }