class init1
{
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
new init1();
}
}