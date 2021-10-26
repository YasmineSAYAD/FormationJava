import java.awt.*;

import javax.swing.*;
public class Ma_première_fenetre extends JFrame {
	private JPanel pane;
	private JLabel lj;
	private JButton bj;
	private JCheckBox co,cn;
	
	public Ma_première_fenetre() {
		setTitle("ma premiere fenetre java");
		setSize(300, 250);
		setLocationRelativeTo(this);
		pane=new JPanel();
		add(pane);
		pane.setBackground(Color.green);
		lj=new JLabel("j'adore java \n");
		pane.add (lj);
		bj=new JButton("je suis un botton cliquez sur moi!");
		pane.add(bj);
		co=new JCheckBox("oui");
		pane.add(co);
		cn=new JCheckBox("non");
		
		pane.add(cn);
		
		
	}

	
	public static void main(String[] args) {
		Ma_première_fenetre fenetre=new Ma_première_fenetre();
		fenetre.setVisible(true);

	}

}
