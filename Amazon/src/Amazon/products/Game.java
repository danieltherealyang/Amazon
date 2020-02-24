package Amazon.products;

public class Game 
{
	private String vtitle;
	private String vdescript;
	private int vprice;
	
	
	public Game(String title, String descript, int price)
	{
		vtitle=title;
		vdescript=descript;
		vprice=price;
		
	}

	
	public String Key()
	{
		return vtitle;
		
	}

	
	public static Game[] Gamedata()
	{
		Game[] vg= {
				new Game("Title Here","descipt here",1),
				
				
				
		};
		
		return vg;
	
	}
		
		
}





