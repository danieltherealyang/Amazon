package Amazon.products;
import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 

public class Consumer 
{
	private String ctitle;
	private String cdescript;
	private int cprice;
	private int ctarrif;
	
	public Consumer(String title, String descript, int price, int tarrif)
	{
		ctitle=title;
		cdescript=descript;
		cprice=price;
		ctarrif=tarrif;
		//picture//
		
		int width = 963;    //width of the image 
        int height = 640;   //height of the image 
  
        // For storing image in RAM 
        BufferedImage image = null; 
  
        // READ IMAGE 
        try
        { 
            File input_file = new File("Users/1831933/Downloads/here"); //image file path 
  
            /* create an object of BufferedImage type and pass 
               as parameter the width,  height and image int 
               type.TYPE_INT_ARGB means that we are representing 
               the Alpha, Red, Green and Blue component of the 
               image pixel using 8 bit integer value. */
            image = new BufferedImage(width, height, 
                                    BufferedImage.TYPE_INT_ARGB); 
  
             // Reading input file 
            image = ImageIO.read(input_file); 
  
            System.out.println("Reading complete."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: "+e); 
        } 
  
        // WRITE IMAGE 
        
        try
        { 
            // Output file path 
            File output_file = new File("G:\\Out.jpg"); 
  
            // Writing to file taking type and path as 
            ImageIO.write(image, "jpg", output_file); 
  
            System.out.println("Writing complete."); 
            
        } 

        
        catch(IOException e) 
        { 
            System.out.println("Error: "+e); 
        } 
	
	
	}

	
	public String Key()
	{
		return ctitle;
		
	}

	
	public static Consumer[] Consumerdata()
	{
		Consumer[] con= {
				new Consumer("Title Here","descipt here",1, 1)
				
				
				
		};
		
		
		
		
		
		
		
		return con;
	
	}
		
		
}
