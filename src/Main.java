/**
 * @author Elif A
 *
 */
public class Main {

	public static void main(String[] args) {
		MyFunctionCalculator myCalculator=new MyFunctionCalculator();
		myCalculator.setCatcheSize(3);
		myCalculator.calculate(5);
		//myCalculator.PrintStore();
		myCalculator.calculate(20);
		//myCalculator.PrintStore();
		myCalculator.calculate(10);
		//myCalculator.PrintStore();
		myCalculator.calculate(5);
		//myCalculator.PrintStore();
		myCalculator.calculate(5);
		//myCalculator.PrintStore();
		myCalculator.calculate(5);
		//myCalculator.PrintStore();
		myCalculator.calculate(2);
		//myCalculator.PrintStore();
		myCalculator.calculate(3);
		//myCalculator.PrintStore();
		
		System.out.println(myCalculator.getCacheElement(0));
		System.out.println(myCalculator.getCacheElement(1));
		System.out.println(myCalculator.getCacheElement(2));
		System.out.println(myCalculator.getCacheElement(3));
		System.out.println(myCalculator.sigmaNotation(5));
        

	}

}
