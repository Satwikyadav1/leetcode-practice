class Solution {
    public double minimumAverage(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        PriorityQueue<Double> b = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]);
        }
        Collections.sort(a);
        double c;
        int d=a.size();
        for (int i = 0; i <d/ 2; i++) {
            int n=a.size();
            c = (double)((a.get(0) + a.get(n-1)) / 2.0);
            System.out.println(c);
            b.add(c);
            a.remove(0);
            a.remove(n-2);
            Collections.sort(a);
        }
        System.out.print(b);
        return b.peek();
    }
}