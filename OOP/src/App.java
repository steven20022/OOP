public class App {
    public static void main(String[] args) throws Exception {
        // Abstraction is to work with something we know how to use without
        // knowing how it works internally

        Student student = new Student("Jacob", "Elam", "CHC");
        System.out.println(student.greeting());

        UndergradStudent undergradStudent = new UndergradStudent(student.getFirstName(), student.getLastName(), student.getSchoolName(), 3.27, 40, "Software Development");
        System.out.println("--- Greeting --- \n"+undergradStudent.greeting());
        System.out.println("--- Credits Remaining ---\n" + undergradStudent.creditsRemaining(180));
        System.out.println("--- Is Major Complete ---\n" + undergradStudent.isMajorComplete(180));
        Integer one = 1;
        Double two = 2.0;
        String twoString = "2.0";
        Boolean bool = false;

        // Strongly typed programming languages will attempt to determin the type for you
        System.out.println(one + two);
        System.out.println(one + twoString);

        // System.out.println(one + bool);
    }
}
