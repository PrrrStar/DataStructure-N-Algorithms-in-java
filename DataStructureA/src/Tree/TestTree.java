package Tree;

import java.util.LinkedList;
import java.util.Queue;


class Tree<T>{
	protected TreeNode<T> root;
	
	class TreeNode<T>{
		protected T data;
		protected Tree<T> left;
		protected Tree<T> right;
		
		public TreeNode(Tree<T> l, T d, Tree<T> r) {
			data = d;
			left = l;
			right = r;
		}
	}
	
	private class Item4BFS<T>{
		int level;
		Tree<T> t;
		
		private Item4BFS(int l, Tree<T> r ) {
			level = l;
			t = r;
			
		}
	}
	
	public Tree(T data) {
		root = new TreeNode<T>(null, data, null);
		
	}
	
	
	public Tree(Tree<T>l, T data, Tree<T> r) {
		root = new TreeNode<T>(l,data,r);
		
	}
	
	public String bfs()	{
		String result ="";
		if(root != null) {
			Queue<Item4BFS<T>> q = new LinkedList<Item4BFS<T>>();
			Item4BFS<T> current = new Item4BFS(0, this);
			q.add(current);
			
			
			while(q.size()>0) {
				current = q.remove();
				result += current.t.root.data + "(" + current.level+")";
				q.add(current);
				
				if(current.t.root.right !=null)
					result+= current.t.root.right.bfs();
				if(current.t.root.left !=null)
					result += current.t.root.left.bfs();
			}
			q.add(current);
			
		}
		return result;
	}
}

public class TestTree {

}
