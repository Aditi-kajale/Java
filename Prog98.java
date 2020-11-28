// an eg of radio buttons (option buttons)
// In AWT, we do not have a separate class to create radio buttons. They are created using
// Checkbox class. To convert a Checkbox to a Radio button, we have to add Checkbox
// to object of another class called as CheckboxGroup. We can multiple CheckboxGroups
// in an applet
import java.applet.*;
import java.awt.*;  // Checkbox, CheckboxGroup classes
import java.awt.event.*;  // ItemEvent class, ItemListener interface

/* <applet code="Prog98.class" width="500" height="500">
</applet> */

public class Prog98 extends Applet implements ItemListener
{
	Label l, lblinfo;  // static & dynamic labels
	CheckboxGroup rbg1;
	Checkbox radm, radum;

	public void init()
	{
		l = new Label("Marital Status");
		rbg1 = new CheckboxGroup();  // default constructor
		radm = new Checkbox("Married",rbg1,false);
		// for radio buttons use parameterized constructor with 3 args
		// 1. caption 2. Radio button group 3. Selected?
		radum = new Checkbox("Unmarried",rbg1,true);  // Selected
		lblinfo = new Label("I am Unmarried");  // default

		setFont(new Font("Arial",Font.BOLD,20));
		setLayout(null);

		l.setBounds(50,50,150,30);
		radm.setBounds(50,130,125,30);
		radum.setBounds(200,130,125,30);
		lblinfo.setBounds(50,200,200,30);

		add(l);
		add(radm);   // don't type add(rbg1);  // error, as it is invisible
		add(radum);
		add(lblinfo);

		radm.addItemListener(this);
		radum.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		// do not call paint() bcoz we just need to update the label
		// lblinfo.setText("I am " + rbg1.getSelectedCheckbox().getLabel());
		// get the label/caption of selected checkbox
		// long cut
		Checkbox r = rbg1.getSelectedCheckbox();
		String caption = r.getLabel();
		lblinfo.setText("I am " + caption);
	}
}
				












