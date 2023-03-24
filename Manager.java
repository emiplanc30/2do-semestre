import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Manager 
{
	
	public Manager()
	{
		
	}
	
	public void ejecutar()
	{
		File pares = new File("pares.txt");
		File impares = new File("impares.txt");
		
		Fibonacci fibo = new Fibonacci();
		Splitter split = new Splitter();
		
		
		// Para los números pares
		try
		{
			if(!pares.exists())
			{
				pares.createNewFile();
			}
			
			PrintWriter pw = new PrintWriter(pares);
			pw.println(split.numerosPares(fibo.fibonacci()));
			pw.close();
			System.out.println("Done");
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		// Para los números impares
		try
		{
			if(!impares.exists())
			{
				impares.createNewFile();
			}
			
			PrintWriter pw = new PrintWriter(impares);
			pw.println(split.numerosImpares(fibo.fibonacci()));
			pw.close();
			System.out.println("Done");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
}
