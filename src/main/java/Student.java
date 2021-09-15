
enum GRADE { A, B, C, D, E, F }
// enum GROUP { 1, 2, 3, 4, 5} Got issues.

public class Student {
    private final String name;
    private GRADE grade;
    // private GROUP group;
    private final String secretNickName = "MySecretNickName";

    public Student(String name, GRADE grade) {
        this.name = name;
        this.grade = grade;
    }

    public GRADE getGrade() {
        return this.grade;
    }
    public String getName(){
        return this.name;
    }
    public void increaseGrade(){
        //this.grade = this.grade++;
        switch (this.grade) {
            case B:
                System.out.println("Got a B, make it an A!");
                this.grade = GRADE.A;
                break;
            case C:
                System.out.println("Got a C, make it an B!");
                this.grade = GRADE.B;
                break;
            case D:
                System.out.println("Got a D, make it an C!");
                this.grade = GRADE.C;
            case E:
                System.out.println("Got a E, make it an D!");
                this.grade = GRADE.D;
                break;
            case F:
                System.out.println("Got a F, make it an E!");
                this.grade = GRADE.E;
                break;
            default:
                System.out.println("What are you trying to pull here! You have a " + this.grade);
        }
    }
    public void decreaseGrade(){

    }
}
