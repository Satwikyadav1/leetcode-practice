class Solution {
    public boolean prefix(String word,String pref){
        if(word.length()<pref.length()){
            return false;
        }
for(int i=0;i<pref.length();i++){
    if(word.charAt(i)!=pref.charAt(i)){
     return false;
    }
}
return true;
    }
    public int prefixCount(String[] words, String pref) {
        int c=0;
for(int i=0;i<words.length;i++){
   if(prefix(words[i],pref)){
    c++;
   }
}
return c;
    }
}