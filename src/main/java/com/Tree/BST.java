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
	 * comparator 값이 없는 경우 변수 비교때 comparable을 사용하도록 함
	 * */
	public BST() {
		this(null); 
	}

	/**
	 * 사용자가 정렬 방법을 넘겨줄때엔 comparator 를 사용
	 */
	public BST(Comparator comparator) {
//		public BST(Comparator<? super E> comparator) {
		// TODO Auto-generated constructor stub
		this.comparator = comparator;
		this.root = null; //루트노드를 가리키는 변수
		this.size = 0; //bst가 갖고 있는 node의 개수 
	}
	
	public boolean add(E value) {
		if(comparator == null) {
			return addUsingComparable(value) == null;
		}
		return addUsingComparator(value,comparator) == null;
		
	}
	
	private E addUsingComparable(E value) {
		//탐색할 노드를 가리키는 current node
		Node<E> current = root;
		
		//만약 current가 null 이고 (즉 root가 null) root에 새 노드를 만들고 null 반환
		if(current == null) {
			root = new Node<E>(value);
			size++;
			return null;
		}
		
		//current의 직전 탐색노드를 가리키는 노드
		Node<E> currentParent;
		
		//삽입할 노드가 비교 될 수 있도록 한 변수를 만든다.
		Comparable<? super E>compValue = (Comparable<? super E>)value;
		
		int compResult;//비교 결과 (양수, 0, 음수)를 담고 있을 변수 
		
		do {
			//다음 순회에서 current와 부모노드를 가리킬 수 있도록 현재 current를 저장
			currentParent = current;
			compResult = compValue.compareTo(current.value);
			
			/**
			 * 비교 결과 value보다 current.value값이 작으면 current을 current의 왼쪽 자식으로 갱신하고 
			 * value보다 current.value가 크다면 current를 오른쪽 자식으로 갱신, 값이 같을 경우 순회 중단 value를 반환
			 **/
			if(compResult < 0) {
				current = current.left;
			} else if(compResult > 0) {
				current = current.right;
			}else {
				return value;
			}
			
		}while(current != null);
		
		//순회가 완료 되어 삽입해야 할 위치를 찾았다면 삽입 할 value를 노드로 만든다.
		Node<E> newNode = new Node<E>(value, currentParent);
		
		//직전 비교 결과에 따라 currentParent의 오른쪽 혹은 왼쪽 노드에 새 노드를 연결해준다.
		if(compResult < 0) {
			currentParent.left = newNode;
		} else if(compResult > 0) {
			currentParent.right = newNode;
		}
		
		size++;
		return null;
	}
	public E addUsingComparator(E value, Comparator<? super E>comp) {
		//탐색할 노드를 가리키는 current node
		Node<E> current = root;
		
		//만약 current가 null 이고 (즉 root가 null) root에 새 노드를 만들고 null 반환
		if(current == null) {
			root = new Node<E>(value);
			size++;
			return null;
		}
		
		//current의 직전 탐색노드를 가리키는 노드
		Node<E> currentParent;
		//비교 결과 (양수, 0, 음수)를 담고 있을 변수 
		int comResult;
		do {
			//다음 순회에서 current와 부모노드를 가리킬 수 있도록 현재 current를 저장
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
		
		//순회가 완료 되어 삽입해야 할 위치를 찾았다면 삽입 할 value를 노드로 만든다.
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
		
		//대체 할 노드의 부모노드를 가리키는 노드
		Node<E> currentParent = node;
		//초기에 오른쪽 자식노드를 가리키도록 한다
		Node<E> current = node.right;
		
		/**
		 * 처음 탐색하는 오른쪽 자식 노드에서 (current)왼쪽 자식이 없다는건,
         * current노드 즉 오른쪽 첫 자식노드가 대체되는 노드가 된다는 것이다.
         * 
		 *그래서 대체해야하는 노드는 삭제되는 노드의 오른쪽 자식이 되며
		 *이에 대체되는 노드자리 (currentParent)의 오른쪽 자식은 current의 오른쪽 자식을 가리키고
		 *currentParent는 이후 current의 값이 반환되고, 상위 메소드에서 currentParent자이에 값이 대체되게 된다
		 **/
		if(current.left == null) {
			currentParent.right = current.right;
			if(currentParent.right != null) {
				currentParent.right.parent = currentParent;
			}
			current.right = null;
			return current;
		}
		
		//가장 작은 노드를 찾을 때 까지 반복한다.
		while(current.left != null) {
			currentParent = current;
			current = current.left;
		}
		
		/**만약 후계자가 될 노드(가장 작은 노드)의 오른족 노드가 존재한다면 currentParent의 왼쪽 자식노드는 오른쪽 자식노드와 연결되어야 한다
		 * 만약 current.right가 null이면, 후계자가 될 노드의 자식노드는 존재하지 않으므로 자연스럽게 후계자 노드의 부모노드는 후계자가 다른 노드로 대체되어 가기 때문에 
		 * 후계자의 부모노드의 왼쪽 자식 노드는 자연스럽게 null을 가리키게 된다
		 */
		currentParent.left = current.right;
		if(currentParent.left != null) {
			currentParent.left.parent  = currentParent;
		}
		
		current.right = null;
		return current;
		
	}

	//전위 순위 (부모->왼쪽 자식->오른쪽 자식노드)
	public void preorder() {
		preorder(this.root);
	}
	public void preorder(Node<E> o) {
		//null이 아닐때까지 재귀적으로 순회
		if(o != null) {
			System.out.print(o.value + " ");//parent node
			preorder(o.left); //left child node
			preorder(o.right); //right child node
		}
	}
	
	//중위 순위 (왼쪽 자식->부모 노드->오른쪽 자식노드)
	public void inorder() {
		inorder(this.root);
	}
	
	public void inorder(Node<E> o) {
		//null이 아닐때까지 재귀적으로 순회
		if(o != null) {
			inorder(o.left);//left child node
			System.out.print(o.value + " ");//parent node
			inorder(o.right);//right child node
		}
	}
	//후위 순위 (왼쪽 자식->오른쪽 자식노드->부모 노드)
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
