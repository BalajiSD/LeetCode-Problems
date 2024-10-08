class Solution {
    public boolean isAnagram(String s, String t) {
        int[] dp1=new int[26];
        int[] dp2=new int[26];
        if(s.length()==t.length()){
            for(int i=0;i<s.length();i++){
                int index1=s.charAt(i)-'a';
                int index2=t.charAt(i)-'a';
                dp1[index1]++;
                dp2[index2]++;
            }
            for(int i=0;i<26;i++){
                if(dp1[i]!=dp2[i]){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
}