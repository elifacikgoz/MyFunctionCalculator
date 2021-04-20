import java.util.LinkedList;
import java.lang.Math;

/**
 * @author Elif A
 *  The class MyTest
 */


public class MyFunctionCalculator implements BaseFunctionCalculator {
	LinkedList<MyFunction> ll; 
	int size;
	int last_request;
	public void setCatcheSize(int size) {
		this.size=size;
		 ll= new LinkedList<MyFunction>(); 
	}
	
	/**
	 * Calculate function using store elements
	 * @param n 
	 */
	public double calculate(int n)
	 {	double ans;
		MyFunction m = null;
		if(getIndex(n)==-1)
			{	if(ll.size()>=size)
					ll.removeLast();
				ans=sigmaNotation(n);
				m=new MyFunction(n,ans);
				ll.addFirst(m);
				return ans;
			}
		else
		{   if(last_request==n)
				shiftLeft(getIndex(n));
			last_request=n;
			return ll.get(getIndex(n)).fn_value;
		}
		
		
	}
	/**
	 * To access the value in the specified index from memory
	 * @param index
	 */
	public int getCacheElement(int index) {
		if (ll.isEmpty())
			return -1;
		else if(index>ll.size()-1)
			return -1;
		else
			return ll.get(index).n_value;
	}
	/**
	 * To access the index in the specified value from memory (searching list)
	 * @param n
	 */
	public int getIndex(int n) {
		for(int i=0;i<ll.size();i++)
		{    
			if(ll.get(i).n_value==n)
				return i;
		}
		return -1;
		
	}
	/**
	 * Print Memory
	 * 
	 */
	public void PrintStore() {
		
		for(int i=0;i<ll.size();i++)
		{  
			System.out.print(ll.get(i).n_value+" ");
		}
		System.out.println();
	}
	
	/**
	 * To ensure priority order
	 * @param index 
	 */
	public void shiftLeft(int index) {
		MyFunction temp;
		if (index!=0)
		{
			temp=ll.get(index-1);
			ll.set(index-1, ll.get(index));
			ll.set(index, temp);
		}
	}
	/**
	 * Calculate Sigma Notation
	 * @param n  
	 */
	
	public double sigmaNotation(int n) {
		double ans=0;
		for(int i=0;i<=n;i++) {
			ans=ans+(Math.sin(Math.toRadians(i))*i);
		}
		return ans;
		
		
	}
	}
	

