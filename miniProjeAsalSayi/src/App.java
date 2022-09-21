public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int number = 25;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = false;

        if(number == 1)
        {
            System.out.println("Sayi Asal Degildir");
            return;
        }

        if(number <1)
        {
            System.out.println("Gecersiz Sayi");
        }
        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
            {
                isPrime = true;
                
            }
        if(isPrime)
         {
            System.out.println("Sayi Asaldir");
            
         }
            else
            {
                System.out.println("Sayi Asal Degildir");
            }
        }
    }
}
