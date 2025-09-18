public class Main {
    public static void main(String[] args) {
        // Reduced edge and steps for a more practical collision simulation
        RandomWalk walk1 = new RandomWalk(100, 100, 3, 0);
        RandomWalk walk2 = new RandomWalk(100, 100, -3, 0);

        int collisions = 0;
        while (walk1.moreSteps() && walk1.inBounds() && walk2.moreSteps() && walk2.inBounds()) {
            walk1.takeStep();
            walk2.takeStep();
            if (Collision.samePosition(walk1, walk2)) {
                collisions++;
            }
        }

        System.out.println(walk1);
        System.out.println(walk2);
        System.out.println("Total collisions: " + collisions);
    }
}
