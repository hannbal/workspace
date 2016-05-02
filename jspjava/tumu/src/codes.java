
public class codes {

	private String strbeforedate ="<style type=\"text/css\">div{    width: 700px;    padding: 0px;    border:3px solid #a40000;    border-radius: 5px;}.head{    color: #a40000;    font:22px 黑体,sans-serf;    font-weight:bold;    text-align: right ;    text-shadow: 2px 2px 2px #aeaeae;}.bt{    background: #ffcef4;    border-top: hidden;    font:25px 宋体,sans-serf;    font-weight: bold;    height: 70px;}.bt span{    text-shadow: 2px 2px 2px #aeaeae;}.nr{    border-top-width: 1px;    font: 20px 黑体,sans-serf;    font-weight:bold;    line-height: 25px;}.nr ul{    text-shadow: 2px 2px 2px #aeaeae;}.nr ul ul li{    font-family: 宋体;    font-size: 16px;    font-weight:normal;    text-shadow:none;}.bz{    border-top-width: 1px;    background: #ffcef4;    color: #244fff;    height: 150px;}    </style><div class=\"head\">  "+
	"<span style=\"margin-right: 10px;\">";
	private String date="2016年第1期";
	private String strafterdate ="</span></div>";
	private String strhead="";
	private String strbody = "";
	private String picadd="<img src=\"https://mail.tongji.edu.cn/coremail/s?func=mbox:getMessageData&sid=CAHMcBOOgezosScPYeOOekDlaitfsbCb&mid=1:1tbiAQAAD1H6Mp1ZuwAAso&part=3\">";
	                               // https://mail.tongji.edu.cn/coremail/s?func=mbox:getMessageData&sid=CAHMcBOOgezosScPYeOOekDlaitfsbCb&mid=1:1tbiAQAAD1H6Mp1ZuwAAso&part=3
	private String lastpart="<div class=\"bz\">    <ul>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <li>请到<font color=\"#ff0000\"><a href=\"mailto:civiledu@163.com\" target=\"_blank\">civiledu@163.com</a></font>（密码<font color=\"#ff0000\">tm65982402</font>）查看土木工程学院教学文件。</li></ul><p><br></p><ul>    <li> 如有任何教学问题，联系学院教务科65982402.</li>    </ul></div>";
	private String page;
	
	public void setpicadd(String str){
		picadd = "<img src=\""+str+"\">";
	}
	public String setpage(){
		page = strhead +strbody+lastpart;
		System.out.println(page);
		return page;
	}
	public void setdate(String str){
		date =str;
		strhead = strbeforedate+picadd +date +strafterdate;
		
	}
	
	public void setbody(String str){
		strbody = str;
	}
	public String getpage(){
		return page;
	}

	public String makecodes(int a ,String str){
		if (a==1){
			str = "<div class=\"bt\">   <span style=\"font-family: 宋体;\"><br>"+str+"</span></div><div class=\"nr\"> ";
			return str;
		}
		else if (a == 2){
			str = "<br><ul type=\"1\"><li>"+str+"</li>";
			return str;
		}
		else{
			str = "<li>"+str +"</li>";
			return str;
		}
	}
}
