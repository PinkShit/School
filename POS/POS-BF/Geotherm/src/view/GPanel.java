package view;

import java.awt.*;

import javax.swing.*;

public class GPanel extends JPanel {
	
	public GPanel() {
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g) {
	   super.paintComponent(g);
	   this.setBackground(Color.WHITE);
	   
	   g.setColor(Color.BLUE);
	   g.fillOval(245, 245, 20, 20);
	   
	   g.setColor(Color.GRAY);
	   g.fillRect(23, 23, 100, 20);
	   
	   UndirectedGraph<String, DefaultEdge> g2 =
		        new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);

		    String v1 = "v1";
		    String v2 = "v2";
		    String v3 = "v3";
		    String v4 = "v4";

		    // add the vertices
		    g.addVertex(v1);
		    g.addVertex(v2);
		    g.addVertex(v3);
		    g.addVertex(v4);

		    // add edges to create a circuit
		    g.addEdge(v1, v2);
		    g.addEdge(v2, v3);
		    g.addEdge(v3, v4);
		    g.addEdge(v4, v1);
	}
}
