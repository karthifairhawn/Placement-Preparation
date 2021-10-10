public class Tree_Runner {
    public static void main(String args[]) {
        
    }
}



class BinaryTree{
    class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode parent;
        
        TreeNode(){

        }
        TreeNode(int x){
            value=x;
            left=null;
            right=null;
            parent=null;
        }
    }
    
    TreeNode root;

    BinaryTree(){
        root=null;
    }

    public TreeNode find(int key){

        TreeNode ptr = root;

        while(ptr!=null){
            if(key<ptr.value){
                if(ptr.left==null) return ptr;
                ptr=ptr.left;
            }else if(key>ptr.value){
                if(ptr.right==null) return ptr;
                ptr=ptr.right;
            }else{
                return ptr;
            }
        }

        return null;
    }

    public void put(int a){
        TreeNode newNode = new TreeNode(a);
        if(root==null){
            root=newNode;
        }else{
            TreeNode parent = find(a);  
            if(parent==null){
                root=newNode;
            }else{
                if(a<parent.value){
                    parent.left = newNode;
                    parent.left.parent = parent;
                }else if(a>parent.value){
                    parent.right = newNode;
                    parent.right.parent = parent;
                }
            }
        }
    }    
    
}