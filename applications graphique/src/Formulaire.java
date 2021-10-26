import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Formulaire extends JFrame implements ActionListener {
	private JPanel pn, ps, pc;
	private JLabel lr, ln, lp, lt, lm;
	private JTextField tn, tp, tv;
	private JComboBox ct;
	private JButton bi, bnv;
	private JCheckBox cho, chn;

	public Formulaire() {
		setTitle("mon premier formulaire");
		setSize(250, 300);
		setLocationRelativeTo(this);
		pn = new JPanel();
		add(pn, "North");
		pn.setBackground(Color.CYAN);
		lr = new JLabel("remplissez les champs");
		pn.add(lr);
		bnv = new JButton("nouveau");
		pn.add(bnv);
		bnv.addActionListener(this);
		bnv.setForeground(Color.red);
		bnv.setCursor(new Cursor(Cursor.HAND_CURSOR));
		bnv.setToolTipText("créer une nouvelle victime");

		pc = new JPanel();
		add(pc, "Center");
		pc.setBackground(Color.GREEN);
		ln = new JLabel("nom");
		pc.add(ln);
		tn = new JTextField(12);
		pc.add(tn);

		lp = new JLabel("prenom");
		pc.add(lp);

		tp = new JTextField(12);
		pc.add(tp);

		lt = new JLabel("titre");
		pc.add(lt);
		ct = new JComboBox();
		ct.addItem("Mlle");
		ct.addItem("Mme");
		ct.addItem("Mr");
		pc.add(ct);

		lm = new JLabel("SM");
		pc.add(lm);

		cho = new JCheckBox("oui");
		pc.add(cho);
		cho.addActionListener(this);

		chn = new JCheckBox("non");
		pc.add(chn);
		chn.addActionListener(this);

		ps = new JPanel();
		add(ps, "South");
		ps.setBackground(Color.YELLOW);
		bi = new JButton("identifier");
		ps.add(bi);
		bi.addActionListener(this);

		tv = new JTextField(12);
		ps.add(tv);

	}

	public static void main(String[] args) {
		Formulaire form = new Formulaire();
		form.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String sm = null;
		String ch = null;
		if (cho.isSelected()) {

			chn.setSelected(false);
			sm = "marié(e)";
		}
		if (chn.isSelected()) {

			cho.setSelected(false);
			sm = "célibataire";
		}

		if (e.getSource() == bi) {
			ch = ct.getSelectedItem() + " " + tn.getText() + " " + tp.getText()
					+ " " + lm.getText();

		}

		tv.setText(ch + " " + sm);

		if (e.getSource() == bnv) {
			tn.setText(null);
			tp.setText(null);
			tv.setText(null);
			ct.setSelectedItem("Mlle");

		}

	}

}
