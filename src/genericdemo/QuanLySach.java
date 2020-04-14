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
public class QuanLySach implements IQuanLy<Sach> // Thay T bằng lớp cụ thể
{
    ArrayList<Sach> dsSach;

    public QuanLySach(ArrayList<Sach> dsSach)
    {
        this.dsSach = dsSach;
    }
    @Override
    public void add(Sach o)
    {
        dsSach.add(o);
    }

    @Override
    public void inds()
    {
        for(Sach s: dsSach)
        {
            System.out.println(s.toString() +"\n");
            
        }
    }
    
}
