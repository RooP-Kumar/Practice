public class Teacher {
    static int salary = 10000;
    public String subject;
    private Student[] students;

    public Teacher(String subject){
        this.subject = subject;
    }

    public void students(Student[] attendedStudents){
        this.students = attendedStudents;
    }

    public void startTeaching(AfterTeaching afterTeach) {
        Thread teach = new Thread(new Runnable() {
            @Override
            public void run() {
                try {System.out.println(subject + " subject class has started.");
                    System.out.println("Attended students are : ");
                    for(Student std : students) {
                        System.out.println("    " + std.getName() + "'s roll no is " + std.getRollNo());
                    }
                    Thread.sleep(5000l);
                    System.out.println(subject + " subject class has been done.");
                    if(afterTeach != null)
                        afterTeach.whatNext();
                } catch (Exception e) {
                    System.out.println("Something went wrong during running this thread. " + e.toString());
                }
            }

        });

        teach.start();
    }

    public interface AfterTeaching {
        public void whatNext();
    }

}
