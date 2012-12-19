public class PhoneNumber
{
    private int type;
    private String number;
    private String extension;

    public PhoneNumber()
    {
        type = Constants.NONE;
        number = "";
        extension = "";
    }

    public int getType()
    {
        return this.type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public String getNumber()
    {
        return this.number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getExtension()
    {
        return extension;
    }

    public void setExtension(String extension)
    {
        this.extension = extension;
    }
}
