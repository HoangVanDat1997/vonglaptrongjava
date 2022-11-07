package CaseMd2;

import java.time.LocalDate;

public class CanBo {
    private String Name;
    private LocalDate Ngaysinh;
    private String quequan;

    public CanBo(String name, LocalDate ngaysinh, String quequan) {
        Name = name;
        Ngaysinh = ngaysinh;
        this.quequan = quequan;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(LocalDate ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "Name='" + Name + '\'' +
                ", Ngaysinh=" + Ngaysinh +
                ", quequan='" + quequan + '\'' +
                '}';
    }

}
