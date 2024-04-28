import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Albano", 27));
        students.add(new Student("Alisya", 26));
        students.add(new Student("Giuseppe", 23));
        students.add(new Student("Luca", 19));
        students.add(new Student("Erika", 24));
        students.add(new Student("Davide", 21));
        students.add(new Student("Maria", 28));
        students.add(new Student("Ilaria", 21));
        students.add(new Student("Mario", 26));
        students.add(new Student("Riccardo", 19));
        students.add(new Student("Andrea", 24));
        students.add(new Student("Giulia", 21));
        students.add(new Student("Rocco", 23));

        System.out.println("Students: "  + students);

        students.sort(Comparator.comparing(Student::getName));

        System.out.println("Ordinate Students: "+students);
    }
}
