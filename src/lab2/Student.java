public class Student {
    private int id;
    private String surname;
    private String name;
    private String fathersname;
    private String birthday;
    private String address;
    private String number;
    private String faculty;
    private int course;
    private String group;
    Student(){
        id=0; surname="";name=""; fathersname="";
        birthday=""; address=""; number="";
        faculty=""; course=0; group="";
    }
    Student(int id, String surname, String name,
            String fathersname, String birthday, String address,
            String number, String faculty,int course, String group )
    {
        this.id=id; this.surname=surname;this.name=name; this.fathersname=fathersname;
        this.birthday=birthday; this.address=address; this.number=number;
        this.faculty=faculty; this.course=course; this.group=group;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersname() {
        return fathersname;
    }

    public void setFathersname(String fathersname) {
        this.fathersname = fathersname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fathersname='" + fathersname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
