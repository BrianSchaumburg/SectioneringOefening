import java.util.*;
public class WeekDag {
    private int getal;
    private String dag;
    public WeekDag()
    {
        genererenGetal();
    }

    private void genererenGetal() {
        Random r = new Random();
        int low = 1;
        int high = 8;
        int result = r.nextInt(high-low) + low;
        getal = result;
    }

    public int getGetal() {
        return getal;
    }

    public String weekDagBepalen()
    {
        switch(getal)
        {
            case 1:
               dag ="maandag";
               break;
            case 2: dag = "Dinsdag"; break;
            case 3: dag = "Woensdag" ; break;
            case 4: dag  = "Donderdag " ; break;
            case 5 : dag = "vrijdag"; break;
            case 6: dag = "zaterdag"; break;
            case 7 : dag = "zondag" ; break;
            default: throw  new IllegalArgumentException("Er is iets foutegelopen, controleer het getal");
        }return "De dag is :  " +dag;
    }
}
