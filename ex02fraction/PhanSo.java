package ex02fraction;

import java.util.Scanner;

public class PhanSo {
    private int  tuSo;
    private int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tuSo = Integer.parseInt(sc.nextLine());

        do{
            System.out.print("Nhap mau so: ");
            mauSo = Integer.parseInt(sc.nextLine());
            if(mauSo == 0){
                System.out.println("Mau so khong hop le! Mau so phai khac khong ");
            }
        }while (mauSo == 0);
    }

    int uocchunglonnhat(int a, int b){
        if(a == 0 || b == 0){
            return 1;
        }
        a = Math.abs(a);
        for(int i = a; i >= 0; i--){
            if(a % i == 0 && b %i == 0){
                return i;
            }
        }
        return 1;
    }
    void rutgon(){
        int ucln = uocchunglonnhat(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;

        if(mauSo < 0){
            mauSo = -tuSo;
            mauSo = -mauSo;
        }
    }
    void xuat(){
        rutgon();
        if(mauSo == 1){
            System.out.println(tuSo);
        }
        else {
            System.out.printf("%d / %d\n", tuSo, mauSo);
        }
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo cong(PhanSo ps){
        PhanSo tong = new PhanSo();
        tong.tuSo = this.tuSo * ps.mauSo + this.mauSo * ps.tuSo;
        tong.mauSo = this.mauSo * ps.mauSo;
        return tong;
    }
    public PhanSo tru(PhanSo ps){
        PhanSo hieu = new PhanSo();
        hieu.tuSo = this.tuSo * ps.mauSo - this.mauSo * ps.tuSo;
        hieu.mauSo = this.mauSo * ps.mauSo;
        return hieu;
    }

    public PhanSo nhan(PhanSo ps){
        PhanSo tich = new PhanSo();
        tich.tuSo = this.tuSo * ps.tuSo;
        tich.mauSo = this.mauSo * ps.mauSo;
        return tich;
    }

    public PhanSo chia(PhanSo ps){
        PhanSo thuong = new PhanSo();
        thuong.tuSo = this.tuSo * ps.mauSo;
        thuong.mauSo = this.mauSo * ps.tuSo;
        return thuong;
    }
    boolean isSoDuong(){
        if(this.tuSo * this.mauSo > 0 ){
            return true;
        }
        else {
            return false;
        }
    }
    boolean number0() {
        if (this.tuSo == 0) {
            return true;
        } else {
            return false;
        }
    }
}
