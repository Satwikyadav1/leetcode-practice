class Solution {
    public int fillCups(int[] arr) {
         if(arr.length==1){
            return arr[0];
                 }
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            b.add(arr[i]);
        }
       
        int c=0;
Collections.sort(b);
Collections.reverse(b);
while(b.get(0)!=0){
c++;
   b.set(0,b.get(0)-1);
   if(b.get(1)!=0){
    b.set(1,b.get(1)-1);
   }
Collections.sort(b);
Collections.reverse(b);
}
return c;
}
}