class init2
{
init2()
{
System.out.println("Constructor");
}
{
System.out.println("Initialization Block");
}
static
{
System.out.println("Static Block");
}
public static void main(String[] args)
{
System.out.println("Main Block");
new init2();
}
}