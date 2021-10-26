import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Ma_mini_calculatrice extends JFrame implements ActionListener {
	JPanel pn,ps,pc;
	JLabel ls,ln1,ln2,lr;
	JTextField tn1,tn2,tr;
	JButton bp,bs,bm,bd,bce;
	public Ma_mini_calculatrice(){
		setTitle("Ma mini calculatrice");
		setSize(300,250);
		setLocationRelativeTo(this);
		
		pn=new JPanel();
		add(pn,"North");
		pn.setBackground(Color.CYAN);
		ls=new JLabel("saisissez les nombres");
		pn.add(ls);
		
		pc=new JPanel();
		add(pc,"Center");
		pc.setBackground(Color.YELLOW);
		ln1=new JLabel("Nombre 1:");
		pc.add(ln1);
		tn1=new JTextField(15);
		pc.add(tn1);
		
		ln2=new JLabel("Nombre 2:");
		pc.add(ln2);
		tn2=new JTextField(15);
		pc.add(tn2);
		
		lr=new JLabel("Résultat  : ");
		pc.add(lr);
		tr=new JTextField(15);
		pc.add(tr);
		
		ps=new JPanel();
		add(ps,"South");
		ps.setBackground(Color.GREEN);
		bp=new JButton("+");
		ps.add(bp);
		bp.addActionListener(this);
		
		bs=new JButton("-");
		ps.add(bs);
		bs.addActionListener(this);
		
		bm=new JButton("*");
		ps.add(bm);
		bm.addActionListener(this);
		
		bd=new JButton("/");
		ps.add(bd);
		bd.addActionListener(this);
		
		bce=new JButton("CE");
		ps.add(bce);
		bce.addActionListener(this);
		
	}

	
	public static void main(String[] args) {
		Ma_mini_calculatrice cal=new Ma_mini_calculatrice();
		cal.setVisible(true);
	

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		float n1=Float.parseFloat(tn1.getText());//Integer.parseInt
		float n2=Float.parseFloat(tn2.getText());
		if (e.getSource()==bp) {
			
			tr.setText((n1+n2)+"");
			
		}
		if(e.getSource()==bs){
			tr.setText((n1-n2)+"");
			
		}
		if(e.getSource()==bm){
			tr.setText((n1*n2)+"");
		}
		if(e.getSource()==bd){
			tr.setText((n1/n2)+"");
		}
		if (e.getSource()==bce) {
			tn1.setText(null);
			tn2.setText(null);
			tr.setText(null);
			
		}
		
		
	}

}
