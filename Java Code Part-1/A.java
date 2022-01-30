// program not runned successfully 1:error {A is not abstract and does not override abstract method getValue() in cInterface}
class B{
   public void getValueB(){}
}

class C{
   public void getValue(){}
}


interface cInterface{
   public void getValue();
}

class cChild extends C implements cInterface{
    public void getValue(){
		System.out.println("Hello");
	}
}


// Below code is **like** class A extends B, C 
class A extends B implements cInterface
{
	public static void main(String args[])
	{
		 cInterface child =  new cChild();
         child.getValue();	
	}
}