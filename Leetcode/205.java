class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
			return false;
        Map<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char char_str1 = s.charAt(i), char_str2 = t.charAt(i);
            if (map.containsKey(char_str1)) 
			{
                if (map.get(char_str1) != char_str2)
					return false;
            }
			else 
			{
                if (map.containsValue(char_str2)) 
					return false;
             map.put(char_str1, char_str2);
            }
        }
        
        return true;
    }
}
