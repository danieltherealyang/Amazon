package Amazon.products;

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
