// public class trees {
//     static class TreeNode{
//         int data;
//         TreeNode left;
//         TreeNode right;
//         TreeNode(int value){
//             data=value;
//             left=right=null;

//         }
//     }
    //------------------------------------------- find height of a tree
    // public static int height(TreeNode root){
    //     if(root == null){
    //         return -1;
    //     }
    //     int leftheight=height(root.left);
    //     int rightheight=height(root.right);
    //     return Math.max(leftheight,rightheight)+1;
    // }
    //------------------------------ count number of nodes
//     public static int nodecount(TreeNode root){
// if(root==null){
//     return 0;
// }
//         return 1+nodecount(root.left)+nodecount(root.right);
//     }
    //------------------------------------------ seach a value in tree
    // public static boolean value(TreeNode root,int key){
    //     if(root==null){
    //         return false;
    //     }
    //     if(root.data==key){
    //         return true;
    //     }
    //     return value(root.left,key)||value(root.right,key);
    // }
    //---------------------------------------------- find number of leaf nodes
    // public static int leaf(TreeNode root){
    //     if(root==null){
    //         return 0;
    //     }
    //     if(root.left==null&&root.right==null){
    //         return 1;
    //     }
    //     return leaf(root.left)+leaf(root.right);
    // }
    //---------------------------------------------- print nodes at a level
    // public static void printlevel(TreeNode root,int level){
    //     if(root==null){
    //         return;
    //     }
    //     if(level==1){
    //         System.out.println(root.data+ " ");
    //     }
    //     else{
    //         printlevel(root.left,level-1);
    //         printlevel(root.right,level-1);
    //     }
    // }
    //-------------------------------------- sum of all nodes
    // public static int sum(TreeNode root){
    //     if(root==null){
    //         return 0;
    //     }
    //     return root.data+sum(root.left)+sum(root.right);
    // }
    //------------------------------------------main
    // public static void main(String[] args) {
    //     TreeNode root=new TreeNode(10);
    //     root.left=new TreeNode(20);
    //     root.right=new TreeNode(30);
    //     root.left.left=new TreeNode(40);
    //     root.left.right=new TreeNode(50);
//        System.out.println("height of tree is"+height(root));
//        System.out.println("nodes of tree are"+nodecount(root));
//        System.out.println("is 4 present "+value(root,4));
//        System.out.println("is 10 present  "+value(root,10));
//        System.out.println("is 35 present  "+value(root,35));
//        System.out.println("is 50 present "+value(root,50));
//        System.out.println("leaf nodes are"+leaf(root));
     //   System.out.println("nodes at level 3");
       // printlevel(root,3);
    //   System.out.println("sum of nodes: "+sum(root));
   // }
//}

//------------------------------------------------------insert at a specific position 
public class Trees

{
    public static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
          this.data=data;
            left=right=null;
        }
    }
public static void insert(TreeNode root,TreeNode x){
    if(root==null) return;
    
    if(root.left!=null&&root.right==null){
        root.right=x;
        return;
    }
     if(root.left==null&&root.right!=null){
        root.left=x;
        return;
    }
    insert(root.left,x);
    insert(root.right,x);
}
public static int height(TreeNode root){
    if(root==null)return 0;
    return 1+Math.max(height(root.left),height(root.right));
}
public static void print(TreeNode root,int level){
    if(root==null)return ;
    if(level==1)System.out.print(root.data+" ");
    else{
        print(root.left,level-1);
        print(root.right,level-1);
    }
}
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
	root.right.left=new TreeNode(6);
	root.right.right=new TreeNode(7);
	int val=5;
	TreeNode x=new TreeNode(val);
	insert(root,x);
	int height=height(root);
	for(int i=1;i<=height;i++){
	    print(root,i);
	}
	}
}