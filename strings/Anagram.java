package strings;

public class Anagram 
{

	public static void main(String[] args) 
	{
//		Anagram: Two strings are called anagrams of each other if they have same number of characters and they are repeated same number of times.ex: cat and act.
// Algorithm: select a character and check if it is available in other string or not and repeat.
		String a = "aab";
		String b = "abc";
		boolean isAnagram=true;
	int al[]=new int[256];
	int bl[]=new int[256];
		
	for(char c: a.toCharArray()) {
		int index=(int)c;
		al[index]++;
	}
	for(char c: b.toCharArray()) {
		int index=(int)c;
		bl[index]++;
	}
	
	for(int i=0;i<256;i++) {
		if(al[i]!=bl[i])
			isAnagram=false;
	}
	
	if(isAnagram) 
			System.out.println("anagram");
		else
			System.out.println("not anagram");
		
	}
}