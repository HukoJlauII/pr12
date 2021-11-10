import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class Phone {
    protected String CountryCode;
    protected String Number;

    public void toNumber(String str)
    {

        try
        {
            Pattern pattern=Pattern.compile("[+]?[0-9]{11}");
            Matcher matcher=pattern.matcher(str);
            if (!matcher.matches())
            {
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            System.out.println("Wrong type of number");
            return;
        }
        if (str.charAt(0)=='+')
        {
            CountryCode=str.substring(0,2);
            Number=str.substring(2);
        }
        else
        {
            CountryCode=str.substring(0,1);
            Number=str.substring(1);
        }
        System.out.println(CountryCode+Number);
    }
    public void toNumberdash(String str)
    {
        try
        {
            Pattern pattern=Pattern.compile("[+]?[0-9]{11}");
            Matcher matcher=pattern.matcher(str);
            if (!matcher.matches())
            {
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            System.out.println("Wrong type of number");
            return;
        }
        if (str.charAt(0)=='+')
        {
            CountryCode=str.substring(0,2);
            Number=str.substring(2);
        }
        else
        {
            CountryCode=str.substring(0,1);
            Number=str.substring(1);
        }
        System.out.println(CountryCode+Number.substring(0,3)+"-"+Number.substring(3,6)+"-"+Number.substring(6));
    }
}
