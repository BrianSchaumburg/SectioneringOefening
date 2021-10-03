public class testApplicatie {
    public static void main(String[] args )
    {
        RandomGetal random = new RandomGetal();
        System.out.println("Het getal is: " + random.getGetal() + " en " + random.evenOnevenControl());
        WeekDag dag = new WeekDag()     ;
        System.out.println("Het getal is " + dag.getGetal() + " en " + dag.weekDagBepalen());
    }
}
