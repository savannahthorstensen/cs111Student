public class Student {
    private String name;
    private int studentID;
    private int points;

   
    public Student() {
        this.name = "Unknown";
        this.studentID = 0000;
        this.points = 0;
    }

    
    public Student(String name, int studentID, int points) {
        this.name = name;
        this.studentID = studentID;
        this.points = points;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + studentID + ", Points: " + points;
    }
}
