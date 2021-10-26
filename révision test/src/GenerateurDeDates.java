import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GenerateurDeDates extends JFrame implements ActionListener {
	private JPanel pn,pc,ps;
	private JLabel lg,lj,lm,la;
	private JTextField tj,ta,tf;
	private JComboBox cm;
	private JButton bg,be;
	private JMenuBar mb;
	private JMenu mf;
	private JMenuItem mn,mq;
	
	public GenerateurDeDates() {
		setTitle("Générateur d'adresses");
		setSize(400, 300);
		setLocationRelativeTo(this);
		mb=new JMenuBar();
		setJMenuBar(mb);
		mf=new JMenu("Fichier");
		mb.add(mf);
		mn=new JMenuItem("Nouveau");
		mf.add(mn);
		mn.addActionListener(this);
		mq=new JMenuItem("Quitter");
		mf.add(mq);
		mq.addActionListener(this);
		pn=new JPanel();
		add(pn,"North");
		pn.setBackground(Color.GRAY);
		lg=new JLabel("Générateur d'adresse");
		pn.add(lg);
		pc=new JPanel();
		add(pc,"Center");
		pc.setBackground(Color.LIGHT_GRAY);
		lj=new JLabel("Jour:");
		pc.add(lj);
		tj=new JTextField(5);
		pc.add(tj);
	
		lm=new JLabel("Mois:");
		pc.add(lm);
		cm=new JComboBox();
		cm.addItem("Janvier");
		cm.addItem("Février");
		cm.addItem("Mars");
		cm.addItem("Avril");
		cm.addItem("Mai");
		cm.addItem("Juin");
		cm.addItem("Juillet");
		cm.addItem("Aout");
		cm.addItem("Septembre");
		cm.addItem("Octobre");
		cm.addItem("Novembre");
		cm.addItem("Décembre");
		pc.add(cm);
		la=new JLabel("Année");
		pc.add(la);
		ta=new JTextField(5);
		pc.add(ta);
		ps=new JPanel();
		add(ps,"South");
		ps.setBackground(Color.GRAY);
		bg=new JButton("Générer");
		ps.add(bg);
		bg.addActionListener(this);
		tf=new JTextField(15);
		ps.add(tf);
		be=new JButton("Exit");
		ps.add(be);
		be.addActionListener(this);
		
	}

	
	public static void main(String[] args) {
		GenerateurDeDates generateur=new GenerateurDeDates();
		generateur.setVisible(true);
		
		
		
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
if (e.getSource()==bg) {
	tf.setText(tj.getText()+" "+cm.getSelectedItem()+" "+ta.getText());
	
}
if (e.getSource()==mn) {
	tj.setText(null);
	ta.setText(null);
	tf.setText(null);
	
}
if (e.getSource()==be || e.getSource()==mq) {
	System.exit(0);
	
}
		
	}

}
