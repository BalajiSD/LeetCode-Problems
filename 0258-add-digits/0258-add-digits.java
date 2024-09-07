class Solution {
    public int addDigits(int num) {
        int result=first(num);
        return result;
    }
    
    private int first(int num){
        int result=0;
        while(num>0){
            result+=num%10;
            num/=10;
        }
        if(result>=10){
            return first(result);
        }
        return result;
    }
}