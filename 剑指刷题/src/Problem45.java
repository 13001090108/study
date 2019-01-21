/**
 * Created by lsc on 2019/1/18.
 * 题目：0,1,...,n-1这n个数排成一个圆圈，从数字0开始从这个圆圈里删除第m个
 * 数字。求出这个圆圈里剩下的最后一个数字。
 */

/*
基础思路一：模拟链表
创新思路二：此思路略难，但是代码极为简单，实在推不出公式可以背诵
 */


public class Problem45 {
    public static void main(String[] args) {
        Problem45 p = new Problem45();
        System.out.println(p.lastRemaining(6 , 3));
    }
    public int lastRemaining(int n , int m) {
        if(n < 1 || m < 1) {
            return -1;
        }
        int last = 0;
        for(int i = 2 ; i < n; i ++) {
            last = (last + m) % i ;
        }
        return last;
    }
}

//public class Problem45 {
//    public static void main(String[] args) {
//        Problem45 p=new Problem45();
//        System.out.println(p.lastRemaining(6, 3));
//    }
//    public int lastRemaining(int n,int m){
//        if(n<1||m<1)
//            return -1;
//        int last=0;
//        for(int i=2;i<=n;i++){
//            last=(last+m)%i;
//        }
//        return last;
//    }
//}
