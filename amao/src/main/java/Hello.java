public class Hello {
    public static void main(String[] args) {
        String str = "WE ARE HAPPY";
        System.out.println(replaceSpace(new StringBuffer(str)));
    }

    public static String replaceSpace(StringBuffer str) {
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                str.append("%20");
            } else {
                str.append(str.charAt(i));
            }
        }
        return str.toString();
    }
}
