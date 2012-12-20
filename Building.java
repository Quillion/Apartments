import java.util.List;
import java.util.ArrayList;

public class Building
{
    private int building_number;
    private String building_name;
    private List<Suite> apartments;

    public Building()
    {
        this.building_number = Constants.NONE;
        this.building_name = "";
        this.apartments = new ArrayList<Suite>();
    }

    public in getBuildingNumber()
    {
        return this.building_number;
    }

    public void setBuildingNumber(int number)
    {
        this.building_number = number;
    }

    public String getBuildingName()
    {
        return this.building_name;
    }

    public void setBuildingName(String name)
    {
        this.building_name = name;
    }

    public Suite getApartment(int number)
    {
        this.apartments.get(number);
    }

    public void addApartment(Suite apartment)
    {
        this.apartments.add(apartment);
    }

    public int getApartmentCount()
    {
        this.apartments.size();
    }
}
