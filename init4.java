class init4
{
init4()
{
System.out.println("Constructor");
}

{	System.out.println("Initialization Block1");	}
{	System.out.println("Initialization Block2");	}
static
{	System.out.println("Static Block");		}
public static void main(String[] args)
{
System.out.println("Main Block");
new init4();
}
}