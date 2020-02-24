package Amazon.products;

public class Electronic
{
	private String etitle;
	private String edescript;
	private int eprice;
	private int ewarran;
	
	
	public Electronic(String title, String descript, int price, int warran)
	{
		etitle=title;
		edescript=descript;
		eprice=price;
		ewarran=warran;
	}

	
	public String Key()
	{
		return etitle;
		
	}

	
	public static Electronic[] Gamedata()
	{
		Electronic[] elec= {
				new Electronic("Title Here","descipt here",1,1),
				
				
				
		};
		
		return elec;
	
	}
		
		
}
