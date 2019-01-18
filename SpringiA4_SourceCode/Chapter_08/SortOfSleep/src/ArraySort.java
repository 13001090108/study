

/**
 * Created by lsc on 2018/11/9.
 */
public class ArraySort implements Runnable {
    private String num;
    public ArraySort(int num ) {
        this.num = num + "";
    }

    public static void main(String[] args) {
        //把这个数组升序输出
        int[] nums = {11, 3, 998 , 5455 , 1, 152 ,990};
        for(int i = 0 ;i < nums.length ; i++) {
            new Thread(new ArraySort(nums[i])).start();
        }
    }
    public void run() {
        try {
            Thread.sleep(Integer.parseInt(num));
            System.out.println(num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
