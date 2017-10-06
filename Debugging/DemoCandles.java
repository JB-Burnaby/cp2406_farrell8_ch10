public class DemoCandles
{
    public static void main(String args[]) {

        Candle aCandle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();

        aCandle.setHeight(4);
        aCandle.setColour("purple");

        scentedCandle.setHeight(4);
        scentedCandle.setColour("orange");
        scentedCandle.setScent("apple");

        System.out.println(aCandle.getHeight() + " inch " + aCandle.getColour() +
                " candle: $" + aCandle.getPrice());
        System.out.println(scentedCandle.getHeight() + " inch " +
                scentedCandle.getScent() +
                " flavoured " + scentedCandle.getColour() +
                " candle: $" + scentedCandle.getPrice());
    }
}