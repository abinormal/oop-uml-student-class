public class Main {
    public static void main(String[] args) {
        try {
            Student peter = new Student("Peter", Grade.B, 4);
            System.out.println(peter.getName()+ " has grade " + peter.getGrade());
            peter.increaseGrade();
            System.out.println(peter.getName()+ " has grade " + peter.getGrade());
            peter.increaseGrade();
            System.out.println(peter.getName()+ " has grade " + peter.getGrade());

            peter.decreaseGrade();
            peter.decreaseGrade();
            peter.decreaseGrade();
            System.out.println(peter.getName()+ " has grade " + peter.getGrade());
        } catch (Exception e) {
            System.out.println("Exception: "+ e);
        }

        try {
            Student david = new Student("David", Grade.F, 6);
            System.out.println(david.getName()+ " has grade " + david.getGrade());
        } catch (Exception e) {
            System.out.println("Exception: "+ e);
        }

        // Can't get secretNickname
        // String secret = peter.secretNickName;
    }

}
