/**
 * @author WYX
 */
public class maxBegin {
    public static void main(String[] args) {

        String[] strs={"flower","flow","flight"};
        System.out.println(getMaxBegin(strs));
    }

    public static String getMaxBegin(String[] strs){
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    String str= i==0? "输入不存在公共前缀":strs[0].substring(0,i);
                    return str;
                }
            }
        }
        return "输入不存在公共前缀";
    }
}
