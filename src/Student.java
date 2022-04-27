public class Student extends Person {
    protected double fees;
    protected String semester;

    public Student() {
    }

    public Student(double fees, String semester) {
        this.fees = fees;
        this.semester = semester;
    }

    public Student(int id, String name, String address, double fees, String semester) {
        super(id, name, address);
        this.fees = fees;
        this.semester = semester;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "\nfees=" + fees +
                "\nsemester=" + semester+ "\n}";
    }
}
