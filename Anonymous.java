

abstract class A
{
	public abstract void shoow();
}
//class B extends A
//{
//	public void shoow()
//	{
//		System.out.println("in b");
//	}
//}
/*now you can see that inorder to implement the abstract class we are creating
another class and overriding that and creating the object of that class and 
calling the method*/

/*SO INORDER TO IGNORE THIS WE CAN DIRECTLY USE ANONYMOUS CLASS*/
public class Anonymous {

	public static void main(String[] args) {
		
		A ob=new A()
		{
			public void shoow()
			{
				System.out.println("THE ABSTRACT METHOD IS CALLED USING  Anonymous CLASS");
			}
		};// this placing of semicolon is very important
		ob.shoow();
/*^^^^^^^^^^^^^^^^^^Implementation of Anonymous class^^^^^^^^^^^^^^^^^*/	

	}

}
