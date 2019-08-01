public class Recursion {
    int[][] map={{1,0,0,0,0,0,0,1,1,0},
                {0,1,0,0,0,1,1,1,1,0},
                {0,1,1,0,0,0,0,1,1,0},
                 {0,0,0,0,0,0,0,1,1,0},
                 {0,0,0,0,0,0,0,1,1,0},
                 {0,0,0,0,0,0,0,1,1,0},
                 {0,0,0,0,0,0,1,1,1,0}};
    void checkXY(int x,int y){
        if(x>=0&&x<7&&y>=0&&y<10&&map[x][y]==1){
            map[x][y]=2;
            check(x,y);}
    }
    void check(int x,int y){
        if(map[x][y]==0)
            return;
        checkXY(x-1,y);
        checkXY(x+1,y);
        checkXY(x,y-1);
        checkXY(x,y+1);
    }
    void printMap(){
        for(int i=0;i<7;i++){
            for(int j=0;j<10;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Recursion ob=new Recursion();
        ob.check(0,7);
        ob.printMap();
    }


}
