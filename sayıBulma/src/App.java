public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for(int sayi:sayilar)
        {
            if(sayi == aranacak)
            {
              varMi = true;
              break; 
            }
        }

        if(varMi)
        {
            System.out.println("Sayi Mevcuttur");
        }
        else
        {
            System.out.println("Sayi Mevcut Degildir");
        }
    }
}
