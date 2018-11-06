package Stack;

import java.util.Scanner ;

public class StackFunctionCalling
{
	StackFunctionCalling()
	{
		StackImplementation si = new StackImplementation() ;
		Scanner sc = new Scanner( System.in ) ;
		
		while( true )
		{
			System.out.print("1.Insert, 2.Delete, 3.Update, 4.Display, 5.Stack Length, 6.Set Stack Length, 7.Exit :- ") ;
			int op = sc.nextInt() ;
			
			if( op == 1)
				si.Insert() ;
			
			else if( op == 2)
				si.Delete() ;
			
			else if( op == 3)
			{
				System.out.print("Update By :- 1.Position, 2. Data") ;
				int opupdate = sc.nextInt() ;
				
				if( opupdate == 1)
				{
					System.out.print("Enter Position :- ") ;
					si.UpdateByPos( sc.nextInt() ) ;
				}
				else if( opupdate == 2)
				{
					System.out.print("Enter Data :- ") ;
					si.UpdateByData( sc.nextInt() ) ;
				}
				else
					System.out.println("Wrong INput, Please Try Again");
			}
			
			else if( op == 4)
				si.Display() ;
			
			else if( op == 5)
				si.Length() ;
			
			else if( op == 6)
				si.SetLength() ;
			
			else if( op == 7)
				break ;
			
			else
				System.out.println("wrong Input, Please Try Again") ;
		}
	}
}
