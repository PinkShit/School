package view;


import javax.swing.JFrame;

public class GFrame extends JFrame{

	public GFrame(String title, GPanel p) {
		setTitle(title);
		setVisible(true);
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(p);
		
	}
}
