package method;

public class Addr {

	String streetName;
	String city;
	String state;
	int zip;

	public String changeStreetName() {
		return "123 Elm";
	}

	public String changeState() {
		return "TX";
	}

	public String changeCity() {
		return "New York";
	}

	public String changeZip() {

		return "1234";
	}

	public static void main(String[] args) {

		Addr add = new Addr();
		String p = add.changeCity();
		System.out.println(p);

	}

}
