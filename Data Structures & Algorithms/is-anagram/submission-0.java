

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s ==null || t == null){
            return false;
        }

        if(s.length() != t.length()){
            return false;
        }

        // char[] charS = s.toCharArray();
        // char[] charT = t.toCharArray();
        // Arrays.sort(charS);
        // Arrays.sort(charT);
        // String sortS = new String(charS);
        // String sortT = new String(charT);

        // if (sortS.equals(sortT)){
        //     return true;
        // }
        // return false;
        // HashMap<Character, Integer> s1 = new HashMap<>();
        // HashMap<Character, Integer> s2 = new HashMap<>();

        // for (int i=0; i< s.length(); i++){
        //     s1.put(s.charAt(i), s1.getOrDefault(s.charAt(i), 0) + 1);
        //     s2.put(t.charAt(i), s2.getOrDefault(t.charAt(i), 0) + 1);
        // }
        // return s1.equals(s2);

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            charCount.put (charS, charCount.getOrDefault(charS, 0) + 1);
            charCount.put (charT, charCount.getOrDefault(charT, 0) - 1);
        }
        for (int count: charCount.values()){
            if (count != 0) {
                 return false;
            }
        }
        return true;


    }
}
