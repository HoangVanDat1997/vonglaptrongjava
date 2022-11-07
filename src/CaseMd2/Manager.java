package CaseMd2;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Canbogiaovien> ListCanbo = new ArrayList<>();
    public Manager(){}

    public Manager(List<Canbogiaovien> listCanbo) {

        ListCanbo = listCanbo;
    }
    public void addCanbogiaovien(Canbogiaovien canbo){

        ListCanbo.add(canbo);
    }
    public void ShowAll(){
        for (Canbogiaovien canbogiaovien:
                ListCanbo) {
            System.out.println(canbogiaovien);
        }
    }
    public void LuongNhohon8tr(){
        for (Canbogiaovien canbogiaovien : ListCanbo) {
            if (canbogiaovien.Luongthuclinh() >= 8000000) {
                System.out.println(canbogiaovien);
            }
        }
    }
}
