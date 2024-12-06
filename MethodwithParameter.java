//Methods with Parameter
public class MethodwithParameter {
    static void StudentDetails(String name, String subject, int mark) {
        System.out.println(name + " Scored " + mark + "in" + subject);
    }

    static void validateMarks(String name, int mark) {
        if (mark < 50) {
            System.out.println(name + "Failed");

        } else {
            System.out.println(name + "Passed");
        }
    }

    public static void main(String args[]) {

        StudentDetails("Guhan", "Maths", 98);
        StudentDetails("Karupaiya", "Maths", 98);
        validateMarks("guhan",90);


    }
}
