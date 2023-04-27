public class Main {
    public static void main(String[] args) {

        Planets planet = Planets.MERCURY;
        System.out.println("\nMERCURY: \ndistance from the Sun is " + planet.getDistanceFromSun() + "\nthe radius is " + planet.getRadius() + "\nthe distance from the previous planet is " + planet.getDistanceFromPreviousPlanet()
                + "\nthe order is " + planet.getSequenceNumberFromSun() + "\nthe previous planet is " + planet.getPreviousPlanet() + "\nthe next planet is " + planet.getNextPlanet(planet));

    }
}