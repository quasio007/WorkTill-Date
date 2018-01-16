package org.quasio.DataStructures;

public class CustomLinkedHashMap<K, V> {

	private int size = 1 << 2;
	private Entry<K, V>[] table;
	private Entry<K, V> first;
	private Entry<K, V> last;
	private int mapSize;

	@SuppressWarnings("unchecked")
	public CustomLinkedHashMap() {
		table = new Entry[size];
	}

	public static final class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;
		Entry<K, V> before, after;

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
		// Before inserting in Map, first maintain the order
		maintainInsertionOrder(entry);
		// Calculate the index(HashCode):
		int index = hash(key);

		// Check if some data is present there:
		if (table[index] == null) {
			// Simply add the enrty there :
			table[index] = entry;
			mapSize++;
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
		mapSize++;
		return null;
	}

	private void maintainInsertionOrder(Entry<K, V> entry) {
		if (mapIsNull()) {
			first = last = entry;
		} else {

			Entry<K, V> current = first;
			while (current != null) {
				if (current.key.equals(entry.key)) {
					return;
				}
				current = current.after;
			}
			// If we are here means list does not contain the given key, hence adding it at
			// last:
			last.after = entry;
			entry.before = last;
			last = entry;
		}

	}

	private boolean mapIsNull() {
		return mapSize == 0;
	}

	public V get(K key) {
		if (key == null) {
			return null;
		}
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
		if (key == null) {
			return null;
		}
		// Calculate the index(HashCode):
		int index = hash(key);

		maintainOrderAfterDeletion(key);
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
				mapSize--;
				return oldValue;
			}
			previous = current;
			current = current.next;
		}
		return null;
	}

	private void maintainOrderAfterDeletion(K key) {
		if (mapIsNull()) {
			return;
		} else {

			Entry<K, V> current = first;
			while (current != null) {
				if (current.key.equals(key)) {

					// When entry is met at first point::
					if (current.before == null) {// Match found at first entry
						first = current.after;
						if (current.after != null) {
							current.after.before = null;
						} else {
							last = null;
						}
					} else

					// Match is found in at last:
					if (current.after == null) {
						last = current.before;
						last.after = null;
					} else {

						// Match is found in between somewhere :
						System.out.println("Current.after : ");
						current.before.after = current.after;
						current.after.before = current.before;
					}
				}
				current = current.after;
			}
		}
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

	public void displayInOrder() {
		Entry<K, V> current = first;
		System.out.print("[");
		while (current != null) {
			System.out.print(" {" + current + "} ");
			current = current.after;
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		CustomLinkedHashMap<Integer, Integer> map = new CustomLinkedHashMap<Integer, Integer>();
		map.put(21, 12);
		map.put(25, 121);
		map.put(30, 151);
		map.put(33, 15);
		map.put(25, 93);
		map.put(35, 89);

		// System.out.println("value corresponding to key 21=" + map.get(21));
		// System.out.println("value corresponding to key 51=" + map.get(51));


		map.displayInOrder();

		System.out.println("value corresponding to key 21 removed: " + map.remove(21));
		map.displayInOrder();
		System.out.println("value corresponding to key 35 removed: " + map.remove(35));
		map.displayInOrder();
		System.out.println("value corresponding to key 21 removed: " + map.remove(21));
		map.displayInOrder();
		// System.out.println("value corresponding to key 51 removed: " +
		// map.remove(51));
		// System.out.println("value corresponding to key 33=" + map.get(33));


	}
}
