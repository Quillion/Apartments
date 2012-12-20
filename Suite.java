import java.util.List;
import java.util.ArrayList;

public class Suite
{
    private String suite_number;
    private int buzzer;
    private List<Person> tenants;

    public Suite()
    {
        this.suite_number = "";
        this.buzzer = Constants.NONE;
        this.tenants = new ArrayList<Person>();
    }

    public String getSuiteNumber()
    {
        return this.suite_number;
    }

    public void setSuiteNumber(String suite_number)
    {
        this.suite_number = suite_number;
    }

    public int getBuzzer()
    {
        return this.buzzer;
    }

    public void setBuzzer(int buzzer)
    {
        this.buzzer = buzzer;
    }

    public Person getTenant()
    {
        return this.tenants.get(0);
    }

    public Person getTenant(int number)
    {
        return this.tenants.get(number);
    }

    public void addTenant(Person person)
    {
        this.tenants.add(person);
    }

    public int getTenantCount()
    {
        return this.tenants.size();
    }
}
