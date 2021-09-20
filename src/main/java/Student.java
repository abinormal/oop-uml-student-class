
enum Grade { A, B, C, D, E, F }

public class Student {
    private final String name;
    private Grade grade;
    private final int group;
    private final String secretNickName = "MySecretNickName";

    public Student(String name, Grade grade, int group) throws Exception {
        this.name = name;
        this.grade = grade;
        if (group >= 1 && group <=5) {
            this.group = group;
        } else {
            throw new Exception("The group can only be values 1-5");
        }
    }

    public Grade getGrade() {
        return this.grade;
    }
    public String getName(){
        return this.name;
    }
    public void increaseGrade(){
        switch (this.grade) {
            case B:
                this.grade = Grade.A;
                break;
            case C:
                this.grade = Grade.B;
                break;
            case D:
                this.grade = Grade.C;
                break;
            case E:
                this.grade = Grade.D;
                break;
            case F:
                this.grade = Grade.E;
                break;
            default:
                System.out.println("What are you trying to pull here! You have a " + this.grade);
        }
    }
    public void decreaseGrade(){
        switch (this.grade) {
            case A:
                this.grade = Grade.B;
                break;
            case B:
                this.grade = Grade.C;
                break;
            case C:
                this.grade = Grade.D;
                break;
            case D:
                this.grade = Grade.E;
                break;
            case E:
                this.grade = Grade.F;
                break;
            default:
                System.out.println("What are you trying to pull here! You have a " + this.grade);
        }

    }
}
