class Solution {
    public String largestOddNumber(String num) {

        int n=num.length();
        for(int i=n-1;i>=0;i--){
            int digit=num.charAt(i)-'0';
            if(digit%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
        // int n=Integer.parseInt(num);
        // if(n%2!=0){
        //     return Integer.toString(n);
        // }
        // while(n!=0){
        //     int digit=n%10;
        //     if(digit%2!=0){
        //         return Integer.toString(digit);
        //     }
        //     n=n/10;
        // }
        // return "";
    }
}