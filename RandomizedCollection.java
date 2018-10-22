import java.util.ArrayList;

public class RandomizedCollection<T> {
	
	ArrayList<T> list = new ArrayList<T>();
	
	public RandomizedCollection(int x) 
	{
		for (int i = 0; i < x; i++) 
		{
			  list.add(null);
		}
	}
	public void add(T o)
	{
		list.add(o);
	}
	public void remove(int x)
	{
		list.remove(x);
	}
	public void overwrite(T o, int x)
	{
		list.set(x, o);
	}
	public T getRandom()
	{
		return list.get((int)(Math.random() * list.size() -1));
	}
	public T getRandom(int a, int b)
	{
		return list.get(a + (int)(Math.random() * ((b - a) + 1)));
	}
	public ArrayList<T> getList()
	{
		return list;
	}
	
	
}
