package hw6a;
import java.util.ArrayList;
import java.util.ListIterator;

abstract class component
{
	     abstract void operation();
}

class composite extends component
{
	  ArrayList<component> list;
	  public composite()
	  {
		     list = new ArrayList<component>();
	  }
	  void addquestion(component ques)
	  {
		   list.add(ques);
	  }
	  void operation()
	  {
		   ListIterator<component> iterator = list.listIterator();
		   while(iterator.hasNext())
		   {
			     component ques = iterator.next();
			     ques.operation();
		   }
	  }
}
public class ques
{
	   public static void main(String args[])
	   {
		      //composite c = new composite("ques1");
		      component[] ques;
	   }
	   void clientop(component[] ques)
	   {
		    for(component q: ques)
		    {
		    	q.operation();
		    }
	   }
}
