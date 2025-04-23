class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        // 3. HashMap 활용 (Running Time : 2ms)
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                return new int[]{numsMap.get(target - nums[i]), i};
            }
            numsMap.put(nums[i], i);
        }
        return new int[0];
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         List<Integer> results = new ArrayList<>();
// 				// 2. target에서 뺀 수가 입력값에 있는지 조회 (Running Time : 38ms) 
//         for (int i = 0; i < nums.length; i++) {
//             int value = target - nums[i];
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (value == nums[j]) {
//                     results.add(i);
//                     results.add(j);
//                     break;
//                 }
//             }
//         }

//         return results.stream()
//                 .mapToInt(Integer::intValue)
//                 .toArray();
//     }
// }

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