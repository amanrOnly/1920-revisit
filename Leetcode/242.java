class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            map.put(temp, map.getOrDefault(temp, 0)+1);
        }
        
        for(int i=0; i<t.length(); i++){
            char temp = t.charAt(i);
            if(map.containsKey(temp)==false) return false;
            else if(map.get(temp)==1){
                map.remove(temp);
            }
            else{
                map.put(temp, map.get(temp)-1);
            }
        }
        return map.size()==0;
    }
}
