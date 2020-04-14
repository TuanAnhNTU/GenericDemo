/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericdemo;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class HieuSach
{
    IQuanLy<Sach> qlSach;
    ArrayList<Sach> dsSach = new ArrayList<>();

    public HieuSach()
    {
        qlSach = new QuanLySach(dsSach);
    }

    public IQuanLy<Sach> getQlSach()
    {
        return qlSach;
    }

    public void setQlSach(IQuanLy<Sach> qlSach)
    {
        this.qlSach = qlSach;
    }

    public ArrayList<Sach> getDsSach()
    {
        return dsSach;
    }

    public void setDsSach(ArrayList<Sach> dsSach)
    {
        this.dsSach = dsSach;
    }
    
    
    public void themSach(Sach s)
    {
        qlSach.add(s);
    }
    
    public void lietKeSach()
    {
        qlSach.inds();
    }
}
