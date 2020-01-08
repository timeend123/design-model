package leetCodePractices.algorithms;

import java.util.ArrayDeque;

/**
 * @author liuyuan
 * @create 2020-01-08 15:14
 * @description 无重复最长字符串
 **/
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        //初始化最大长度为0
        int maxlength = 0;
        //用队列存放无重复子串的字符
        ArrayDeque queue=new ArrayDeque();
        for (int i = 0; i < chars.length; i++) {
            if (!queue.contains(chars[i])) {//如果队列中没有该字符，则加入字符
                queue.add(chars[i]);
            } else {//否则队列中含有该字符，则删除前面的字符，直到没有重复字符，加入新字符
                while (queue.contains(chars[i])){
                    queue.removeFirst();
                }
                queue.add(chars[i]);
            }
            if (queue.size() > maxlength) {
                maxlength = queue.size();
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int count = new LengthOfLongestSubstring().lengthOfLongestSubstring("");
        System.out.println(count);
    }
}
