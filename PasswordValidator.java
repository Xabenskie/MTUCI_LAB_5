public class PasswordValidator {
	public static void main(String[] args) {
		String password = "Password123";
		String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";

		if (password.matches(regex)) {
			System.out.println("Password successfully");
		} else {
			System.out.println("Password failed");
		}
	}
}
