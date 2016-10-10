import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class SineWave
{
	public static void main ( String[] args )
	{
		SineFrame frame = new SineFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

/**
   A frame with a message panel
  */
class SineFrame extends JFrame
{
	public SineFrame()
	{
		setTitle("SineTest");
		setSize(WIDTH,HEIGHT);
	
		// add panel to frame
		SinePanel panel = new SinePanel();
		Container contentPane = getContentPane();
		contentPane.add(panel);
	}

	public static final int WIDTH = 640;
	public static final int HEIGHT = 480;
}

/**
   A panel that shows a sine wave
*/
class SinePanel extends JPanel
{

	public SinePanel()
	{
		w = 6;
		old_x = 5;
		old_y = 240;
		analog = false;
	}

	public void paintComponent( Graphics g )
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;

		g2.draw(new Line2D.Double(0,240,640,240));
		
		for ( x=5;x<635;x++)
		{
			y = 240 + 60*Math.sin((x-30)/45);
			if ( ( analog || x%6==0 ) )
			{
				if ( analog )
				{
					if ( old_x <= x )
						g2.draw(new Line2D.Double(old_x,old_y,x,y));
					old_x = x; old_y = y;
				}
				else
				{
					if ( y < 240 )
					{
						ul_y = y;
						h = 240 - y;
					}
					else
					{
						ul_y = 240;
						h = y - 240;
					}
					g2.draw(new Rectangle2D.Double(x-2,ul_y,w,h));
				}
			}
		}

	}

	double x, y, old_x, old_y;
	double ul_y;
	double w, h;
	boolean analog;
}


