import java.text.NumberFormat;

public class NumberDemosApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		
		// demo some of the Math class methods
		
		// random #
		int r = (int)(Math.random()*10)+1;
		System.out.println(r);
		
		// rounding
		double d = 4.577;
		d *= 100;
		double dr = Math.round(d);
		dr /= 100;
		
		System.out.println(dr);
		
		// max / min
		double m = Math.min(5.7, 3.2);
		System.out.println(m);
		
		double price = 45565.77;
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		System.out.println(currency.format(price));
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(2);
		double interst = .0745;
		System.out.println(percent.format(interst));
		
		System.out.println("Bye");

	}

}
