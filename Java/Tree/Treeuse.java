package Java.Tree;


import java.util.ArrayList;
import java.util.Scanner;

class Treeuse{
    public static TreeNode<Integer> takeinput(){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the node data: ");
        n=s.nextInt();
        TreeNode<Integer> root=new TreeNode<Integer>(n);
        System.out.println("Enter number of children: ");
        int childcount=s.nextInt();
        for(int i=0;i<childcount;i++){
            TreeNode<Integer> child= takeinput();
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root){
        String d=root.data+": ";
        for(int i=0;i<root.children.size();i++){
            d=d+root.children.get(i).data+" ";
        }
        System.out.println(d);
        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }

        
    }
    public static void main(String[] args) {
        TreeNode<Integer> root=takeinput();
        print(root);
    }

}
class TreeNode<T>{
    public T data;
    public ArrayList<TreeNode<T>> children;
    public TreeNode(T data){
        this.data=data;
        children=new ArrayList<>();

    }
}