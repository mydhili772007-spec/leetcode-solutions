// Last updated: 03/02/2026, 16:08:20
class Solution {

    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Integer> map = new HashMap<>();

        for (int[] arr : rectangles) {
            map.merge((double) arr[0] / arr[1], 1, Integer::sum);
        }

        long count = 0;
        
        for (int val : map.values()) {
            if (val > 1) count+= (long) val * (val - 1) / 2;
        }

        return count;
    }
}