class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            //sort 
            //put key as sorted string, and value add in list
            String key = str.chars()
            .mapToObj(c->String.valueOf((char)c))
            .sorted().collect(Collectors.joining());

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}
