public class Car
{
    private String license_plate;
    private String make;
    private String parking_spot;

    public Car()
    {
        this.license_plate = "";
        this.make = "";
        this.parking_spot = "";
    }

    public String getLicensePlate()
    {
        return this.license_plate;
    }

    public void setLicensePlate(String license_plate)
    {
        this.license_plate = license_plate;
    }

    public String getMake()
    {
        return this.make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getParkingSpot()
    {
        return this.parking_spot;
    }

    public void setParkingSpot(String parking_spot)
    {
        this.parking_spot = parking_spot;
    }
}
