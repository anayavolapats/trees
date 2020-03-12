public class Tree {
    class Node{
        Node r, l;
        int data;
        Node(int v){
            this.data = v;
        }
    }
    Node root;

    Tree(int v){
        root = new Node(v);
    }

    public void add(int value){
        Node cur =  root;
        boolean found = true;
        while(!found){
            if(cur.data > value){
                if(cur.l != null){
                    cur = cur.l;
                }
                else{
                    cur.l = new Node(value);
                    break;
                }
            }
            else{
                if(cur.data < value){
                    if(cur.r != null){
                        cur = cur.r;
                    }
                    else{
                        cur.r = new Node(value);
                        break;
                    }
                }
                else{
                    break;
                }
            }
        }
    }
}
