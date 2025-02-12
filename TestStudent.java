public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Bob", 53001, 50);
        System.out.println(student);

        UnderGrad undergrad = new UnderGrad("Mia", 50601, 70, 85);
        System.out.println(undergrad);
        System.out.println("Overall Performance: " + undergrad.calculatePerformance());

 
        Grad grad = new Grad("Anna", 70012, 80, 90);
        System.out.println(grad);
        System.out.println("Overall Performance: " + grad.calculatePerformance());
    }
}
