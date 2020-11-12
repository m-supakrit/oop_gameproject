package javaapplication22;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class NinjaL{
    public ImageIcon[] imL = new ImageIcon[10];
    public int x;
    public int y;
    public int count = 0;
    NinjaL(){
        for(int i=0;i<imL.length;i++){
            imL[i] = new ImageIcon(this.getClass().getResource((i+11)+".png"));
	}
    }
    public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,100,100));
	}
}
