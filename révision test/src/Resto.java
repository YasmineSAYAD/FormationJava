import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Resto extends JFrame implements ActionListener{
	private JPanel pn,pc,ps;
	private JLabel lj,lpe,lpp,lpd;
	private JComboBox cj;
	private JTextArea ta;
	private JRadioButton rba,rbe;
	private JButton bt;
	private JTextField tf;
	
	
	Resto(){
		setTitle("Menu Restaurant");
		setSize(500, 300);
		setLocationRelativeTo(this);
		pn=new JPanel();
		add(pn,"North");
		pn.setBackground(Color.GRAY);
		lj=new JLabel("Menu du jour:");
		pn.add(lj);
		cj=new JComboBox();
		cj.addItem("Dimanche");
		cj.addItem("Lundi");
		cj.addItem("Mardi");
		cj.addItem("Mercredi");
		cj.addItem("Jeudi");
		cj.addItem("Vendredi");
		cj.addItem("Samedi");
		pn.add(cj);
		cj.addActionListener(this);
		
		pc=new JPanel();
		add(pc,"Center");
		pc.setBackground(Color.LIGHT_GRAY);
		ta=new JTextArea(9,40);
		pc.add(ta);
		lpe=new JLabel("");
		pc.add(lpe);
		lpp=new JLabel("");
		pc.add(lpp);
		lpd=new JLabel("");
		pc.add(lpd);
		
		ps=new JPanel();
		add(ps,"South");
		ps.setBackground(Color.GRAY);
		rba=new JRadioButton("Tarif Adult");
		ps.add(rba);
		rba.addActionListener(this);
		
		rbe=new JRadioButton("Tarif Enfant");
		ps.add(rbe);
		rbe.addActionListener(this);
		
		bt=new JButton("Tarif");
		ps.add(bt);
		bt.addActionListener(this);
		
		tf=new JTextField(12);
		ps.add(tf);
		
	}

	
	public static void main(String[] args) {
		Resto rest=new Resto();
		rest.setVisible(true);
		
		
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (cj.getSelectedItem()=="Dimanche") {
			ta.setText("Dimanche nous vous proposons :\n\n Entrée:Salade\nPlat:Couscous\nDéssert:Glace\n\nBon appetit!!!");
			lpe.setText("Prix Entrée:100");
			lpp.setText("Prix plat:300");
			lpd.setText("Prix Déssert:150");
			int t=100+300+150;
			if (rba.isSelected()) {
				if (e.getSource()==bt) {
					
					tf.setText(String.valueOf(t));
				}}
		 
			   if (rbe.isSelected()) {
				   if (e.getSource()==bt) {
					float te=t-(t*20/100);
					tf.setText(String.valueOf(te));
					
				
				
			
		   }	
				
				
			}
		}
		if (cj.getSelectedItem()=="Lundi") {
			ta.setText("Lundi nous vous proposons:\n\nEntrée:Macedoine\nPlat:Dolma\nDéssert:Glace\n\nBon appetit!!!");
			lpe.setText("Prix Entrée:150");
			lpp.setText("Prix plat:250");
			lpd.setText("Prix Déssert:150");
			int t=150+250+150;
			if (rba.isSelected()) {
				if (e.getSource()==bt) {
					
					tf.setText(String.valueOf(t));
				}}
		 
			   if (rbe.isSelected()) {
				   if (e.getSource()==bt) {
					float te=t-(t*20/100);
					tf.setText(String.valueOf(te));
					
				   }}
			
			
		}
		if (cj.getSelectedItem()=="Mardi") {
			ta.setText("Mardi nous vous proposons :\n\nEntrée:Chorba\nPlat:Chtitha\nDéssert:Tarte\n\nBon appetit!!!");
			lpe.setText("Prix Entrée:200");
			lpp.setText("Prix plat:250");
			lpd.setText("Prix Déssert:150");
			int t=200+250+150;
			if (rba.isSelected()) {
				if (e.getSource()==bt) {
					
					tf.setText(String.valueOf(t));
				}}
		 
			   if (rbe.isSelected()) {
				   if (e.getSource()==bt) {
					float te=t-(t*20/100);
					tf.setText(String.valueOf(te));
					
				   }}
			
			
			
			
		}
		if (cj.getSelectedItem()=="Mercredi") {
			ta.setText("Mercredi nous vous proposons :\n\nEntrée:Bourak\nPlat:Spaghettis\nDéssert:Fruit\n\nBon appetit!!!");
			lpe.setText("Prix Entrée:70");
			lpp.setText("Prix plat:200");
			lpd.setText("Prix Déssert:100");	
			int t=70+200+100;
			if (rba.isSelected()) {
				if (e.getSource()==bt) {
					
					tf.setText(String.valueOf(t));
				}}
		 
			   if (rbe.isSelected()) {
				   if (e.getSource()==bt) {
					float te=t-(t*20/100);
					tf.setText(String.valueOf(te));
					
				   }}
			
		}
		if (cj.getSelectedItem()=="Jeudi") {
			ta.setText("Jeudi nous vous proposons:\n\nEntrée:Soupe\nPlat:Lentilles\nDéssert:Génoise\n\nBon appetit!!!");
			lpe.setText("Prix Entrée:150");
			lpp.setText("Prix plat:200");
			lpd.setText("Prix Déssert:100");	
			int t=150+200+100;
			if (rba.isSelected()) {
				if (e.getSource()==bt) {
					
					tf.setText(String.valueOf(t));
				}}
		 
			   if (rbe.isSelected()) {
				   if (e.getSource()==bt) {
					float te=t-(t*20/100);
					tf.setText(String.valueOf(te));
					
				   }}
			
			
		}
		if (cj.getSelectedItem()=="Vendredi") {
			ta.setText("Vendredi nous vous proposons:\n\nEntrée:Veloute\nPlat:Poulet\nDessert:Bavarois\n\nBon appetit!!!");
			lpe.setText("Prix Entrée:150");
			lpp.setText("Prix plat:200");
			lpd.setText("Prix Déssert:100");	
			int t=150+200+100;
			if (rba.isSelected()) {
				if (e.getSource()==bt) {
					
					tf.setText(String.valueOf(t));
				}}
		 
			   if (rbe.isSelected()) {
				   if (e.getSource()==bt) {
					float te=t-(t*20/100);
					tf.setText(String.valueOf(te));
					
				   }}
			
			
		}
		if (cj.getSelectedItem()=="Samedi") {
			ta.setText("Samedi nous vous proposons :\n\nEntrée:Légumes\nPlat:Gratin\nDéssert:Mousse\n\nBon appetit!!!");
			lpe.setText("Prix Entrée:100");
			lpp.setText("Prix plat:200");
			lpd.setText("Prix Déssert:150");	
			int t=100+200+150;
			if (rba.isSelected()) {
				if (e.getSource()==bt) {
					
					tf.setText(String.valueOf(t));
				}}
		 
			   if (rbe.isSelected()) {
				   if (e.getSource()==bt) {
					float te=t-(t*20/100);
					tf.setText(String.valueOf(te));
					
				   }}
			
		}
		if (rba.isSelected()) {
			rbe.setSelected(false);
			
		}
		if (rbe.isSelected()) {
			rba.setSelected(false);
			
		}
		
		
		
	}

}
