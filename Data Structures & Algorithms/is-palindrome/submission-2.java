class Solution {
    public boolean isPalindrome(String s) {
        final String f = s.toLowerCase().replaceAll("[^a-z0-9]","");
                if(f.isBlank() || f.isEmpty() || f.length() ==1) return true;

    return  IntStream.rangeClosed(0,f.length()/2)
        .allMatch(a->f.charAt(a)==f.charAt(f.length()-1-a));
        
    }
}
