package javaapplication22;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class NinjaSpeedR{
    public ImageIcon[] imSR = new ImageIcon[10];
    public int x;
    public int y;
    public int count = 0;
    NinjaSpeedR(){    
            for(int i=0;i<imSR.length;i++){
            imSR[i] = new ImageIcon(this.getClass().getResource((i+21)+".png"));
	}
	}
    
    public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,100,100));
	}
}
