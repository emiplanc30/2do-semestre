import java.util.Random;
import java.util.Scanner;

public class SuperClase_main 
{	
	public static void main(String[] args) 
	{
		// Crear nuestra base de datos - nombres
		String[] names = {"Shai Hulud", "Muad'Did", "Ana", "Juan", "Julio", "Ghanima", 
				"Santiago", "Diana", "Georgina", "Leto"};
		
		// Contadores
		int att1 = 0;
		int att2 = 0;
		int att3 = 0;
		int att4 = 0;
		
		Random random = new Random();
			
		Personajes[] actores = new Personajes[10];
		
		for(int i = 0; i < 10; i++)
		{
			int randomNum = random.nextInt(10);
			
			while(names[randomNum] == "cero")
			{
				randomNum = random.nextInt(10);
			}
			actores[i] = new Personajes();
			String randomName = names[randomNum];
			names[randomNum] = "cero";
			actores[i].setName(randomName);
			
			boolean randomAnswer = random.nextBoolean();
			actores[i].setHasGlasses(randomAnswer);
			
			randomAnswer = random.nextBoolean();
			actores[i].setIsMale(randomAnswer);
			
			randomAnswer = random.nextBoolean();
			actores[i].setIsFemale(randomAnswer);
			
			randomAnswer = random.nextBoolean();
			actores[i].setHasSuperpower(randomAnswer);
		}
		
		int randomNumero = random.nextInt(10);
		
	/*  actores[randomNumero].setHasGlasses(true);
		actores[randomNumero].setIsMale(true);
		actores[randomNumero].setIsFemale(true);
		actores[randomNumero].setHasSuperpower(true);
	*/
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(actores[i].getName() + ": " + "¿usa lentes?: " + actores[i].getHasGlasses() + ", " + 
					"¿es masculino?: " + actores[i].getIsMale() + ", " + "¿es mujer?: " + actores[i].getIsFemale() + ", " + 
						"¿tiene superpoderes?: " + actores[i].getHasSuperpower() + "\n");
			
			att1 += actores[i].getHasGlasses()? 1:0 ;
			att2 += actores[i].getIsMale()? 1:0 ;
			att3 += actores[i].getIsFemale()? 1:0 ;
			att4 += actores[i].getHasSuperpower()? 1:0;
		}
				
		System.out.println("");
		System.out.println(att1 + " personajes usan lentes");
		System.out.println(att2 + " personajes son masculinos");
		System.out.println(att3 + " personajes son femeninos");
		System.out.println(att4 + " personajes tienen superpoderes\n");
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int j = 0;
		for(i = 0; i < 3; i++)
		{
			System.out.println("\nEscoga una de las siguientes opciones: ");
			System.out.println("1. ¿Usa lentes? \n2. ¿Es masculino?\n3. ¿Tiene superpoderes?\n");
			int option = Integer.parseInt(scan.nextLine());
			switch(option)
			{
				case 1:
					System.out.println("Estos actores usan lentes: ");
					for(j = 0; j < 10; j++)
					{
						if(actores[j].getHasGlasses() == true)
						{
							System.out.println(actores[j].getName());
						}
					}
					break;
					
				case 2:
					System.out.println("Estos personajes son masculinos: ");
					for(j = 0; j < 10; j++)
					{
						if(actores[j].getIsMale() == true)
						{
							System.out.println(actores[j].getName());
						}
					}
					break;
					
				case 3:
					System.out.println("Estos personajes tienen superpoderes: ");
					for(j = 0; j < 10; j++)
					{
						if(actores[j].getHasSuperpower())
						{
							System.out.println(actores[j].getName());
						}
					}
					break;
					
				default:
					System.out.println("Opción no válida, escoga otra opción...");
					break;
			}
		}
		
		
		System.out.println("\n¿Qué número de persona crees que es? (escoga una ocpión del 0 al 9)");
		int numPersona = Integer.parseInt(scan.nextLine());
		if(numPersona == randomNumero)
		{
			System.out.println("¡Felicidades! La persona a adivinar era: " + actores[randomNumero].getName());
		}
		else
		{
			System.out.println("¡Tú puedes lograrlo! La persona a adivinar era: " + actores[randomNumero].getName());
		}
		
	}

}
