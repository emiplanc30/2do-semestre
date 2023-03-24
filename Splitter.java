import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Splitter 
{
	List<Integer> numerosPares = new ArrayList<>();
	List<Integer> numerosImpares = new ArrayList<>();
	
	public List<Integer> numerosPares(List<Integer> lista)
	{
		for(int i = 0; i < 32; i++)
		{
			if(lista.get(i) % 2 == 0)
			{
				numerosPares.add(lista.get(i));
			}
		}
		
		return numerosPares;
	}
	
	public List<Integer> numerosImpares(List<Integer> lista)
	{
		for(int i = 0; i < 32; i++)
		{
			if(lista.get(i) % 2 != 0)
			{
				numerosImpares.add(lista.get(i));
			}
		}
		
		return numerosImpares;
	}
}
