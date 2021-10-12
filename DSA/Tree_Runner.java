public class Tree_Runner {
    public static void main(String args[]) {
        BinaryTree obj = new BinaryTree();
        obj.put(10);
        obj.put(8);
        obj.put(12);
        obj.put(11);

        obj.inOrder(obj.root);
        System.out.println();
        obj.preOrder(obj.root);
        System.out.println();
        obj.postOrder(obj.root);

        System.out.println(obj.root.value);
        

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

    public TreeNode findSeccesor(TreeNode node){
        if(node.right==null) return node;
        
        TreeNode current=node.right;
        TreeNode parent=node.right;

        while(current!=null){
            parent=current;
            current=current.left;
        }
        return parent;
    }

    public boolean remove(int a){
        TreeNode temp = find(a);

        if(temp.value!=a) return false;

        if((temp.left==null ) && (temp.right==null)){
            if(root == temp) root = null;
            else if(temp.parent.value<temp.value){
                temp.parent.right = null;
            }else temp.parent.left = null;
            return true;
        }

        
        

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
    
    public void inOrder(TreeNode subRoot){
        if(subRoot!=null){
            inOrder(subRoot.left);
            System.out.println(subRoot.value+" ");
            inOrder(subRoot.right);
        }        
    }
     
    public void preOrder(TreeNode subRoot){
        if(subRoot!=null){
            System.out.println(subRoot.value+" ");
            preOrder(subRoot.left);            
            preOrder(subRoot.right);
        }        
    }
    public void postOrder(TreeNode subRoot){
        if(subRoot!=null){
            postOrder(subRoot.left);            
            postOrder(subRoot.right);
            System.out.println(subRoot.value+" ");
        }        
    }
    
    
    
}