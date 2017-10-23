<?php
/**
 * Created by PhpStorm.
 * User: icecream
 * Date: 2017/9/20
 * Time: 上午11:54
 */
#设置时区
ini_set('date.timezone','Asia/shanghai');

$cars=array("Volvo","BMW","Toyota");

var_dump($cars);
echo "<br>";
echo "my car is {$cars[0]} ";
echo "my son's car is $cars[1] ";
echo 'John has three cars';
echo"<br>";
#变量类型
#整数
$x = 79;
var_dump($x);
echo"    ";
$x =-34;
var_dump($x);
echo "    ";
$x=0x8c;
var_dump($x);
echo "    ";
$x=047;
var_dump($x);
echo "<br>";
#浮点数
$x = -10.38;
var_dump($x);
echo "    ";
$x= 2.4e2;
var_dump($x);
echo "    ";
$x=8E-5;
var_dump($x);
echo "<br>";
#使用null将变量清空
$x=null;
var_dump($x);
echo "<br>";
#对象
class Car{
    var $color;
    function Car($color="green"){
        $this->color = $color;
    }
    function what_color(){
        return $this->color;
    }
}
#常量
define("Car","This is a red car!",false);
echo Car;
echo "        ";
echo car;
echo "<br>";
define("Car","This is a red car!",ture);
echo Car;
echo "    ";
echo car;
echo "<br>";

define("Car","This is a red car!",false);
echo Car;
echo "    ";
echo car;
echo "<br>";

function myTest(){
    echo car;
    echo "<br>";
}
myTest();
#字符串
$txt1 ="Hello world!";
$txt2 ="What a nice day!";
echo $txt1 . $txt2;
echo "<br>";
echo 1 . 2;
echo "<br>";
echo strlen("hello world");
echo "<br>";
echo strpos("hello world!","wor"); #区分大小写
echo "<br>";
#运算符
#整除
var_dump(intdiv(10,3));
#比较运算符
echo "the result of  5 == '5' is"  ;
var_dump( 5 =="5");
echo "<br>"  ;
echo "the result of  5 === '5' is"  ;
var_dump(  5 ==="5");
echo "<br>"  ;

echo "the result of  5 != '5' is"  ;
var_dump(  5 !="5");
echo "<br>"  ;
echo "the result of  5 !== '5' is"  ;
var_dump( 5 !=="5");
echo "<br>"  ;
#数组运算符
$x =array("a"=>"red","b"=>"green");
$y = array("c"=>"blue","d"=>"yellow");
$z=$x+$y;
var_dump($z);
echo "<br>";
var_dump($x==$y);
echo "    ";
var_dump($x===$y);
echo "    ";
var_dump($x!=$y);
echo "    ";
var_dump($x<>$y);
echo "    ";
var_dump($x!==$y);
echo "<br>";
#3元运算符
$text="tony";
$name =isset($text) ? $text:'nobody';
echo $name , "<br>";
$name = $text ? : "nobody";
echo $name , '<br>';
#PHP7多了一个NULL合并运算符
$name =$_GET['user'] ?? 'nobody';//如果$_GET['user']不存在返回nobody，存在则返回$_GET['user']的值
echo $name,'<br>';
#组合比较运算符
echo 1<=>1,"    ";
echo 1<=>2,"    ";
echo 2<=>1,"<br>";

echo a<=>b,"    ";
echo a<=>A,"<br>";
#比较or 和|| 的优先级的差别
$a=3;
$b=false;
$c=$a or $b;
var_dump($c);
echo "<br>";
$d = $a || $b;
var_dump($d);
echo"<br>";

#if elseif else
$t=date( H);
echo $t,"<br>";
if($t>"10")
{
    echo "have a good morning!";
}
elseif ($t<"20")
{
    echo "have a good day!";
}
else
{
    echo "have a good night!";
}
echo "<br>";
#数组
#特殊的关联数组
$age = array("peter"=>"35","ben"=>"37","joe"=>"43");
#特殊遍历
foreach($age as $x=>$x_value)
{
    echo "Key=" . $x .",Value=" . $x_value;
    echo "<br>";
}


?>