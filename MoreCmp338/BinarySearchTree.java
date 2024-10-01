package MoreCmp338;

public class BinarySearchTree {
	
	private int[] A;
	private int i;
	
	private BSTNode root = null;
	
	public void balance() {
		A = new int[count()];
		inOrder();
		bisectionInsert(0, A.length -1);
	}
	
	public void bisectionInsert(int first, int last)	{
		
		if(first <= last) {
			
		int middle = (first + last)/2;
		
		insert(A[middle]);	
		
		bisectionInsert(first, middle-1);
		bisectionInsert(middle+1, last);
		}
		
	}
	
	public void insert(int x) {
		if(isEmpty()) root = new BSTNode(x);
		else 		  root.insert(x);
	}
	
	public int search(int x) {
		if(isEmpty()) return -1;
		else		  return root.search(x);
	}
	
	public int count() {
		if(isEmpty())  			return 0;
		
		else					return root.count();
	}
	public int height() {
		if(isEmpty())  			return 0;
		
		else					return root.height();
	}
	
	public void inOrder() {
		if(!isEmpty())  {
			A = new int[count()];
			i = 0;
			root.inOrder();
		}
	}
	
	public void printInOrder()	{
		if(!isEmpty()) {
			root.printInOrder();
		}
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	
		public class BSTNode {
			int item;
			BSTNode Left = null;
			BSTNode right = null;
			
			
			public BSTNode(int item) {
				this.item = item;
			}
			
			public void minimum() {
				if(Left != null) {
					Left.minimum();
				}
				else {
					System.out.println(item);
				}
			}
			
			public void maximum() {
				if(right != null) {
					right.maximum();
				}
				else {
					System.out.println(item);
				}
			}
			
			public void printInOrder() {
				
				if(Left != null) printInOrder();
				System.out.println(item);
				if(right != null) printInOrder();
			} 
			
		public void inOrder() {
				
			if(Left != null) inOrder();
			A[i++] = item;
			if(right != null) inOrder();
			} 
			
		public void inReverseOrder() {
				
				if(right != null) inReverseOrder();
				System.out.println(item);
				if(Left != null) inReverseOrder();
			}
	
			public int summation() {
				int sl = 0;
				int sr = 0;
				if(Left != null) sl = Left.summation();
				if(right != null) sr += right.summation();
				
				return sl + sr + item;
			}
			
			public int product() {
				int pl = 0;
				int pr = 0;
				if(Left != null) pl = Left.summation();
				if(right != null) pr += right.summation();
				
				return pl + pr + item;
			}
			
			
			public int count() {
				int LC = 0;
				int RC = 0;
				if(Left != null) LC += Left.count();
				
				if(right != null) RC += right.count();
				
				
				return LC + RC + 1;
				
			}
			
			public int search(int x) {
				if(x == item) return item;
				
				if((Left != null) && (x < item))  return Left.search(x);
				
				if((right != null) && (x > item)) return right.search(x);
				
				return -1;
			}
			
			public void insert(int x) {
				if(x < item) {
					if(Left != null) Left.insert(x);
					
					else 			 Left = new BSTNode(x);
				}
				if(x > item) {
					if(right != null) right.insert(x);
				
					else 			 right = new BSTNode(x);
				}
			}
			
			public int height() {
				
				int LH = 0;
				int RH = 0;
				
				if(Left != null) LH = Left.height();
				if(right != null) RH = right.height();
				
				return max(LH, RH) + 1;
			}
			
			public int max(int a, int b) {
				if(a >= b) {
					return a;
				}
				return b;
			}
		}

}
