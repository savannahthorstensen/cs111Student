public class UnderGrad extends Student {
   private int finalScore;

    
    public UnderGrad() {
        super();
        this.finalScore = 0;
    }

    
    public UnderGrad(String name, int studentID, int points, int finalScore) {
        super(name, studentID, points);
        this.finalScore = finalScore;
    }


    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", UndergraduateStudent Final Score:" + finalScore;
    }

    
    public int calculatePerformance() {
        return getPoints() + finalScore;
    }
}
