class cons4
{
int a,b;

{	show();		a=10;	b=20;	}
cons4()	{show();	a=100;	b=200;	}

void show()
{	System.out.println(a);	System.out.println(b);	}

public static void main(String[] args)
{
cons4 cs=new cons4();
cs.show();
}
}