/*
三种循环的区别：

1.for循环和while循环如果条件判断不满足，执行0次；而do while循环执行1次

2.for循环中的变量只在小括号中成立，而while循环和dowhile循环初始化语句就在外面，所以循环后可继续使用
*/
public class Demo13LoopDifference {
    public static void main(String[] args) {
        for (int i=1;i<0;i++){
            System.out.println("hello");
    }
        //System.out.println(i);已经超出for循环 无法使用
        int i=1;
        do {
            System.out.println("world");
            i++;
        }while (i<=0);
        System.out.println(i);//超出while循环，可以使用
    }


}
