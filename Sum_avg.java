import java.util.Scanner;
public class Sum_avg
{
    public static void main(String[] args) 
    {
        int n, sum = 0,avg;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        avg=sum/n ;
        System.out.println("Sum: "+sum);
        System.out.println("Avg:"+avg);
    }
}