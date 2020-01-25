package Nov2019;

public class PermutationPalindrome {

	
public boolean isPalndrome(String str) {

int charCount[] = new int[256];
int singleCounter=0;
for(int i=0;i<str.length();i++) {
  char c = str.charAt(i);
  int pos = (int)c;
  charCount[pos] = charCount[pos] + 1;
}

for(int j=0;j<charCount.length;j++) {
	if(charCount[j]==1) {
		++singleCounter;
	}
}

if(singleCounter>1) {
    return false;
 } 
else {
	return true;
}

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "civil";
		PermutationPalindrome perm = new PermutationPalindrome();
		boolean res = perm.isPalndrome(str);
		System.out.println(res);
		
	}

}
