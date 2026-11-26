class Solution {
    public boolean isPalindrome(String s) {
              s = s.replaceAll("[^a-zA-Z0-9]","");
                s = s.toLowerCase();  
                 String q = s;
   return IntStream.range(0, q.length()/2)
    .allMatch(t->q.charAt(t)==q.charAt(q.length()-t-1));


//          s = s.replaceAll("[^a-zA-Z0-9]","");
// s = s.toLowerCase();

//     return 
//     s .equals(new StringBuilder(s).reverse().toString());


    }
}
