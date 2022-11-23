import model.Student;
public class Main {
    public static void main(String[] args) {

        Student StudA = new Student();
        StudA.getAll();
        StudA.setAll("Leung",222,'F',"89634");
        StudA.getAll();
    }
}