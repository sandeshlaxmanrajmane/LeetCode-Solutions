class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int n : candies)
            max = Math.max(max, n);

        List<Boolean> l = new ArrayList<>();
        for (int n : candies)
            l.add(n + extraCandies >= max);

        return l;
    }
}