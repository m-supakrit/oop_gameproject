package javaapplication22;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class NinjaBleed{
    public ImageIcon[] imB = new ImageIcon[1];
    public int x;
    public int y;
    public int count = 0;
    NinjaBleed(){
        for(int i=0;i<1;i++){
            imB[i] = new ImageIcon(this.getClass().getResource("bleed1.png"));
	}
    }
    public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,100,100));
	}
}
