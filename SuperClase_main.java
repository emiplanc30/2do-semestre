import java.util.Random;

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
		
		actores[3].setHasGlasses(true);
		actores[3].setIsMale(true);
		actores[3].setIsFemale(true);
		actores[3].setHasSuperpower(true);
		
		actores[5].setHasGlasses(true);
		actores[5].setIsMale(true);
		actores[5].setIsFemale(true);
		actores[5].setHasSuperpower(true);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(actores[i].getName() + ": " + actores[i].getHasGlasses() + ", " + 
					actores[i].getIsMale() + ", " + actores[i].getIsFemale() + ", " + 
						actores[i].getHasSuperpower());
			System.out.println("");
			
			att1 += actores[i].getHasGlasses()? 1:0 ;
			att2 += actores[i].getIsMale()? 1:0 ;
			att3 += actores[i].getIsFemale()? 1:0 ;
			att4 += actores[i].getHasSuperpower()? 1:0;		
		}
		System.out.println("");
		System.out.println(att1 + " personajes usan lentes");
		System.out.println(att2 + " personajes son masculinos");
		System.out.println(att3 + " personajes son femeninos");
		System.out.println(att4 + " personajes tienen superpoderes");
		
	}

}
