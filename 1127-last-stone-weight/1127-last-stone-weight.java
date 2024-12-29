class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<stones.length;i++){
            a.add(stones[i]);
        }
       
        if(a.size()>1){
        while(a.size()>1){
            Collections.sort(a);
             int n=a.size();
            int b=a.get(n-1)-a.get(n-2);
            if(b==0){
                a.remove(Integer.valueOf(a.get(n-1)));
                a.remove(Integer.valueOf(a.get(n-2)));
            }
            else{
                 a.remove(Integer.valueOf(a.get(n-1)));
                  a.remove(Integer.valueOf(a.get(n-2)));
                a.add(b);
            }
        }
        if(a.size()==0){
return 0;
        }
        else{
            return a.get(0);
        }
        }
        return a.get(0);
    }
}