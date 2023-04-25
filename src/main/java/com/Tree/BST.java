package com.Tree;
import java.util.Comparator;

/**
 * 
 * @author https://st-lab.tistory.com/300
 *
 * @param <E>
 */


public class BST<E> {
	
	public class Node<E> {
		E value;
		Node<E> left;
		Node<E> right;
		Node<E> parent;
		
		Node(E value){
			this(value, null);
		}
		public Node(E value, Object object) {
			// TODO Auto-generated constructor stub
			this.value = value;
			this.parent = parent;
			this.right = right;
			this.left = left;
		}

	}

	private Node<E> root;
	private int size;
	
//	private final Comparator<? super E> comparator;
	private final Comparator comparator;

	/**
	 * comparator ���� ���� ��� ���� �񱳶� comparable�� ����ϵ��� ��
	 * */
	public BST() {
		this(null); 
	}

	/**
	 * ����ڰ� ���� ����� �Ѱ��ٶ��� comparator �� ���
	 */
	public BST(Comparator comparator) {
//		public BST(Comparator<? super E> comparator) {
		// TODO Auto-generated constructor stub
		this.comparator = comparator;
		this.root = null; //��Ʈ��带 ����Ű�� ����
		this.size = 0; //bst�� ���� �ִ� node�� ���� 
	}
	
	public boolean add(E value) {
		if(comparator == null) {
			return addUsingComparable(value) == null;
		}
		return addUsingComparator(value,comparator) == null;
		
	}
	
	private E addUsingComparable(E value) {
		//Ž���� ��带 ����Ű�� current node
		Node<E> current = root;
		
		//���� current�� null �̰� (�� root�� null) root�� �� ��带 ����� null ��ȯ
		if(current == null) {
			root = new Node<E>(value);
			size++;
			return null;
		}
		
		//current�� ���� Ž����带 ����Ű�� ���
		Node<E> currentParent;
		
		//������ ��尡 �� �� �� �ֵ��� �� ������ �����.
		Comparable<? super E>compValue = (Comparable<? super E>)value;
		
		int compResult;//�� ��� (���, 0, ����)�� ��� ���� ���� 
		
		do {
			//���� ��ȸ���� current�� �θ��带 ����ų �� �ֵ��� ���� current�� ����
			currentParent = current;
			compResult = compValue.compareTo(current.value);
			
			/**
			 * �� ��� value���� current.value���� ������ current�� current�� ���� �ڽ����� �����ϰ� 
			 * value���� current.value�� ũ�ٸ� current�� ������ �ڽ����� ����, ���� ���� ��� ��ȸ �ߴ� value�� ��ȯ
			 **/
			if(compResult < 0) {
				current = current.left;
			} else if(compResult > 0) {
				current = current.right;
			}else {
				return value;
			}
			
		}while(current != null);
		
		//��ȸ�� �Ϸ� �Ǿ� �����ؾ� �� ��ġ�� ã�Ҵٸ� ���� �� value�� ���� �����.
		Node<E> newNode = new Node<E>(value, currentParent);
		
		//���� �� ����� ���� currentParent�� ������ Ȥ�� ���� ��忡 �� ��带 �������ش�.
		if(compResult < 0) {
			currentParent.left = newNode;
		} else if(compResult > 0) {
			currentParent.right = newNode;
		}
		
		size++;
		return null;
	}
	public E addUsingComparator(E value, Comparator<? super E>comp) {
		//Ž���� ��带 ����Ű�� current node
		Node<E> current = root;
		
		//���� current�� null �̰� (�� root�� null) root�� �� ��带 ����� null ��ȯ
		if(current == null) {
			root = new Node<E>(value);
			size++;
			return null;
		}
		
		//current�� ���� Ž����带 ����Ű�� ���
		Node<E> currentParent;
		//�� ��� (���, 0, ����)�� ��� ���� ���� 
		int comResult;
		do {
			//���� ��ȸ���� current�� �θ��带 ����ų �� �ֵ��� ���� current�� ����
			currentParent = current;
			comResult = comp.compare(value,current.value);
			if(comResult < 0) {
				current = current.left;
			}else if(comResult >0) {
				current = current.right;
			}else {
				return value;
			}
			
		}while(current != null);
		
		//��ȸ�� �Ϸ� �Ǿ� �����ؾ� �� ��ġ�� ã�Ҵٸ� ���� �� value�� ���� �����.
		Node<E> newNode = new Node<E>(value, currentParent);
		if(comResult < 0) {
			currentParent.left = newNode;
		} else {
			currentParent.right = newNode;
		}
		size++;
		return null;
	}
	
	private Node<E> getSuccessorAndUnlink(Node<E> node) {
		
		//��ü �� ����� �θ��带 ����Ű�� ���
		Node<E> currentParent = node;
		//�ʱ⿡ ������ �ڽĳ�带 ����Ű���� �Ѵ�
		Node<E> current = node.right;
		
		/**
		 * ó�� Ž���ϴ� ������ �ڽ� ��忡�� (current)���� �ڽ��� ���ٴ°�,
         * current��� �� ������ ù �ڽĳ�尡 ��ü�Ǵ� ��尡 �ȴٴ� ���̴�.
         * 
		 *�׷��� ��ü�ؾ��ϴ� ���� �����Ǵ� ����� ������ �ڽ��� �Ǹ�
		 *�̿� ��ü�Ǵ� ����ڸ� (currentParent)�� ������ �ڽ��� current�� ������ �ڽ��� ����Ű��
		 *currentParent�� ���� current�� ���� ��ȯ�ǰ�, ���� �޼ҵ忡�� currentParent���̿� ���� ��ü�ǰ� �ȴ�
		 **/
		if(current.left == null) {
			currentParent.right = current.right;
			if(currentParent.right != null) {
				currentParent.right.parent = currentParent;
			}
			current.right = null;
			return current;
		}
		
		//���� ���� ��带 ã�� �� ���� �ݺ��Ѵ�.
		while(current.left != null) {
			currentParent = current;
			current = current.left;
		}
		
		/**���� �İ��ڰ� �� ���(���� ���� ���)�� ������ ��尡 �����Ѵٸ� currentParent�� ���� �ڽĳ��� ������ �ڽĳ��� ����Ǿ�� �Ѵ�
		 * ���� current.right�� null�̸�, �İ��ڰ� �� ����� �ڽĳ��� �������� �����Ƿ� �ڿ������� �İ��� ����� �θ���� �İ��ڰ� �ٸ� ���� ��ü�Ǿ� ���� ������ 
		 * �İ����� �θ����� ���� �ڽ� ���� �ڿ������� null�� ����Ű�� �ȴ�
		 */
		currentParent.left = current.right;
		if(currentParent.left != null) {
			currentParent.left.parent  = currentParent;
		}
		
		current.right = null;
		return current;
		
	}

	//���� ���� (�θ�->���� �ڽ�->������ �ڽĳ��)
	public void preorder() {
		preorder(this.root);
	}
	public void preorder(Node<E> o) {
		//null�� �ƴҶ����� ��������� ��ȸ
		if(o != null) {
			System.out.print(o.value + " ");//parent node
			preorder(o.left); //left child node
			preorder(o.right); //right child node
		}
	}
	
	//���� ���� (���� �ڽ�->�θ� ���->������ �ڽĳ��)
	public void inorder() {
		inorder(this.root);
	}
	
	public void inorder(Node<E> o) {
		//null�� �ƴҶ����� ��������� ��ȸ
		if(o != null) {
			inorder(o.left);//left child node
			System.out.print(o.value + " ");//parent node
			inorder(o.right);//right child node
		}
	}
	//���� ���� (���� �ڽ�->������ �ڽĳ��->�θ� ���)
	public void postorder() {
		postorder(this.root);
	}
	
	public void postorder(Node<E> o) {
		if(o!= null) {
			postorder(o.left);//left child node
			postorder(o.right);//right child node
			System.out.print(o.value + " ");//parent node
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST<Integer> tree = new BST<Integer>(); 
		tree.add(23);
		tree.add(12);
		tree.add(40);
		tree.add(7);
		tree.add(16);
		tree.add(1);
		tree.add(14);
		tree.add(17);
		tree.add(29);
		tree.add(55);
		tree.add(61);
		
		System.out.print("preorder : ");
		tree.preorder();
		System.out.println();
		
		System.out.print("inorder : ");
		tree.inorder();
		System.out.println();
		
		System.out.print("postorder : ");
		tree.postorder();
		System.out.println();
		
	}

}
