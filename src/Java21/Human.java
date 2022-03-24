package Java21;

public class Human extends Team {

    public Human(String name, int maxRange, int maxJump) {
        super(name, maxRange, maxJump);
    }


    @Override
    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getLength() <= getMaxRange() )
            System.out.println(getName() + " пробежал " + treadmill.getLength() + " метров" );
        else System.out.println(getName() + " не смог пробежать " + treadmill.getLength() + " метров");
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= getMaxJump())
            System.out.println(getName() + " смог перепрыгнуть препятствие высотой " + wall.getHeight() + " метра");
        else System.out.println(getName() + " не смог перепрыгнуть препятствие");
    }
}
