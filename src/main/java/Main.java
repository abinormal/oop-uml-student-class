public class Main {
    public static void main(String[] args) {
        Student peter = new Student("Peter", GRADE.B);
        peter.increaseGrade();
        peter.increaseGrade();
        System.out.println(peter.getName()+ " has grade " + peter.getGrade());

        peter.decreaseGrade();
        peter.decreaseGrade();
        peter.decreaseGrade();
        System.out.println(peter.getName()+ " has grade " + peter.getGrade());

        // Can't get secretNickname
        // String secret = peter.secretNickName;
    }

}
