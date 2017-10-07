public class DemoCandles
{
    public static void main(String args[]) {

        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();

        candle.setHeight(4);
        candle.setColour("purple");

        scentedCandle.setHeight(4);
        scentedCandle.setColour("orange");
        scentedCandle.setScent("apple");

        System.out.println(candle.getHeight() + " inch " + candle.getColour() +
                " candle: $" + candle.getPrice());
        System.out.println(scentedCandle.getHeight() + " inch " +
                scentedCandle.getScent() +
                " flavoured " + scentedCandle.getColour() +
                " candle: $" + scentedCandle.getPrice());
    }
}