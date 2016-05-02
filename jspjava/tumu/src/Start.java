
import java.util.*;

import java.applet.*;
import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;

public class Start{
	public static void main(String agrs[])  {
		String title1 ="摘要";
		String title2 = "主要内容";
		PCTextarea title1_list = new PCTextarea();
		PCTextarea title2_list = new PCTextarea();
		String file = "\test.txt";
        IOstream readAndwrite = new IOstream();      
        String response = "";
		PCFrame mainframe = new PCFrame();
		
		JFrame framecode = new JFrame();
		framecode.setSize(500, 500);
		framecode.setResizable(false);
		framecode.setVisible(false);
		PCTextarea finallylist = new PCTextarea();
		framecode.add(finallylist);
		
		PCButton buttonStart = new PCButton("生成代码");
		buttonStart.setLocation(800, 700);
        //PCButton buttonSave =new PCButton("保存");
        //buttonSave.setLocation(900, 700);
		
        PCLabel  labe_1 = new PCLabel("主标题1");
		labe_1.setLocation(5, 5);
		PCTextField  text_1 = new PCTextField();
//		JCheckBox checktt1 = new JCheckBox("修改",false);
//		checktt1.setLocation(100,100);
	
		text_1.setLocation(120, 5);
		text_1.SetTextvaule(title1);
		title1_list.setLocation(10, 30);
		
		
		PCLabel  labe_2 = new PCLabel("主标题2");
		labe_2.setLocation(10, 335);
		PCTextField  text_2 = new PCTextField();
		text_2.setLocation(100,335);
		text_2.SetTextvaule(title2);
		
		PCLabel labe_2_1 = new PCLabel("副标题2-1");
		labe_2_1.setLocation(10, 365);
		PCTextField text_2_1 =new PCTextField();
		text_2_1.setLocation(100, 365);
		text_2_1.SetTextvaule("国家、教育部、上海市有关教学文件");
		title2_list.setLocation(10, 395);
		
		PCLabel labe_2_2 =new PCLabel("副标题2-2");
		labe_2_2.setLocation(430,5);
		PCTextField text_2_2 = new PCTextField();
		text_2_2.setLocation(530, 5);
		text_2_2.SetTextvaule("同济大学有关教学文件");
		PCTextarea title3_list = new PCTextarea();
		title3_list.setLocation(430, 30);
        
		PCLabel labe_2_3 = new PCLabel(" 副标题2-3");
        labe_2_3.setLocation(430, 335);
        PCTextField text_2_3 = new PCTextField();
        text_2_3.setLocation(530, 335);
        text_2_3.SetTextvaule("土木工程学院有关教学文件");
        PCTextarea title4_list = new PCTextarea();
        title4_list.setLocation(430,365);
		
        PCLabel label_picadd = new PCLabel("首行图片地址");
        PCTextField text_picadd =new PCTextField();
        text_picadd.SetTextvaule("https://mail.tongji.edu.cn/coremail/s?func=mbox:getMessageData&sid=CAHMcBOOgezosScPYeOOekDlaitfsbCb&mid=1:1tbiAQAAD1H6Mp1ZuwAAso&part=3");
        label_picadd.setBounds(430, 680, 100, 20);
        text_picadd.setLocation(530, 680);
        PCTextField text_time = new PCTextField();
        text_time.setLocation(750,5);
        text_time.SetTextvaule("2016年第1期");
        
        
        mainframe.makeframe();
        mainframe.addElements(labe_1);
        mainframe.addElements(text_1);
        mainframe.addElements(title1_list);
//        mainframe.addElements(checktt1);
        
        mainframe.addElements(labe_2);
        mainframe.addElements(text_2);
        mainframe.addElements(labe_2_1);
        mainframe.addElements(text_2_1);
        mainframe.addElements(title2_list);
        
        mainframe.addElements(labe_2_2);
        mainframe.addElements(text_2_2);
        mainframe.addElements(title3_list);
        

        mainframe.addElements(labe_2_3);
        mainframe.addElements(text_2_3);
        mainframe.addElements(title4_list);
        mainframe.addElements(label_picadd);
        mainframe.addElements(text_picadd);
        mainframe.addElements(text_time);
        
        mainframe.addElements(buttonStart);
       // mainframe.addElements(buttonSave);
        
        codes pagecode = new codes();
        
        
        buttonStart.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e){        		
        		String tmp,tmp2;
        		pagecode.setpicadd(text_picadd.getText());
        		pagecode.setdate(text_time.getText());
        		
        		tmp =pagecode.makecodes(1,text_1.getText())+ makebody(pagecode,title1_list)+"</div>";
        		tmp = tmp +pagecode.makecodes(1,text_2.getText())+pagecode.makecodes(2,text_2_1.getText());
        		
        		tmp2 = makebody(pagecode,title2_list);
        		tmp = tmp+"<ul type=\"1\">"+ tmp2 +"</ul>";
        		
        		tmp = tmp +pagecode.makecodes(2, text_2_2.getText());
                tmp2 = makebody(pagecode,title3_list);    		
        		tmp = tmp+"<ul type =\"1\">"+tmp2+"</ul>";
                
        		tmp = tmp +pagecode.makecodes(2, text_2_3.getText());
                tmp2 = makebody(pagecode,title4_list);    		
        		tmp = tmp+"<ul type =\"1\">"+tmp2+"</ul>"+"</div>";
        				
                pagecode.setbody(tmp);
                pagecode.setpage();
                finallylist.setText( pagecode.getpage());
                framecode.setVisible(true);
                framecode.show();
        	}
        	
        });
        
        
       
        
	}

	public static String makebody(codes code,PCTextarea area){		  
		String[] lineString =area.getText().split("\n");
        String tmp="";
        for(int i = 0;i<lineString.length;i++){
        	tmp = tmp+code.makecodes(0, lineString[i].toString());
        }
        tmp = tmp +"</ul>";
        return tmp;
	}
	
	
	

}