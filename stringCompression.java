public class stringCompression {
	public static void main(String args[]){
		String testString = "aabcccccaaa";
		System.out.println(compressStr(testString));
	}
	
	public static String compressStr(String input){
		String result = "";
		result += input.charAt(0);
		int counter = 1;
		for(int i = 0; i < input.length()-1; i++){
			if(input.charAt(i) == input.charAt(i+1)){
				counter++;
			}else{
				result += (char) (counter + '0');
				result += input.charAt(i+1);
				counter = 1;
			}
		}
		result += (char) (counter + '0');
		return result;
	}
}
