package main.code;public class StringCharRepeatingCount {

    public static void main(String[] args)
    {
        String str = "abcaaabcssddee";
//        StringBuilder sb = new StringBuilder();
//        int n= str.length();
//        char[] a = str.toCharArray();
//        for(int i=0;i<n-2;)
//        {
//            if(a[i]==a[i+1])
//            {
//                int l=i+1, count=1;
//                char k = a[i];
//                for(int j=i+1;j<n;j++)
//                {
//                    if(a[j]==k && l==j)
//                    {
//                        l++;
//                        count++;
//                    }
//                }
//                sb.append(a[i]);
//                i=i+count;
//                sb.append(count);
//            }
//            else {
//                sb.append(a[i]);
//                i++;
//            }
//        }
        StringBuilder sb = new StringBuilder();
        char prevChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == prevChar) {
                count++;
            } else {
                sb.append(prevChar);
                if (count > 1) {
                    sb.append(count);
                }
                prevChar = currentChar;
                count = 1;
            }
        }

        // Append the last character and its count
        sb.append(prevChar);
        if (count > 1) {
            sb.append(count);
        }

        System.out.println(sb.toString());
    }

}
