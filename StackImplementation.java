package Stack;

import java.util.Scanner ;
import java.util.Random ;
import java.util.ArrayList ;

public class StackImplementation
{
	int rear ;
	boolean flag1 = false ;
	int a[] ;
	
	Scanner sc = new Scanner( System.in ) ;
	Random rn = new Random() ;
	
	StackImplementation()
	{
		rear = -1 ;
		
		System.out.print("Enter the Size of Array :- ");
		a = new int[ sc.nextInt() ] ;
		
		InputMethod() ;
	}
	void InputMethod()
	{
		while( true )
		{
			System.out.println("1.Manual Input, 2.Automatic Input") ;
			int opinit = sc.nextInt() ;
			
			if( opinit == 1)
			{
				flag1 = true ;
				break ;
			}
			else if( opinit == 2)
			{
				flag1 = false ;
				break ;
			}
			else
				System.out.println("Wrong Input, Please Try Again");
		}
	}
	int Input()
	{
		if( flag1 == true)				//Manual Input
		{
			System.out.print("Enter Number :- ") ;
			return (sc.nextInt() ) ;
		}
		else							//Automatic Input
			return ( rn.nextInt(50) + 1) ;
	}
	boolean IsStackFull()
	{
		if( rear == a.length )
			return true ;
		else
			return false ;
	}
	boolean IsStackOverflow()
	{
		if(rear == -1)
			return true ;
		else
			return false ;
	}
	void Insert()
	{
		System.out.print("How Many Values You Want To Insert :- ") ;
		int op  = sc.nextInt() ;
		for( int i = 0 ; i< op ; i++)
		{
			if(IsStackFull() == false)
			{
				rear++ ;
				a[rear] = Input() ;
			}
			else
			{
				System.out.print( (i-1)+"Values Inserted" ) ;
				System.out.println("Stack OverFlow") ;
				break ;
			}
		}
	}
	void Delete()
	{
		System.out.print("How Many Values You Want To Delete :- ") ;
		int op = sc.nextInt() ;
		
		for( int i = 0 ; i< op ; i++)
		{
			if(IsStackOverflow() == false)
			{
				System.out.println("Deleted Number :- "+a[rear] ) ;
				rear-- ;
			}
			else
			{
				System.out.print( (i-1)+"Values Inserted" ) ;
				System.out.println("Stack UnderFlow") ;
				break ;
			}
		}
	}
	void Display()
	{
		if( rear == -1)
			System.out.println("No Element in Stack");
		else
		{
			for( int i = 0 ; i<=rear ; i++)
				System.out.print(a[i]+ " ") ;
			System.out.println();
		}
	}
	void UpdateByPos( int pos)
	{
		if( pos <= rear)
		{
			System.out.print("Enter New Value :- ") ;
			int data = sc.nextInt() ;
			
			a[pos] = data ;
			System.out.println("Value Updated");
		}
		else
			System.out.println("Position Not Available, Stack Length :- "+rear);
	}
	void UpdateByData( int data )
	{
		boolean flag = false ;
		
		ArrayList<Integer> indexes = new ArrayList<Integer>(0) ;
		
		for( int i = 0 ; i<=rear ; i++)
		{
			if( data == a[i])
			{
				flag = true ;
				indexes.add(i) ;
			}
		}
		if( flag == true)
		{
			System.out.print("Enter New Data :- ") ;
			int newdata = sc.nextInt() ;
			
			for( int i = 0 ; i<indexes.size() ; i++)
				a[ indexes.get(i)] = newdata ;
			
			System.out.println("Value Updated");
		}
		else
			System.out.println(data+" is not available in stack") ;
	}
	void Length()
	{
		System.out.println("Stack Length :- "+(rear+1)+" & Possible Length :- "+a.length) ;
	}
	void SetLength()
	{
		int b[] = a ;
		
		System.out.print("Enter New Length of Array :- ");
		a = new int[ sc.nextInt() ] ;
		
		for( int i = 0 ; i < 5 ; i++)
			a[i] = b[i] ;
	}
}