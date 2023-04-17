package ObjectPractice;

public class Student {

    //メンバ変数
    private int studentNumber;
    private String studentName;
    private int studentAge;

    //コンストラクタ
    public Student(int studentNumber, String studentName, int studentAge) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    //thisによるコンストラクタの簡単化
    public Student(int studentNumber, int studentAge) {
        this(studentNumber, "拓郎", studentAge);
    }

    //thisによるコンストラクタの簡単化2
    public Student() {
        this(10, "邪", 20);
    }

    //getter
    public int getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    //setter
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String toString() {
        return "生徒情報：学籍番号" + studentNumber + "名前" + studentName + "年齢" + studentAge;
    }

    public String tenYearsLater(String studentName, int studentAge) {
        studentAge = studentAge + 10;
        return studentName + "さんの10年後のの年齢差は" + studentAge + "歳です。";
    }



}
