class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null){
            return null;
        }
        HashMap<String, List<String>> anagram = new HashMap<>();

        for (int i=0; i< strs.length; i++){
            char[] strArr = strs[i].toCharArray();
            Arrays.sort(strArr);
            String sortedStr = new String(strArr);

            if(!anagram.containsKey(sortedStr)){
                anagram.put(sortedStr, new ArrayList<>());            
            }
            anagram.get(sortedStr).add(strs[i]);           
        }
        return new ArrayList<>(anagram.values());
        
    }
}
