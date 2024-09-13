class Solution {
    public int getLucky(String s, int k) {
        char[] letters=s.toCharArray();
        int sum=0;
        for(char letter:letters){
            int value=letter-96;
            sum+=convert(value);
        }
        while(k>1){
            sum=convert(sum);
            k--;
        }
        return sum;
    }

    public int convert(int value){
        int sum=0;
        while(value>0){
            sum+=value%10;
            value/=10;
        }
        return sum;
    }
}