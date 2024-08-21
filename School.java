public class School {
    public static void main(String[] args) {
        Teacher ravi = new Teacher("Maths");
        Teacher krishna = new Teacher("Hindi");

        Student[] students = getStudents();

        ravi.students(students);
        Student[] tempStd = new Student[] {students[0], students[1], students[2], students[3]};
        krishna.students(tempStd);

        ravi.startTeaching(new Teacher.AfterTeaching() {
            @Override
            public void whatNext() {
                krishna.startTeaching(null);
            }
        });
    }

    public static Student[] getStudents() {
        Student ram = new Student();
        ram.setName("Ram Yadav");
        ram.setRollNo(20);

        Student roop = new Student();
        roop.setName("Roop Kumar");
        roop.setRollNo(21);

        Student rajat = new Student();
        rajat.setName("Rajat Mandal");
        rajat.setRollNo(22);

        Student kaushal = new Student();
        kaushal.setName("Kaushal Viswas");
        kaushal.setRollNo(23);

        Student sachi = new Student();
        sachi.setName("Sachi Priya");
        sachi.setRollNo(24);

        Student simran = new Student();
        simran.setName("Simran Nandi");
        simran.setRollNo(25);
        return new Student[] {ram, roop, rajat, kaushal, sachi, simran};

    }
}
