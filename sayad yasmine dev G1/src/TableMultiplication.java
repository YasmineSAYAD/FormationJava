import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class TableMultiplication extends JFrame implements ActionListener {
	private JPanel pn, pc, ps;
	private JButton bn, bok, bf;
	private JLabel ls, lt;
	private JTextField tf;
	private JTextArea ta;

	public TableMultiplication() {
		setTitle("Table de multiplication");
		setSize(400, 300);
		setLocationRelativeTo(this);
		pn = new JPanel();
		add(pn, "North");
		pn.setBackground(Color.GRAY);
		ls = new JLabel("Saisir un chiffre:");
		pn.add(ls);
		tf = new JTextField(10);
		pn.add(tf);
		bok = new JButton("OK");
		pn.add(bok);
		bok.addActionListener(this);
		bn = new JButton("Nouveau");
		pn.add(bn);
		bn.addActionListener(this);

		pc = new JPanel();
		add(pc, "Center");
		pc.setBackground(Color.LIGHT_GRAY);
		ta = new JTextArea(20, 30);
		pc.add(ta);

		ps = new JPanel();
		add(ps, "South");
		ps.setBackground(Color.GRAY);
		lt = new JLabel("La table de la multiplication de:");
		ps.add(lt);
		bf = new JButton("Fermer");
		ps.add(bf);
		bf.addActionListener(this);

	}

	public static void main(String[] args) {
		TableMultiplication table = new TableMultiplication();
		table.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bok) {
		int n=	Integer.parseInt(tf.getText());
			ta.setText("0*"+tf.getText()+"="+(n*0)+"\n"+"1*"+tf.getText()+"="+(n*1)+"\n"+"2*"+tf.getText()+"="+(n*2)+ "\n"+"3*"+tf.getText()+"="+(n*3)+"\n"+"4*"+tf.getText()+"="+(n*4)+"\n"+"5*"+tf.getText()+"="+(n*5)+"\n"+"6*"+tf.getText()+"="+(n*6)+"\n"+"7*"+tf.getText()+"="+(n*7)+"\n"+"8*"+tf.getText()+"="+(n*8)+"\n"+"9*"+tf.getText()+"="+(n*9)+"\n"+"10*"+tf.getText()+"="+(n*10));
			lt.setText(lt.getText()+tf.getText());
			
		}
		if (e.getSource()==bn) {
			ta.setText(null);
			tf.setText(null);
			lt.setText("La table de multiplication de :");
			
			
		}
		if (e.getSource()==bf) {
			System.exit(0);
			
		}
		
	}
}
