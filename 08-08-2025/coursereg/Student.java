package coursereg;

public class Student {
    private String studentName;
    private String studentMail;
    private long studentPhNo;

    public Student(String studentName, String studentMail, long studentPhNo) {
        this.studentName = studentName;
        this.studentMail = studentMail;
        this.studentPhNo = studentPhNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentMail() {
        return studentMail;
    }

    public long getStudentPhNo() {
        return studentPhNo;
    }
}
