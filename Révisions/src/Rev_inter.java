import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Rev_inter extends JFrame implements ActionListener{
	JPanel ps,pn,pc,pe,pw ;
	JLabel lt,ln,lp,ls,le,ld;
	JTextField tn,tp;
	JComboBox cs;
	JCheckBox cho,chn;
	JButton bn;
	
	public Rev_inter(){
		setTitle("SAYAD");
		setSize(300, 250);
		setLocationRelativeTo(this);
		
		pn= new JPanel();
		add(pn,"North");
		pn.setBackground(Color.gray);
		lt=new JLabel("Mon premier projet");
		pn.add(lt);
		
		ps=new JPanel();
		add(ps,"South");
		ps.setBackground(Color.cyan);
		
		ld=new JLabel("septembre 2017");
		ps.add(ld);
		
		
		pc=new JPanel();
		add(pc,"Center");
		pc.setBackground(Color.MAGENTA);
		
		ln=new JLabel("nom");
		pc.add(ln);
		tn=new JTextField(12);
		pc.add(tn);
		
		lp=new JLabel("prenom");
		pc.add(lp);
		tp=new JTextField(12);
		pc.add(tp);
		
		ls=new JLabel("sexe");
		pc.add(ls);
		cs=new JComboBox();
		cs.addItem("masculin");
		cs.addItem("feminin");
		pc.add(cs);
		
		le=new JLabel("vous etes etudiant");
		pc.add(le);
		
		cho=new JCheckBox("oui") ;
		pc.add(cho);
		cho.addActionListener(this);
		chn=new JCheckBox("non");
		pc.add(chn);
		chn.addActionListener(this);
		
		
		pe=new JPanel();
		add(pe,"East");
		pe.setBackground(Color.PINK);
		
		
		pw=new JPanel ();
		add(pw,"West");
		pw.setBackground(Color.YELLOW);
		
		bn=new JButton("nouveau");
		pw.add(bn);
		bn.addActionListener(this);
		
	}

	
	public static void main(String[] args) {
		Rev_inter fen= new Rev_inter();
		fen.setVisible(true);
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bn) {
			tn.setText(null);
			tp.setText(null);
			
		}
		
			if (cho.isSelected()){
				chn.setSelected(false);
			}else if (chn.isSelected()) {
				cho.setSelected(false);
				
			}
				
			}
			
		}
		
		
	


