
 import javax.swing.*;
 import java.awt.*;
 import java.awt.color.*;
 import java.awt.event.*;

public class PCTextField extends JTextField {
	
	PCTextField(){
		
		this.setSize(210,20);
		this.setColumns(10);
		
		
	}
/*
	public void Textchange(){
		textVaule = this.getText();
		
	}*/
	public void SetTextvaule(String str){
		this.setText(str);
		
	}
	public String GetTextvaule(){
		
		return this.getText();
	}
}

