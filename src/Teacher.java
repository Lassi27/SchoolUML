public class Teacher extends Person {
    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public String teacherInfo(){
        return this.getName() + " teaches the following sections: "  + this.sectionExtension() + " students";

    }

    public void addTeacher(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }


    public String sectionExtension(){
        String o = "";
        for( int i= 0; i < this.getSectionCount() ; i++){
            o += this.sections[i].getName() +  " with " + this.sections[i].getCurrentSize();
        }
        return o;
    }

}
