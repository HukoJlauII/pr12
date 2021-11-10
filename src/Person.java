public class Person {
    protected String surname;
    protected String name;
    protected String oname;

    public Person(String surname, String name, String oname) {
        this.surname = surname;
        this.name = name;
        this.oname = oname;
    }

    public Person(String surname) {
        this.surname = surname;
    }
    public String getPerson()
    {
        if ((this.oname != null) && (this.name != null))
        {
            return (this.surname+" "+this.name.charAt(0)+"."+this.oname.charAt(0)+".");
        }
        else return (this.surname);
    }
}
