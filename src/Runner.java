public class Runner{
    public static void main (String[] args){
     School Berkeleyhigh = new School("Berkeley high");

     Section mathSection = new Section("Math") ;
     Section biologySection = new Section("Biology");
     Section computerscienceSection = new Section ("Computer Science");

     Teacher Albinson = new Teacher ("Albinson", "Computer Science");
     Teacher Teacher2 = new Teacher("Teacher2", "Biology");
     Teacher Teacher3 = new Teacher ("Teacher3", "Math");

     Student Me = new Student("Me", 11);
     Student Friend1 = new Student("Friend 1", 12);
        Student Friend2 = new Student("Friend 2", 10);
        Student Friend3 = new Student("Friend 3", 11);
        Student Friend4 = new Student("Friend 4", 9);
        Student Friend5 = new Student("Friend 5", 12);

        Berkeleyhigh.addSection(mathSection);
        Berkeleyhigh.addSection(biologySection);
        Berkeleyhigh.addSection(computerscienceSection);

        mathSection.setTeacher(Teacher3);
        computerscienceSection.setTeacher(Albinson);
        biologySection.setTeacher(Teacher2);

        Albinson.addTeacher(computerscienceSection);
        Teacher2.addTeacher(biologySection);
        Teacher3.addTeacher(mathSection);

        computerscienceSection.addStudents(Me) ;
        biologySection.addStudents(Friend1);
        computerscienceSection.addStudents(Friend5);
        biologySection.addStudents(Friend4);
        mathSection.addStudents(Friend2);
        mathSection.addStudents(Friend3) ;

        Me.addStudent(computerscienceSection);
        Friend1.addStudent(biologySection);
        Friend2.addStudent(mathSection);
        Friend5.addStudent(computerscienceSection);
        Friend4.addStudent(biologySection);
        Friend3.addStudent(mathSection);


        System.out.println(Berkeleyhigh.schoolInfo());
        System.out.println(computerscienceSection.sectionInfo());
        System.out.println(mathSection.sectionInfo());
        System.out.println(biologySection.sectionInfo());
        System.out.println(Albinson.teacherInfo());
        System.out.println(Teacher2.teacherInfo());
        System.out.println(Teacher3.teacherInfo());
        System.out.println(Me.studentInfo());
        System.out.println(Friend1.studentInfo());
        System.out.println(Friend2.studentInfo());
        System.out.println(Friend3.studentInfo());
        System.out.println(Friend4.studentInfo());
        System.out.println(Friend5.studentInfo());

    }

}
