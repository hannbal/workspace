
 import javax.swing.*;
 import java.awt.*;
 import java.awt.color.*;
 import java.awt.event.*;
 
public class PCFrame  {
	private JFrame fmain;
	private JPanel contentPane;
	

	public void makeframe(){
		
		fmain = new JFrame("土木通讯生成器v1.1");
		contentPane = new JPanel();
        contentPane.setLayout(null);
		
		fmain.setSize(1000,1000);
		
		fmain.setContentPane(contentPane);
        fmain.setVisible(true);
        fmain.setResizable(false);

    }
	public void addElements(Component obj){
		
		this.contentPane.add( obj);
	}
	
	
}
