class Solution {
    public boolean isValid(String s) {
        
    int n = -1;
	while (s.length() != n) {
		n = s.length();
		s = s.replace("()", "");
		s = s.replace("[]", "");
		s = s.replace("{}", "");
	}
        
	if(s.length() == 0){
        return true;
    }
        
	else{
        return false;
        }
    }
}
