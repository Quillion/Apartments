import java.util.List;
import java.util.ArrayList;

public class Person
{
    private String name;
    private List<Car> cars;
    private List<PhoneNumber> phone_numbers;
    private List<Locker> lockers;

    public Person()
    {
        this.name = "";
        this.cars = new ArrayList<Car>();
        this.phone_numbers = new ArrayList<PhoneNumber>();
        this.lockers = new ArrayList<Locker>();
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Car getCar()
    {
        return this.cars.get(0);
    }

    public Car getCar(int number)
    {
        return this.cars.get(number);
    }

    public void addCar(Car car)
    {
        this.cars.add(car);
    }

    public PhoneNumber getPhoneNumber()
    {
        return this.phone_numbers.get(0);
    }

    public PhoneNumber getPhoneNumber(int number)
    {
        return this.phone_numbers.get(number);
    }

    public void addPhoneNumber(PhoneNumber phone_number)
    {
        this.phone_numbers.add(phone_number);
    }

    public Locker getLocker()
    {
        return this.lockers.get(0);
    }

    public Locker getLocker(int number)
    {
        return this.lockers.get(number);
    }

    public void addLocker(Locker locker)
    {
        this.lockers.add(locker);
    }
}
