package basicExercisesPart1;

class Question79 {

	public static void main(String[] args) {
		int[] OriginalArray= {20, 30, 40};
		int temp=OriginalArray[0];
		
		
			OriginalArray[0]=OriginalArray[1];
			OriginalArray[1]=OriginalArray[2];
			OriginalArray[2]=temp;
		
		for(int i=0;i<OriginalArray.length;i++) {
			System.out.print(OriginalArray[i]+" ");
		}
	}
}
