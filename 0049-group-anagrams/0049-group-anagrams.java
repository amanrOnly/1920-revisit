class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null){
            return null;
        }
        
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        Arrays.sort(strs); 

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String newStr = String.valueOf(chars);   
            if(map.containsKey(newStr)){
                map.get(newStr).add(str);
            }else{
                List<String> anagramlist = new ArrayList<String>();
                anagramlist.add(str);
                map.put(newStr, anagramlist);
            }
        }
        List<List<String>> list = new ArrayList<List<String>>(map.values());  
        return list;
    }
}