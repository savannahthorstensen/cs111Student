public class Grad extends Student {  
    private int thesisScore;


    public Grad() {
        super();
        this.thesisScore = 0;
    }


    public Grad(String name, int studentID, int points, int thesisScore) {
        super(name, studentID, points);
        this.thesisScore = thesisScore;
    }

    
    public int getThesisScore() {
        return thesisScore;
    }

    public void setThesisScore(int thesisScore) {
        this.thesisScore = thesisScore;
    }


    @Override
    public String toString() {
        return super.toString() + ", GraduateStudent Thesis Score: " + thesisScore;
    }

    
    public int calculatePerformance() {
        return getPoints() + thesisScore;
    }
}

