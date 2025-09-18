public class RandomWalk {
    private int currentX;
    private int currentY;
    private int maxSteps;
    private int numSteps;
    private int edge;
    private int maxDistance;

    public RandomWalk(int maxSteps, int edge){
        currentX=0;
        currentY=0;
        numSteps=0;
        this.maxSteps = maxSteps;
        this.edge = edge;
        this.maxDistance = 0;
    }

    public RandomWalk(int maxSteps, int edge, int currentX, int currentY){
        this.maxSteps=maxSteps;
        this.edge = edge;
        this.currentX = currentX;
        this.currentY = currentY;
        this.numSteps=0;
        this.maxDistance = 0;
    }

    public String toString(){
        return ("Steps: "+numSteps+"   Position: ("+currentX+","+currentY+")");
    }

    public void takeStep(){
        switch ((int) Math.floor(Math.random() * 4)) {
            case 0:
                currentX--;
                break;
            case 1:
                currentX++;
                break;
            case 2:
                currentY++;
                break;
            case 3:
                currentY--;
                break;
        }
        numSteps++;
        maxDistance = max(maxDistance, max(Math.abs(currentX), Math.abs(currentY)));
    }

    public boolean moreSteps(){
        if (numSteps<maxSteps){
            return true;
        }else
        return false;
    }
    public boolean inBounds(){
        if (currentX <edge && currentY <edge){
            return true;
        }else
        return false;
    }
    public void walk(){
        while (inBounds() && moreSteps()){
            takeStep();
        }
    }

    public int getX(){
        return currentX;
    }
    public int getY(){
        return currentY;
    }

    private int max(int num1, int num2){
        if (num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    public int getMaxDistance(){
        return maxDistance;
    }

    public int getMaxSteps(){
        return maxSteps;
    }

}