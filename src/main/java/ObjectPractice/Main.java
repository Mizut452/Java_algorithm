package ObjectPractice;

public class Main {
    public static void main(String[] args) {
        Fish Suzuki = new Fish("Suzuki", "Blue");
        System.out.println(Suzuki.getFishColor());
        System.out.println(Suzuki.getFishName());

        Student suzuki = new Student(1, "鈴木", 18);
        Student yoshida = new Student(100, "吉田", 13);
        System.out.println(suzuki);
        System.out.println(yoshida.tenYearsLater(yoshida.getStudentName(), yoshida.getStudentAge()));
    }
}
