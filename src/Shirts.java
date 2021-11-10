import java.util.StringTokenizer;

public class Shirts {
    protected String Modelnum="";
    protected String ShirtType="";
    protected String Color="";
    protected String Size="";

    public Shirts() {
    }

    public void toShirt(String str)
    {
        StringTokenizer tokenizer=new StringTokenizer(str,",");
        Modelnum=tokenizer.nextToken();
        ShirtType=tokenizer.nextToken();
        Color=tokenizer.nextToken();
        Size=tokenizer.nextToken();

    }

    @Override
    public String toString() {
        return "Shirts{" +
                "Modelnum='" + Modelnum + '\'' +
                ", ShirtType='" + ShirtType + '\'' +
                ", Color='" + Color + '\'' +
                ", Size='" + Size + '\'' +
                '}';
    }
}
