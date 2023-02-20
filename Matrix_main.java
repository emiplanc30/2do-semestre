
public class Matrix_main 
{

	public static void main(String[] args) 
	{
		Matrix matrix = new Matrix();
		
		// Declarar mis matrices:
		int[][] m1 = {{1, 2, 3}, {4, 5, 6}};
		int[][] m2 = {{7, 8, 9}, {10, 11, 12}};
		int[][] m3 = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
		int[][] m4 = {{5, 6, 100}, {8, 9, 0}};
 		
		// Imprimir matrices:
		matrix.imprimirMatriz(m1);
		matrix.imprimirMatriz(m2);
		matrix.imprimirMatriz(m3);
		matrix.imprimirMatriz(m4);
		
		// 1.- 
		matrix.multiplicarMatriz(m1, m2);
		
		// 2.-
		matrix.matrizTranspuesta(m1);
		
		// 3.-
		System.out.println("La suma diagonal es de: " + matrix.sumaDiagonal(m3));
		
		// 4.-
		System.out.println("El valor más grande es: " + matrix.valorMasGrande(m4));
		
		// 5.-
		System.out.println();
		matrix.sumarMatriz(m1, m2);
		
		// 6.- 
		System.out.println();
		matrix.multiplicacionEscalar(m1);
		
	}
}
