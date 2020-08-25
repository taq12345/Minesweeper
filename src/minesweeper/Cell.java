/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import javax.swing.JButton;
import javax.swing.SwingUtilities;
/**
 *
 * @author Talha
 */
public class Cell {
    boolean mine;
    boolean revealed;
    boolean flag;
    int around;
    int i;
    int j;
    
    Cell(int i, int j)
    {
        this.i = i;
        this.j = j;
        this.revealed = false;
        this.flag = false;
        this.mine = false;
        
    
    }
    
    public void setMine()
    {
        this.mine = true;
    }
    
    public String show()
    { 
        if(this.revealed == true )
        {
            if (this.mine == true)
            {
                return "/images/bomb.png";
                //return "M";
            }
            if (this.around > 0)
            {
                return "/images/" + Integer.toString(around) + ".jpg";
                //return Integer.toString(around);
            }
            if (this.around == 0 && this.mine == false && this.flag == false)
            {
                return "/images/0.png";
                //return "0";

            }
        }
        else if (this.flag == true && this.revealed == false)
        {
                return "/images/flag2.png";
                //return "F";
        }
        else if (this.flag == false && this.revealed == false)
        {
            return "/images/blank.png";
        }
        return "";
    }
    
    public int toggleFlag()
    {
        if(flag == false)
        {
            if(this.revealed != true)
            {
                flag = true;
            }
            if (this.revealed == false)
            {
                return 0;
            }
        }
        else
        {
            flag = false;
            return 1;
        }
        return 2;
    }
    
    public void setAround(int val)
    {
        this.around = val;
    }
    public boolean isEmpty()
    {
        if(this.around == 0 && this.mine == false && this.flag == false)
        {
            return true;
        }
        return false;
    }
    public boolean getMine()
    {
        return this.mine;
    }
    public int getI()
    {
        return this.i;
    }
    
    public int getJ()
    {
        return this.j;
    }
    
    public boolean getFlag()
    {
        return this.flag;
    }
    
    public void reveal()
    {
        if (this.flag != true)
        {
            this.revealed = true;
        }
    }
    
    
}
