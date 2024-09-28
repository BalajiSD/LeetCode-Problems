class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i=0;
        while(k>=0){
            if(i==chalk.length){
                i=0;
            }
            k-=chalk[i];
            i++;
        }
        return i-1;
    }
}