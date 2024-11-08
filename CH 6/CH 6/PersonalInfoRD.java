
/**
 * Stores an individual's name, age, address, and number.
 * Provides accessor methods and mutator methods to get and set
 * the stored values.
 *
 * @author Ryan Davies
 * @version 11/7/2024
 */
public class PersonalInfoRD
{
    // fields - store user information
    private int age;
    private String name;
    private String address;
    private String number;

    //accessors
    //returns the value of age
    public int getAge()
    {
        return age;
    }
    //returns the value of name
    public String getName()
    {
        return name;
    }
    //returns the value of address
    public String getAddress()
    {
        return address;
    }
    //returns the value of number
    public String getNumber()
    {
        return number;
    }
    
    //mutators
    //sets the value of age to value
    public void setAge(int value)
    {
        age = value;
    }
    //sets the value of name to value
    public void setName(String value)
    {
        name = value;
    }
    //sets the value of address to value
    public void setAddress(String value)
    {
       address = value; 
    }
    //sets the value of number to value
    public void setNumber(String value)
    {
        number = value;
    }
}
