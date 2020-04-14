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
public class GenericDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        HieuSach tanTien = new HieuSach();
        tanTien.themSach(new Sach("Design Pattern", "Tuấn Anh", 35000));
        tanTien.themSach(new Sach("Lập trình TBDĐ", "Tuấn Anh", 45000));
        tanTien.themSach(new Sach("Lập trình C", "Nguyễn Văn An", 45000));
        tanTien.lietKeSach();
    }
    
}
