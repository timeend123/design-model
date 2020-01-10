package leetCodePractices.algorithms;

import java.util.LinkedList;

/**
 * @author liuyuan
 * @create 2020-01-09 10:32
 * @description 最长回文子串
 **/
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        //将字符串转成字符数组
        char[] chars = s.toCharArray();
        //记录结果
        StringBuilder result=new StringBuilder();
        //每个字符都有可能是回文子串的中间值
        for (int i = 0; i < chars.length; i++) {
            //定义中间值左边的字符位置和右边的字符位置
            int j=i,k=i;
            j--;
            k++;
            //链表用于存放回文子串
            LinkedList<Character> list=new LinkedList();
            list.add(chars[i]);
            //先取到中间部分，有可能多个值相等
            while (j>=0){
                if (chars[j]==chars[i]){
                    list.addFirst(chars[j]);
                }else{
                    break;
                }
                j--;
            }
            while (k<chars.length){
                if (chars[k]==chars[i]){
                    list.addLast(chars[k]);
                }else{
                    break;
                }
                k++;
            }
            while (j>=0&&k<chars.length){
                if (chars[j]==chars[k]){
                    list.addFirst(chars[j]);
                    list.addLast(chars[k]);
                }else{
                    break;
                }
                j--;
                k++;
            }
            if (list.size()>result.length()){
                result=new StringBuilder();
                for (Character character : list) {
                    result.append(character);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s="a";
        String result = new LongestPalindrome().longestPalindrome(s);
        System.out.println(result);
    }
}
