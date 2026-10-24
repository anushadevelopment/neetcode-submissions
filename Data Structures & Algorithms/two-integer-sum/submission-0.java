class Solution {
    public int[] twoSum(int[] nums, int target) {

        if (nums.length == 0 || nums.length < 2){
            return new int[0];
        }

        
        // for (int i=0; i< nums.length; i++){
        //     int diff = target - nums[i];
        //     for (int j=i+1; j<nums.length; j++){
        //         if(diff == nums[j]){
        //             return new int[] {i,j};
        //         }
        //     }


        // }
        // return null;

        HashMap<Integer, Integer> visitedNos = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(visitedNos.containsKey(diff)){
                return new int[] {visitedNos.get(diff), i};
            }
            visitedNos.put(nums[i], i);
        }

    return new int[0];



        
    }
}
