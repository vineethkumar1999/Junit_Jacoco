package main.code;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"Vineeth", "eeth", "eth", "th" };
        int len = arr[0].length();
        String search = "";
        for (String i : arr) {
            if (i.length() < len) {
                search = i;
                len = i.length();
            }
        }
        int k =0;
        while(len>0 && k<arr.length) {
            if (!arr[k].contains(search)) {
                search = search.substring(0, len - 1);
                len = len-1;
                k=0;
                continue;
            }
            k++;
        }
        if(search.isEmpty())
            System.out.println("No common matching string found");
        System.out.println(search);
    }

}
