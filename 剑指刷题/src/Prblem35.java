import java.util.LinkedHashMap;

/**
 * Created by lsc on 2018/12/18.
 * 题目：在字符串中找出第一个只出现一次的字符。如果输入“abaccdeff”，则
 输出‘b’。
 */


public class Prblem35 {
    public static void main(String[] args) {
        Prblem35 p = new Prblem35();
        System.out.println(p.firstNotRepeatChar("agbaccdeff"));
    }
    public Character firstNotRepeatChar(String str) {
        if(str == null) return null;
        char[] strChar = str.toCharArray();
        LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
        for(char item : strChar) {
            map.put(item,map.getOrDefault(item , 0) + 1);
        }
        for(char key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }
        return null;
    }
}
