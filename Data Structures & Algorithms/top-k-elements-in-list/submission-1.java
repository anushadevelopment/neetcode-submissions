class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k <= 0){
            return new int[0];
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0) + 1);
        }

        // create buckets with size nums +1
        List<Integer>[] buckets = new List[nums.length+1];

        // group all the numbers into the buckets based on its frequencies

        for (int num : frequencyMap.keySet()){
            int frequency = frequencyMap.get(num);
            if (buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(num);
        }

        //Gather top k elements by iterating the buckets from n to 1

        int[] result = new int[k];
        int index = 0;

        for (int i= buckets.length - 1; i >= 0 && index < k; i--){
            if (buckets[i] != null){
                for (int num : buckets[i]){
                    result[index++] = num;
                    if (index == k){
                        break;
                    }
                }
            }

        }
        return result;
        
    }
}
