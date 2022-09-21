public class App 
{
    public static void main(String[] args) throws Exception 
    {
        String ogrenci1 = "Nuri";
        String ogrenci2 = "Utku";
        String ogrenci3 = "Yigit";
        String ogrenci4 = "Can";
        
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Nuri";
        ogrenciler[1] = "Utku";
        ogrenciler[2] = "Yigit";
        ogrenciler[3] = "Can";
        //ogrenciler[4] = "Ali";
        for(int i = 0; i < ogrenciler.length; i++)
        {
            System.out.println(ogrenciler[i]);
        }

        for(String ogrenci:ogrenciler)
        {
            System.out.println(ogrenci);
        }
    }
}
