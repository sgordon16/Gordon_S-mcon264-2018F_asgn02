
public class RandomCollectionMain {

	public static void main(String[] args) {
		
		RandomizedCollection<String> rcStrings = randomCollection("N/A", 50);
		System.out.println(rcStrings.getList().toString());
		rcStrings.add("Hello");
		System.out.println("added String \"Hello\"");
		System.out.println(rcStrings.getList().toString());
		rcStrings.overwrite("Hi!", 25);
		System.out.println("overwrote String at index 25 with \"Hi!\"");
		System.out.println(rcStrings.getList().toString());
		rcStrings.remove(25);
		System.out.println("removed Object at index 25");
		System.out.println(rcStrings.getList().toString());
		System.out.println("Random String: " + rcStrings.getRandom());
		System.out.println(rcStrings.getList().toString());
		System.out.println("Random String between index 10 and 30: " + rcStrings.getRandom(10, 30));
		RandomizedCollection<Integer> rcIntegers = randomCollection(0, 50);
		System.out.println(rcIntegers.getList().toString());
		rcIntegers.add(123);
		System.out.println("added int 123");
		System.out.println(rcIntegers.getList().toString());
		rcIntegers.overwrite(57, 25);
		System.out.println("overwrote int at index 25 with 57");
		System.out.println(rcIntegers.getList().toString());
		rcIntegers.remove(25);
		System.out.println("removed int at index 25");
		System.out.println(rcIntegers.getList().toString());
		System.out.println("Random int: " + rcIntegers.getRandom());
		System.out.println(rcIntegers.getList().toString());
		System.out.println("Random int between index 10 and 30: " +rcIntegers.getRandom(10,30));

	}
	public static <T> RandomizedCollection<T> randomCollection(T o, int x)
	{
		RandomizedCollection<T> rc = new RandomizedCollection<T>(x);
		for(int i = 0; i < x; i++)
			rc.overwrite(o, i);
		return rc;
	}

}
