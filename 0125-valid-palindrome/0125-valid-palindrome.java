class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder c=new StringBuilder();
        for(char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                c.append(Character.toLowerCase(i));
            }
        }
        String cl=c.toString();
        String re=c.reverse().toString();

        return cl.equals(re);
    }
}