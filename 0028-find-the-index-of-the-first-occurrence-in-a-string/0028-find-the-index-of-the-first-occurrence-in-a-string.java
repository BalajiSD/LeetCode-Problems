class Solution {
    public int strStr(String haystack, String needle) {
        int len1=haystack.length();
        int len2=needle.length();
        if(len2>len1){
            return -1;
        }
        else{
            int index1=0;
            int index2=len2;
            for(int i=0;(i<len1 && index2<=len1);i++){
                if(needle.equals(haystack.substring(index1,index2))){
                    return index1;
                }
                index1++;
                index2++;
            }
        }
        return -1;
    }
}