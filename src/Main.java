public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(0);
      //  System.out.println(f.currentFood);
        Feeder g = new Feeder(500);
        System.out.println(f.getCurrentFood());
        System.out.println(g.getCurrentFood());
        g.simulateOneDay(12);
        System.out.println(Math.random());
        double random = Math.random() * 10;
        System.out.println(random);

    }
}
