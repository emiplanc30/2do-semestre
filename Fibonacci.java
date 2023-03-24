import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Fibonacci 
{
	
	public List<Integer> fibonacci()
	{
		List<Integer> fibonacci = new ArrayList<Integer>();
		int a = 0;
		int b = 1;
		int x = 1;
		int n = 1346270;
		
		fibonacci.add(a);
		
		for(int i = 1; x < n; i++)
		{
			fibonacci.add(x);
			
			x = a + b;
			a = b;
			b = x;
		}
		
		return fibonacci;
	}
}
