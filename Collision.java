public class Collision {
    public static boolean samePosition(RandomWalk p1, RandomWalk p2){
        if (p1.getX() == p2.getX() && p1.getY() == p2.getY()){
            System.out.println("Collision detected at: (" + p1.getX() + "," + p1.getY() + ")");
            return true;
        }
        return false;
    }
}