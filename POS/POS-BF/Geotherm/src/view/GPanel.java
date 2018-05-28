package view;

import java.awt.*;

import javax.swing.*;

import control.*;
public class GPanel extends JPanel{
	
	//Panel
	JPanel north;
	JPanel south;
	JPanel west;
	JPanel east;
	JPanel center;
	
	
	
	//Menu
	JMenuBar menuBar;
	JMenu menu, submenu;
	JMenuItem menuItem;
	JRadioButtonMenuItem rbMenuItem;
	JCheckBoxMenuItem cbMenuItem;
	
	//Buttons
	JButton random;
	public JButton setsize;
	
	//Label
	public JLabel idk = new JLabel();
	
	//Textarea
	public JTextArea jtf;
	
	/*
	 * 
	 */
	public GPanel() {
		
		//Buttons
		random = new JButton("Random");
		setsize = new JButton("Knoten");
		random.addActionListener(new GControl(this));
		setsize.addActionListener(new GControl(this));
		
		//TextArea
		jtf = new JTextArea();
		jtf.setSize(450,200);
		
		//Label
	
		
		//Menu
		menuBar = new JMenuBar();
		menu = new JMenu("A Menu");
		menuBar.add(menu);
		
		//Panels
		north = new JPanel();
		south = new JPanel();
		west = new JPanel();
		east = new JPanel();
		center = new JPanel();
		
		//Layouts
		north.setLayout(new FlowLayout());
		south.setLayout(new FlowLayout());
		west.setLayout(new FlowLayout());
		east.setLayout(new GridLayout());
		center.setLayout(new FlowLayout());
		
		this.setLayout(new BorderLayout());
		
		//hinzufuegen der Element
		north.add(random, FlowLayout.LEFT);
		center.add(jtf);
		this.add(north, BorderLayout.NORTH);
		this.add(south, BorderLayout.SOUTH);
		this.add(west, BorderLayout.WEST);
		this.add(east, BorderLayout.EAST);
		this.add(center, BorderLayout.CENTER);
		
	}

	public JButton getRandom() {
		return random;
	}

	public void setRandom(JButton random) {
		this.random = random;
	}

	public JTextArea getJtf() {
		return jtf;
	}

	public void setJtf(JTextArea jtf) {
		this.jtf = jtf;
	}

	
}
