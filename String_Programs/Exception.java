public class Exception
{
    public static void main(String arg[])
   {
    try
    {
        stmt-1;
        stmt-2;
        stmt-3;
        try
        {
            stmt-4;
            stmt-5;
            stmt-6;
        }
        catch (X e)
        {
            stmt-7;
        }
        finally
        {
            stmt-8;
        }
            stmt-9;
    }
    catch (Y e)
    {
        stmt-10;
    }
    finally
    {
        stmt-11;
    }
        stmt-12;
   }
}