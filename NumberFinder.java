import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFinder {
	public static void main(String[] args) {
		String text = "The price of the product is $19.99 and $5.00.";
		Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+");
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
