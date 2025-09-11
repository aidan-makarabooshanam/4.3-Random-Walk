public class RandomWalk {
    private int currentX;
    private int currentY;
    private int maxSteps;
    private int numSteps;
    private int edge;

    public RandomWalk(int maxSteps, int edge){
        currentX=0;
        currentY=0;
        numSteps=0;
        this.maxSteps = maxSteps;
        this.edge = edge;
    }

    public RandomWalk(int maxSteps, int edge, int currentX, int currentY){
        this.maxSteps=maxSteps;
        this.edge = edge;
        this.currentX = currentX;
        this.currentY = currentY;
        this.numSteps=0;
    }

    public String toString(){
        return ("Steps: "+numSteps+"Position: ("+currentX+","+currentY+")");
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


}