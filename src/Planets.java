public enum Planets {

    MERCURY (1, 0, 2.439, null),
    VENUS (2, 0.336,6.050, MERCURY),
    EARTH (3, 0.277, 6.371, VENUS),
    MARS (4, 0.5237, 3.397, EARTH),
    JUPITER (5, 3.6763, 69.911, MARS),
    SATURN (6, 4.34, 58.000, JUPITER),
    URANUS (7, 9.68, 25.400, SATURN),
    NEPTUNE (8, 10.89, 24.300, URANUS);

    private final int sequenceNumberFromSun;
    private final  double distanceFromPreviousPlanet;
    private final double distanceFromSun;
    private final double radius;
    private final Planets previousPlanet;
    //private final Planets nextPlanet;

    Planets(int sequenceNumberFromSun, double distanceFromPreviousPlanet, double radius, Planets previousPlanet) {
        this.sequenceNumberFromSun = sequenceNumberFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.distanceFromSun = previousPlanet != null ? previousPlanet.distanceFromSun + distanceFromPreviousPlanet : 0.387;
    }

    public int getSequenceNumberFromSun() {
        return sequenceNumberFromSun;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getDistanceFromPreviousPlanet() {
        return distanceFromPreviousPlanet;
    }

    public double getRadius() {
        return radius;
    }

    public Planets getPreviousPlanet() {
        return previousPlanet;
    }

    public Planets getNextPlanet(Planets planet){
        Planets nextPlanet;
        switch (planet){
            case MERCURY -> nextPlanet = VENUS;
            case VENUS -> nextPlanet = EARTH;
            case EARTH -> nextPlanet = MARS;
            case MARS -> nextPlanet = JUPITER;
            case JUPITER -> nextPlanet = SATURN;
            case SATURN -> nextPlanet = URANUS;
            case URANUS -> nextPlanet = NEPTUNE;
            //case NEPTUNE -> nextPlanet = null;
            default -> nextPlanet = null;
        }
        return nextPlanet;
    }
}
