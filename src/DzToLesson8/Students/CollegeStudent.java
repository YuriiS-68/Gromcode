package DzToLesson8.Students;

/**
 * Created by Skorodielov on 09.06.2017.
 */
public class CollegeStudent extends Student {
    String collegeName;
    int rating;
    long id;

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken){
        super(firstName, lastName, group, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(firstName, lastName, group, coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}
