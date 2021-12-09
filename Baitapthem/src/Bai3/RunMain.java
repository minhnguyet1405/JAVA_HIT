package Bai3;

import java.util.ArrayList;
import java.util.List;

public class RunMain {

       static List<NhanSu> nhansu= new ArrayList<>();
    public static void main(String[] args) {
        nhansu.add(new CanBo(1,"minhg","nguyet",2002,"nu",new Phong("a","ngueyt"),"cong nhan",2.5,"A"));
        nhansu.add(new CanBo(1,"minhg","nguyet",2002,"nu",new Phong("a","ngueyt"),"cong nhan",2.5,"A"));
        nhansu.add(new CanBo(1,"minhg","nguyet",2002,"nu",new Phong("a","ngueyt"),"cong nhan",2.5,"A"));
        nhansu.add(new CanBo(1,"minhg","nguyet",2002,"nu",new Phong("a","ngueyt"),"cong nhan",2.5,"A"));
       for(int i=0;i<nhansu.size();i++){
           System.out.println(nhansu.get(i));
       }
    }
}
