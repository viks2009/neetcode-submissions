class Solution {
    public boolean isAnagram(String s, String t) {
       Map<Character, Integer> map  = new HashMap<>();
       for(int i =0; i < s.length(); i++){
        if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }else{
            map.put(s.charAt(i), 1);
        }
       }
        for(int key = 0 ; key <t.length(); key++){
            if(!map.containsKey(t.charAt(key))){
                return false;
            }else{
                if(map.get(t.charAt(key))>1){
                    map.put(t.charAt(key), map.get(t.charAt(key))-1);
                }else{
                    map.remove(t.charAt(key));
                }
            }

        }
        return map.isEmpty();

    }
}
