class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs.length==1) return List.of(List.of(strs[0]));
        
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            String key = s.chars().sorted().mapToObj(q->String.valueOf((char)q))
                            .collect(Collectors.joining());
            
            if(!map.containsKey(key)){
                 map.put(key, new ArrayList<>());
               
            } map.get(key).add(s);
        }
        List<List<String>> l =  new ArrayList<>();
        l.addAll(map.values());
        return l;
    }
}
