package org.quasio.DataStructures;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CustomBinarySearchTree<E extends Comparable<? super E>> {
	private Node<E> root;
	private int treeSize;

	static class Node<E> {
		E data;
		Node<E> left;
		Node<E> right;

		public Node(E data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}

	public boolean add(E data) {
		Node<E> node = new Node<>(data);
		if (isTreeEmpty()) {// Enter node as root
			root = node;
			treeSize++;
			return true;
		}
		Node<E> current = root;
		while (true) {
			if (current.data.compareTo(data) >= 0) {
				if (current.left != null) {
					current = current.left;
				} else {// Node to be inserted in right of current :
					current.left = node;
					treeSize++;
					return true;
				}
			} else {
				if (current.right != null) {
					current = current.right;
				} else {// Node to be inserted in right of current :
					current.right = node;
					treeSize++;
					return true;
				}
			}
		}
	}

	public void preOrderTraversal() {
		preOrderTraversal(root);
	}

	private void preOrderTraversal(Node<E> node) {
		if (node == null) {
			return;
		}
		System.out.print(node);
		System.out.print(" ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	public void inorderOrderTraversal() {
		inorderOrderTraversal(root);
	}

	private void inorderOrderTraversal(Node<E> node) {
		if (node == null) {
			return;
		}
		inorderOrderTraversal(node.left);
		System.out.print(node);
		System.out.print(" ");
		inorderOrderTraversal(node.right);
	}

	public void postOrderTraversal() {
		postOrderTraversal(root);
	}

	private void postOrderTraversal(Node<E> node) {
		if (node == null) {
			return;
		}
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node);
		System.out.print(" ");
	}

	public void logitudnalTraversal() {
		Queue<Node<E>> queue = new LinkedList<>();
		queue.add(root);
		while (queue.size() != 0) {
			Node<E> tempNode = queue.remove();
			if (tempNode == null) {
				continue;
			}
			queue.add(tempNode.left);
			queue.add(tempNode.right);
			System.out.print(tempNode);
			System.out.print(" ");
		}

	}

	private boolean isTreeEmpty() {
		return treeSize == 0;
	}

	public boolean remove(E data) {
		if (!contains(data)) {
			return false;
		}
		Node<E> current = root;
		Node<E> parent = null;
		String child = null;
		while (current != null) {
			if (current.data.equals(data)) {
				if (parent == null) {
					if (current.left == null && current.right == null) {// No Child
						root = null;
						break;
					}
					if (current.left == null) { // One child is there
						root = current.right;
						break;
					}
					if (current.right == null) { // One Child is there
						root = current.left;
						break;
					}

					// Both children are there ::
					Node<E> leftMaxChild = max(current.left);
					if (current.left.data.equals(data)) {
						remove(leftMaxChild.data);
						leftMaxChild.left = current.left;
						leftMaxChild.right = current.right;
						root = leftMaxChild;

					} else {
						remove(leftMaxChild.data);
						leftMaxChild.left = current.left;
						leftMaxChild.right = current.right;
						root = leftMaxChild;

					}
					break;

				} else {
					if (current.left == null && current.right == null) {// No Child
						if (child.equals("left")) {
							parent.left = null;
						} else {
							parent.right = null;
						}
						break;
					}
					if (current.left == null) { // One child is there
						if (child.equals("left")) {
							parent.left = current.right;
						} else {
							parent.right = current.right;
						}
						break;
					}
					if (current.right == null) { // One Child is there
						if (child.equals("left")) {
							parent.left = current.left;
						} else {
							parent.right = current.left;
						}
						break;
					}

					// Both children are there ::
					Node<E> leftMaxChild = max(current.left);
					if (child.equals("left")) {
						remove(leftMaxChild.data);
						leftMaxChild.left = current.left;
						leftMaxChild.right = current.right;
						parent.left = leftMaxChild;
					} else {
						remove(leftMaxChild.data);
						leftMaxChild.left = current.left;
						leftMaxChild.right = current.right;
						parent.right = leftMaxChild;
					}
					break;
				}
			} else {
				parent = current;
				if (current.data.compareTo(data) > 0) {
					current = current.left;
					child = "left";
				} else {
					current = current.right;
					child = "right";
				}
			}
		}
		return true;
	}

	private Node<E> max(Node<E> current) {
		while (current != null && current.right != null) {
			current = current.right;
		}
		return current;
	}

	public void displayTree() {
		if (isTreeEmpty()) {
			return;
		}
		System.out.println("Tree :: ");

		Map<Integer, Parameters<E>> depthParam = new HashMap<>();
		Map<E, Integer> position = new HashMap<>();
		Map<E, E> parent = new HashMap<>();
		Queue<Node<E>> queue = new LinkedList<>();

		int depth = getTreeDepth();
		int spaces = 2;
		// Putting values in depthParam Map, which could be used to retrieve any
		// information at depth level :
		depthParam.put(depth, new Parameters<E>(2, 0));
		for (int i = 1; i <= depth; i++) {
			int indentation = spaces;
			spaces = (2 * spaces) + 2;
			depthParam.put(depth - i, new Parameters<E>(spaces, indentation));
		}

		// Queue is used for level wise traversal, adding root as first node in queue :
		queue.add(root);
		parent.put(root.data, null);
		position.put(root.data, 0);

		int previousDepth = 0;
		while (queue.size() != 0) {
			Node<E> tempNode = queue.remove();
			if (tempNode == null) {
				continue;
			}
			queue.add(tempNode.left);
			queue.add(tempNode.right);

			// Adding Patents & Position :
			Node<E> left;
			Node<E> right;
			if ((left = tempNode.left) != null) {
				parent.put(left.data, tempNode.data);
				position.put(left.data, 2 * position.get(parent.get(left.data))); // i.e is parent pos = 1 ; leftChild
																					// pos = 2
			}
			if ((right = tempNode.right) != null) {
				parent.put(right.data, tempNode.data);
				position.put(right.data, 2 * position.get(parent.get(right.data)) + 1); // i.e is parent pos = 1 ;
																						// rightChild pos = 3
			}

			// Printing the Node details at correct position with correct indentation and
			// spaces::
			int nodeDepth = getDepth(tempNode.data);
			// Taking record of last entered node at the given depth :
			E lastElement = depthParam.get(nodeDepth).lastElement;
			depthParam.get(nodeDepth).lastElement = tempNode.data;

			// Adding new line if depth has changed :
			if (previousDepth < nodeDepth) {
				System.out.println();
				previousDepth = nodeDepth;
			}

			int elementPosition = position.get(tempNode.data);
			int nodeIndentation = depthParam.get(nodeDepth).indentation;
			int nodeSpaces = depthParam.get(nodeDepth).spaces;

			if (elementPosition == 0) {
				String indent = getStringOfSpaces(nodeIndentation);
				System.out.print(indent + tempNode);
			} else {
				int requiredSpaces = 0;
				if (lastElement == null) {
					requiredSpaces = nodeIndentation + (elementPosition * (nodeSpaces + 2));
				} else {
					int lastElementPosition = position.get(lastElement);
					requiredSpaces = (elementPosition - lastElementPosition) * (nodeSpaces + 2) - 2;
				}
				String space = getStringOfSpaces(requiredSpaces);
				System.out.print(space + tempNode);
			}
		}
		System.out.println();
	}

	public void mirror() {
		mirror(root);
	}

	private void mirror(Node<E> node) {
		if (node == null) {
			return;
		}
		mirror(node.left);
		mirror(node.right);
		Node<E> temp = node.left;
		node.left = node.right;
		node.right = temp;

	}

	private String getStringOfSpaces(int size) {
		String str = "";
		for (int i = 0; i < size; i++) {
			str += " ";
		}
		return str;
	}

	static class Parameters<E> {
		int spaces;
		int indentation;
		E lastElement;

		public Parameters(int spaces, int indentation) {
			this.spaces = spaces;
			this.indentation = indentation;
		}

		@Override
		public String toString() {
			return spaces + " : " + indentation + " : " + lastElement;
		}
	}

	public E min() {
		if (isTreeEmpty())
			return null;

		Node<E> current = root;
		E min = null;
		while (current != null) {
			min = current.data;
			current = current.left;
		}
		return min;
	}

	public E max() {
		if (isTreeEmpty())
			return null;

		Node<E> current = root;
		E max = null;
		while (current != null) {
			max = current.data;
			current = current.right;
		}
		return max;
	}

	public int getSize() {
		return treeSize;
	}

	public boolean contains(E data) {
		if (isTreeEmpty())
			return false;

		Node<E> current = root;
		while (true) {
			if (current.data.equals(data)) {
				return true;
			}

			if (current.data.compareTo(data) > 0) {
				if (current.left != null) {
					current = current.left;
				} else {
					return false;
				}

			} else {
				if (current.right != null) {
					current = current.right;
				} else {
					return false;
				}
			}
		}
	}

	public int getTreeDepth() {
		return getTreeHeight();
	}

	public int getTreeHeight() {
		if (isTreeEmpty())
			return -1;

		return getHeight(root);
	}

	private int getHeight(Node<E> root) {
		if (root == null) {
			return -1;
		}
		int leftTreeDepth = getHeight(root.left);
		int rightTreeDepth = getHeight(root.right);
		if (leftTreeDepth >= rightTreeDepth) {
			return leftTreeDepth + 1;
		} else {
			return rightTreeDepth + 1;
		}
	}

	public int getDepth(E data) {
		if (contains(data)) {
			int depth = 0;
			Node<E> current = root;
			while (!current.data.equals(data)) {
				if (current.data.compareTo(data) > 0) {
					current = current.left;
				} else {
					current = current.right;
				}
				depth++;
			}
			return depth;
		}
		return -1;
	}

	public int getHeight(E data) {
		if (contains(data)) {
			Node<E> current = root;
			while (!current.data.equals(data)) {
				if (current.data.compareTo(data) > 0) {
					current = current.left;
				} else {
					current = current.right;
				}
			}
			return getHeight(current);
		}
		return -1;
	}

	public E inorderOrderPredessor(E data) {
		if (!contains(data)) {
			return null;
		}

		Node<E> current = root;
		Node<E> successorNode = null;
		E returnValue = null;

		while (current != null) {
			if (current.data.equals(data)) {
				if (current.left != null) {
					returnValue = max(current.left).data;
				} else if (successorNode != null) {
					returnValue = successorNode.data;
				}
				break;
			} else {
				if (current.data.compareTo(data) > 0) {
					current = current.left;
				} else {
					successorNode = current;
					current = current.right;
				}
			}
		}
		return returnValue;
	}
	
	public E inorderOrderSuccessor(E data) {
		if (!contains(data)) {
			return null;
		}

		Node<E> current = root;
		Node<E> successorNode = null;
		E returnValue = null;

		while (current != null) {
			if (current.data.equals(data)) {
				if (current.right != null) {
					returnValue = min(current.right).data;
				} else if (successorNode != null) {
					returnValue = successorNode.data;
				}
				break;
			} else {
				if (current.data.compareTo(data) > 0) {
					successorNode = current;
					current = current.left;
				} else {
					current = current.right;
				}
			}
		}
		return returnValue;
	}

	private Node<E> min(Node<E> current) {
		while (current != null && current.left != null) {
			current = current.left;
		}
		return current;
	}

	public static void main(String[] args) {
		CustomBinarySearchTree<Integer> tree = new CustomBinarySearchTree<>();
		tree.add(17);
		tree.add(13);
		tree.add(15);
		tree.add(14);
		tree.add(16);
		tree.add(21);
		tree.add(19);
		tree.add(20);
		tree.add(18);
		tree.add(95);
		tree.add(11);
		tree.add(12);
		tree.add(10);
		tree.add(55);
		tree.add(99);

		tree.displayTree();

		System.out.println("\nTree Size :: " + tree.getSize());
		System.out.println();
		System.out.print("Pre Order:: ");
		tree.preOrderTraversal();
		System.out.println();
		System.out.print("In Order:: ");
		tree.inorderOrderTraversal();
		System.out.println();
		System.out.print("Post Order:: ");
		tree.postOrderTraversal();
		System.out.print("\n\nLongitudnal Order:: ");
		tree.logitudnalTraversal();

		System.out.println("\n \nMinimun in tree: " + tree.min());
		System.out.println("Maximum in tree: " + tree.max());

		System.out.println("\nDoes tree contain 13 : " + tree.contains(13));
		System.out.println("Does tree contain 15 : " + tree.contains(15));
		System.out.println("Does tree contain 18 : " + tree.contains(18));

		System.out.println("\nDepth of tree: " + tree.getTreeDepth());
		System.out.println("Depth of 17: " + tree.getDepth(17));
		System.out.println("Depth of 13: " + tree.getDepth(13));
		System.out.println("Depth of 15: " + tree.getDepth(15));
		System.out.println("Depth of 18: " + tree.getDepth(18));

		System.out.println("\nHeight of tree: " + tree.getTreeHeight());
		System.out.println("Height of 17: " + tree.getHeight(17));
		System.out.println("Height of 13: " + tree.getHeight(13));
		System.out.println("Height of 15: " + tree.getHeight(15));
		System.out.println("Height of 14: " + tree.getHeight(14));

		System.out.println("\nRemoving 17 from tree : " + tree.remove(17));
		System.out.println("Removing 95 from tree : " + tree.remove(95));
		System.out.println("Removing 15 from tree : " + tree.remove(15));
		
		tree.displayTree();

		System.out.println("\nInOrder Successor of 14 is : " + tree.inorderOrderSuccessor(14));
		System.out.println("InOrder Successor of 12 is : " + tree.inorderOrderSuccessor(12));
		System.out.println("InOrder Successor of 16 is : " + tree.inorderOrderSuccessor(16));
		System.out.println("InOrder Successor of 55 is : " + tree.inorderOrderSuccessor(55));
		
		System.out.println("\nPrevious of 10 is : " + tree.inorderOrderPredessor(10));
		System.out.println("Previous of 12 is : " + tree.inorderOrderPredessor(12));
		System.out.println("Previous of 16 is : " + tree.inorderOrderPredessor(16));
		System.out.println("Previous of 55 is : " + tree.inorderOrderPredessor(55));
		// tree.mirror();
		
	}

}
