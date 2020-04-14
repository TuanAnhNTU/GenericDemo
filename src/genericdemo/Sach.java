/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericdemo;

/**
 *
 * @author asus
 */
public class Sach
{
    String tenSach;
    String tacGia;
    int gia;

    public Sach()
    {
    }

    public Sach(String tenSach, String tacGia, int gia)
    {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
    }

    public String getTenSach()
    {
        return tenSach;
    }

    public void setTenSach(String tenSach)
    {
        this.tenSach = tenSach;
    }

    public String getTacGia()
    {
        return tacGia;
    }

    public void setTacGia(String tacGia)
    {
        this.tacGia = tacGia;
    }

    public int getGia()
    {
        return gia;
    }

    public void setGia(int gia)
    {
        this.gia = gia;
    }

    @Override
    public String toString()
    {
        return "Tên sách: " + tenSach + "\n"+
                "Tác giả: " + tacGia + "\n"+
                "Giá: " + gia;
    }
    
}
