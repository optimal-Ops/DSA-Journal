import java.util.*;

public class ZigZagTraversal {
    public static List<List<Integer>> zigzagTraversal(TreeNode node){

        List<List<Integer>> ans=new ArrayList<>();
        if(node==null)
            return ans;
        Queue<TreeNode> q=new LinkedList<>();
        int flag=0;
        q.offer(node);
        while(!q.isEmpty()){
            List<Integer> ls=new ArrayList<>();
            int level=q.size();
            for(int i=0;i<level;i++){

                    node=q.poll();
                    ls.add(node.data);

                    if(node.left!=null)
                        q.offer(node.left);
                    if(node.right!=null)
                        q.offer(node.right);

            }
            if(flag==0){
                ans.add(ls);
                flag=1;
            }else{
                Collections.reverse(ls);
                ans.add(ls);
                flag=0;
            }
        }
        return ans;
    }
}
