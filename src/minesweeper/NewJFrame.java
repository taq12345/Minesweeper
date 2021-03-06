/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.Border;

/**
 *
 *
 * @author Talha
 */
public class NewJFrame extends javax.swing.JFrame{
    
    Cell[][] cells = new Cell[9][9];
    JButton[][] jButtons = new JButton[9][9];
    ArrayList<Point> vector = new ArrayList<Point>();
    
    int time;
    int flags;
    
    Timer timer;
    
    
    
    final private int buttonSize = 100;
    //JButton [][] jButtons = new JButton[9][9];
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setComponentProperties();
        initGame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 450, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bombsleft.png"))); // NOI18N
        jLabel1.setText("MinesLeft");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 100, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clock.png"))); // NOI18N
        jLabel2.setText("Time");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 100, 100));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 80, 60));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setText("10");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 80, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
                
            }
        });
    }
    
    public void setComponentProperties()
    {
        jPanel2.setBackground(Color.darkGray);
    }
    
    public void newGame()
    {
        initGame();
    }
    
    public void initGame()
    {
        flags = 0;
        spawnTimer();
        spawnButtons();
        spawnCells();
        spawnMines();
        spawnArounds();
    }
    
    public void spawnTimer()
    {
        timer = new Timer(1000, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
           time++;
           jLabel3.setText(Integer.toString(time));
        }
        
    });
        time = 0;
        timer.start();

    }
    public void spawnButtons()
    {
        Border emptyBorder = BorderFactory.createEmptyBorder();
        
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j <9; j++)
            {
                jButtons[i][j] = new JButton();
                jButtons[i][j].setBounds(j*50, i*50,50,50);
                jButtons[i][j].setBorder(emptyBorder);
                jButtons[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
                jButtons[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blank.png")));
                
                

               

                jButtons[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMouseClicked(evt);
            }
        });
            }
        }
    }
    
    public void spawnCells()
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j <9; j++)
            {
             cells[i][j] = new Cell(i*50,j*50);
             
             jPanel1.add(jButtons[i][j]);
            }
        }
    }
    
    public void spawnMines()
    {
        int rand1=0;
        int rand2=0;
        for (int i = 0; i < 10; i++)
        {
            rand1 = (int)(Math.random()*9);
            rand2 = (int)(Math.random()*9);
            cells[rand1][rand2].setMine();
            //System.out.println(rand1 + " " + rand2);

        }
    }
    
    public void spawnArounds()
    {
        int count;
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                count= 0;
                if(i-1 != -1)
                {
                    if (cells[i-1][j].getMine() == true)
                    {
                        count++;
                    }
                    
                }
                if(i+1 != 9)
                {
                    if (cells[i+1][j].getMine() == true)
                    {
                        count++;
                    }
                    
                }
                if(j-1 != -1)
                {
                    if (cells[i][j-1].getMine() == true)
                    {
                        count++;
                    }
                    
                }
                if (j+1 != 9)
                {
                    if (cells[i][j+1].getMine() == true)
                    {
                        count++;
                    }
                }
                if (i-1 != -1 && j-1 != -1)
                {
                    if (cells[i-1][j-1].getMine() == true)
                    {
                        count++;
                    }
                }
                if (i+1 != 9 && j+1 != 9)
                {
                    if (cells[i+1][j+1].getMine() == true)
                    {
                        count++;
                    }
                }
                if (i-1 != -1 && j+1 != 9)
                {
                    if (cells[i-1][j+1].getMine() == true)
                    {
                        count++;
                    }
                }
                if (i+1 != 9 && j-1 != -1)
                {
                    if (cells[i+1][j-1].getMine() == true)
                    {
                        count++;
                    }
                }
                //System.out.println(count);
                cells[i][j].setAround(count);
            }
        }
    }
    
    public void revealAll()
    {
        for (int i = 0; i< 9;i++)
        {
            for (int j = 0; j < 9; j++)
            {
                    cells[i][j].reveal();
                    jButtons[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource(cells[i][j].show())));
                    //jButtons[i][j].setText(cells[i][j].show());
            }
        }
        
    }
    public void floodFill(int i, int j)
    {
        for (int k = 0; k < vector.size(); k++)
        {
            if (vector.get(k).x == i && vector.get(k).y == j)
            {
                return;
            }
        }
        if (i == 9 || j == 9 || i == -1 || j == -1)
        {
            return;
        }
        if(cells[i][j].isEmpty() == false)
        {
            cells[i][j].reveal();
            return;
        }
        else
        {
            vector.add(new Point(i,j));
            cells[i][j].reveal();
            jButtons[i][j].setIcon(new ImageIcon(getClass().getResource("/images/0.png")));
            //jButtons[i][j].setText("0");
            floodFill(i,j+1);
            floodFill(i+1,j);
            floodFill(i,j-1);
            floodFill(i-1,j);
            floodFill(i+1,j+1);
            floodFill(i+1,j-1);
            floodFill(i-1,j+1);
            floodFill(i-1,j-1);

        }
        
       
        
        
    }

    
    public void jButtonMouseClicked(java.awt.event.MouseEvent evt) {      
        
        //playSound();
        int iC = evt.getComponent().getY()/50;
        int jC = evt.getComponent().getX()/50;
        System.out.println(iC + " " + jC);
        if(SwingUtilities.isRightMouseButton(evt))
        {
            //cells[iC][jC].reveal();
            int f = cells[iC][jC].toggleFlag();
            if (f == 1)
            {
                flags--;
            }
            else if (f == 0)
            {
                flags++;
            }
            jLabel4.setText(Integer.toString(10-flags));
            //cells[ic][jC].setAround(jC);
        }
        if(SwingUtilities.isLeftMouseButton(evt))
        { 
            if (cells[iC][jC].isEmpty() == true)
            {
                cells[iC][jC].reveal();
                floodFill(iC,jC);
            }
            else if (cells[iC][jC].getMine() == true)
            {
                //jButtons[iC][jC].setIcon(new ImageIcon("/images.reserve/mine.png"));
                //return;
                revealAll();
            }
            else
            {
                cells[iC][jC].reveal();
            }
        }
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                String show = cells[i][j].show();
                
                //jButtons[i][j].setText(cells[i][j].show());
               
                if (show != "")
                {
                    jButtons[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource(cells[i][j].show())));
                    //jButtons[i][j].setText(show);
                }
                else
                {
                     //jButtons[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blank.png")));
                   
                }

            }
        }
        
    }     
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}
