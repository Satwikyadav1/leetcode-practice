class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        if(s.length()==1){
            return true;
        }
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(Character.isLetter(a) || Character.isDigit(a) ){
                str.append(Character.toLowerCase(a));
            }
        }

       String b= str.toString();
      str.reverse();
     String c= str.toString();
       if(b.equals(c)){
        return true;
       }
       return false;
    }
}