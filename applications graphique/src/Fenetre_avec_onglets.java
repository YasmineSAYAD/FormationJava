import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
public class Fenetre_avec_onglets extends JFrame implements ActionListener,FocusListener{
	private JTabbedPane tp;
	private JPanel po1,po2,po3,pno1,pco1,pso1;
	private JLabel lt,lp,lta ; 
	private JTextField tt;
	private JButton bb,br,bg,bcop,bcol,bcoup,bgr,bi,bf,bsaut;
	private JComboBox cp,ct;
	private JTextArea ta;
	private JScrollPane sp;
	
	public Fenetre_avec_onglets(){
		setTitle("fenetres avec onglets");
		setSize(600, 500);
		setLocationRelativeTo(this);
		tp=new JTabbedPane();
		add(tp);
		po1=new JPanel();
		tp.add(po1,"Onglet 1");
		po1.setBackground(Color.LIGHT_GRAY);
		po1.setLayout(new BorderLayout());
		pno1=new JPanel();
		po1.add(pno1,BorderLayout.NORTH);
		pno1.setBackground(Color.yellow);
		lt=new JLabel("Texte");
		pno1.add(lt);
		
		tt=new JTextField(12);
		pno1.add(tt);
		
		bb=new JButton();
		pno1.add(bb);
		bb.setBackground(Color.black);
		bb.addActionListener(this);
		
		br=new JButton();
		pno1.add(br);
		br.setBackground(Color.RED);
		br.addActionListener(this);
		
		bg=new JButton();
		pno1.add(bg);
		bg.setBackground(Color.GREEN);
		bg.addActionListener(this);
		
		lp=new JLabel("Police");
		pno1.add(lp);
		
		cp=new JComboBox();
		cp.addItem("Combria");
		cp.addItem("Times New Roman");
		cp.addItem("Monotype Corsiva");
		pno1.add(cp);
		cp.addActionListener(this);
		 lta=new JLabel("Taille");
		 pno1.add(lta);
		 
		 ct=new JComboBox();
		 ct.addItem("12");
		 ct.addItem("20");
		 ct.addItem("30");
		 pno1.add(ct);
		 ct.addActionListener(this);
		
		
		pco1=new JPanel();
		po1.add(pco1,BorderLayout.CENTER);
		pco1.setBackground(Color.GREEN);
		ta=new JTextArea(22,30);
		sp=new JScrollPane(ta);
		ta.addFocusListener(this);
	
		pco1.add(sp);
		
		
		
		
		pso1=new JPanel();
		po1.add(pso1,BorderLayout.SOUTH);
		pso1.setBackground(Color.CYAN);
		bcop=new JButton("copier");
		pso1.add(bcop);
		bcop.addActionListener(this);
		
		bcol=new JButton("coller");
		pso1.add(bcol);
		bcol.addActionListener(this);
		
		bcoup=new JButton("couper");
		pso1.add(bcoup);
		bcoup.addActionListener(this);
		
		bgr=new JButton("G");
		pso1.add(bgr);
		bgr.addActionListener(this);
		
		bi=new JButton("I");
		pso1.add(bi);
		bi.addActionListener(this);
		
		bf=new JButton("Fermer");
		pso1.add(bf);
		bf.addActionListener(this);
		bsaut=new JButton();
		pso1.add(bsaut);
		bsaut.addActionListener(this);
		
		
		
		
		po2=new JPanel();
		tp.add(po2,"Onglet 2");
		po2.setBackground(Color.GRAY);
		
		po3=new JPanel();
		tp.add(po3,"Onglet 3");
		po3.setBackground(Color.darkGray);
		
		
		
		
	}

	
	public static void main(String[] args) {
		Fenetre_avec_onglets fen=new Fenetre_avec_onglets();
		fen.setVisible(true);
	

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bcop) {
			tt.copy();
			
			
		}
		if (e.getSource()==bcol) {
			ta.paste();
			
		}
		if (e.getSource()==bcoup) {
			tt.cut();
			
		}
		if (e.getSource()==bb) {
			ta.setForeground(Color.BLACK);
			
		}
		if (e.getSource()==br) {
			ta.setForeground(Color.RED);
			
		}
		if (e.getSource()==bgr) {
			ta.setFont(new Font("Cambria",Font.BOLD,12));
			
		}
		if (e.getSource()==bi) {
			ta.setFont(new Font("Cambria",Font.ITALIC,12));
			
		}
		if (e.getSource()==bg) {
			ta.setForeground(Color.GREEN);
			
		}
		
		if (e.getSource()==cp) {
			if (cp.getSelectedItem()=="Cambria") {
				ta.setFont(new Font("Cambria",Font.PLAIN,Integer.parseInt(ct.getSelectedItem().toString())));
				//plain ni gras ni italic
				
			}
			if (cp.getSelectedItem()==("Times New Roman")) {
				ta.setFont(new Font ("Times New Roman",Font.PLAIN,Integer.parseInt(ct.getSelectedItem().toString())));
				
			}
			if (cp.getSelectedItem()=="Monotype Corsiva") {
				ta.setFont(new Font("Monotype Corsiva",Font.PLAIN,Integer.parseInt(ct.getSelectedItem().toString())));
				
			}
			
		}
		if (e.getSource()==ct) {
			if (ct.getSelectedItem()=="12") {
				ta.setFont(new Font(cp.getSelectedItem().toString(),Font.PLAIN,12));
				
			}
			if (ct.getSelectedItem()=="20") {
				ta.setFont(new Font(cp.getSelectedItem().toString(),Font.PLAIN,20));
				
			}
			if (ct.getSelectedItem()=="30") {
				ta.setFont(new Font(cp.getSelectedItem().toString(),Font.PLAIN,30));
				
			}
			
		}
		if (e.getSource()==bf) {
			dispose();
			
		}
		if (e.getSource()==bsaut) {
			
				
			
				
			
			
			boolean etat=ta.getLineWrap();
			if (etat==false) {
				ta.setLineWrap(true);
				
			} else {
				ta.setLineWrap(false);

			}
			
				
				bsaut.setText(etat==false ? "Saut activé" : "Saut désactivé");
				
				
		
			
		}
		
		
		
	}


	@Override
	public void focusGained(FocusEvent e) {
		ta.setText(null) ;
			bsaut.setText("Saut de ligne");
			
			
		}
		
		
	


	@Override
	public void focusLost(FocusEvent e) {
		
		
	}

}
