package lecture9;

public class mazeproblem {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        String processed="";
        mazepath(processed,row,col);
    }
    public static void mazepath(String processed,int row,int col){
        if (row==1&&col==1){
            System.out.println(processed);
            return;
        }
        if (row>1){
            mazepath(processed+"v",row-1,col);
        }
        if(col>1){
            mazepath(processed+"h",row,col-1);
        }
    }
}
