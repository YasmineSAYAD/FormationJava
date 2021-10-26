import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Boutton_daction extends JFrame implements ActionListener{
	private JPanel pn,pw,pc,pe,ps;
	private JButton bb,br,bv ,bn;
	private JLabel n, lp;
	private JCheckBox jn,jb;
	private JTextField tf;
     public Boutton_daction(){
    	 setTitle("boutton d'action");
    	 setSize(500,250);
    	 setLocationRelativeTo(this);
    	 pn=new JPanel();
    	 add(pn,"North");
    	 pn.setBackground(Color.blue);
    	 pw=new JPanel();
    	 add(pw,"West");
    	 pw.setBackground(Color.BLACK);
    	 pc=new JPanel(); 
    	 add(pc,"Center");
    	 pc.setBackground(Color.green);
    	 pe=new JPanel();
    	 add(pe,"East");
    	 pe.setBackground(Color.orange);
    	 ps=new JPanel();
    	 add(ps,"South");
    	 ps.setBackground(Color.RED);
    	 
    	 bb=new JButton("bleu");
    	 pn.add(bb);
    	 bb.addActionListener(this);
    	 
    	 br=new JButton("rouge");
    	 pn.add(br);
    	 br.addActionListener(this);
    	 
    	 bv=new JButton("vert");
    	 pn.add (bv);
    	 bv.addActionListener(this);
    	 lp=new JLabel("programmeur java c'est tiptop");
    	 ps.add(lp);
    	 
    	 
    	 
    	 jn=new JCheckBox("noir");
    	 pe.add(jn);
    	 jn.addActionListener(this);
    	 
    	 jb=new JCheckBox("blanc");
    	 pw.add(jb);
    	 jb.addActionListener(this);
    	 n=new JLabel("nom:");
    	 pc.add(n);
    	 
    	 tf=new JTextField(12);
         pc.add(tf);
         bn=new JButton("nouveau");
         pc.add(bn);
         bn.addActionListener(this);
    	 
    	 
     }
	
	public static void main(String[] args) {
		Boutton_daction fenetre= new Boutton_daction();
		fenetre.setVisible(true);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bb) {
			pc.setBackground(Color.BLUE);
			
		}
		if (e.getSource()==bv){
			pc.setBackground(Color.GREEN);
		}
		if (e.getSource()==br){
			pc.setBackground(Color.RED);
		}
		if(e.getSource()==jn){
			if (jn.isSelected()) {
				lp.setForeground(Color.BLACK);
				jb.setSelected(false);
				
				
			} else {
				lp.setForeground(null);

			}
		
		}
		if(e.getSource()==jb){
			if (jb.isSelected()) {
				lp.setForeground(Color.WHITE);
				jn.setSelected(false);
				
				
			} else {
				lp.setForeground(null);

			}
			
		}
		if (e.getSource()==bn) {
			tf.setText(null);
			
		}
		
		
	}

}
