package Oct2020;

import java.util.ArrayList;
import java.util.List;

class TreeString {
	
	public TreeString left;
	public TreeString right;
	public String pre;
	
	public TreeString(String val) {
		this.pre = val;
	}
}

public class TreeTraversal {

	
	public void buildList(List<String> resultList, TreeString tree,String str) {
		if(tree.left==null && tree.right==null) {
			str = str+tree.pre;
			if(!resultList.contains(str)) {
				resultList.add(str);	
			}
					
		}
		
		
		if(tree.left!=null) {
			buildList(resultList, tree.left, str+tree.pre);
		}
		
		if(tree.right!=null) {
			buildList(resultList, tree.right, str+tree.pre);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeString tsA = new TreeString("b");
		TreeString tsa1 = new TreeString("a");
		TreeString tsa2 = new TreeString("a");
		TreeString tsa3 = new TreeString("z");
		tsA.left = tsa1;
		tsa1.left = tsa2;
		tsa2.left = tsa3;
	
	
		TreeString tsb2 = new TreeString("h");
		TreeString tsb3 = new TreeString("u");
		tsA.right = tsa1;
		tsa1.right = tsb2;
		tsb2.right = tsb3;
		
		
		List<String> result = new ArrayList<String>();
		
		TreeTraversal trv = new TreeTraversal();
		trv.buildList(result, tsA, "");
		System.out.println(result);
	}

}
