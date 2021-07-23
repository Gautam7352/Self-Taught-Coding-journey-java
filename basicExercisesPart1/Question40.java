package basicExercisesPart1;
import java.nio.charset.Charset;

class Question40 {

	public static void main(String[] args) {
		for (String str : Charset.availableCharsets().keySet()) {
		      System.out.println(str);
		    }
	}
}
