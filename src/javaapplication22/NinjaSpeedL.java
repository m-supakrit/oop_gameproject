package javaapplication22;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class NinjaSpeedL{
    public ImageIcon[] imSL = new ImageIcon[10];
    public int x;
    public int y;
    public int count = 0;
    NinjaSpeedL(){    
            for(int i=0;i<imSL.length;i++){
            imSL[i] = new ImageIcon(this.getClass().getResource((i+31)+".png"));
	}
	}
    
    public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,100,100));
	}
}
