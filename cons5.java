class cons5
{
int a,b;

cons5()	{	a=100;	b=200;	}
cons5(int a,int b){	a=a;	b=b;	}
void show()
{
System.out.println(a);	System.out.println(b);
}
public static void main(String[] args)
{
new cons5().show();
new cons5(10,20).show();
}
}