package participant;

public class Main {
    public static void main ( String[] args ) {
        Participant[] participants = {
                new Human ("Alice"),
                new Cat ("Bob"),
                new Robot ("Charlie")
        };
        Obstacle[] obstacles = {
                new Treadmill ("First treadmill", 10),
                new Wall ("First wall", 1),
                new Treadmill ("Second treadmill", 20),
                new Wall ("Second wall", 2)
        };
        for (Participant participant : participants) {
            boolean passedAllObstacles = true;
            for (Obstacle obstacle : obstacles) {
                if ( obstacle.getDifficulty () > 0 ) {
                    if ( obstacle instanceof Treadmill ) {
                        participant.run (obstacle.getDifficulty ());
                        System.out.println ("Participant " + participant.getName () + " passed the obstacle " + obstacle.getName () + " at the distance " + obstacle.getDifficulty ());
                    }
                    else if ( obstacle instanceof Wall ) {
                        participant.jump (obstacle.getDifficulty ());
                        if ( participant instanceof Robot ) {
                            System.out.println ("Participant " + participant.getName () + " did not pass the obstacle " + obstacle.getName () + " at the height " + obstacle.getDifficulty ());
                        }
                    }
                }
            }
        }
    }
}



