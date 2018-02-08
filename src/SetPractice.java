import java.util.*;

/**
 * Practice using a Set.
 */
public class SetPractice {

	/**
	 * Add zero or more items to the set, and print what is being added.
	 * @parameter set is the Set to add items to
	 * @parameter values zero or more Strings to add to set
	 */
	public static void addAll(Set<String> set, String ...values) {
		// add all the values to the set. 
		// print each one as you add it
		System.out.println("{ ");
		for(String s : values){
			set.add(s);
			System.out.print(s + " ");
		}
		System.out.println("}");
	}
	
	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	public static void print(Collection<String> set) {
		// create an Iterator using set.iterator()
		// then use the iterator to print everything in the set
		Iterator<String> iterator = set.iterator();
		System.out.print("( ");
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println(" )");
	}
	
	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer( ) {
		
		HashSet<String> hashSet = new HashSet<String>();
		System.out.println("Using HashSet");
		setCollection(hashSet);

		TreeSet<String> treeSet = new TreeSet<String>();
		System.out.println("Using TreeSet");
		setCollection(treeSet);

		System.out.println("Using TreeSet with a Comparator");
		Comparator<String> comparator = new StringComparator();
		TreeSet<String> treeSet1 = new TreeSet<String>();
		setCollection(treeSet1);

	}

	public static void setCollection(Collection<String> collection){
		System.out.println("----------------------");

		collection.add("ant");
		collection.add("bird");
		collection.add("cat");
		collection.add("dog");
		collection.add("elephant");

		System.out.println("Add : ant , bird , cat , dog , elephant");
		System.out.print("Set contains: ");
		print(collection);
		System.out.print("Remove : ");
		print(collection);
		collection.clear();

		collection.add("cat");
		collection.add("elephant");
		collection.add("bird");
		collection.add("ant");
		collection.add("dog");
		System.out.println("Add : cat , elephant , bird , ant , dog");
		System.out.print("Set contains: ");
		print(collection);

		System.out.println("Add duplicate items to the set : cat , dog");
		collection.add("cat");
		collection.add("dog");

		System.out.print("Set contains: ");
		print(collection);
		System.out.println("----------------------");
		System.out.println();
	}

	public static void main(String[] args) {
		setExplorer();
	}
}
