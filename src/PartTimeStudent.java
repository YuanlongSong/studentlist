
/**
 * This class +++Insert Description Here+++
 *
 * @author Yuanlong Song
 */
public class PartTimeStudent extends Student {
    private int numCourses;
    public PartTimeStudent(String name, int numCourses) {
        super(name);
        this.numCourses = numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    
}
