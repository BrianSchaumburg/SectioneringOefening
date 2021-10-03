import java.util.*;
public class RandomGetal {
    private int getal;
    public RandomGetal()
    {
    randomGetalGenereren();
    }
    public int getGetal()
    {
        return this.getal;
    }
    private void randomGetalGenereren()
    {
        Random r = new Random();
        int low = 1;
        int high = 1001;
        getal = r.nextInt(high-low) + low;
    }
    public String evenOnevenControl()
    {
        if(getal%2 == 0 )
        {
            return "Het getal is even ";
        }
        else
            return "Het getal is oneven ";
    }

}
