public class stringRotationSubstr {
	public static void main(String args[]){
		String s1 = "Hello, world!";
		String s2 = "";
		//System.out.println(isSubstring(s1,s2));
	}
	
	public static boolean isSubstring(String s1, String s2){
		if(s1.length()==0 || s2.length()==0){
			System.out.println("Invalid input");
			return false;
		}
		
		for(int i = 0; i < s1.length(); i++){
			if(s1.charAt(i) == s2.charAt(0)){
				for(int j = 0; j < s1.length()-i; j++){
					if(s1.charAt(i+j) == s2.charAt(j)) return true;
				}
			}
		}
		return false;
	}
}
