package ThiThucHanhMoDul2;

public class CollegeStudent {
    public int studentCode;
    private String fullName;
    private int age;
    private String sex;
    private String address;
    private double mediumScore;

    public CollegeStudent(Integer studentCode, String fullName, int age, String sex, String address, double mediumScore) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.mediumScore = mediumScore;
    }
    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", mediumScore=" + mediumScore +
                '}';
    }
}
