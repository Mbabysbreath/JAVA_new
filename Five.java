public class Five {
    int count1,count2;
    int[][] map={
            {-1,1,1,1,1,0,0,-1,0,0},
            {1,-1,1,1,1,1,1,-1,-1,0},
            {0,1,-1,0,0,0,0,1,1,0},
            {0,0,1,-1,0,0,0,1,-1,0},
            {0,0,0,1,-1,0,0,1,0,0},
            {0,0,0,0,0,0,0,0,1,0},
            {0,0,0,0,0,0,1,1,1,0}};
        void check(int x,int y){
            if(x>=0&&x<7&&y>=0&&y<10&&map[x][y]==1){
                count1++;
                //if(count1!=5)
       //         checkXY(x,y);
            }
            if(count1==5)
                System.out.println("黑子");
                return ;
        }
        void checkXY(int x,int y){
            check(x,y+1);
            check(x+1,y);
            check(x+1,y+1);
            check(x-1,y-1);
        }

    public static void main(String[] args) {
        Five ob=new Five();
        for(int i=0;i<7;i++){
            for(int j=0;j<10;j++){
                ob.check(i,j);
            }
        }
    }

}
