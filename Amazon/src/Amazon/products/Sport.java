package Amazon.products;

public class Sport
{
	private String stitle;
	private String sdescript;
	private int sprice;
	
	
	
	public Sport(String title, String descript, int price)
	{
		stitle=title;
		sdescript=descript;
		sprice=price;
		
	}

	
	public String Key()
	{
		return stitle;
		
	}

	
	public static Sport[] Sportdata()
	{
		Sport[] sp= {
				new Sport("Title Here","descipt here",1),
				
				
				
		};
		
		return sp;
	
	}
		
		
}
