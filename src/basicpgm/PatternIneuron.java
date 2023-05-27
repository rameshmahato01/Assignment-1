package basicpgm;

public class PatternIneuron {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n-1;i++)
		    {
              for(int j=1; j<=n-1;j++)
              {
                if(i==0 || i==n-1 )
                {
                  System.out.print("*");
                   
                }
                else if(j==n/2)
                {
              	   System.out.print("*");
                }

              else
              {
              	System.out.print(" ");
              }

            }
            System.out.print("  ");

            for(int j=0;j<=n;j++)
           {
             if(j==0||j==n||i==j){
              System.out.print("*");
             }else{
                  System.out.print(" ");
             }
             
            }

            System.out.print("  ");

            for(int j=0; j<=n-1; j++)
       {
            if(j==0 || i==0 ||i==n-1 || i==n/2)
                 {
                          System.out.print("*"); 
                 }
               else
               {
                System.out.print(" ");
                }
         }

         System.out.print("  ");

         for(int j=0; j<=n-1;j++)
      {
        if(j==0 || i==n-1 ||j==n-1)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }

      System.out.print("  ");

      for(int j=0; j<=n-1; j++)
              {
               if(j==0 || i==n/2 || i==0 ||(j==n-1&&i<n/2)||(i==j &&i>=n/2&&i>=n/2))
                   {
                    System.out.print("*");
                   }
                else
                   {
                    System.out.print(" ");
                   }
              }

             System.out.print("  ");
             
              for(int j=0; j<=n-1; j++)
      {
        if(i==0 || j==0 || i==n-1 || j==n-1)
        {
          System.out.print("*");  
        }
          else
          {
           System.out.print(" ");
          }
      }

      System.out.print("  ");

      for(int j=0;j<=n;j++)
           {
             if(j==0||j==n||i==j){
              System.out.print("*");
             }else{
                  System.out.print(" ");
             }
             
            } 

               System.out.println(); 
		    }



		// TODO Auto-generated method stub

	}

}
