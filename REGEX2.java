import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import java.awt.Scrollbar;
import java.awt.Choice;
import java.awt.List;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import java.awt.Window.Type;
public class REGEX2 extends JFrame {
	
	/* DECLARING FIELDS LABELS AND PANEL */
	
	private JPanel contentPane;
	private JTextField name;
	private JTextField faname;
	private JTextField dob;
	private JTextField email;
	private JTextField addr;
	private JTextField cnic;
	private JTextField pnum;
	private JLabel nl;
	private JLabel fal;
	private JLabel dobl;
	private JLabel el;
	private JLabel al;
	private JLabel pl;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField nicno;
	private JLabel cnicl;
	private JTextField City;
	private JLabel cil;
	
	
	/*  MAIN METHOD  */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGEX2 frame = new REGEX2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public REGEX2() {
		setResizable(false);

		
		/* CONFIGURING SETTINGS  */
		
		setTitle("OOP PROJECT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 570);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegisterationForm = new JLabel("REGISTRATION FORM");
		lblRegisterationForm.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
		lblRegisterationForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisterationForm.setForeground(SystemColor.infoText);
		lblRegisterationForm.setBackground(SystemColor.inactiveCaptionBorder);
		lblRegisterationForm.setBounds(280, 11, 214, 26);
		contentPane.add(lblRegisterationForm);
		
		JLabel lblPersonalInformation = new JLabel("PERSONAL INFORMATION :");
		lblPersonalInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalInformation.setForeground(SystemColor.desktop);
		lblPersonalInformation.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblPersonalInformation.setBounds(10, 38, 198, 20);
		contentPane.add(lblPersonalInformation);
		
		JLabel lblLastName = new JLabel("FULL NAME *");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setForeground(Color.BLUE);
		lblLastName.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblLastName.setBounds(0, 82, 135, 14);
		contentPane.add(lblLastName);
		
		JLabel lblFathersName = new JLabel("FATHER'S NAME *\r\n");
		lblFathersName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFathersName.setForeground(Color.BLUE);
		lblFathersName.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblFathersName.setBounds(10, 113, 135, 14);
		contentPane.add(lblFathersName);
		
		JLabel lblDateOfBirth = new JLabel("DATE OF BIRTH *");
		lblDateOfBirth.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateOfBirth.setForeground(Color.BLUE);
		lblDateOfBirth.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblDateOfBirth.setBounds(10, 144, 135, 14);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblGender = new JLabel("GENDER *");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setForeground(Color.BLUE);
		lblGender.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblGender.setBounds(0, 209, 125, 14);
		contentPane.add(lblGender);
		
		JLabel lblCnicNumber = new JLabel("CNIC NUMBER *");
		lblCnicNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblCnicNumber.setForeground(Color.BLUE);
		lblCnicNumber.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblCnicNumber.setBounds(10, 172, 135, 14);
		contentPane.add(lblCnicNumber);
		
		JLabel lblEmail = new JLabel("EMAIL *");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.BLUE);
		lblEmail.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblEmail.setBounds(-10, 243, 135, 14);
		contentPane.add(lblEmail);
		
		JLabel lblContactInformation = new JLabel("CONTACT INFORMATION :");
		lblContactInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactInformation.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblContactInformation.setBounds(10, 277, 186, 14);
		contentPane.add(lblContactInformation);
		
		JLabel lblAddress = new JLabel("ADDRESS *");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(Color.BLUE);
		lblAddress.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblAddress.setBounds(0, 319, 135, 14);
		contentPane.add(lblAddress);
		
		JLabel lblCountry = new JLabel("COUNTRY *");
		lblCountry.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountry.setForeground(Color.BLUE);
		lblCountry.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblCountry.setBounds(0, 380, 135, 14);
		contentPane.add(lblCountry);
		
		JLabel lblCity = new JLabel("CITY *");
		lblCity.setHorizontalAlignment(SwingConstants.CENTER);
		lblCity.setForeground(Color.BLUE);
		lblCity.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblCity.setBounds(-10, 344, 135, 20);
		contentPane.add(lblCity);
		
		JLabel lblPhonemobileNumber = new JLabel("MOBILE NUMBER *");
		lblPhonemobileNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhonemobileNumber.setForeground(Color.BLUE);
		lblPhonemobileNumber.setFont(new Font("Georgia", Font.PLAIN, 12));
		lblPhonemobileNumber.setBounds(24, 408, 135, 20);
		contentPane.add(lblPhonemobileNumber);
	
		
		
		/* DEFINING LABELS */
		
		JList list = new JList();
		list.setForeground(Color.BLUE);
		list.setBackground(SystemColor.control);
		list.setBounds(267, 329, -59, 14);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list_1.setBounds(285, 357, -67, 1);
		contentPane.add(list_1);
		
		nl = new JLabel("");
		nl.setForeground(Color.RED);
		nl.setBounds(548, 82, 207, 14);
		contentPane.add(nl);
		
		fal = new JLabel("");
		fal.setForeground(Color.RED);
		fal.setBackground(SystemColor.control);
		fal.setBounds(548, 113, 207, 14);
		contentPane.add(fal);
		
		dobl = new JLabel("");
		dobl.setForeground(Color.RED);
		dobl.setBackground(UIManager.getColor("Button.background"));
		dobl.setBounds(548, 144, 207, 14);
		contentPane.add(dobl);
		
		cnicl = new JLabel("");
		cnicl.setForeground(Color.RED);
		cnicl.setBackground(SystemColor.menu);
		cnicl.setBounds(548, 178, 207, 14);
		contentPane.add(cnicl);
		
		el = new JLabel("");
		el.setForeground(Color.RED);
		el.setBounds(548, 243, 207, 14);
		contentPane.add(el);
		
		al = new JLabel("");
		al.setForeground(Color.RED);
		al.setBounds(548, 316, 207, 14);
		contentPane.add(al);
		
		cil = new JLabel("");
		cil.setForeground(Color.RED);
		cil.setBounds(548, 347, 207, 14);
		contentPane.add(cil);
		
		pl = new JLabel("");
		pl.setForeground(Color.RED);
		pl.setBounds(548, 408, 207, 14);
		contentPane.add(pl);
		
		
		
		

		/* CODING FOR "SUBMIT" BUTTON */
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(name.getText().trim().isEmpty()) {
				JOptionPane.showInternalMessageDialog(null, "Your Name is required !");
			}
			else if(faname.getText().trim().isEmpty()) {
				JOptionPane.showInternalMessageDialog(null, "Father's Name is required !");	
			}
			else if(dob.getText().trim().isEmpty()) {
				JOptionPane.showInternalMessageDialog(null, "Your Date Of Birth Numnber is required !");	
			}
			else if(nicno.getText().trim().isEmpty()) {
				JOptionPane.showInternalMessageDialog(null, "Your CNIC is required !");	
			}
			else if(email.getText().trim().isEmpty()) {
				JOptionPane.showInternalMessageDialog(null, "Email is required !");	
			}
			else if(addr.getText().trim().isEmpty()) {
				JOptionPane.showInternalMessageDialog(null, "Your Address is required !");	
			}
			else if(City.getText().trim().isEmpty()) {
				JOptionPane.showInternalMessageDialog(null, "City is required !");	
			}
			else if(pnum.getText().trim().isEmpty()) {
				JOptionPane.showInternalMessageDialog(null, "Your Phone Numnber is required !");	
			}
			else 
			{
			JOptionPane.showInternalMessageDialog(null, "YOUR FORM IS SUCCESSFULLY SUBMITTED.");
			}
			
			}
		});
		
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(335, 463, 109, 32);
		contentPane.add(btnNewButton);		
		
		
		
		
		//  CODING FOR TEXT FIELDS
		/*   CODING FOR "NAME" TEXT FIELD  */
		
		name = new JTextField();
		name.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{	
				String PATTERN="[a-zA-Z\\. ]+";
				Pattern p=Pattern.compile(PATTERN);
				Matcher m=p.matcher(name.getText());
				if(m.matches())
				{
					nl.setEnabled(true); 
					nl.setText("Valid");
					btnNewButton.setEnabled(true);
				}	
				else if(name.getText().equals(""))
				{
					nl.setEnabled(true);
					nl.setText(" This field is Mandatory ");
				}
				else
				{
					nl.setEnabled(true);
					nl.setText(" INVALID !");
					btnNewButton.setEnabled(false);
					
				}
			}
	});
		name.setColumns(10);
		name.setBounds(169, 80, 325, 20);
		contentPane.add(name);
		
		
		
		/* CODING FOR "FATHER'S NAME" TEXT FIELD */
		
		faname = new JTextField();
		faname.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				String PATTERN="[a-zA-Z\\. ]+";
				Pattern p=Pattern.compile(PATTERN);
				Matcher m=p.matcher(faname.getText());
				if(m.matches())
				{
					fal.setEnabled(true);
					fal.setText("Valid");
					btnNewButton.setEnabled(true);
				}	
				else if(faname.getText().equals(""))
				{
					fal.setEnabled(true);
					fal.setText(" This field is Mandatory ");
				}
				else
				{
					fal.setEnabled(true);
					fal.setText(" INVALID !");
					btnNewButton.setEnabled(false);
				}
			}
	});
		faname.setColumns(10);
		faname.setBounds(169, 111, 325, 20);
		contentPane.add(faname);
		
		
		
		/* CODING FOR "DATE OF BIRTH" TEXT FIELD */
		
		dob = new JTextField();
		dob.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				//String PATTERN="^(1[0-2]|0[1-9])/(3[01]" + "|[12][0-9]|0[1-9])/[0-9]{4}$";
				String PATTERN="^([0-2][1-9]|(3)[0-1])(\\/)(((0)[1-9])|((1)[0-2]))(\\/)\\d{4}$";
				Pattern p=Pattern.compile(PATTERN);
				Matcher m=p.matcher(dob.getText());
				if(m.matches())
				{
					dobl.setEnabled(true);
					dobl.setText("Valid");
					btnNewButton.setEnabled(true);
				}
				else if(dob.getText().equals(""))
				{
					dobl.setEnabled(true);
					dobl.setText(" This field is Mandatory ");
				}
				else
				{
					dobl.setEnabled(true);
					dobl.setText(" INVALID !");
					btnNewButton.setEnabled(false);
				}
			}
	});
		dob.setColumns(10);
		dob.setBounds(169, 142, 325, 20);
		contentPane.add(dob);
		
		
		
		/* CODING FOR "CNIC NUMBER" TEXT FIELD */
		
		nicno = new JTextField();
		nicno.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				String PATTERN="^[0-9+]{5}-[0-9+]{7}-[0-9]{1}$";
				
				Pattern p=Pattern.compile(PATTERN);
				Matcher m=p.matcher(nicno.getText());
				if(m.matches())
				{
					cnicl.setEnabled(true);
					cnicl.setText("Valid");
					btnNewButton.setEnabled(true);
				}
				else if(nicno.getText().equals(""))
				{
					cnicl.setEnabled(true);
					cnicl.setText(" This field is Mandatory ");
				}
				else	
				{
					cnicl.setEnabled(true);
					cnicl.setText(" INVALID !");
					btnNewButton.setEnabled(false);
				}
			}
	});
		nicno.setColumns(10);
		nicno.setBounds(169, 172, 325, 20);
		contentPane.add(nicno);
		
		

		
		/* CODING FOR "EMAIL" TEXT FIELD */
		
		email = new JTextField();
		email.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{	
				String PATTERN="^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +  "(?:[a-zA-Z-]+\\.)+[a-z" +  "A-Z]{3}$";
				Pattern p=Pattern.compile(PATTERN);
				Matcher m=p.matcher(email.getText());
				if(m.matches())
				{
					el.setEnabled(true);
					el.setText("Valid");
					btnNewButton.setEnabled(true);
				}	
				else if(email.getText().equals(""))
				{
					el.setEnabled(true);
					el.setText(" This field is Mandatory ");
				}
				else
				{
					el.setEnabled(true);
					el.setText(" INVALID !");
					btnNewButton.setEnabled(false);
				}
			}
	});
		email.setColumns(10);
		email.setBounds(169, 240, 325, 20);
		contentPane.add(email);
		
		
		
		/* CODING FOR "ADDRESS" TEXT FIELD */
		
		addr = new JTextField();
		addr.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{	
				String PATTERN="[a-zA-Z0-9\\s+\\.\\#\\:\\=\\,]+";
				Pattern p=Pattern.compile(PATTERN);
				Matcher m=p.matcher(addr.getText());
				if(m.matches())
				{
					al.setEnabled(true);
					al.setText("Valid");
					btnNewButton.setEnabled(true);
				}	
				else if(addr.getText().equals(""))
				{
					al.setEnabled(true);
					al.setText(" This field is Mandatory ");
				}
				else
				{
					al.setEnabled(true);
					al.setText(" INVALID !");
					btnNewButton.setEnabled(false);
				}
			}
	});
		addr.setColumns(10);
		addr.setBounds(169, 313, 325, 20);
		contentPane.add(addr);
		
		
		
		
		/* CODING FOR "PHONE NUMBER" TEXT FIELD */

		City = new JTextField();
		City.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				String PATTERN="^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
				
				Pattern p=Pattern.compile(PATTERN);
				Matcher m=p.matcher(City.getText());
				if(m.matches())
				{
					cil.setEnabled(true);
					cil.setText("Valid");
					btnNewButton.setEnabled(true);
				}
				else if(City.getText().equals(""))
				{
					cil.setEnabled(true);
					cil.setText(" This field is Mandatory ");
				}
				else	
				{
					cil.setEnabled(true);
					cil.setText(" INVALID !");
					btnNewButton.setEnabled(false);
				}
			}
	});	
		City.setColumns(10);
		City.setBounds(169, 344, 325, 20);
		contentPane.add(City);
		
		
		
		
		/* CODING FOR "PHONE NUMBER" TEXT FIELD */
		
		pnum = new JTextField();
		pnum.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent e)
			{
				String PATTERN="^(\\+92)-{0,1}\\d{2}-{0,1}\\d{8}$|^\\d{11}$|^\\d{3}-\\d{3}-\\d{4}|^02[1-9]{3}-\\d{7}|\\d{7}$";
				
				Pattern p=Pattern.compile(PATTERN);
				Matcher m=p.matcher(pnum.getText());
				if(m.matches())
				{
					pl.setEnabled(true);
					pl.setText("Valid");
					btnNewButton.setEnabled(true);
				}
				else if(pnum.getText().equals(""))
				{
					pl.setEnabled(true);
					pl.setText(" This field is Mandatory ");
				}
				else	
				{
					pl.setEnabled(true);
					pl.setText(" INVALID !");
					btnNewButton.setEnabled(false);
				}
			}
	});		
		pnum.setColumns(10);
		pnum.setBounds(169, 408, 325, 20);
		contentPane.add(pnum);
	
		
		
		
/* CODING FOR "GENDER" RADIO BUTTONS */	
		
		JRadioButton jfemale = new JRadioButton("Female");
		buttonGroup.add(jfemale);
		jfemale.setBounds(353, 205, 109, 23);
		contentPane.add(jfemale);
		
		JRadioButton jmale = new JRadioButton("Male");
		buttonGroup.add(jmale);
		jmale.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{		
			}
		});
		
		jmale.setBounds(206, 206, 109, 21);
		contentPane.add(jmale);
		
		JComboBox con = new JComboBox();
		con.setModel(new DefaultComboBoxModel(new String[] {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Anguilla", "Antigua & Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia & Herzegovina", "Botswana", "Brazil", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "China - Hong Kong / Macau", "Colombia", "Comoros", "Congo", "Congo, Democratic Republic of (DRC)", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "French Guiana", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Great Britain", "Greece", "Grenada", "Guadeloupe", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Israel and the Occupied Territories", "Italy", "Ivory Coast (Cote d'Ivoire)", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Korea, Democratic Republic of (North Korea)", "Korea, Republic of (South Korea)", "Kosovo", "Kuwait", "Kyrgyz Republic (Kyrgyzstan)", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia, Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Moldova, Republic of", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar/Burma", "Namibia", "Nepal", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pacific Islands", "Pakistan", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovak Republic (Slovakia)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Tajikistan", "Tanzania", "Thailand", "Netherlands", "Timor Leste", "Togo", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks & Caicos Islands", "Uganda", "Ukraine", "United Arab Emirates", "United States of America (USA)", "Uruguay", "Uzbekistan", "Venezuela", "Vietnam", "Virgin Islands (UK)", "Virgin Islands (US)", "Yemen", "Zambia", "Zimbabwe"}));
		con.setBounds(169, 375, 325, 22);
		contentPane.add(con);
		
	}
}