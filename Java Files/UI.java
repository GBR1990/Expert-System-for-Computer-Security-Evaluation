import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

import java.util.*;
import java.text.SimpleDateFormat;

import jess.JessException;
import jess.Rete;

public class UI extends JPanel
                           implements ActionListener {

    static JFrame frame;
    JLabel result;
    String currentPattern;
    static JButton b1,b2;
    static String OS;
    static Bean obj=new Bean();
    String nameStatic=null;
    public void callPattern(String[] patternExamples, JLabel patternLabel2)
    {
    	 

    	    JComboBox patternList = new JComboBox(patternExamples);
    	    patternList.addActionListener(this);
    	  /*  JLabel resultLabel = new JLabel("Rating",
    	                                   JLabel.LEADING); 
    	    
    	    result = new JLabel(" ");
    	    result.setForeground(Color.black);
    	    result.setBorder(BorderFactory.createCompoundBorder(
    	         BorderFactory.createLineBorder(Color.black),
    	         BorderFactory.createEmptyBorder(5,5,5,5)
    	         
    	         
    	         
    	    )
    	    );*/

    	    
    	    JPanel patternPanel = new JPanel();
    	    patternPanel.setLayout(new BoxLayout(patternPanel,
    	                           BoxLayout.PAGE_AXIS));
    	    patternPanel.add(patternLabel2);
    	    patternList.setAlignmentX(Component.LEFT_ALIGNMENT);
    	    patternPanel.add(patternList);

    	    JPanel resultPanel = new JPanel(new GridLayout(1, 1));
    	    //resultPanel.add(resultLabel);
    	    //resultPanel.add(result);
    	    
    	    

    	    patternPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
    	    resultPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

    	    add(patternPanel);
    	    add(Box.createRigidArea(new Dimension(0, 10)));
    	    add(resultPanel);

    	    setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

    	   // reformat();
    	    

    }
public UI(String name){
	
	if(name.equals("one"))
	{
		nameStatic=name;
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
             "Please Select","20",
             "15-20",
             "10-15",
             "6-10"
             };

    currentPattern = patternExamples[0];

JLabel patternLabel2 = new JLabel("What is the length of the password?");
callPattern(patternExamples,patternLabel2);

   }
	else if(name.equals("two"))
	{
		nameStatic="two";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","yes",
             "no"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("Is the password mixed case?");
    callPattern(patternExamples,patternLabel2);
    

   }
	else if(name.equals("three"))
	{
		nameStatic="three";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","0",
             "1-3",
             "4-6",
             ">6"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("What is the number of repeated characters?");
    callPattern(patternExamples,patternLabel2);
    
   }
	else if(name.equals("four"))
	{
		nameStatic="four";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","yes",
             "no"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("Does the password include letters, numbers and symbols?");
    callPattern(patternExamples,patternLabel2);
    
   }
	else if(name.equals("five"))
	{
		nameStatic="five";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","yes",
             "no"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("Is it a keyboard walk?");
    callPattern(patternExamples,patternLabel2);
    

   }
	else if(name.equals("six"))
	{
		nameStatic="six";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","yes",
             "no"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("Is it in the dictionary?");
    callPattern(patternExamples,patternLabel2);
    

   }
	else if(name.equals("seven"))
	{
		nameStatic="seven";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","every month",
             "1-3 months",
             "6 months",
             "> 6 months"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("How often do you reset the password?");
    callPattern(patternExamples,patternLabel2);
    
   }
	
	
	
	else if(name.equals("eight"))
	{
		nameStatic="eight";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","1",
             "2",
             ">2"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("How many users have an access to this account?");
    callPattern(patternExamples,patternLabel2);
   

   }

	else if(name.equals("nine"))
	{
		nameStatic="nine";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","Mozilla Firefox",
             "Google Chrome",
             "Internet Explorer"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("Which browser do you use?");
    callPattern(patternExamples,patternLabel2);
    

   }
	else if(name.equals("ten"))
	{
		nameStatic="ten";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","yes",
             "no"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("Is firewall installed?");
    callPattern(patternExamples,patternLabel2);
    //System.out.println("In first sysout"+nameStatic);

   }
	else if(name.equals("11"))
	{
		nameStatic="11";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","yes",
             "no"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("Are security patches installed?");
    callPattern(patternExamples,patternLabel2);
    obj.setSecurityPatches(currentPattern);

   }
	else if(name.equals("12"))
	{nameStatic="12";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","yes",
             "no"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("Do you use peer to peer transfer?");
    callPattern(patternExamples,patternLabel2);
    

   }
	
	else if(name.equals("13"))
	{nameStatic="13";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","Windows",
             "Personal","Zone Alarm","Anti Virus"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("Which firewall do you use?");
    callPattern(patternExamples,patternLabel2);
    

   }
	else if(name.equals("14"))
	{nameStatic="14";
	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    String[] patternExamples = {
    		"Please Select","Computer checks and installs automatically",
             "checks automatically and user choose what to update and what not","user visit the website and decides what to update and install"
             };

    currentPattern = patternExamples[0];
    JLabel patternLabel2 = new JLabel("Which of these do you use?");
    callPattern(patternExamples,patternLabel2);
    

   }
	
	
	
	
	
}

public static void createSecondWindow()
{
	createAndShowGUI_2();
}

private static void createAndShowGUI_2() {
    JFrame frame2 = new JFrame("Questionnaire Page 2");
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(false);
    JPanel content = new JPanel();
    JScrollPane pane = new JScrollPane(content);
    frame2.getContentPane().add(pane);
    JComponent newContentPane = new UI("eight");
    
   JComponent newContentPane_2 = new UI("nine");
    JComponent newContentPane_3 = new UI("ten");
    JComponent newContentPane_4 = new UI("11");
    JComponent newContentPane_5 = new UI("12");
    frame2.setContentPane(newContentPane);
   
   frame2.add(newContentPane_2);
    frame2.add(newContentPane_3);
    frame2.add(newContentPane_4);
    frame2.add(newContentPane_5);
    b2 = new JButton("Submit");
    b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	 
      		   submitButton();
               
                
             }
                 
     });
    
   
    frame2.add(b2);
       frame2.pack();
    frame2.setVisible(true);
}



private static void createAndShowGUI_3() {
    JFrame frame3 = new JFrame("Questionnaire Page 3");
    //frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame3.setVisible(false);
    JPanel content = new JPanel();
    JScrollPane pane = new JScrollPane(content);
    frame3.getContentPane().add(pane);
    JComponent newContentPane = new UI("13");
    
    frame3.setContentPane(newContentPane);
    frame3.pack();
    frame3.setVisible(true);
}




private static void createAndShowGUI_4() {
    JFrame frame4 = new JFrame("Questionnaire Page 4");
    //frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame4.setVisible(false);
    JPanel content = new JPanel();
    JScrollPane pane = new JScrollPane(content);
    frame4.getContentPane().add(pane);
    JComponent newContentPane = new UI("14");
    
    frame4.setContentPane(newContentPane);
    frame4.pack();
    frame4.setVisible(true);
}

public void actionPerformed(ActionEvent e) {
     
    	   {
        JComboBox cb = (JComboBox)e.getSource();
        String newSelection = (String)cb.getSelectedItem();
        currentPattern = newSelection;
        if(nameStatic.equals("one"))
        {
        	if(currentPattern.equals("20"))
        	{
        		obj.setPasswordLength(20);
        	}
        	else if(currentPattern.equals("15-20"))
        	{
        		obj.setPasswordLength(18);
        	}
        	else if(currentPattern.equals("10-15"))
        	{
        		obj.setPasswordLength(12);
        	}
        	else if(currentPattern.equals("6-10"))
        	{
        		obj.setPasswordLength(8);
        	}
        }
        else if(nameStatic.equals("two"))
        {
        	obj.setMixedCase(currentPattern);
        }
        else if(nameStatic.equals("three"))
        {
        
            if(currentPattern.equals("0"))
        	{
        		obj.setRepeatedChars(0);
        	}
        	else if(currentPattern.equals("1-3"))
        	{
        		obj.setRepeatedChars(2);
        	}
        	else if(currentPattern.equals("4-6"))
        	{
        		obj.setRepeatedChars(5);
        	}
        	else if(currentPattern.equals(">6"))
        	{
        		obj.setRepeatedChars(8);
        	}
            
        }
        else if(nameStatic.equals("four"))
        {
        	obj.setPaswdLettersNumbsSymb(currentPattern);
        }
        else if(nameStatic.equals("five"))
        {
        	obj.setPaswdKbdWalk(currentPattern);
        }
        else if(nameStatic.equals("six"))
        {
        	obj.setPaswdDictionary(currentPattern);
        }
        else if(nameStatic.equals("seven"))
        {
        	
        	 if(currentPattern.equals("every month"))
         	{
         		obj.setResetPaswd(0);
         	}
         	else if(currentPattern.equals("1-3 months"))
         	{
         		obj.setResetPaswd(2);
         	}
         	else if(currentPattern.equals("6 months"))
         	{
         		obj.setResetPaswd(6);
         	}
         	else if(currentPattern.equals("> 6 months"))
         	{
         		obj.setResetPaswd(8);
         	}
        }
        else if(nameStatic.equals("eight"))
        {
        	
            
            if(currentPattern.equals("1"))
         	{
         		obj.setNumbrUsers(1);
         	}
         	else if(currentPattern.equals("2"))
         	{
         		obj.setNumbrUsers(2);
         	}
         	else if(currentPattern.equals(">2"))
         	{
         		obj.setNumbrUsers(6);
         	}	
        }
        else if(nameStatic.equals("nine"))
        {
        	
        	
            if(currentPattern.equals("Mozilla Firefox"))
         	{
         		obj.setBrowser(1);
         	}
         	else if(currentPattern.equals("Google Chrome"))
         	{
         		obj.setBrowser(2);
         	}
         	else if(currentPattern.equals("Internet Explorer"))
         	{
         		obj.setBrowser(3);
         	}
        	
        	
        	
        	
        	//obj.setBrowser(currentPattern);
        }
        else if(nameStatic.equals("ten"))
        {
        	obj.setFirewall(currentPattern);
        	if(currentPattern.equals("yes"))
        	{
        		createAndShowGUI_3();
        	}
        	
        	
        }
        else if(nameStatic.equals("11"))
        {
        	obj.setSecurityPatches(currentPattern);
        	
        	if(currentPattern.equals("yes"))
        	{
        		createAndShowGUI_4();
        	}
        	
        	
        }
        
        else if(nameStatic.equals("12"))
        {	obj.setPeerToPeer(currentPattern);
        	
        }
        else if(nameStatic.equals("13"))
        {	obj.setFirewallName(currentPattern);
        	
        }
        else if(nameStatic.equals("14"))
        {	
            if(currentPattern.equals("Computer checks and installs automatically"))
         	{
         		obj.setSecurityPatchesOptions(1);
         	}
         	else if(currentPattern.equals("checks automatically and user choose what to update and what not"))
         	{
         		obj.setSecurityPatchesOptions(2);
                System.out.println(obj.getSecurityPatchesOptions());
         	}
         	else if(currentPattern.equals("user visit the website and decides what to update and install"))
         	{
         		obj.setSecurityPatchesOptions(3);
         	}
        }
        
        
        
        
        
    	   }
    }

   
    public static void submitButton() {
    	
    	try{
    	engine e = new engine(obj);
        e.run(obj);
    	}
    	catch(Exception e)
    	{
    		
    	}
    }

    private static void createAndShowGUI() {
        
        frame = new JFrame("Questionnaire Page 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel content = new JPanel();
        JScrollPane pane = new JScrollPane(content);
        frame.getContentPane().add(pane);
        
        JComponent newContentPane = new UI("one");
        
       JComponent newContentPane_2 = new UI("two");
        JComponent newContentPane_3 = new UI("three");
        JComponent newContentPane_4 = new UI("four");
        JComponent newContentPane_5 = new UI("five");
        JComponent newContentPane_6 = new UI("six");
        JComponent newContentPane_7 = new UI("seven");
        frame.setContentPane(newContentPane);
       
       frame.add(newContentPane_2);
        frame.add(newContentPane_3);
        frame.add(newContentPane_4);
        frame.add(newContentPane_5);
        frame.add(newContentPane_6);
        frame.add(newContentPane_7);
        b1 = new JButton("To Page 2 > ");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 
          		 
                     createSecondWindow();
                    
                 }
                     
         });
        frame.add(b1);
       
               frame.pack();
        frame.setVisible(true);
    }

    
    
    
    public static void main(String[] args) throws JessException {
    	
    	OS=System.getProperty("os.name");
    	String array[]=OS.split(" ");
    	System.out.println(array[0]);
    	obj.setOs(array[0]);
    	
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
       
    }
}