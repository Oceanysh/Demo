/*
break关键字的用途有两种：
1.switch语句中，一旦执行，整个switch语句立刻结束
2.循环语句中，一旦执行，循环结束



关于循环的选择：如果循环次数确定用for循环，否则用while循环
*/




public class Demo15Break {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if (i==4){
                break;
            }
            System.out.println(i);
        }
    }
}
