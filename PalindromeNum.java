
public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int x = 1000000001;
		int y = -121;
		int z = 10;
		int q = 1001;
		
		//isPalindrome(x);
		isPalindrome(y);
		isPalindrome(z);
		isPalindrome(q);
		
	}
	
	public static boolean isPalindrome(int x) {
		
String numStr = Integer.toString(x);
		
		int i = 0;
		int j = 1;
		if(numStr.length() % 2 == 0) {
			for(i=0; i<j; i++) {
				for(j=numStr.length()-1; j>=i; j--) {
					if( i == j) {
						break;
					}
					else if(numStr.charAt(i) == numStr.charAt(j)) {
						i++;
					}
					else if((numStr.charAt(i) == numStr.charAt(j)) && (i == j-1)) {
						return true;
					}
					else {
						return false;
					}
				}
			}
		}
		else {
			for(i=0; i<numStr.length(); i++) {
				for(j=numStr.length()-1; j>=i; j--) {
					if(numStr.charAt(i) == numStr.charAt(j)) {
						i++;
					}
					else if(i == j) {
						return true;
					}
					else {
						return false;
					}
				}
			}
		}
		
		return true;
		
	}

}
