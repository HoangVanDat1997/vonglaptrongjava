package CaseMd2;

import java.time.LocalDate;

public class Canbogiaovien extends CanBo {
    private double Luongthuong;
    private double luongphat;
    private double luongcung;

    public Canbogiaovien(String name, LocalDate ngaysinh, String quequan, double luongthuong, double luongphat, double luongcung) {
        super(name, ngaysinh, quequan);
        Luongthuong = luongthuong;
        this.luongphat = luongphat;
        this.luongcung = luongcung;
    }

    public double getLuongthuong() {
        return Luongthuong;
    }

    public void setLuongthuong(double luongthuong) {
        Luongthuong = luongthuong;
    }

    public double getLuongphat() {
        return luongphat;
    }

    public void setLuongphat(double luongphat) {
        this.luongphat = luongphat;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }
    public double Luongthuclinh(){
        return luongcung+ Luongthuong-luongphat;
    }

    @Override
    public String toString() {
        return "Canbogiaovien{" +
                "Luongthuong=" + Luongthuong +
                ", luongphat=" + luongphat +
                ", luongcung=" + luongcung +
                "} " + super.toString();
    }

    public Object getId() {
        return null;
    }
}
