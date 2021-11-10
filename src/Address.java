import java.util.StringTokenizer;

public class Address {
    protected String Country="";
    protected String Region="";
    protected String City="";
    protected String Street="";
    protected String House="" ;
    protected String Housing="";
    protected String Flat="";

    public Address() {
    }

    public Address(String country, String region, String city, String street, String house, String housing, String flat) {
        Country = country;
        Region = region;
        City = city;
        Street = street;
        House = house;
        Housing = housing;
        Flat = flat;
    }

    public void StringtoAddresscomma(String str)
    {
        String[] Address=new String[7];
        Address = str.split(",");
        Country = Address[0].trim();
        Region = Address[1].trim();
        City = Address[2].trim();
        Street = Address[3].trim();
        House = Address[4].trim();
        Housing =Address[5].trim();
        Flat = Address[6].trim();
    }
    public void StringtoAddress(String str)
    {
        StringTokenizer tokenizer=new StringTokenizer(str,"., ;");
        Country = tokenizer.nextToken().trim();
        Region = tokenizer.nextToken().trim();
        City = tokenizer.nextToken().trim();
        Street = tokenizer.nextToken().trim();
        House = tokenizer.nextToken().trim();
        Housing = tokenizer.nextToken().trim();
        Flat = tokenizer.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "Country='" + Country + '\'' +
                ", Region='" + Region + '\'' +
                ", City='" + City + '\'' +
                ", Street='" + Street + '\'' +
                ", House='" + House + '\'' +
                ", Housing='" + Housing + '\'' +
                ", Flat='" + Flat + '\'' +
                '}';
    }
}
