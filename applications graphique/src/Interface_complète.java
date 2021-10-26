import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.sound.midi.SysexMessage;
import javax.swing.*;
import javax.swing.plaf.OptionPaneUI;

public class Interface_complète extends JFrame implements ActionListener ,MouseListener { //menu contextuel
	private JPanel pn, ps, pc;
	private JButton bq, bcol, bcoup, bcop, bn, bo;
	private JLabel lf;
	private JMenuBar mb;
	private JMenu mf, me, ma;
	private JMenuItem io, ic, iq, icop, icol, icou, ir, ip,popo,popb,popc,popq;
	private JToolBar tb;
	private JPopupMenu popm;

	public Interface_complète() {
		setTitle("Interface complète");
		setSize(800, 650);
		setLocationRelativeTo(this);
		// création de la barre de menu
		mb = new JMenuBar();
		setJMenuBar(mb);
		mf = new JMenu("Fichier");
		mb.add(mf);
		io = new JMenuItem("Ouvrir");
		mf.add(io);
		io.addActionListener(this);
		ic = new JMenuItem("Consulter");
		mf.add(ic);
		iq = new JMenuItem("Quitter");
		mf.add(iq);
		iq.addActionListener(this);
		me = new JMenu("Edition");
		mb.add(me);
		icop = new JMenuItem("Copier");
		me.add(icop);
		icol = new JMenuItem("coller");
		me.add(icol);
		icou = new JMenuItem("Couper");
		me.add(icou);

		ma = new JMenu("Aide");
		mb.add(ma);
		ir = new JMenuItem("Rubriquer");
		ma.add(ir);
		ip = new JMenuItem("A propos");
		ma.add(ip);
		pn = new JPanel();
		pn.setBackground(Color.BLUE);
		add(pn, "North");
		pn.setLayout(new FlowLayout(FlowLayout.LEFT));
		tb = new JToolBar();
		pn.add(tb);
		bn = new JButton(new ImageIcon(this.getClass().getResource("nouveau.png")));
		tb.add(bn);
		bn.setToolTipText("Nouveau");
		bo = new JButton(new ImageIcon(this.getClass().getResource("ouvrir.png")));
		tb.add(bo);
		bo.addActionListener(this);
		bo.setToolTipText("Ouvrir");
		bcop = new JButton(new ImageIcon(this.getClass().getResource("copier.png")));
		tb.add(bcop);
		bcop.setToolTipText("copier");

		bcol = new JButton(new ImageIcon(this.getClass().getResource("coller.png")));
		tb.add(bcol);
		bcol.setToolTipText("coller");
		bcoup = new JButton(new ImageIcon(this.getClass().getResource("couper.png")));
		tb.add(bcoup);
		bcoup.setToolTipText("couper");

		pc = new JPanel();
		add(pc, "Center");
		pc.setBackground(Color.GREEN);
		lf = new JLabel(new ImageIcon(this.getClass().getResource("Fond.png")));
		pc.add(lf);

		ps = new JPanel();
		add(ps, "South");
		ps.setBackground(Color.ORANGE);
		ps.setLayout(new FlowLayout(FlowLayout.RIGHT));
		bq = new JButton("Quitter l'application");
		ps.add(bq);
		bq.addActionListener(this);
		
		//creation du menu contextuel
		popm=new JPopupMenu();
		popo=new JMenuItem("Ouvrir");
		popm.add(popo);
		popo.addActionListener(this);
		
		popc=new JMenuItem("Consulter");
		popm.add(popc);
		popc.addActionListener(this);
		
		popq=new JMenuItem("Quitter");
		popm.add(popq);
		popq.addActionListener(this);
		this.addMouseListener(this);
			

	}

	public static void main(String[] args) {
		Interface_complète inter = new Interface_complète();
		inter.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == io || (e.getSource() == bo || e.getSource()==popo)) {
			Fenetre_avec_onglets f1 = new Fenetre_avec_onglets();
			f1.setVisible(true);

		}
		if (e.getSource() == bq|| e.getSource()==iq || e.getSource()==popq ) {
			int op= JOptionPane.showConfirmDialog(this,
					"etes vous surs de vouloir quitter l'application?",
					"Confirmation", JOptionPane.YES_NO_OPTION);
			if (op==0) {
				System.exit(0);
				
			}

		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
	
		
	}

	@Override
	public void mousePressed(MouseEvent e) { //clic sans lacher
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.isPopupTrigger()) {
			popm.show(this,e.getX(),e.getY());
			
		}
		
		
	}

}
