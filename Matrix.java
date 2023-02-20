
public class Matrix 
{
	public Matrix()
	{
		
	}
	
	public void imprimirMatriz(int[][] matrix)
	{
		int i = 0;
		int j = 0;
		
		for(i = 0; i < matrix.length; i++)
		{
			for(j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public void multiplicarMatriz(int[][] matrix_1, int[][] matrix_2)
	{
		int i = 0;
		int j = 0;
		int f = 2;
		int c = 3;
		int[][] producto = new int[f][c];
		
		for(i = 0; i < f; i++)
		{
			for(j = 0; j < c; j++)
			{
				producto[i][j] = matrix_1[i][j] * matrix_2[i][j];
			}
		}
		
		System.out.println("Las matrices multiplicadas son: ");
		imprimirMatriz(producto);
	}
	
	public void matrizTranspuesta(int[][] matrix)
	{
		int i = 0;
		int j = 0;
		int[][] transpuesta = new int[matrix[0].length][matrix.length];
		
		for(i = 0; i < matrix.length; i++)
		{
			for(j = 0; j < matrix[i].length; j++)
			{
				transpuesta[j][i] = matrix[i][j];
			}
		}
		
		System.out.println("La matriz transpuesta es: ");
		imprimirMatriz(transpuesta);
	}
	
	public int sumaDiagonal(int[][] matrix)
	{
		int suma = 0;
		int i = 0;
		int j = 0;
		
		while(i < matrix.length && j < matrix[0].length)
		{
			suma += matrix[j][i];
			i++;
			j++;
		}

		
		return suma;
	}
	
	public int valorMasGrande(int[][] matrix)
	{
		int i = 0;
		int j = 0;
		int actual = 0;
		int valor = matrix[0][0];
		
		for(i = 0; i < matrix.length; i++)
		{
			for(j = 0;j < matrix[i].length; j++)
			{
				actual = matrix[i][j];
				if(actual > valor)
				{
					valor = actual;
				}
			}
		}
		
		return valor;
	}
	
	public void sumarMatriz(int[][] matrix1, int[][] matrix2)
	{
		int i = 0;
		int j = 0;
		int f = 2;
		int c = 3;
		int[][] suma = new int[f][c];
		
		for(i = 0; i < f; i++)
		{
			for(j = 0; j < c; j++)
			{
				suma[i][j] += matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("La matriz suma es: ");
		imprimirMatriz(suma);
	}
	
	public void multiplicacionEscalar(int[][] matrix)
	{
		int i = 0;
		int j = 0;
		int f = 2;
		int c = 3;
		int[][] escalar = new int[f][c];
		
		for(i = 0; i < f; i++)
		{
			for(j = 0; j < c; j++)
			{
				escalar[i][j] = 2 * matrix[i][j];
			}
		}
		
		System.out.println("El resultado es: ");
		imprimirMatriz(escalar);
	}
}
