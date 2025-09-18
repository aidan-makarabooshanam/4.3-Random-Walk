import java.util.Scanner;

public class DrunkenWalk {
    public static void main(String[] args) {
        int drunksFallen=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of drunks to simulate: ");
        int size = scan.nextInt();
        System.out.print("Enter the maximum number of steps each drunk can take: ");
        int maxSteps = scan.nextInt();
        System.out.print("Enter the edge of the square: ");
        int edge = scan.nextInt();
        scan.close();

        for (int i=0; i<size; i++){
            RandomWalk walk = new RandomWalk(maxSteps, edge);
            walk.walk();
            if (!walk.inBounds()){
                drunksFallen++;
            }
        }
        System.out.println(drunksFallen);
    }
}
