import java.util.*;
public class Zero
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String[] str=s.nextLine().split("");
        int []arr=new int[str.length];
        for(int i=0;i<arr.length;i++)
        {
        arr[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        for(int j=0;j<arr.length-n;j++)
        {
            System.out.print(arr[j]+"");
        }
}
}
