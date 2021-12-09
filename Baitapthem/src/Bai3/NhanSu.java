package Bai3;

public abstract class NhanSu {
    protected int maNs;
    protected String hoDem;
    protected String ten;
    protected int namSinh;

    public NhanSu(int maNs, String hoDem, String ten, int namSinh, String gioiTinh) {
        this.maNs = maNs;
        this.hoDem = hoDem;
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    protected String gioiTinh;

    public abstract void input();
    public  abstract void output();
    public abstract void tinhLuong();
}
