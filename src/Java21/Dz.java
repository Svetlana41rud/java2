package Java21;

public class Dz {
    public static void main(String[] args) {
        int stage = 0;
        Team[] team = new Team[3];
        team[0] = new Cat("Barsik", 50, 5);
        team[1] = new Human("Pavel", 500, 3);
        team[2] = new Robot("Valli", 700, 15);

        Treadmill treadmill = new Treadmill(300);
        Wall wall = new Wall(2);
        playMarathon(team, treadmill, wall);
    }


    public static void playMarathon(Team[] team, Treadmill treadmill, Wall wall) {
        int stage;
        do {
            for ( stage = 1; stage <=3 ; stage++) {
                treadmill.setLength(treadmill.getLength()*stage);
                wall.setHeight(wall.getHeight()*stage);
                for (int i = 0; i < 3; i++) {
                    team[i].runTreadmill(treadmill);
                }
                for (int j = 0; j < 3; j++) {
                    team[j].jumpWall(wall);
                }
                System.out.println("\n" + stage + " этап окончен" + "\n");
            }
        } while (stage == 3);
    }
}
