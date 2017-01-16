//import java.util.Date;
class init6
{
init6(){	System.out.println("Constructor");	}
init6(int a){	System.out.println("Constructor"+a);	}

static{	System.out.println("Static Block1");		}
static{	System.out.println("Static Block2");		}

public static void main(String[] args)
{
//System.out.println(new Date());
System.out.println("Main Block");
new init6();
new init6(100);
}
{	System.out.println("Initialization Block1");	}
{	System.out.println("Initialization Block2");	}
}