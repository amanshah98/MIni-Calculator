import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calci{
	JFrame f;
	JPanel p;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b1,b2,b3,b4,b5;
	Calci(){
		    class A implements ActionListener {
        @Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
        	try {
            String s1=t1.getText();
        	String s2=t2.getText();
        	int n1=Integer.parseInt(s1);
        	int n2=Integer.parseInt(s2);
            int n=n1+n2;
            l4.setText(n+"");
        	}catch (Exception ex){
        		JOptionPane.showMessageDialog(null, "Plz enter valid number");
        	}
		}
		    }
		    class B implements ActionListener {
		        @Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
		        	try {
		            String s1=t1.getText();
		        	String s2=t2.getText();
		        	int n1=Integer.parseInt(s1);
		        	int n2=Integer.parseInt(s2);
		            int n=n1-n2;
		            l4.setText(n+"");
		        	}catch (Exception ex){
		        		JOptionPane.showMessageDialog(null, "Plz enter valid number");
		        	}
				}
				    }
		    class C implements ActionListener {
		        @Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
		        	try {
		            String s1=t1.getText();
		        	String s2=t2.getText();
		        	int n1=Integer.parseInt(s1);
		        	int n2=Integer.parseInt(s2);
		            int n=n1*n2;
		            l4.setText(n+"");
		        	}catch (Exception ex){
		        		JOptionPane.showMessageDialog(null, "Plz enter valid number");
		        	}
				}
				    }
		    class D implements ActionListener {
		        @Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
		        	try {
		            String s1=t1.getText();
		        	String s2=t2.getText();
		        	int n1=Integer.parseInt(s1);
		        	int n2=Integer.parseInt(s2);
		            int n=n1/n2;
		            l4.setText(n+"");
		        	}catch (Exception ex){
		        		JOptionPane.showMessageDialog(null, "Plz enter valid number");
		        	}
				}
				    }
		    class E implements ActionListener {
		        @Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
		        	try {
		            String s1=t1.getText();
		        	String s2=t2.getText();
		        	int n1=Integer.parseInt(s1);
		        	int n2=Integer.parseInt(s2);
		            int n=n1%n2;
		            l4.setText(n+"");
		        	}catch (Exception ex){
		        		JOptionPane.showMessageDialog(null, "Plz enter valid number");
		        	}
				}
				    }
		Font font=new Font(Font.SANS_SERIF, Font.BOLD, 16);
		f=new JFrame();
		f.setSize(400,300);
		f.setTitle("Mini Calci");
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.getContentPane().setBackground(Color.YELLOW);
		p=new JPanel();
		p.setLayout(null);
		p.setBackground(Color.BLUE);
		p.setBounds(30, 30, 320, 180);
		f.add(p);
		l1=new JLabel("1st No:");
		l1.setFont(font);
		l1.setForeground(Color.WHITE);
		l1.setBounds(20, 20, 80, 30);
		p.add(l1);
		t1=new JTextField();
		t1.setFont(font);
		t1.setForeground(Color.red);
		t1.setBounds(120, 20, 150, 30);
		p.add(t1);
		
		l2=new JLabel("2st No:");
		l2.setFont(font);
		l2.setForeground(Color.WHITE);
		l2.setBounds(20, 70, 80, 30);
		p.add(l2);
		t2=new JTextField();
		t2.setFont(font);
		t2.setForeground(Color.red);
		t2.setBounds(120, 70, 150, 30);
		p.add(t2);
		b1=new JButton("+");
		b1.addActionListener(new A());
		b1.setBackground(Color.YELLOW);
		b1.setFont(font);
		b1.setBounds(20, 120, 50, 40);
		p.add(b1);
		b2=new JButton("-");
		b2.addActionListener(new B());
		b2.setBackground(Color.YELLOW);
		b2.setFont(font);
		b2.setBounds(75, 120, 50, 40);
		p.add(b2);
		b3=new JButton("*");
		b3.addActionListener(new C());
		b3.setBackground(Color.YELLOW);
		b3.setFont(font);
		b3.setBounds(130, 120, 50, 40);
		p.add(b3);
		b4=new JButton("/");
		b4.addActionListener(new D());
		b4.setBackground(Color.YELLOW);
		b4.setFont(font);
		b4.setBounds(185, 120, 50, 40);
		p.add(b4);
		b5=new JButton("%");
		b5.addActionListener(new E());
		b5.setBackground(Color.YELLOW);
		b5.setFont(font);
		b5.setBounds(240, 120, 50, 40);
		p.add(b5);
		l3 =new JLabel("Answer: ");
		l3.setFont(font);
		l3.setBounds(40, 220, 80, 30);
		f.add(l3);
		l4 =new JLabel("------------------------------------ ");
		l4.setFont(font);
		l4.setBounds(150, 220, 200, 30);
		f.add(l4);
		f.setVisible(true);
	}
}
public class MiniCalci {
	public static void main(String[] args) {
		Calci g=new Calci();
	}

}
