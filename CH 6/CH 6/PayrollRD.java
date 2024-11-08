
/**
 * Write a description of class PayrollRD here.
 *
 * @author Ryan Davies
 * @version 11/7/2024
 */
public class PayrollRD
{
    //fields - store payroll information
    private String name;
    private int id;
    private double hourlyPay;
    private double hoursWorked;

    //accessors
    /**
     * returns the employee's name
     *
     * @return    employee name
     */
    public String getName()
    {
       return name;
    }
    /**
     * returns the employee's ID
     *
     * @return    employee ID
     */
    public int getId()
    {
       return id;
    }
    /**
     * returns the employee's hourly pay rate
     *
     * @return    employee hourly pay
     */
    public double getHourlyPay()
    {
       return hourlyPay;
    }
    /**
     * returns the hours the employee worked
     *
     * @return    hours the employee worked
     */
    public double getHoursWorked()
    {
       return hoursWorked;
    }
    
    //mutators
    /**
     * sets the employee's name to value
     * 
     * @param   value   the name to enter into the object
     */
    public void setName(String value)
    {
       name = value;
    }
}
