package javalap1.tem;

import java.applet.*;
import java.awt.*;
public class myappl extends Applet
{
    String s = "";
    public void init()
    {
        setBackground(Color.green);
        setForeground(Color.red);
        s = s+"INIT";
    }
    public void start()
    {
        s = s+"START";
    }
    public void stop()
    {
        s = s+"STOP";
    }
public void destroy()
{
    s = s+"DESTROY";
}
    public void paint( graphics g) 
    {
        Font f = new Font("arial",Font.BOLD,40);
        g.setFont(f);
        g.drawString(s,100,100);
    } 
} 