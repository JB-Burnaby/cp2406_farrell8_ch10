public class DemoHorses {

    public static void main(String args[]) {

        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();

        horse1.setName("cow");
        horse1.setColour("pink");
        horse1.setDOB(1803);

        horse2.setName("oneone");
        horse2.setColour("black");
        horse2.setDOB(2031);
        horse2.setRaces(7);

        System.out.println(horse1.getName() + " is " +
                horse1.getColour() + ", born in " + horse1.getDOB());
        System.out.println(horse2.getName() + " is " +
                horse2.getColour() + ", born in " + horse2.getDOB());
        System.out.println(horse2.getName() + " entered " + horse2.getRaces() + " races.");
    }
}