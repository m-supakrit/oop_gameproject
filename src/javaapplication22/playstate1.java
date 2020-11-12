package javaapplication22;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class playstate1 extends JPanel implements ActionListener {

    private final ImageIcon imgstate1 = new ImageIcon(this.getClass().getResource("BackJP.png"));
    private final ImageIcon imgstate2 = new ImageIcon(this.getClass().getResource("BackJP2.png"));
    private final ImageIcon imgstate3 = new ImageIcon(this.getClass().getResource("BackJP3.png"));

    NinjaR m = new NinjaR();
    NinjaL ml = new NinjaL();
    NinjaBleed mb = new NinjaBleed();
    NinjaBleedR mbr = new NinjaBleedR();
    NinjaSpeedR msr = new NinjaSpeedR();
    NinjaSpeedL msl = new NinjaSpeedL();
    
    homegames hg = new homegames();
    ImageIcon Ninwin = new ImageIcon(this.getClass().getResource("7.png"));
    ImageIcon Ninwin2 = new ImageIcon(this.getClass().getResource("17.png"));
    ImageIcon fieldover = new ImageIcon(this.getClass().getResource("ENDGAME.gif"));
    ImageIcon fieldwinner = new ImageIcon(this.getClass().getResource("TrophyBG.gif"));
    ImageIcon exitover = new ImageIcon(this.getClass().getResource("ButtonExit.png"));
    ImageIcon restart = new ImageIcon(this.getClass().getResource("ButtonStart.png"));
    JButton BStartover = new JButton(restart);
    JButton BExitover = new JButton(exitover);

    private JLabel score = new JLabel();
    public ArrayList<onigiri> oni = new ArrayList<onigiri>();
    public ArrayList<sushi1> su1 = new ArrayList<sushi1>();
    public ArrayList<kunai> ku = new ArrayList<kunai>();
    public ArrayList<fire> f1 = new ArrayList<fire>();
    public ArrayList<shuriken> shuri = new ArrayList<shuriken>();
    public ArrayList<lightning> light = new ArrayList<lightning>();
    public ArrayList<sushi2> su2 = new ArrayList<sushi2>();
    public ArrayList<potion> po = new ArrayList<potion>();
    public ArrayList<item> i1 = new ArrayList<item>();

    public int times;
    public int c = 0;
    public int HP = 3;
    public int rs1 = 1;
    public int rs2 = 2;
    boolean timestart = true;
    boolean startball = false;
    public int count = 11;
    public int l = 0;
    public int r = 0;
    public int num = 0;
//    public int timetop = 50;

//    private gameover gover = new gameover();
    public int scor = 0;
    boolean speed = false;
    public int time_speed = 8;
    boolean bleed = false;
    public int time_bleed = 5;
    boolean top = false;
    Thread time = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }

                if (timestart == false) {
                    repaint();
                }
            }
        }
    });

    Thread tonigiri = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep(3000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (startball == false) {
                    oni.add(new onigiri());
                }
            }
        }
    });
  
    Thread tsushi1 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep(6000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (startball == false) {
                    su1.add(new sushi1());
                }
            }
        }
    });

    Thread tkunai = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep(5000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (startball == false) {
                    ku.add(new kunai());
                }
            }
        }
    });
    Thread tfire = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep(10000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (startball == false) {
                    f1.add(new fire());
                }
            }
        }
    });
    Thread tlight = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep(5500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (startball == false) {
                    light.add(new lightning());
                }
            }
        }
    });

    Thread tshuri = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep(6000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (startball == false) {
                    shuri.add(new shuriken());
                }
            }
        }
    });
    Thread tsushi2 = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep(8000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (startball == false) {
                    su2.add(new sushi2());
                }
            }
        }
    });
    Thread tpotion = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep(10000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (startball == false) {
                    po.add(new potion());
                }
            }
        }
    });
    Thread titem = new Thread(new Runnable() {
        public void run() {
            while (true) {
                try {
                    if (startball == false) {
                        Thread.sleep(8000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (startball == false) {
                    i1.add(new item());
                }
            }
        }
    });
    Thread tbleed = new Thread(new Runnable() {

        public void run() {
            while (true) {
                if (time_bleed < 1) {
                    bleed = false;
                    if (mb.count == 0) {
                        m.count = 0;
                    } else if (mb.count == 1) {
                        ml.count = 0;
                    }
                    time_bleed = 5;
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });
    
    Thread tspeed = new Thread(new Runnable() {

        public void run() {
            while (true) {
                if (time_speed < 1) {
                    speed = false;
                    if (msl.count == 0) {
                        m.count = 0;
                    } else if (msl.count == 1) {
                        ml.count = 0;
                    }
                    time_bleed = 8;
                }
                try {
                    Thread.sleep(8000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    });

    Thread t = new Thread(new Runnable() {
        public void run() {
            while (true) {
                if (timestart == false) {
                    if (c == 1) {
                        times = (int) (times + (Math.random() * 5) + 1);
                        c = 0;
                    } else {
                        times = (times - 1);
                    }
                    if (bleed) {
                        time_bleed--;
                        System.out.println(time_bleed);
                    } else if (speed) {
                        time_speed--;
                        System.out.println(time_speed);
                    }
                    
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });

    playstate1() {
        this.setFocusable(true);
        this.setLayout(null);
        this.add(score);

        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {

                int a = e.getKeyCode();
                if (bleed) {
                    if (a == KeyEvent.VK_A) {
                        mb.count = 0;
                        l++;
                        r = 0;
                    } else if (a == KeyEvent.VK_D) {
                        mbr.count = 0;
                        r++;
                        l = 0;
                    }
                } else if (speed) {
                    if (a == KeyEvent.VK_A) {
                        msl.count++;
                        m.x -= 30;
                        if (msl.count >= 10) {
                            msl.count = 0;
                        }
                        l++;
                        r = 0;
                    } else if (a == KeyEvent.VK_D) {
                        msr.count++;
                        m.x += 30;
                        if (msr.count >= 10) {
                            msr.count = 0;
                        }
                        r++;
                        l = 0;
                    }
                }

                else {
                    if (a == KeyEvent.VK_A) {
                        ml.count++;
                        m.x -= 10;
                        if (ml.count >= 10) {
                            ml.count = 0;
                        }
                        l++;
                        r = 0;
                    } else if (a == KeyEvent.VK_D) {
                        m.count++;
                        m.x += 10;
                        if (m.count >= 10) {
                            m.count = 0;
                        }
                        r++;
                        l = 0;
                    }
                    
                    
                }
            }
        });

        m.x = 400;
        m.y = 500;
        time.start();
        t.start();
        tonigiri.start();
        tsushi1.start();
        tkunai.start();
        tlight.start();
        tfire.start();
        tshuri.start();
        tsushi2.start();
        tpotion.start();
        titem.start();
        tbleed.start();
        tspeed.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (times <= 0 || HP <= 0) {
            this.setLayout(null);
            g.drawImage(fieldover.getImage(), 0, 0, 1000, 800, this);
            ImageIcon im = new ImageIcon(this.getClass().getResource("dead.png"));
            g.drawImage(im.getImage(), 350, 450, 287, 202, this);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 80));
            g.drawString("GAME OVER", 260, 220);
            g.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 70));
            g.drawString("SCORE   " + scor, 280, 360);
            t.stop();
            tonigiri.stop();
            tsushi1.stop();
            tkunai.stop();
            tlight.stop();
            tfire.stop();
            tshuri.stop();
            tsushi2.stop();
            tpotion.stop();
            titem.stop();
            tbleed.stop();
            tspeed.stop();
            

        } else if (scor >= 300) {
            this.setLayout(null);
            g.drawImage(fieldwinner.getImage(), 0, 0, 1000, 800, this);
            g.drawImage(Ninwin.getImage(), 200, 400, 233, 281, this);
            g.drawImage(Ninwin2.getImage(), 575, 400, 233, 281, this);
            g.setColor(Color.BLACK);
            g.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 70));
            g.drawString("WINNER", 360, 100);
            g.drawString("SCORE    " + scor, 300, 200);
            t.stop();
            tonigiri.stop();
            tsushi1.stop();
            tkunai.stop();
            tlight.stop();
            tfire.stop();
            tshuri.stop();
            tsushi2.stop();
            tpotion.stop();
            titem.stop();
            tbleed.stop();
            tspeed.stop();
            
        } else if (scor >= 200 ) {

            g.drawImage(imgstate3.getImage(), 0, 0, 1000, 800, this);
            if (bleed) {
                if (l == 0) {
                    g.drawImage(mbr.imBR[mbr.count].getImage(), m.x, 550, 110, 160, this);
                } else if (r == 0) {
                    g.drawImage(mb.imB[mb.count].getImage(), m.x, 550, 110, 160, this);
                }
            } else if (speed) {
                if (l == 0) {
                    g.drawImage(msr.imSR[msr.count].getImage(), m.x, 550, 110, 160, this);
                } else if (r == 0) {
                    g.drawImage(msl.imSL[msl.count].getImage(), m.x, 550, 110, 160, this);
                }
            } else {
                if (l == 0) {
                    g.drawImage(m.imR[m.count].getImage(), m.x, 550, 110, 160, this);
                } else if (r == 0) {
                    g.drawImage(ml.imL[ml.count].getImage(), m.x, 550, 110, 160, this);
                }
            }

            if (m.x < 0) {
                m.x = this.getWidth() - 10;
            }
            if (m.x > this.getWidth()) {
                m.x = 20;
            }

            //===========onigiri================
            for (int i = 0; i < oni.size(); i++) {
                g.drawImage(oni.get(i).getImage(), oni.get(i).getX(), oni.get(i).getY(), 100, 100, this);
            }
            for (int j = 0; j < oni.size(); j++) {
                if (Intersect(m.getbound(), oni.get(j).getbound())) {
                    oni.remove(j);
                    scor += 20;
                    g.drawString("+20", m.x + 100, m.y + 100);
                }
            }
            //========================sushi1=========================
            for (int i = 0; i < su1.size(); i++) {
                g.drawImage(su1.get(i).getImage(), su1.get(i).getX(), su1.get(i).getY(), 100, 100, this);
            }

            for (int j = 0; j < su1.size(); j++) {
                if (Intersect(m.getbound(), su1.get(j).getbound())) {
                    su1.remove(j);
                    scor += 40;
                    g.drawString("+40", m.x + 100, m.y + 100);
                }
            }

            //=================================kunai=============
            for (int i = 0; i < ku.size(); i++) {
                g.drawImage(ku.get(i).getImage(), ku.get(i).getX(), ku.get(i).getY(), 70, 150, this);
            }
            for (int j = 0; j < ku.size(); j++) {
                if (Intersect(m.getbound(), ku.get(j).getbound())) {
                    ku.remove(j);
                    scor -= 20;
                    HP -= 1;
                    g.drawString("-1HP", m.x + 100, m.y + 100);
                    g.drawString("-20", m.x + 100, m.y + 120);
                }
            }
            //=================================shuriken=============    
            for (int i = 0; i < shuri.size(); i++) {
                g.drawImage(shuri.get(i).getImage(), shuri.get(i).getX(), shuri.get(i).getY(), 100, 80, this);
            }
            for (int j = 0; j < shuri.size(); j++) {
                if (Intersect(m.getbound(), shuri.get(j).getbound())) {
                    shuri.remove(j);
                    times -=10;
                    HP -= 3;
                    if (l == 0) {
                        mbr.count = 0;
                    } else if (r == 0) {
                        mb.count = 0;
                    }
                    bleed = true;
                    g.drawString("-3HP", m.x + 100, m.y + 100);
                }
            }
            //=================================fire=============    
            for (int i = 0; i < f1.size(); i++) {
                g.drawImage(f1.get(i).getImage(), f1.get(i).getX(), f1.get(i).getY(), 100, 150, this);
            }
            for (int j = 0; j < f1.size(); j++) {
                if (Intersect(m.getbound(), f1.get(j).getbound())) {
                    f1.remove(j);
                    HP = 0;

                }
            }
            //=================================lightning=============
            for (int i = 0; i < light.size(); i++) {
                g.drawImage(light.get(i).getImage(), light.get(i).getX(), light.get(i).getY(), 100, 150, this);
            }
            for (int j = 0; j < light.size(); j++) {
                if (Intersect(m.getbound(), light.get(j).getbound())) {
                    light.remove(j);
                    if (l == 0) {
                        msr.count = 0;
                    } else if (r == 0) {
                        msl.count = 0;
                    }
                    speed = true;

                }
            }
            //========================================sushi2================= 
            for (int i = 0; i < su2.size(); i++) {
                g.drawImage(su2.get(i).getImage(), su2.get(i).getX(), su2.get(i).getY(), 100, 100, this);
            }
            for (int j = 0; j < su2.size(); j++) {
                if (Intersect(m.getbound(), su2.get(j).getbound())) {
                    su2.remove(j);
                    scor += 60;
                    g.drawString("+60", m.x + 100, m.y + 100);
                }
            }
            //========================================potion================= 
            for (int i = 0; i < po.size(); i++) {
                g.drawImage(po.get(i).getImage(), po.get(i).getX(), po.get(i).getY(), 100, 100, this);
            }
            for (int j = 0; j < po.size(); j++) {
                if (Intersect(m.getbound(), po.get(j).getbound())) {
                    po.remove(j);
                    HP += 2;
                    g.drawString("+2HP", m.x + 100, m.y + 100);
                }
            }
            //========================================item================= 
            for (int i = 0; i < i1.size(); i++) {
                g.drawImage(i1.get(i).getImage(), i1.get(i).getX(), i1.get(i).getY(), 100, 100, this);
            }
            for (int j = 0; j < i1.size(); j++) {
                if (Intersect(m.getbound(), i1.get(j).getbound())) {
                    i1.remove(j);
                    c = 1;
                }
            }

            g.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30));
            g.setColor(Color.WHITE);
            g.drawString("SCORE =  " + scor, 740, 100);
            g.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
            g.setColor(Color.BLACK);
            g.drawString("STATE 3" , 400, 80);
            g.drawString("Time " + times, 385, 150);
            g.setColor(Color.WHITE);
            g.drawString("HP " + HP, 780, 200);

        } else if (scor >= 100) {

            g.drawImage(imgstate2.getImage(), 0, 0, 1000, 800, this);
            if (bleed) {
                if (l == 0) {
                    g.drawImage(mbr.imBR[mbr.count].getImage(), m.x, 550, 110, 160, this);
                } else if (r == 0) {
                    g.drawImage(mb.imB[mb.count].getImage(), m.x, 550, 110, 160, this);
                }
            } else if (speed) {
                if (l == 0) {
                    g.drawImage(msr.imSR[msr.count].getImage(), m.x, 550, 110, 160, this);
                } else if (r == 0) {
                    g.drawImage(msl.imSL[msl.count].getImage(), m.x, 550, 110, 160, this);
                }
            } else {
                if (l == 0) {
                    g.drawImage(m.imR[m.count].getImage(), m.x, 550, 110, 160, this);
                } else if (r == 0) {
                    g.drawImage(ml.imL[ml.count].getImage(), m.x, 550, 110, 160, this);
                }
            }
            if (m.x < 0) {
                m.x = this.getWidth() - 10;
            }
            if (m.x > this.getWidth()) {
                m.x = 20;
            }

            //===========onigiri================
            for (int i = 0; i < oni.size(); i++) {
                g.drawImage(oni.get(i).getImage(), oni.get(i).getX(), oni.get(i).getY(), 100, 100, this);
            }
            for (int j = 0; j < oni.size(); j++) {
                if (Intersect(m.getbound(), oni.get(j).getbound())) {
                    oni.remove(j);
                    scor += 20;
                    g.drawString("+20", m.x + 100, m.y + 100);
                }
            }
            //========================sushi1=========================
            for (int i = 0; i < su1.size(); i++) {
                g.drawImage(su1.get(i).getImage(), su1.get(i).getX(), su1.get(i).getY(), 100, 100, this);
            }

            for (int j = 0; j < su1.size(); j++) {
                if (Intersect(m.getbound(), su1.get(j).getbound())) {
                    su1.remove(j);
                    scor += 40;
                    g.drawString("+40", m.x + 100, m.y + 100);
                }
            }

            //=================================kunai=============
            for (int i = 0; i < ku.size(); i++) {
                g.drawImage(ku.get(i).getImage(), ku.get(i).getX(), ku.get(i).getY(), 70, 150, this);
            }
            for (int j = 0; j < ku.size(); j++) {
                if (Intersect(m.getbound(), ku.get(j).getbound())) {
                    ku.remove(j);
                    scor -= 20;
                    HP -= 1;
                    g.drawString("-1HP", m.x + 100, m.y + 100);
                    g.drawString("-20", m.x + 100, m.y + 120);
                }
            }
            //=================================lightning=============
            for (int i = 0; i < light.size(); i++) {
                g.drawImage(light.get(i).getImage(), light.get(i).getX(), light.get(i).getY(), 100, 150, this);
            }
            for (int j = 0; j < light.size(); j++) {
                if (Intersect(m.getbound(), light.get(j).getbound())) {
                    light.remove(j);
                    if (l == 0) {
                        msr.count = 0;
                    } else if (r == 0) {
                        msl.count = 0;
                    }
                    speed = true;

                }
            }
            //=================================shuriken=============    
            for (int i = 0; i < shuri.size(); i++) {
                g.drawImage(shuri.get(i).getImage(), shuri.get(i).getX(), shuri.get(i).getY(), 100, 80, this);
            }
            for (int j = 0; j < shuri.size(); j++) {
                if (Intersect(m.getbound(), shuri.get(j).getbound())) {
                    shuri.remove(j);
                    times -=10;
                    HP -= 3;
                    if (l == 0) {
                        mbr.count = 0;
                    } else if (r == 0) {
                        mb.count = 0;
                    }
                    bleed = true;
                    g.drawString("-3HP", m.x + 100, m.y + 100);
                }
            }

            //========================================item================= 
            for (int i = 0; i < i1.size(); i++) {
                g.drawImage(i1.get(i).getImage(), i1.get(i).getX(), i1.get(i).getY(), 100, 100, this);
            }
            for (int j = 0; j < i1.size(); j++) {
                if (Intersect(m.getbound(), i1.get(j).getbound())) {
                    i1.remove(j);
                    c = 1;
                }
            }

            g.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30));
            g.setColor(Color.BLACK);
            g.drawString("SCORE =  " + scor, 740, 100);
            g.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
            g.drawString("STATE 2" , 400, 80);
            g.drawString("Time " + times, 385, 150);
            g.setColor(Color.RED);
            g.drawString("HP " + HP, 780, 200);

        }
        
        else {
            g.drawImage(imgstate1.getImage(), 0, 0, 1000, 800, this);

            if (speed) {
                if (l == 0) {
                    g.drawImage(msr.imSR[msr.count].getImage(), m.x, 550, 110, 160, this);
                } else if (r == 0) {
                    g.drawImage(msl.imSL[msl.count].getImage(), m.x, 550, 110, 160, this);
                }
            } else {
                if (l == 0) {
                    g.drawImage(m.imR[m.count].getImage(), m.x, 550, 110, 160, this);
                } else if (r == 0) {
                    g.drawImage(ml.imL[ml.count].getImage(), m.x, 550, 110, 160, this);
                }
            }

            if (m.x < 0) {
                m.x = this.getWidth() - 10;
            }
            if (m.x > this.getWidth()) {
                m.x = 20;
            }
            
            //========================================onigiri================= 
            for (int i = 0; i < oni.size(); i++) {
                g.drawImage(oni.get(i).getImage(), oni.get(i).getX(), oni.get(i).getY(), 100, 100, this);
            }
            for (int j = 0; j < oni.size(); j++) {
                if (Intersect(m.getbound(), oni.get(j).getbound())) {
                    oni.remove(j);
                    scor += 20;
                    g.drawString("+20", m.x + 100, m.y + 100);
                }
            }
            

            //=================================lightning=============
            for (int i = 0; i < light.size(); i++) {
                g.drawImage(light.get(i).getImage(), light.get(i).getX(), light.get(i).getY(), 100, 150, this);
            }
            for (int j = 0; j < light.size(); j++) {
                if (Intersect(m.getbound(), light.get(j).getbound())) {
                    light.remove(j);
                    speed = true;
                    if (l == 0) {
                        msr.count = 0;
                    } else if (r == 0) {
                        msl.count = 0;
                    }

                }
            }

            //=================================kunai=============
            for (int i = 0; i < ku.size(); i++) {
                g.drawImage(ku.get(i).getImage(), ku.get(i).getX(), ku.get(i).getY(), 70, 150, this);
            }
            for (int j = 0; j < ku.size(); j++) {
                if (Intersect(m.getbound(), ku.get(j).getbound())) {
                    ku.remove(j);
                    scor -= 20;
                    HP -= 1;

                    g.drawString("-1HP", m.x + 100, m.y + 100);
                    g.drawString("-20", m.x + 100, m.y + 120);
                }
            }

            g.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30));
            g.setColor(Color.WHITE);
            g.drawString("SCORE =  " + scor, 740, 100);
            g.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
            g.drawString("STATE 1" , 400, 80);
            g.drawString("Time " + times, 385, 150);
            g.setColor(Color.WHITE);
            g.drawString("HP " + HP, 780, 200);

        }

    }

    public boolean Intersect(Rectangle2D a, Rectangle2D b) {
        return (a.intersects(b));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BStartover) {
            this.setSize(1000, 800);
            this.add(hg);
            this.setLocation(null);
            timestart = true;
            startball = true;
        } else if (e.getSource() == BExitover) {
            System.exit(0);
        }
    }
}
