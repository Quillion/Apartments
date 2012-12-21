import java.util.ArrayList;
import java.util.List;


public class Contractor
{
  private String company;
  private String name;
	private List<Suite> suites;
	public Contractor()
	{
		this.company = "";
		this.name = "";
		this.suites = new ArrayList<Suite>();
	}
	public Contractor(String company, String name, List<Suite> suites)
	{
		this.company = company;
		this.name = name;
		this.suites = suites;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company = company;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public List<Suite> getSuites()
	{
		return suites;
	}
	public void setSuites(List<Suite> suites)
	{
		this.suites = suites;
	}
}
