public class prob3 {

	public static void main( String args[] ) {
		int year = Integer.parseInt(args[0]);
		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 400 == 0)
				leap = true;
			else if (year % 100 == 0)
				leap = false;
			else
				leap = true;
		}

		if (leap == true)
			System.out.println("leap year!");
		else
			System.out.println("not a leap year!");
	}
}
