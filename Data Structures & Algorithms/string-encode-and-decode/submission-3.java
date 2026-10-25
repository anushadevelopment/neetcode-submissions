class Solution {

    public String encode(List<String> strs) {

        if (strs == null || strs.isEmpty()){
            return "";
        }
        StringBuilder encodedStr = new StringBuilder();
        for (String s : strs){
            encodedStr.append(s.length()).append("#").append(s);
            
        }
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.isEmpty()){
            return result;
        }

        // for eg, the current string is 5#Hello5#World
        //need to get the index i, and j(#) and get the length as 5

        // int i=0;
        // while (i<str.length()){
        //     int j=i;
        //     while (str.charAt(j) != '#'){
        //         j++;
        //     }

        //     // find the substring between i & j to get the length 5

        //     int length = Integer.parseInt(str.substring(i,j));

        //     // move the pointer next to #
        //     i = j+1; // so i = 2

        //     String word = str.substring(i, i+length);
        //     result.add(word);

        //     i = i + length; // 2+5 = 7 (starting index of next 5)



        // }
        // return result;

        int i = 0;
        int len = str.length();
        while (i < len){

            int length = 0;
            while (str.charAt(i) != '#'){
                length = length * 10 + (str.charAt(i) - '0');
                i++;
            }
            // move the pointer next to #
            i++;

            result.add(str.substring(i, i+length));

            i = i + length;

        }
        return result;

    }
}
