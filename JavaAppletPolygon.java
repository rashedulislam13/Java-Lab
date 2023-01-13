/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javalabfinal;

import java.applet.Applet;

/**
 *
 * @author DELL
 */
public class JavaAppletPolygon extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
       public class Polygon extends Applet {
int x [] = {10, 30, 40, 50, 110, 140};
int y[] = {140, 110, 50, 40, 30, 10};
@Override
public void paint(Graphics g) {
g.setColor(Color.blue);
g.fillPolygon(x, y, 6);
}
}
    }

    // TODO overwrite start(), stop() and destroy() methods
}
