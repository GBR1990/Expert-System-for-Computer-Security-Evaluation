import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import jess.JessException;
import jess.Rete;
import jess.WorkingMemoryMarker;


public class engine extends JPanel{

	private Rete engine;
	private WorkingMemoryMarker marker;
	 static JFrame frame;
	 static String s1=null,s2=null,s3=null,s4=null,s5=null,s6=null,s7=null,s8=null,s9=null,s10=null,s11=null,s12=null,s13=null,s14=null,s15=null;
	static Bean bean=new Bean();
	public engine(String name1,String name2,String name3,String name4,String name5,String name6,String name7,String name8,String name9,String name10,String name11,String name12,String name13,String name14,String name15,String meth)
	{	   if(name1.equals("one"))
    		{
    	    	if(bean.getPasswordLength()==100)
    	    	{
    	    		s1="High";
    	    		
    	    	}
    	    	else if(bean.getPasswordLength()==80)
    	    	{
    	    		s1="Moderate";
    	    	}
    	    	else if(bean.getPasswordLength()==60)
    	    	{
    	    		s1="Low";
    	    	}
    	    	else
    	    	{
    	    		s1="Very low";
    	    	}
    	   }
		if(name2.equals("two"))
		{
			if(bean.getMixedCase().equals("100"))
			{
				s2="High";
				
			}
			else if(bean.getMixedCase().equals("50"))
			{
				s2="Low";
			}
				   }
		if(name3.equals("three"))
		{	if(bean.getRepeatedChars()==100)
			{
				s3="Very high";
			}
			else if(bean.getRepeatedChars()==80)
			{
				s3="High";
			}
			else if(bean.getRepeatedChars()==60)
			{
				s3="Moderate";
			}
			else if(bean.getRepeatedChars()==40)
			{
				s3="Low";
			}
	   }
		if(name4.equals("four"))
		{	if(bean.getPaswdLettersNumbsSymb().equals("100"))
			{
				s4="High";
			}
			else if(bean.getPaswdLettersNumbsSymb().equals("50"))
			{
				s4="Low";
			}
		
	   }
		if(name5.equals("five"))
		{	if(bean.getPaswdKbdWalk().equals("100"))
			{
				s5="High";
			}
			else if(bean.getPaswdKbdWalk().equals("50"))
			{
				s5="Low";
			}
		   }
		if(name6.equals("six"))
		{	if(bean.getPaswdDictionary().equals("100"))
			{
				s6="High";
			}
			else if(bean.getPaswdDictionary().equals("50"))
			{
				s6="Low";
			}
	    	   }
		if(name7.equals("seven"))
		{	if(bean.getResetPaswd()==100)
			{
				s7="High";
			}
			else if(bean.getResetPaswd()==80)
			{
				s7="Moderate";
			}
			else if(bean.getResetPaswd()==60)
			{
				s7="Low";
			}
			else if(bean.getResetPaswd()==40)
			{
				s7="Very low";
			}
	
	    
	   }
		if(name8.equals("eight"))
		{	if(bean.getNumbrUsers()==100)
			{
				s8="High";
			}
			else if(bean.getNumbrUsers()==75)
			{
				s8="Moderate";
			}
			else if(bean.getNumbrUsers()==50)
			{
				s8="Low";
			}
		    	   }

		if(name9.equals("nine"))
		{	if(bean.getBrowser()==100)
			{
				s9="High";
			}
			else if(bean.getBrowser()==75)
			{
				s9="Moderate";
			}
			else if(bean.getBrowser()==50)
			{
				s9="Low";
			}
	
	    	   }
		if(name10.equals("ten"))
		{	
				if(bean.getFirewall().equals("100"))
				{
					s13="Very high";
				}
				else if(bean.getFirewall().equals("80"))
				{
					s13="High";
				}
				else if(bean.getFirewall().equals("60"))
				{
					s13="Moderate";
				}
				else if(bean.getFirewall().equals("40"))
				{
					s13="Low";
				}
				else if(bean.getFirewall().equals("0"))
				{
					s13="Very low";
				}
		    	   
	
	    	   }
		if(name11.equals("11"))
		{    	  if(bean.getSecurityPatches().equals("100"))
		    	  {
		    		  s14="High";
		    	  }
		    	  else if(bean.getSecurityPatches().equals("75"))
		    	  {
		    		  s14="Moderate";
		    	  }
		    	  else if(bean.getSecurityPatches().equals("50"))
		    	  {
		    		  s14="Low";
		    	  }
		    	  else if(bean.getSecurityPatches().equals("0"))
		    	  {
		    		  s14="Very low";
		    	  }
		   }
		if(name12.equals("12"))
		{	if(bean.getPeerToPeer().equals("100"))
			{
				s12="High";
			}
			else if(bean.getPeerToPeer().equals("50"))
			{
				s12="Low";
			}
	    	   }
		
		if(name15.equals("15"))
		{
			if(bean.getOs().equals("100"))
			{
				s15="High";
			}
			else if(bean.getOs().equals("75"))
			{
				s15="Moderate";
			}
			else if(bean.getOs().equals("50"))
			{
				s15="Low";
			}
			
		}
			    	   JPanel patternPanel1 = new JPanel();
				patternPanel1.setLayout(new BoxLayout(patternPanel1,
		                BoxLayout.PAGE_AXIS));
				
		
				JTextArea textArea1 = new JTextArea();
				textArea1.setEditable(false);
				textArea1.setWrapStyleWord(true);
				textArea1.setOpaque(false);
				
				textArea1.setBorder(BorderFactory.createEmptyBorder());
				add(textArea1, BorderLayout.CENTER);
				if(meth.equals("1"))
				{
				textArea1.append("The length of your password is: "+ s1 +"\n The case strength of your password is: "+ s2+"\n The number of repeated character strength is: "+s3+"\n The symbol variation strength is: "+s4+"\n The keyboard walk strength: "+s5+ "\n Predictability based on dictionary: "+s6+"\n Resetting strength: "+s7+"\n Security based on the number of users: "+s8+"\n Browser strength: "+s9+"\n Peer to peer transfer strength: "+s12+"\n Choice of firewall strength: "+s13+"\n Choice of patch strength: "+s14+"\n Operating System strength is: "+s15);
				}
				else
				{String t1=null,t2=null,t3=null,t4=null,t5=null,t6=null,t7=null,t8=null,t9=null,t10=null,t11=null,t12=null,t13=null;
					if(s1.equals("High"))
					{
						t1="The length of your password does not need any change";
					}
					else
					{
						t1="The length of your password should be increased to 20";
					}
					if(s2.equals("High"))
					{
						t2="The case strength of your password does not need any change";
					}
					else
					{
						t2="Your password needs to be mixed case";
					}
					if(s3.equals("High"))
					{
					t3="The number of repeated character strength does not need any change";	
					}
					else
					{
						t3="Decrease the number of characters to 0";
					}
					if(s4.equals("High"))
					{
						t4="The symbol variation strength need not be changed";
					}
					else
					{
						t4="Please include numbers,letters and symbols";
					}
					if(s5.equals("High"))
					{
						t5="The keyboard walk strength need not be changed";
					}
					else
					{
						t5="Please avoid keyboard walk passwords";
					}
					if(s6.equals("High"))
					{
						t6="Predictability based on dictionary need not be changed";
					}
					else
					{
						t6="Please avoid words taken from the dictionary";
					}
					if(s7.equals("High"))
					{
						t7="You are resetting the password at a good interval";
					}
					else
					{
						t7="Please reset your password more frequently";
					}
					if(s8.equals("High"))
					{
						t8="Security based on the number of users does not need to be changed";
					}
					else
					{
						t8="Please decrease the number of users sharing the password";
					}
					if(s9.equals("High"))
					{
						t9="The browser you are using does not need to be changed";
					}
					else
					{
						t9="Please choose a more secure browser such as Firefox";
					}
					if(s12.equals("High"))
					{
						t10="Peer to peer transfer has already been avoided by you";
					}
					else
					{
						t10="Please avoid peer to peer transfer";
					}
					if(s13.equals("High"))
					{
						t11="Your firewall strength does not need any improvement";
					}
					else
					{
						t11="Your firewall is weak please use a Windows Firewall";
					}
					if(s14.equals("High"))
					{
						t12="Security patch updating does not need any change";
					}
					else
					{
						t12="Please use the system to check automatically and let yourself choose what to update and what not";
					}
					if(s15.equals("High"))
					{
						t13="Your operating system has good security";
					}
					else
					{
						t13="Please note that Windows is a more secure operating system";
					}
					textArea1.append(t1+"\n"+t2+"\n"+t3+"\n"+t4+"\n"+t5+"\n"+t6+"\n"+t7+"\n"+t8+"\n"+t9+"\n"+t10+"\n"+t11+"\n"+t12+"\n"+t13);
				}
				patternPanel1.add(textArea1);
				patternPanel1.setAlignmentX(Component.LEFT_ALIGNMENT);
	    	    add(patternPanel1);
	}
	
	
	public static void createSecondWindow()
	{
		createAndShowGUI_2();
	}
	
	
	private static void createAndShowGUI_2() {
		  frame = new JFrame("Final recommendation");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JPanel content = new JPanel();
	        JScrollPane pane = new JScrollPane(content);
	        frame.getContentPane().add(pane);
	        
	        JComponent newContentPane = new engine("one","two","three","four","five","six","seven","eight","nine","ten","11","12","13","14","15","2");
	     
	        frame.setContentPane(newContentPane);
	               frame.pack();
	        frame.setVisible(true);
	}




	
	
	
	 
	private static void createAndShowGUI() {
	        
	        frame = new JFrame("Analysis based on user input");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JPanel content = new JPanel();
	        JScrollPane pane = new JScrollPane(content);
	        frame.getContentPane().add(pane);
	        
	        JComponent newContentPane = new engine("one","two","three","four","five","six","seven","eight","nine","ten","11","12","13","14","15","1");
	     
	        frame.setContentPane(newContentPane);
	       
	        JButton b1 = new JButton("Recommendations");
	        b1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	 
	          		   
	                     createSecondWindow();
	                    
	                 }
	                     
	         });
	        frame.add(b1);
	       
	       
	               frame.pack();
	        frame.setVisible(true);
	    }
	
	
	public engine(Bean b ) throws JessException {
		bean=b;
		engine = new Rete();
		engine.reset();


		engine.batch("rules.clp");
		engine.executeCommand("(assert(passwordLength (value "+bean.getPasswordLength()+")))");
		
		engine.executeCommand("(assert(mixedChoice (value "+bean.getMixedCase()+")))");
		engine.executeCommand("(assert(repeatedcharacters (value "+bean.getRepeatedChars()+")))");
		engine.executeCommand("(assert(letnumsyb (value "+bean.getPaswdLettersNumbsSymb()+")))");
		engine.executeCommand("(assert(keyboardwalk (value "+bean.getPaswdKbdWalk()+")))");
		engine.executeCommand("(assert(dictionary (value "+bean.getPaswdDictionary()+")))");
		engine.executeCommand("(assert(resetpassword (value "+bean.getResetPaswd()+")))");
		engine.executeCommand("(assert(totalusers (value "+bean.getNumbrUsers()+")))");
		engine.executeCommand("(assert(browser (value "+bean.getBrowser()+")))");
		engine.executeCommand("(assert(firewall (value "+bean.getFirewall()+")))");
		engine.executeCommand("(assert(firewalltypes (value "+bean.getFirewallName()+")))");
		
		engine.executeCommand("(assert(securitypatches (value "+bean.getSecurityPatches()+")))");
		engine.executeCommand("(assert(securitytypes (value "+bean.getSecurityPatchesOptions()+")))");
		
		
		engine.executeCommand("(assert(peertopeer (value "+bean.getPeerToPeer()+")))");
		engine.executeCommand("(assert(osname (value "+bean.getOs()+")))");
	
	
	marker = engine.mark();

}

public void run(Bean bean) throws JessException {
	engine.resetToMark(marker);
	engine.run();
	
	

	bean.setPasswordLength(Integer.parseInt(engine.getGlobalContext().getVariable("*pwdValue*").stringValue(null)));


	bean.setMixedCase((engine.getGlobalContext().getVariable("*mixedChoice*").stringValue(null)));

	bean.setRepeatedChars(Integer.parseInt(engine.getGlobalContext().getVariable("*repeatedchar*").stringValue(null)));

	bean.setPaswdLettersNumbsSymb(engine.getGlobalContext().getVariable("*lns*").stringValue(null));

	bean.setPaswdKbdWalk(engine.getGlobalContext().getVariable("*keybwalk*").stringValue(null));

	bean.setPaswdDictionary(engine.getGlobalContext().getVariable("*dictpass*").stringValue(null));

	bean.setResetPaswd(Integer.parseInt(engine.getGlobalContext().getVariable("*resetp*").stringValue(null)));

	bean.setNumbrUsers(Integer.parseInt(engine.getGlobalContext().getVariable("*usercount*").stringValue(null)));
	

	bean.setBrowser(Integer.parseInt(engine.getGlobalContext().getVariable("*browsername*").stringValue(null)));
	
	

	bean.setFirewall(engine.getGlobalContext().getVariable("*firewallchoice*").stringValue(null));

	String spatch = engine.getGlobalContext().getVariable("*spatches*").stringValue(null);

	bean.setSecurityPatches(spatch);
	System.out.println(" val "+spatch);
			bean.setPeerToPeer(engine.getGlobalContext().getVariable("*ptop*").stringValue(null));
	
	

	bean.setOs(engine.getGlobalContext().getVariable("*oname*").stringValue(null));
	
	
	double passwordTotal= (0.1*bean.getPasswordLength())
	+(0.1*Integer.parseInt(bean.getMixedCase()))
	+ (0.1*(bean.getRepeatedChars()))
	+ (0.1*Integer.parseInt(bean.getPaswdLettersNumbsSymb()))
	+ (0.2*Integer.parseInt(bean.getPaswdKbdWalk()))
	+ (0.2*Integer.parseInt(bean.getPaswdDictionary()))
	+ (0.1*(bean.getResetPaswd()))
	+ (0.1*(bean.getNumbrUsers()));



	
	
	double systemStrength=(0.75*Integer.parseInt(bean.getFirewall())+(0.25*Integer.parseInt(bean.getSecurityPatches())));
	
	
	
	javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            createAndShowGUI();
        }
    });
	
	
	
}
}