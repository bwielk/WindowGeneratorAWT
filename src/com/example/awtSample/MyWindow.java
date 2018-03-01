package com.example.awtSample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame{

	public MyWindow(String title){
		super(title);
		setSize(500, 140);
		addWindowListener(new WindowAdapter(){
			public void windowClosed(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
		Font sansSerifSmall = new Font("SansSerif", Font.ITALIC, 12);
		g.setFont(sansSerifLarge);
		g.drawString("It's very snowy today", 60, 60);
		g.setFont(sansSerifSmall);
		g.drawString("Thursday 1st of March 2018", 60, 100);
	}
}