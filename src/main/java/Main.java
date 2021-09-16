public class Main {
    public static void main(String[] args) {
        Student peter = new Student("Peter", GRADE.B, 4);
        peter.increaseGrade();
        peter.increaseGrade();
        System.out.println(peter.getName()+ " has grade " + peter.getGrade());

        peter.decreaseGrade();
        peter.decreaseGrade();
        peter.decreaseGrade();
        System.out.println(peter.getName()+ " has grade " + peter.getGrade());

        Student david = new Student("David", GRADE.F, 6);
        System.out.println(david.getName()+ " has grade " + david.getGrade());

        // Can't get secretNickname
        // String secret = peter.secretNickName;
    }

}
