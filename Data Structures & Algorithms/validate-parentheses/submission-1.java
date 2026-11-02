class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (st.isEmpty()||st.peek().equals(map.get(c))) { 
                    if(st.isEmpty()){
                        return false;
                    }
                    st.pop();
                }else
                 return false;       
            } else
            st.add(c);
        }
        return st.isEmpty();
    }   
}
