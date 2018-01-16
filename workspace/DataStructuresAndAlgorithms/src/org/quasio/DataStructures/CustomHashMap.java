package org.quasio.DataStructures;

public class CustomHashMap<K, V> {

	private int size = 1 << 2;
	private Entry<K, V>[] table;

	@SuppressWarnings("unchecked")
	public CustomHashMap() {
		table = new Entry[size];
	}

	static final class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}

		@Override
		public String toString() {
			return key + " : " + value;
		}
	}

	private int hash(K k) {
		return Math.abs(k.hashCode()) % size;
	}

	public V put(K key, V value) {
		if (key == null) {
			return null;
		}
		// Create a new entry :
		Entry<K, V> entry = new Entry<>(key, value, null);

		// Calculate the index(HashCode):
		int index = hash(key);

		// Check if some data is present there:
		if (table[index] == null) {
			// Simply add the enrty there :
			table[index] = entry;
			return null;
		}

		// Data is present at required position
		Entry<K, V> current = table[index];
		Entry<K, V> previous = null;
		while (current != null) {
			// Key is already present in Map :
			if (current.key.equals(key)) {
				V oldValue = current.value;
				current.value = value;
				return oldValue;
			}
			previous = current;
			current = current.next;
		}
		// Means the key is new :
		previous.next = entry;
		return null;
	}

	public V get(K key) {
		// Calculate the index(HashCode):
		int index = hash(key);

		if (table[index] == null) {
			return null;
		}

		Entry<K, V> current = table[index];
		while (current != null) {
			if (current.key.equals(key)) {
				return current.value;
			}
			current = current.next;
		}
		return null;
	}

	public V remove(K key) {
		// Calculate the index(HashCode):
		int index = hash(key);

		// Check if some data is present there:
		if (table[index] == null) {
			return null;
		}

		// Data is present at required position
		Entry<K, V> current = table[index];
		Entry<K, V> previous = null;
		while (current != null) {
			if (current.key.equals(key)) {
				V oldValue = current.value;
				if (previous == null) {// Match found at first entry:
					table[index] = current.next;
				} else {
					previous.next = current.next;
				}
				return oldValue;
			}
			previous = current;
			current = current.next;
		}
		return null;
	}

	public void display() {
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			Entry<K, V> current = table[i];
			while (current != null) {
				System.out.print(" {" + current + "} ");
				current = current.next;
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		CustomHashMap<Integer, Integer> map = new CustomHashMap<Integer, Integer>();
		System.out.println(map.put(21, 12));
		System.out.println(map.put(25, 121));
		System.out.println(map.put(30, 151));
		System.out.println(map.put(33, 15));
		System.out.println(map.put(25, 93));
		System.out.println(map.put(35, 89));

		System.out.println("value corresponding to key 21=" + map.get(21));
		System.out.println("value corresponding to key 51=" + map.get(51));

		System.out.println("Map Items: ");
		map.display();

		System.out.println("\nvalue corresponding to key 21 removed: " + map.remove(21));
		System.out.println("value corresponding to key 51 removed: " + map.remove(51));
		System.out.println("value corresponding to key 33=" + map.get(33));

		System.out.println("Map Items: ");
		map.display();

	}
}

/*
 * Output
 * 
 * value corresponding to key 21=12 value corresponding to key 51=null
 * Displaying : {21=12} {25=121} {33=15} {30=151} {35=89}
 * 
 * value corresponding to key 21 removed: true value corresponding to key 51
 * removed: false Displaying : {25=121} {33=15} {30=151} {35=89}
 * 
 */
