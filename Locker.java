public class Locker
{
    private String location;

    public Locker()
    {
        this("");
    }

    public Locker(String location)
    {
        this.location = location;
    }

    public String getLocation()
    {
        return this.location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }
}
