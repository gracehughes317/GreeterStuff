package greeterProj;

public class Greeter {
private String name;
private int age;

public Greeter()
{
name = "Just a dude bro";
age=420;
}
	
public Greeter(String xname, int xage)
	
{
name = xname;
age = xage;
}
	

public String toString()
{
return "Name: "+name+". Age: "+ age;	
}



}
