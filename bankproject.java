import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class bank implements ActionListener
{
Frame f,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
TextArea ta,ta1,ta2,ta3,ta4;
Choice c1;
PreparedStatement st;
Connection co;
ResultSet rs=null;
bank()
{

// giving memory to all frames 
f=new Frame("DASTA BANK");
f1=new Frame("WELCOME TO BANK");
f2=new Frame("ABOUT OUR BANK");
f3=new Frame("CREATE YOUR ACCOUNT");
f4=new Frame("LOG IN");
f5=new Frame("OPTIONS");
f6=new Frame("WITHDRAWAL");
f7=new Frame("DEPOSIT");
f8=new Frame("TRANSFER");
f9=new Frame("BANK BALANCE");
f10=new Frame("PROFILE");
f11=new Frame("TRANSACTION HISTORY");
f12=new Frame("LAST TRANSACTION");
f13=new Frame("TRANSACTION BETWEEN 2 DATES");
f14=new Frame("ALL TRANSACTIONS");

// giving memory to all labels
l1=new Label("DASTA BANK");
l2=new Label();
l3=new Label("NAME");
l4=new Label("AGE");
l5=new Label("EMAIL");
l6=new Label("ACCOUNT TYPE");
l7=new Label("AMOUNT");
l8=new Label("NAME");
l9=new Label("ACCOUNT_NO");
l10=new Label("ENTER AMOUNT");
l11=new Label("ENTER AMOUNT");
l12=new Label("ACCOUNT_NO.");
l13=new Label("ENTER AMOUNT");
l14=new Label("ENTER DATE AND TIME");
l15=new Label("ENTER 2ND DATE AND TIME");
l16=new Label("DATE TIME = YYYY-MM-DD HH:MM:SS");

// giving memory to all buttons
b1=new Button("NEW TO BANK");
b2=new Button("EXISTING USER");
b3=new Button("VEIW BANK");
b4=new Button("NEW ACCOUNT");
b5=new Button("CANCEL");
b6=new Button("CREATE ACCOUNT");
b7=new Button("CONFIRM");
b8=new Button("WITHDRAWAL");
b9=new Button("DEPOSIT");
b10=new Button("TRANSFER");
b11=new Button("BANK BALANCE");
b12=new Button("PROFILE");
b13=new Button("CONFIRM");
b14=new Button("CANCEL");
b15=new Button("CONFIRM");
b16=new Button("CANCEL");
b17=new Button("CONFIRM");
b18=new Button("CANCEL");
b19=new Button("TRANSACTION HISTORY");
b20=new Button("CANCEL");
b21=new Button("LAST TRANSACTION");
b22=new Button("TRANSACTION B/W 2 DATES");
b23=new Button("ALL TRANSACTIONS");
b24=new Button("GET ME THE DATA");

// giving memory to all testfields
t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
t5=new TextField();
t6=new TextField();
t7=new TextField();
t8=new TextField();
t9=new TextField();
t10=new TextField();
t11=new TextField();
t12=new TextField();

// giving memory to all choices
c1=new Choice();

// giving memory to all textareas
ta=new TextArea();
ta1=new TextArea();
ta2=new TextArea();
ta3=new TextArea();
ta4=new TextArea();

f.setVisible(true);
f.setLayout(null);

// giving the position to all labels
l1.setBounds(30,60,140,40);
l2.setBounds(10,30,290,210);
l3.setBounds(20,40,120,20);
l4.setBounds(20,80,120,20);
l5.setBounds(20,120,120,20);
l6.setBounds(20,160,120,20);
l7.setBounds(20,200,120,20);
l8.setBounds(20,40,120,20);
l9.setBounds(20,80,120,20);
l10.setBounds(20,40,120,20);
l11.setBounds(20,40,120,20);
l12.setBounds(20,40,120,20);
l13.setBounds(20,80,120,20);
l14.setBounds(20,80,200,20);
l15.setBounds(20,120,200,20);
l16.setBounds(120,40,220,20);

// giving the position to all textfeilds
t1.setBounds(140,40,120,20);
t2.setBounds(140,80,120,20);
t3.setBounds(140,120,120,20);
t4.setBounds(140,200,120,20);
t5.setBounds(140,40,120,20);
t6.setBounds(140,80,120,20);
t7.setBounds(140,40,120,20);
t8.setBounds(140,40,120,20);
t9.setBounds(140,40,120,20);
t10.setBounds(140,80,120,20);
t11.setBounds(240,80,120,20);
t12.setBounds(240,120,120,20);

// giving the position to all choices
c1.setBounds(140,160,120,20);

// giving the position to all textareas
ta.setBounds(10,40,280,150);
ta1.setBounds(10,40,280,150);
ta2.setBounds(10,40,280,150);
ta3.setBounds(10,200,440,150);
ta4.setBounds(10,40,280,150);

// giving the position to all buttons
b1.setBounds(50,140,100,20);
b2.setBounds(50,180,100,20);
b3.setBounds(50,140,100,20);
b4.setBounds(50,180,100,20);
b5.setBounds(120,260,60,20);
b6.setBounds(30,240,120,20);
b7.setBounds(30,120,90,20);
b8.setBounds(90,40,120,20);
b9.setBounds(90,80,120,20);
b10.setBounds(90,120,120,20);
b11.setBounds(90,160,120,20);
b12.setBounds(90,200,120,20);
b13.setBounds(70,100,60,20);
b14.setBounds(170,100,60,20);
b15.setBounds(70,100,60,20);
b16.setBounds(170,100,60,20);
b17.setBounds(70,120,60,20);
b18.setBounds(170,120,60,20);
b19.setBounds(50,240,180,20);
b20.setBounds(50,160,180,20);
b21.setBounds(50,40,180,20);
b22.setBounds(50,120,180,20);
b23.setBounds(50,80,180,20);
b24.setBounds(160,160,120,20);

// adding everything thing on the frames on which we want to 
f.add(l1);
f.add(b1);
f.add(b2);
f1.add(b3);
f1.add(b4);
f2.add(l2);
f2.add(b5);
f3.add(l3);
f3.add(l4);
f3.add(l5);
f3.add(l6);
f3.add(l7);
f3.add(t1);
f3.add(t2);
f3.add(t3);
f3.add(t4);
f3.add(c1);
f3.add(b6);
f4.add(l8);
f4.add(l9);
f4.add(t5);
f4.add(t6);
f4.add(b7);
f5.add(b8);
f5.add(b9);
f5.add(b10);
f5.add(b11);
f5.add(b12);
f5.add(b19);
f6.add(l10);
f6.add(t7);
f6.add(b13);
f6.add(b14);
f7.add(l11);
f7.add(t8);
f7.add(b15);
f7.add(b16);
f8.add(l12);
f8.add(l13);
f8.add(t9);
f8.add(t10);
f8.add(b18);
f8.add(b17);
f9.add(ta);
f10.add(ta1);
f11.add(b20);
f11.add(b21);
f11.add(b22);
f11.add(b23);
f12.add(ta2);
f13.add(t11);
f13.add(t12);
f13.add(l14);
f13.add(l15);
f13.add(l16);
f13.add(ta3);
f13.add(b24);
f14.add(ta4);

// adding values on the choices
c1.add("SAVINGS");
c1.add("NRI");
c1.add("SALARY");
c1.add("CURRENT");
c1.add("FIXED DEPOSIT");
c1.add("RECURRING DEPOSIT");

// setting the layout of all the frames
f1.setLayout(null);
f2.setLayout(null);
f3.setLayout(null);
f4.setLayout(null);
f5.setLayout(null);
f6.setLayout(null);
f7.setLayout(null);
f8.setLayout(null);
f9.setLayout(null);
f10.setLayout(null);
f11.setLayout(null);
f12.setLayout(null);
f13.setLayout(null);
f14.setLayout(null);

// setting the sixe of all the frames
f14.setSize(300,200);
f13.setSize(460,320);
f12.setSize(300,200);
f11.setSize(300,200);
f10.setSize(300,240);
f9.setSize(300,240);
f8.setSize(300,200);
f7.setSize(300,150);
f6.setSize(300,150);
f5.setSize(300,360);
f4.setSize(300,180);
f3.setSize(300,300);
f2.setSize(300,300);
f1.setSize(300,300);
f.setSize(300,300);

// adding Action listener to all the buttons
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
b21.addActionListener(this);
b22.addActionListener(this);
b23.addActionListener(this);
b24.addActionListener(this);

try
{
Class.forName("com.mysql.jdbc.Driver");
co=DriverManager.getConnection("jdbc:mysql://localhost:3206/bank","root","archit27nov@gmail.com");
}catch(Exception e)
{
System.out.print("conn"+e);
}
}

public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b1)
{
f1.setVisible(true);
}

else if(e.getSource()==b2)
{
f4.setVisible(true);
}

else if(e.getSource()==b3)
{
f2.setVisible(true);
}

else if(e.getSource()==b4)
{
f3.setVisible(true);
}

else if(e.getSource()==b5)
{
f2.setVisible(false);
}

else if(e.getSource()==b6)
{
try
{
String s1=t1.getText();
String s2=t2.getText();
String s3=t3.getText();
String s4=c1.getSelectedItem();
String s5=t4.getText();
st=co.prepareStatement("insert into bank(name,age,email,account_type,amount) values (?,?,?,?,?)");
st.setString(1,s1);
st.setInt(2,Integer.parseInt(s2));
st.setString(3,s3);
st.setString(4,s4);
st.setString(5,s5);
st.executeUpdate();
st.close();

st=co.prepareStatement("select * from bank where name=?");
st.setString(1,s1);
rs=st.executeQuery();
int c=0;
String s="";
while(rs.next())
{
s=s+rs.getString(1);
c=c+1;
}
if(c!=0)
JOptionPane.showMessageDialog(f3,s,"successfully created",JOptionPane.INFORMATION_MESSAGE);
f3.setVisible(false);
f1.setVisible(false);
}catch(SQLException ee)
{
System.out.print("CREATE ACCOUNT"+ee);
}
}

else if(e.getSource()==b7)
{
try
{
String s6=t5.getText();
String s7=t6.getText();
st=co.prepareStatement("select * from bank where name=? and account_no=?");
st.setString(1,s6);
st.setInt(2,Integer.parseInt(s7));
rs=st.executeQuery();
int d=0;
while(rs.next())
{
d=d+1;
}
if(d!=0)
{
JOptionPane.showMessageDialog(f4,"Sucessfully Login","welcome box",JOptionPane.INFORMATION_MESSAGE);
f5.setVisible(true);
}
else
JOptionPane.showMessageDialog(f4," Login id or Pass mismatched","sorry box",JOptionPane.ERROR_MESSAGE);
st.close();
}catch(Exception ee)
{
System.out.print("CONFIRM"+ee);
}
}

else if(e.getSource()==b8)
{
f6.setVisible(true);
}

else if(e.getSource()==b9)
{
f7.setVisible(true);
}

else if(e.getSource()==b10)
{
f8.setVisible(true);
}

else if(e.getSource()==b11)
{
f9.setVisible(true);
try
{
String s8=t6.getText();
st=co.prepareStatement("select*from bank where account_no=?");
st.setInt(1,Integer.parseInt(s8));
rs=st.executeQuery();
String s="YOUR BANK BALANCE IS ";
while(rs.next())
{
s=s+rs.getString(6);
}
ta.setText(s);
st.close();
}catch(SQLException ee)
{
System.out.print("BANK BALANCE"+ee);
}
}

else if(e.getSource()==b12)
{
f10.setVisible(true);
try
{
String s9=t6.getText();
st=co.prepareStatement("select*from bank where account_no=?");
st.setInt(1,Integer.parseInt(s9));
rs=st.executeQuery();
String s="USER PROFILE";
while(rs.next())
{
s=s+"\n"+"ACCOUNT_NO. :- "+rs.getString(1)+"\n"+"NAME :- "+rs.getString(2)+"\n"+"AGE :- "+rs.getString(3)+"\n"+"EMAIL :- "+rs.getString(4)+"\n"+"ACCOUNT_TYPE :- "+rs.getString(5);
}
ta1.setText(s);
st.close();
}catch(SQLException ee)
{
System.out.print("PROFILE"+ee);
}
}

else if(e.getSource()==b13)
{
try
{
String s9=t6.getText();
String s10=t7.getText();
st=co.prepareStatement("update bank set amount=amount-? where account_no=?");
st.setInt(1,Integer.parseInt(s10));
st.setInt(2,Integer.parseInt(s9));
st.executeUpdate();
st.close();

st=co.prepareStatement("insert into transaction(Last_transaction,account_no) values(?,?)");
int w = (-1) * (Integer.parseInt(s10));
st.setInt(1,w);
st.setInt(2,Integer.parseInt(s9));
st.executeUpdate();
JOptionPane.showMessageDialog(f6,"Sucessful","Withdrawal",JOptionPane.INFORMATION_MESSAGE);
f6.setVisible(false);
st.close();
}catch(SQLException ee)
{
System.out.print("WITHDRAWAL"+ee);
}
}

else if(e.getSource()==b14)
{
f6.setVisible(false);
}

else if(e.getSource()==b15)
{
try
{
String s11=t6.getText();
String s12=t8.getText();
st=co.prepareStatement("update bank set amount=amount+? where account_no=?");
st.setInt(1,Integer.parseInt(s12));
st.setInt(2,Integer.parseInt(s11));
st.executeUpdate();
st.close();

st=co.prepareStatement("insert into transaction(Last_transaction,account_no) values(?,?)");
int d = (+1) * (Integer.parseInt(s12));
st.setInt(1,d);
st.setInt(2,Integer.parseInt(s11));
st.executeUpdate();
JOptionPane.showMessageDialog(f7,"Sucessful","Deposit",JOptionPane.INFORMATION_MESSAGE);
f7.setVisible(false);
st.close();
}catch(SQLException ee)
{
System.out.print("DEPOSIT"+ee);
}
}

else if(e.getSource()==b16)
{
f7.setVisible(false);
}

else if(e.getSource()==b17)
{
try
{
String s13=t6.getText();
String s14=t9.getText();
String s15=t10.getText();
st=co.prepareStatement("update bank set amount=amount-? where account_no=?");
st.setInt(1,Integer.parseInt(s15));
st.setInt(2,Integer.parseInt(s13));
st.executeUpdate();
st.close();
st=co.prepareStatement("update bank set amount=amount+? where account_no=?");
st.setInt(1,Integer.parseInt(s15));
st.setInt(2,Integer.parseInt(s14));
st.executeUpdate();
st.close();

st=co.prepareStatement("insert into transaction(Last_transaction,account_no) values(?,?)");
int t1 = (-1) * (Integer.parseInt(s15));
st.setInt(1,t1);
st.setInt(2,Integer.parseInt(s13));
st.executeUpdate();
st=co.prepareStatement("insert into transaction(Last_transaction,account_no) values(?,?)");
int t2 = (+1) * (Integer.parseInt(s15));
st.setInt(1,t2);
st.setInt(2,Integer.parseInt(s14));
st.executeUpdate();
JOptionPane.showMessageDialog(f8,"Sucessful","Transfer",JOptionPane.INFORMATION_MESSAGE);
f8.setVisible(false);
st.close();
}catch(SQLException ee)
{
System.out.print("TRANSFER"+ee);
}
}

else if(e.getSource()==b18)
{
f8.setVisible(false);
}

else if(e.getSource()==b19)
{
f11.setVisible(true);
}

else if(e.getSource()==b20)
{
f11.setVisible(false);
}

else if(e.getSource()==b21)
{
f12.setVisible(true);
try
{
String s9=t6.getText();
st=co.prepareStatement("select*from transaction where account_no = ? and Date_Time = (select max(Date_Time) from transaction)");
st.setInt(1,Integer.parseInt(s9));
rs=st.executeQuery();
String s="";
while(rs.next())
{
s=s+"Transaction Date :- "+rs.getString(1)+"\n"+"Transaction Amount :- "+rs.getString(2);
}
ta2.setText(s);
st.close();
}catch(SQLException ee)
{
System.out.print("LAST TRANSACTION"+ee);
}
}

else if(e.getSource()==b22)
{
f13.setVisible(true);
}

else if(e.getSource()==b23)
{
f14.setVisible(true);
try
{
String s9=t6.getText();
st=co.prepareStatement("select*from transaction where account_no=?");
st.setInt(1,Integer.parseInt(s9));
rs=st.executeQuery();
String s="";
while(rs.next())
{
s=s+"Transaction Date :- "+rs.getString(1)+"  "+"Transaction Amount :- "+rs.getString(2)+"\n";
}
ta4.setText(s);
st.close();
}catch(SQLException ee)
{
System.out.print("ALL TRANSACTION"+ee);
}
}

else if(e.getSource()==b24)
{
try
{
String s9=t6.getText();
String s16=t11.getText();
String s17=t12.getText();
st=co.prepareStatement("select*from transaction where account_no=? and Date_Time between ? and ?");
st.setInt(1,Integer.parseInt(s9));
st.setString(2,s16);
st.setString(3,s17);
rs=st.executeQuery();
String s="";
while(rs.next())
{
s=s+"Transaction Date :- "+rs.getString(1)+"  "+"Transaction Amount :- "+rs.getString(2)+"\n";
}
ta3.setText(s);
st.close();
}catch(SQLException ee)
{
System.out.print("TRANSACTION BETWEEN 2 DATES"+ee);
}
}

}

public static void main(String ar[])
{
bank b1=new bank();
}
}