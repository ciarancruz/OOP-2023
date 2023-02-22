package ie.tudublin;

public class Cat
{
	String name;
    private int numLives = 9;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Cat()
	{
	}
	
	public Cat(String name)
	{
	}

    public void kill()
    {
        if(this.numLives > 0)
        {
            this.numLives--;
            System.out.println("Ouch!");
        }
        else{
            System.out.println("Dead");
        }
        
    }
	
	public void speak()
	{
		System.out.println("Meow");
	}
}