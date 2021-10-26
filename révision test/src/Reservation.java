import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Reservation extends JFrame implements ActionListener{
	private JPanel pn,ps,pc;
	private JLabel ldes,lmoy;
	private String[]dest={"Alger","Oran","Annaba"};
	private JList lville;
	private JComboBox cmoy;
	private JTextArea ta;
	private JButton bc,bt;
	private JTextField tf;
	Reservation(){
	setTitle("Agence Voyage");
	setSize(500,300);
	setLocationRelativeTo(this);
	pn=new JPanel();
	add(pn,"North");
	pn.setBackground(Color.GRAY);
	ldes=new JLabel("Destination:");
	pn.add(ldes);
	lville=new JList (dest);
	pn.add(lville);
	lmoy=new JLabel("Moyen:");
	pn.add(lmoy);
	
	cmoy=new JComboBox();
	cmoy.addItem("train");
	cmoy.addItem("avion");
	pn.add(cmoy);
	
	
	
	pc=new JPanel();
	add(pc,"Center");
	pc.setBackground(Color.LIGHT_GRAY);
	ta=new JTextArea(12,40);
	pc.add(ta);
	
	ps=new JPanel();
	add(ps,"South");
	ps.setBackground(Color.GRAY);
	bc=new JButton("Confirmer");
	ps.add(bc);
	bc.addActionListener(this);
	bt=new JButton("Tarif à payer");
	ps.add(bt);
	bt.addActionListener(this);
	
	tf=new JTextField(15);
	ps.add(tf);
		
	}

	
	
	public static void main(String[] args) {
		Reservation res=new Reservation();
		res.setVisible(true);
		

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String x = null;
		if (e.getSource()==bc) {
			ta.setText("Destination:"+lville.getSelectedValue()+"\n"+"Moyen:"+cmoy.getSelectedItem());
			
		}
		if (cmoy.getSelectedItem()=="train") {
			if (lville.getSelectedValue()=="Alger") {
				x="700 da";
				
			}else {
				if (lville.getSelectedValue()=="Annaba") {
					x="800 da";
					
				} else {
					if (lville.getSelectedValue()=="Oran") {
						x="900 da";
						
					}

				}
			}
			
			
		}
		if (cmoy.getSelectedItem()=="avion") {
			if (lville.getSelectedValue()=="Alger") {
				x="4500 da";
				
			} else {
				if (lville.getSelectedValue()=="Annaba") {
					x="6000 da";
					
				} else {
					if (lville.getSelectedValue()=="Oran") {
						x="7000 da";
						
					}

				}

			}
			
		}
		if (e.getSource()==bt) {
			tf.setText(x);
			
		}
		
	}

}
