package strings;

public class ReverseAString {

	public static String reverseWords(String s) {
		int i=s.length()-1;
		int j=0;
		String ans="";
		while(i>=0) {
			if(i<0)break;
			while(i>=0&&s.charAt(i)==' ')
				 j=i;
			while(i>=0&&s.charAt(i)!=' ')i--;
		if(ans.isEmpty()) {
			ans=ans.concat(s.substring(i+1,j+1));
		}else
			ans=ans.concat(" "+s.substring(i+1,j+1));
		}
		
		return ans;
	}
	public static void main(String[] args) {
		String s="  The  sky is   Blue   ";
		System.out.println(reverseWords(s));
		}
}
