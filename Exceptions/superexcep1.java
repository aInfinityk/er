class MyExcep extends Exception
{
    public MyExcep(String s)
    {
        super(s);
    }
}
  
public class superexcep1
{
    public static void main(String args[])
    {
        try
        {
            throw new MyExcep("GeeksGeeks");
        }
        catch (MyExcep ex)
        {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}