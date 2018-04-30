package view;


import javax.swing.JFrame;

public class GFrame extends JFrame{

	public GFrame(String title, GPanel p) {
		setTitle(title);
		setVisible(true);
		setSize(1920,1080);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(p);
		
	}
}
