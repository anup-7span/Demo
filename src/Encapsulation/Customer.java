package Encapsulation;

public class Customer {

    private String firstName;
    private String lastName;
    private String craditCard;

    public  String getFirstName()
    {
        return firstName;
    }
    public void  setFirstName(String firstName)
    {
        if(firstName==null)
        {
            System.out.println("Invalid");
        }
        this.firstName=firstName;
    }

    public  String getLastName()
    {
        return lastName;
    }
    public void  setLastName(String lastName)
    {
        this.lastName=lastName;
    }

    public  String getCraditCard()
    {
        return craditCard;
    }
    public void  setCraditCard(String craditCard)
    {
        this.craditCard=craditCard;
    }
}
