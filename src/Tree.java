public class Tree {

    class Node{
        Node r, l;
        int data;
        Node(int v){
            this.data = v;
        }
    }
    Node root;
    int num = 1;
    Tree(int v){
        root = new Node(v);
    }

    public void add(int value){
        num = num + 1;
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

    public static void main(String[] args) {
        Tree i = new Tree(21);
        int c = 0;
        for(int y = 0; y < c; y++){

        }
    }
}
// написать вывод всего
// написать поиск элемента - тру/фолз