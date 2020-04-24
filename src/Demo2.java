/*
范围小的类型 范围小的变量=（范围小的类型）范围大的数据

byte short char 这三种类型进行运算时，首先会提升为int类型，再运算
Boolen类型不能发生数据转换
ASC码表，48代表'0'  65代表'A' 97代表'a'
American Standard Code for information interchange 0-127
Unicode码表，里面包含中文
*/public class Demo2 {
    public static void main(String[] args) {
        int num=(int)100L;
        System.out.println(num);


        int num1=(int)6000000000L;//1705032704,数据溢出
        System.out.println(num1);



        int num3=(int)3.5;//3 精度损失，这不是四舍五入，是小数位被舍弃掉
        System.out.println(num3);



        char zifu1='A';
        System.out.println(zifu1+1);//字母A被当做65处理
        //计算机底层会用数字（二进制）代表A



        byte num4=40;//byte+byte-->int+int-->int
        byte num5=50;
        int result1=num4+num5;//byte 改成int
        System.out.println(result1);


        short num6=100;
        short result2=(short)(num6+num4);//int强制转化为short，必须保证逻辑上真实大小没有超过short范围
        System.out.println(result2);

        char num7='中';//20013
        System.out.println(num7+0);

    }
}
