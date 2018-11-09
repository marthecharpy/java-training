package exercices;

public class Person {

	private String name;
	private int age;
	private boolean wilder;

   public Person (String name, int age)
   {
   		this.name=name;
   		this.age=age;
   }

   public String getName () 
   {
   		return this.name;
   }

   public void setName(String name)
   {
   		this.name=name;
   }

   public int getAge()
   {
   		return this.age;
   }

   public void setAge (int age)
   {
   		this.age=age;
   }

   public boolean isWilder()
   {
   		return this.wilder;
   }

   public void setWilder(boolean wilder)
   {
   		this.wilder=wilder;
   }

   public String whoAmI()
   {
   	return "My name is " + this.name + " and I'm " + this.age;
   }
   
   public Person ()
   {
    }


}
 
