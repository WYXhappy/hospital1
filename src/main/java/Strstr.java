public class Strstr {
    public static void main(String[] args) {

        System.out.println(strGet("hdjsdhakjj","js"));
    }

    public static int strGet(String haystack, String needle) {
        if(haystack.length()==0){
            return 0;
        }
        haystack.lastIndexOf(" ");
        if(needle.length()==0){
            return 0;
        }
        for(int i=0;i<haystack.length()-needle.length();i++){
            if(haystack.startsWith(needle, i)){
                return i;
            }
        }
        return -1;
    }
}
