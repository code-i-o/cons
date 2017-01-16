class init5
{
init5()
{	System.out.println("Constructor");	}

{	System.out.println("Initialization Block1");	}
{	System.out.println("Initialization Block2");	}
static
{	System.out.println("Static Block1");		}
static
{	System.out.println("Static Block2");		}

public static void main(String[] args)
{
System.out.println("Main Block");
init5 ob1=new init5();
init5 ob2=new init5();
}
}