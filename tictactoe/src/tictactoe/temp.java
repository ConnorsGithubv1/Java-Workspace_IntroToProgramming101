package tictactoe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class temp extends JFrame{
	private int row = 3;
	private int col = 3;
	private String mark = "x";
	ImageIcon markO=new ImageIcon("markO.png");
	ImageIcon markX=new ImageIcon("markX.png");
	
	JButton Button1=new JButton(" 1 ");
	JButton Button2=new JButton(" 2 ");
	JButton Button3=new JButton(" 3 ");
	JButton Button4=new JButton(" 4 ");
	JButton Button5=new JButton(" 5 ");
	JButton Button6=new JButton(" 6 ");
	JButton Button7=new JButton(" 7 ");
	JButton Button8=new JButton(" 8 ");
	JButton Button9=new JButton(" 9 ");
	
	
	public temp() {
	    setTitle("Tik tak toe");
	    setResizable(false);
	    addWindowListener(new WindowAdapter() {
	      public void windowClosing(WindowEvent evt) {
	        exitForm(evt);
	      }

	    });
	    setLayout(new GridLayout(row, col));
	    add(Button1);
	    add(Button2);
	    add(Button3);
	    add(Button4);
	    add(Button5);
	    add(Button6);
	    add(Button7);
	    add(Button8);
	    add(Button9);
	    
	    
 
	    
	    Button1.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("button 1 clicked");
				Button1.setText(mark);
				if (mark == "x") {
					mark = "0";
				}else {
					mark = "x";
				}
			}
	    });
	   
	    Button2.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("button 2 clicked");
				Button2.setText(mark);
				if (mark == "x") {
					mark = "0";
				}else {
					mark = "x";
				}
			}
	    });
	    
	    Button3.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("button 3 clicked");
				Button3.setText(mark);
				if (mark == "x") {
					mark = "0";
				}else {
					mark = "x";
				}
			}
	    });
	    
	    Button4.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("button 4 clicked");
				Button4.setText(mark);
				if (mark == "x") {
					mark = "0";
				}else {
					mark = "x";
				}
			}
	    });
	    
	    Button5.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("button 5 clicked");
				Button5.setText(mark);
				if (mark == "x") {
					mark = "0";
				}else {
					mark = "x";
				}
			}
	    });
	    
	    Button6.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("button 6 clicked");
				Button6.setText(mark);
				if (mark == "x") {
					mark = "0";
				}else {
					mark = "x";
				}
			}
	    });
	    
	    Button7.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("button 7 clicked");
				Button7.setText(mark);
				if (mark == "x") {
					mark = "0";
				}else {
					mark = "x";
				}
			}
	    });
	    
	    Button8.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("button 8 clicked");
				Button8.setText(mark);
				if (mark == "x") {
					mark = "0";
				}else {
					mark = "x";
				}
			}
	    });
	    
	    Button9.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("button 9 clicked");
				Button9.setText(mark);
				if (mark == "x") {
					mark = "0";
				}else {
					mark = "x";
				}
			}
	    });

	}
	
		 
	private void exitForm(WindowEvent evt) {
		// TODO Auto-generated method stub
		    System.exit(0);
	}
	
}