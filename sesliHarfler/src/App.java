import javax.swing.event.SwingPropertyChangeSupport;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        char harf='E';

        switch ( harf )
        {
            case 'A' :
            case 'I' :
            case 'O' :
            case 'U' :
                System.out.println("Kalin Sesli Harf");
                break;
            default:
            System.out.println("Ince Sesli Harf");
        }

    }
}
