public class Main {
    public static void main(String[] args) {
        Person p1=new Person("Ivanov");
        Person p2 = new Person("Glushko","Nikita","Sergeevich");
        System.out.println(p1.getPerson());
        System.out.println(p2.getPerson());
        System.out.println("----------------------------------------------------------------------");
        String[] ad=new String[4];
        String[] Country ={"Russia","Ukraine","Belarus","Canada"};
        String[] Region ={"Dagestan","Donbass","Kazan","Middlewood"};
        String[] City ={"Krym","Donetsk","Minsk","Toronto"};
        String[] Street ={"Nagornaya","Uglevaya","Pozharnaya","Blackcow"};
        String[] delim={",",".",";"," "};
        for (int i=0;i<4;i++)
        {
            int house,housing,flat;
            house=(int)(Math.random()*30+1);
            housing=(int)(Math.random()*7+1);
            flat=(int)(Math.random()*100+1);
            ad[i]=Country[i]+delim[i]+Region[i]+delim[i]+City[i]+delim[i]+Street[i]+delim[i]+Integer.toString(house)+delim[i]+Integer.toString(housing)+delim[i]+Integer.toString(flat);
        }
        Address[] address=new Address[4];
        address[0]=new Address();
        address[0].StringtoAddresscomma(ad[0]);
        System.out.println(address[0]);
        for (int i=1;i<4;i++)
        {
            address[i]=new Address();
            address[i].StringtoAddress(ad[i]);
            System.out.println(address[i]);
        }
        System.out.println("----------------------------------------------------------------------");
        String[]shirts=new String[11];
        Shirts[] Shirt=new Shirts[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        int i=0;
        for (String s:shirts)
        {
            Shirt[i]=new Shirts();
            Shirt[i].toShirt(shirts[i]);
            System.out.println(Shirt[i++]);
//            i++;
        }
        System.out.println("----------------------------------------------------------------------");
        String[] numbers=new String[3];
        numbers[0]="+780055535353535" ;
        numbers[1]="88005553535";
        numbers[2]="+37184201670";
        Phone[] phones= new Phone[3];
        for (i=0;i<3;i++)
        {
            phones[i]=new Phone();
            phones[i].toNumber(numbers[i]);
            phones[i].toNumberdash(numbers[i]);
        }
    }
}
