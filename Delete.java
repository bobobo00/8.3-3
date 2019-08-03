package day13;

/**
 * @ClassName Delete
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/3 22:41]
 * @Version 1.0
 **/

public class Delete {
    public static void main(String[] args) {
        String s1="They are students";
        String s2="aeiou";
        int len=s1.length();
        int num=0;
        char[] arr=s1.toCharArray();
        for (int i = 0; i <s2.length() ; i++) {
            char temp=s2.charAt(i);
            for(int j=0;j<len;j++){
                char c=arr[j];
                if(temp==c){
                    arr[j]='*';
                }
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]=='*'){
                if(i==arr.length-1){
                    arr[i]=' ';
                    num++;
                    continue;
                }
                int temp=i;
                while(temp<arr.length-1){
                    arr[temp]=arr[temp+1];
                    temp++;
                }
                num++;
            }
        }
        s1="";
       for(int i=0;i<arr.length-num;i++){
            s1+=arr[i];
       }
        System.out.printf("%s",s1);
    }

}
