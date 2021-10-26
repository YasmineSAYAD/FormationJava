import java.awt.*;
import javax.swing.*;
public class Facture extends JFrame {
	private JPanel pn,pc,ps;
	private JLabel lfen,lmht,lr,lmtva,lmttc;
	private JButton br,bmtva,bmttc;
	private JTextField tmht,tr,tmtva,tmttc;
	public Facture(){
		setTitle("Facturation");
		setSize(350, 250);
		setLocationRelativeTo(this);
		
		pn=new JPanel();
		add(pn,"North");
		pn.setBackground(Color.DARK_GRAY);
		lfen=new JLabel("FENETRE TAXATION");
		pn.add(lfen);
		
		pc=new JPanel();
		add(pc,"Center");
		pc.setBackground(Color.LIGHT_GRAY);
		lmht=new JLabel("Montant HT:");
		pc.add(lmht);
		tmht=new JTextField(20);
		pc.add(tmht);
		
		lr=new JLabel("Remise:       ");
		pc.add(lr);
		tr=new JTextField(20);
		pc.add(tr);
		
		lmtva=new JLabel("Montant TVA:");
		pc.add(lmtva);
		tmtva=new JTextField(20);
		pc.add(tmtva);
		lmttc=new JLabel("Montant TTC:");
		pc.add(lmttc);
		tmttc=new JTextField(20);
		pc.add(tmttc);
		
		
		ps=new JPanel();
		add(ps,"South");
		ps.setBackground(Color.DARK_GRAY);
		br=new JButton("Remise");
		ps.add(br);
		bmtva=new JButton("Montant TVA");
		ps.add(bmtva);
		bmttc=new JButton("Montant TTC");
		ps.add(bmttc);
		
		
		
	}
	
	public static void main(String[] args) {

     Facture fact=new Facture();
     fact.setVisible(true);

	

	
		
	}

}
