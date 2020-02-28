public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize = 0;


    public Section(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void addStudents(Student  l){
        students[currentSize] = l;
        currentSize++;
    }

    public String sectionInfo() {
        return this.getName() + " is taught by " + this.getTeacher().getName()+ " and has " + this.getCurrentSize() + " students: " + sectionExtension() ;
    }


    public String sectionExtension() {
        String o = "";
        for (int i = 0; i < this.getCurrentSize(); i++) {
            o += this.students[i].getName();
        }
        return o;
    }
}
