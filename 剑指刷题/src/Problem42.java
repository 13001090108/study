/**
 * Created by lsc on 2019/1/18.
 * 题目一：输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
 * 为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student.",
 * 则输出"shtudent. a am I".
 */

//public class Problem42 {
//    public static void main(String[] args) {
//        Problem42 p = new Problem42();
//        String string = "I am a student.";
//        p.reverseSentence(string);
//    }
//    public void reverseSentence(String sentence) {
//        if(sentence == null)
//            return;
//        String[] str = sentence.split(" ");
//        StringBuffer sb = new StringBuffer();
//        for(int i = str.length - 1 ; i >= 0; i --) {
//            sb.append(str[i] + " ");
//        }
//        System.out.println(sb);
//    }
//}

/*
题目二：字符串的左旋操作是把字符串前面的若干个字符转移到字符串的尾部。
        请定义一个函数实现字符串左旋操作的功能。比如输入字符串"abcdefg"
        和数字2，该函数左旋转2位得到的结果"cdefgab".
 */
public class Problem42 {
    public static void main(String[] args) {
        Problem42 p = new Problem42();
        String sentence = "abcdefg";
        int index = 2;
        p.leftRotateString(sentence, index);

    }

    public void leftRotateString(String sentence , int index) {
        if(sentence == null || index > sentence.length() || index < 0) {
            return;
        }
        String[] spiltString = {sentence.substring(0 , index),sentence.substring(index , sentence.length())};
        StringBuffer stringBuffer = new StringBuffer();
        for(String string : spiltString) {
            stringBuffer.append(reverse(string));
        }
        System.out.println(reverse(stringBuffer.toString()));

    }

    public String reverse(String str) {
        char[] arrays = str.toCharArray();
        int begin = 0;
        int end = arrays.length - 1;
        while(begin < end) {
            char temp = arrays[begin];
            arrays[begin] = arrays[end];
            arrays[end] = temp;
            begin ++;
            end --;
        }
        return String.valueOf(arrays);
    }
}
