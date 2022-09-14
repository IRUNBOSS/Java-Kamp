public class Day1
 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello, World!");
        
        //değişken isimlendirmeleri java'da camelCase yazılır
        String ortaMetin = "Ilginizi cekebilir";
        String altMetin = "Vade suresi";

        System.out.println(ortaMetin);

        System.out.println(altMetin);
        
        //integer
        int vade = 12;

        double dolarDun = 18.25;
        double dolarBugun = 18.20;
        
        boolean dolarDustuMu = false;

        String okYonu = "";

        if(dolarBugun < dolarDun) //true
        {
            okYonu = "down.svg";
            System.out.println(okYonu);
        }
        else if(dolarBugun > dolarDun)
        {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else
        {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        //array

        String[] krediler = {"Hizli Kredi","Maasini Sikbanktan alanlar","Mutlu Emekli"};

        for(int i = 0; i < krediler.length; i++)
        {
            System.out.println(krediler[i]);            
        }

    }
}
