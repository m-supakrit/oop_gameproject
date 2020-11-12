package javaapplication22;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class NinjaR{
    public ImageIcon[] imR = new ImageIcon[10];
    public int x;
    public int y;
    public int count = 0;
    NinjaR(){
        for(int i=0;i<imR.length;i++){
            imR[i] = new ImageIcon(this.getClass().getResource((i+1)+".png"));     
	}
    }
    public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,100,100));
	}
}
