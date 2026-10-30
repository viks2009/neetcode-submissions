class Solution {
    public int[] topKFrequent(int[] nums, int k) {

     return   Arrays.stream(nums).boxed()
       .collect(Collectors.groupingBy(s->s, Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
        .limit(k)
        .mapToInt(e ->e.getKey())
        .toArray();
        
    }
}
