package ObserverPattern.part2;

import java.awt.*;


public class Oval extends AbstractFrame
{
	public Oval()
	{
		getContentPane().setLayout(null);
		setSize(300,200);
		setTitle("Oval");
		count.setCount(0);

		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);

	}


	class SymWindow extends java.awt.event.WindowAdapter
	{
		public void windowClosing(java.awt.event.WindowEvent event)
		{
		Object object = event.getSource();
		if (object == Oval.this)
			OvalFrame_WindowClosing(event);
		}
	}

	void OvalFrame_WindowClosing(java.awt.event.WindowEvent event)
	{
		dispose();		 // dispose of the Frame.
	}



public  void  paint(  Graphics  display  )  
          {
            // clear display first
          Dimension dims = getSize();
          display.clearRect(0,0,dims.width,dims.height);
          
          int x = 50;
          int y = 30;
          
          // Magnify value by 9 to get a bigger visual effect
          int height =  count.getCount()*9;
          int width   = count.getCount()*9;
          
          display.setColor( Color.red );
          
          display.fillOval(x, y, Math.abs(width), Math.abs( height ) );
          }

}