class Solution {
    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        int length=words.length;
        return words[length-1].length();
    }
}