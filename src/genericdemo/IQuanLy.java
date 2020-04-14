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
public interface IQuanLy<T> // T là một đối tượng Generic
{
    public void add(T o);
    public void inds();
}
