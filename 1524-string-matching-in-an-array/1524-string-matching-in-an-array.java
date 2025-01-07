class Solution {
    public List<String> stringMatching(String[] a) {
        ArrayList<String> b = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[j].contains(a[i])) {
                    b.add(a[i]);
                    break;
                }
            }
        }
        return b;
    }
}