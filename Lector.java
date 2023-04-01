import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Lector 
{
	private File lista = new File("C:/Users/emili/OneDrive/Escritorio/Emi/emails.csv");
	
	public Lector()
	{
		
	}
	
	public void ejecutar(int ID) throws IOException
	{	
		File exam = new File("177478.txt");
		String currentLine;
		String IDString = String.valueOf(ID);
		String subString = IDString.substring(IDString.length()- 3);
		int begin = Integer.parseInt(subString);
		int end = begin + 50;
		
		int[] suma = new int[3000];
		String[] words = new String[1];
		
		for(int i = 0; i < 3000; i++)
		{
			suma[i] = 0;
		}
		
		int j = 1;
		
		if(this.lista.exists())
		{
			try (FileReader fileReader = new FileReader(lista))
			{
				// Para separar la línea de palabras:
				BufferedReader bufReader = new BufferedReader(fileReader);
				currentLine = bufReader.readLine();
				words = currentLine.split(",");
				
				while((currentLine = bufReader.readLine()) != null)
				{
					String[] arregloDeLinea = currentLine.split(",");
					
					if(j >= begin && j <= end)
					{
						for(int i = 1; i < 3001; i++)
						{
							suma[i - 1] += Integer.parseInt(arregloDeLinea[i]);
						}
					}
					
					if(j > end)
					{
						break;
					}
					
					j++;
				}
				
				fileReader.close();
				bufReader.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
			try(PrintWriter writer = new PrintWriter("C:/Users/emili/OneDrive/Escritorio/Emi/" + IDString + ".txt"))
			{
				for(int i = 0; i < 3000; i++)
				{
					writer.print(words[i + 1] + ", ");
					writer.println(suma[i]);
				}
				writer.close();
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("¡¡Funciona!!");
	}
}
