package javaapplication22;
import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class NinjaBleedR{
    public ImageIcon[] imBR = new ImageIcon[1];
    public int x;
    public int y;
    public int count = 0;
    NinjaBleedR(){
        for(int i=0;i<1;i++){
            imBR[i] = new ImageIcon(this.getClass().getResource("bleed2.png"));
	}
    }
    public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,100,100));
	}
}
