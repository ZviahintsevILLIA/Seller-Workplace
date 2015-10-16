package kassa;

import java.awt.Image;
import javax.swing.ImageIcon;

/* @author ILLIA*/
public final class Images {
    public static Image mainIcon(){
        return new ImageIcon(Images.class.getResource("Images/MainIcon.png")).getImage();
    }
}
