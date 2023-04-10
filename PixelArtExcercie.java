import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelArtExcercie 
{
	
	// Definimos el tamaño de la imagen en ancho y alto
	private static int width = 850;
    private static int height = 850;
    
    // Definimos el tamaÃƒÂ±o del pixel
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;
    
    // Definimos los colores a usar
    /*
    static Color white 		= Color.white;
    static Color blue  		= Color.blue;
    static Color red   		= Color.red;
    static Color darkBlue 	= new Color(5,56,100);
    static Color softBlue 	= new Color(113,168,221);
    static Color darkOrange = new Color(212,60,54);
    static Color softOrange = new Color(252,109,3); //*/
    
    static Color softRed = new Color(254, 61, 38, 255);
    static Color red = Color.red;
    static Color black = Color.black;
    static Color white = Color.white;
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
     
    public static void paint() 
    {
    	drawBackground(PIXEL_SIZE, Color.white);     
        drawHorizontalLine(3, 8, 1, Color.black);
        drawHorizontalLine(12, 17, 1, Color.black);
        drawHorizontalLine(2, 18, 2, Color.black);
        drawHorizontalLine(1, 19, 3, Color.black);
        putPixel(10, 2, Color.white);
        drawHorizontalLine(1, 19, 4, Color.black);
        drawHorizontalLine(1, 19, 5, Color.black);
        drawHorizontalLine(1, 19, 6, Color.black);
        drawHorizontalLine(2, 18, 7, Color.black);
        drawHorizontalLine(3, 17, 8, Color.black);
        drawHorizontalLine(4, 16, 9, Color.black);
        drawHorizontalLine(5, 15, 10, Color.black);
        drawHorizontalLine(6, 14, 11, Color.black);
        drawHorizontalLine(7, 13, 12, Color.black);
        drawHorizontalLine(8, 12, 13, Color.black);
        drawHorizontalLine(9, 11, 14, Color.black);
        drawHorizontalLine(10, 10, 15, Color.black);
        
        drawHorizontalLine(3, 8, 2, Color.red);
        drawHorizontalLine(12, 17, 2, Color.red);
        drawHorizontalLine(2, 18, 3, Color.red);
        putPixel(10, 3, Color.black);
        drawHorizontalLine(2, 18, 4, Color.red);
        drawHorizontalLine(2, 18, 5, Color.red);
        drawHorizontalLine(2, 18, 6, Color.red);
        drawHorizontalLine(3, 17, 7, Color.red);
        drawHorizontalLine(4, 16, 8, Color.red);
        drawHorizontalLine(5, 15, 9, Color.red);
        drawHorizontalLine(6, 14, 10, Color.red);
        drawHorizontalLine(7, 13, 11, Color.red);
        drawHorizontalLine(8, 12, 12, Color.red);
        drawHorizontalLine(9, 11, 13, Color.red);
        drawHorizontalLine(10, 10, 14, Color.red);
        
        drawHorizontalLine(15, 16, 3, Color.white);
        drawHorizontalLine(15, 16, 4, Color.white);
        drawSquareGrid(PIXEL_SIZE, Color.black); 
        
        // Guardamos la imagen en formato JPG
        try 
        {       
            ImageIO.write(image, "jpg", new File("pixel_art.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    private static void drawVerticalLine(int a, int b, int x, Color c)
    {
   	    g.setColor(c);
    	for(int i=a;i<=b;i++)
    	{
    		 putPixel(x, i, c);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c)
    {
    	g.setColor(c);
        for(int i=a;i<=b;i++)
        {
        	 putPixel(i, y, c);
        }
    }
    
    private static void putPixel(int x, int y, Color c)
    {       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c)
    {
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    
    private static void drawSquareGrid(int size, Color c) {
    	g.setColor(c);
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            { 
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    private static void drawBackground(int size, Color c) 
    {
    	g.setColor(c);
    	for (int i = 0; i < size; i++) 
    	{
            for (int j = 0; j < size; j++) 
            {
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }    
    
    public static void main(String[] args) 
    {
        g = image.createGraphics();        
        paint();
    }
}
