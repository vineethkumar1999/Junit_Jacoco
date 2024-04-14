package main.code;

public class StringWordReverse {
    public static void main(String[] args)
    {
        String str = "Geeks Quiz Practice Code";
        StringBuilder sb = new StringBuilder();
        int endIndex = str.length();
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' ')
            {
                sb.append(str.substring(i+1,endIndex) + ' ');
                endIndex=i;
            }
        }
        sb.append(str.substring(0,endIndex));
        System.out.println(sb.toString());
    }
}
