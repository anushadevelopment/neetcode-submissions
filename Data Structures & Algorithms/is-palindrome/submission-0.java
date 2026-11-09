class Solution {
    public boolean isPalindrome(String s) {

        if (s == null || s.isEmpty()){
            return true;
        }
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            Character leftC = s.charAt(left);
            Character rightC = s.charAt(right);

            if (!Character.isLetterOrDigit(leftC)){
                left++;
            }else if(!Character.isLetterOrDigit(rightC)){
                right--;
            }else{
                if (Character.toLowerCase(leftC) != Character.toLowerCase(rightC)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
        
    }
}
