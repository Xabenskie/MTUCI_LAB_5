public class IPAddressValidator {
	public static void main(String[] args) {
		String ipAddress = "192.168.1.1";
		String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
				"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
				"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
				"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

		if (ipAddress.matches(regex)) {
			System.out.println("IP-address successfully");
		} else {
			System.out.println("IP-address failed");
		}
	}
}
