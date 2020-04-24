/*while循环有一个标准格式，还有一个扩展格式


标准格式：
while(){
循环体
}

扩展格式：
        初始化语句；
         while(条件判断){
                循环体；
                步进表达式；}*/

public class Demo10While {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.println("wocuole"+i);
        }


        int i=1;//1.初始化语句
        while (i<=10){
            System.out.println("wocuole"+i);//循环体
            i++;}//步进语句

        }
    }
