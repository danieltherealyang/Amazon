package Amazon.products;

public class Fresh
{
	private String ftitle;
	private String fdescript;
	private int fprice;
	private String fexp;
	
	
	public Fresh(String title, String descript, int price,String exp)
	{
		ftitle=title;
		fdescript=descript;
		fprice=price;
		fexp=exp;
	
	}

	
	public String Key()
	{
		return ftitle;
		
	}

	
	public static Fresh[] Freshdata()
	{
		Fresh[] fo= {
				new Fresh("Title Here","descipt here",1,"exp here"),
				
				
				
		};
		
		return fo;
	
	}
		
		
}
