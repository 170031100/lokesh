public class search {
   public static void main(String args[]) 
   {
       
      int[] a = {11,25,69,87,10,72,32,44,24};
      int i,n=11;
      int t=0;
      int count=0;
      for(i=0;i<a.length;i++)
      {
          if(a[i]==n)
          {
              t=i;
              count++;
          }
          
      }  
      if(count==0)
      {
          System.out.println("-1");
      }
      else if(count>=1)
      {
          System.out.println(" "+t);
      }
    }
}