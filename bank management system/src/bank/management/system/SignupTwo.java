
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {
    
    
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton  syes,sno,eyes,eno;
    JComboBox religion,category,income,education,occupation;
    
    String formno;
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel rg = new JLabel("Religion:");
        rg.setFont(new Font("Raleway",Font.BOLD, 20));
        rg.setBounds(100, 140, 100, 30);
        add(rg);
        
        
        String valReligion[]={"Choose","Hindu","Muslim","Sikh","Christan","Others"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE); 
        add(religion);
        
        
        
        
        JLabel catg = new JLabel("Category:");
        catg.setFont(new Font("Raleway",Font.BOLD, 20));
        catg.setBounds(100, 190, 200, 30);
        add(catg);
        
        
        String valCategory[]={"Choose","General","SC","ST","OBC 1","OBC 2","Others"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 200, 30);
        category.setBackground(Color.WHITE); 
        add(category);
        
        JLabel inc = new JLabel("Income");
        inc.setFont(new Font("Raleway",Font.BOLD, 20));
        inc.setBounds(100, 240, 200, 30);
        add(inc);
        
        String valIncome[]={"Choose","Below 1Lakhs","1Lakhs to 5 Lakhs","5 Lakhs to 10 Lakhs","Above 10 lakhs"};
        income = new JComboBox(valIncome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE); 
        add(income);
        
        JLabel ed = new JLabel("Educational");
        ed.setFont(new Font("Raleway",Font.BOLD, 20));
        ed.setBounds(100, 305, 200, 30);
        add(ed);
        
        JLabel email = new JLabel("Qualification");
        email.setFont(new Font("Raleway",Font.BOLD, 20));
        email.setBounds(100, 325, 200, 30);
        add(email);
        
        String educationalValues[]={"Choose","No Formal Education","Primary","Seconary","Under Graduate","Graduate","Post Graduate","Doctrate"};
        education = new JComboBox(educationalValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE); 
        add(education);
        
        
        
        
        JLabel occu = new JLabel("Occupation:");
        occu.setFont(new Font("Raleway",Font.BOLD, 20));
        occu.setBounds(100, 390, 200, 30);
        add(occu);
        
        String occupationValues[]={"Choose","Self-Employed","Salaried","Bussiness Man","Student","Retired","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE); 
        add(occupation);
        
        
        
        
        JLabel panc = new JLabel("PAN Number");
        panc.setFont(new Font("Raleway",Font.BOLD, 20));
        panc.setBounds(100, 440, 200, 30);
        add(panc);
        
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        
        JLabel aadc = new JLabel("Aadhar Number");
        aadc.setFont(new Font("Raleway",Font.BOLD, 20));
        aadc.setBounds(100, 490, 200, 30);
        add(aadc);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);
        
        JLabel senc = new JLabel("Senior Citizen");
        senc.setFont(new Font("Raleway",Font.BOLD, 20));
        senc.setBounds(100, 540, 200, 30);
        add(senc);
        
        
        syes =new JRadioButton("Yes");
        syes.setBounds(300, 540,100,30);
        syes.setBackground(Color.WHITE);
        syes.setForeground(Color.BLUE);
        add(syes);
        
        sno =new JRadioButton("No");
        sno.setBounds(450, 540,100,30);
        sno.setBackground(Color.WHITE);
        sno.setForeground(Color.BLUE);
        add(sno);
        
       
        
        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(syes);
        seniorGroup.add(sno);
        
        
        JLabel exaccount = new JLabel("Existing Account");
        exaccount.setFont(new Font("Raleway",Font.BOLD, 20));
        exaccount.setBounds(100, 590, 200, 30);
        add(exaccount);
        
        eyes =new JRadioButton("Yes");
        eyes.setBounds(300, 590,100,30);
        eyes.setBackground(Color.WHITE);
        eyes.setForeground(Color.BLUE);
        add(eyes);
        
        eno =new JRadioButton("No");
        eno.setBounds(450, 590,100,30);
        eno.setBackground(Color.WHITE);
        eno.setForeground(Color.BLUE);
        add(eno);
        
       
        
        ButtonGroup eGroup = new ButtonGroup();
        eGroup.add(eyes);
        eGroup.add(eno);
        
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620, 677, 80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String rg=(String)religion.getSelectedItem();
        String catg=(String)category.getSelectedItem();
        String inc=(String)income.getSelectedItem();
        String ed=(String)education.getSelectedItem();
        String occu=(String)occupation.getSelectedItem();
        
        String senc = null;
        if(syes.isSelected()){
            senc="Yes";
        }
        
        else if(sno.isSelected()){
            senc ="No";
        }
        
        
        String exaccount = null;
        if(eyes.isSelected()){
            exaccount="Yes";
        }
        
        else if(eno.isSelected()){
            exaccount ="No";
        }
        
        String panc= panTextField.getText();
        String aadc=aadharTextField.getText();
        
        
        
        
        try{
            if(rg.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Religione is Required");
            }
            else if(catg.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Category is Required");
            }
            
            else if(panc.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Pan Number is Required");
            }
            else if(aadc.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Aadharcard is Required");
            }
            
            else{
                Conn c=new Conn();
                String query ="insert into signuptwo values('"+formno+"', '"+rg+"', '"+catg+"','"+inc+"','"+ed+"','"+occu+"','"+panc+"', '"+aadc+"', '"+senc+"', '"+exaccount+"')";
                c.s.executeUpdate(query);
                
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        } 
    }
    
    public static void main(String args[]) {
        new SignupTwo("");
        
    }
}
