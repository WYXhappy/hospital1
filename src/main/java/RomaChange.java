public class RomaChange {
    public static void main(String[] args) {
        System.out.println(roma("LVIII"));

    }
    //从最左边 一位一位加
    public static Integer roma(String s){
        int sum = 0;
        int preNum = change(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = change(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;

    }

    public static Integer change(char c){
        switch (c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default: return 0;
        }
    }
}
