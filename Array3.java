public class Array3 {
    public static void main(String[] args) {
        char[][] star=new char[10][];
        for(int i=0;i<star.length;i++){
            star[i]=new char[10];
        }
        for(int i=0;i<star.length;i++){
            for(int j=0;j<star[i].length;j++){
                if(i==0||j==0||i==9||j==9||i==j||((i+j)==9)){
                    star[i][j]='*';
                   System.out.print(star[i][j]+" ");
                }else{
                    star[i][j]='@';
                    System.out.print(star[i][j]+" ");
                }
            }
            System.out.println();
        }
        /*for(int i=0;i<star.length;i++){
            for(int j=0;j<star[i].length;j++){
                System.out.print(star[i][j]+" ");
            }
            System.out.println();
        }*/
    }
}
