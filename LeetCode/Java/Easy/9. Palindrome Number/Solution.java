class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        return x==reverse(x,0);
    }
    private int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        int digit=n%10;
        return reverse(n/10,rev*10+digit);
    }
}