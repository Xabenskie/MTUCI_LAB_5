import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalAfterLower {
	public static void main(String[] args) {
		String text = "Hello there, I have a Cat and a dog.";
		String regex = "(?<=\\p{Lower})\\p{Upper}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		String result = matcher.replaceAll("!$0!");
		System.out.println(result);
	}
}
