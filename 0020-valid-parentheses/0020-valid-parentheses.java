class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char value:s.toCharArray()){
            if(value=='(' || value=='{' || value=='['){
                stack.push(value);
            }
            else if(value==')' || value=='}' || value==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(!isMatch(top,value)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isMatch(char begin,char end){
        if((begin=='(' && end==')') || (begin=='{' && end=='}') || (begin=='[' && end==']')){
            return true;
        }
        else {
            return false;
        }
    }
}