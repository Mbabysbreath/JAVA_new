import java.util.ArrayList;
import java.util.*;
public class PokeCardTest {
    private static void swap( ArrayList<PokeCard> cards,int i,int j){
        PokeCard tempI=cards.get(i);
        PokeCard tempJ=cards.get(j);
        cards.set(i,tempJ);
        cards.set(j,tempI);
    }
    public static void main(String[] args) {
        ArrayList<PokeCard> cards=new ArrayList<>(52);
        String[] colors={"♥","♦","♠","♣"};
        for(int i=0;i<4;i++){
            for(int j=1;j<=13;j++){
                PokeCard card=new PokeCard(j,colors[i]);
                cards.add(card);
            }
        }
        System.out.println(cards);
        Random random=new Random(20190820);
     for(int i=51;i>0;i--){
         swap(cards,i,random.nextInt(i));
     }
        System.out.println(cards);
        ArrayList<PokeCard> A=new ArrayList<>(5);
        ArrayList<PokeCard> B=new ArrayList<>(5);
        ArrayList<PokeCard> C=new ArrayList<>(5);

        for(int n=0;n<15;n++){
                PokeCard card=cards.remove(cards.size()-1);
                switch(n%3){
                    case 0:A.add(card);break;
                    case 1:B.add(card);break;
                    case 2:C.add(card);break;
                }
        }
        System.out.println(A);
        PokeCard heartA=new PokeCard(12,"♥");
        if(A.contains(heartA)){
            System.out.println("包含");
        }else{
            System.out.println("不包含");
        }
        for(int i=0;i<A.size();i++){
                PokeCard ob=A.get(i);
                if(ob.equals(heartA)){
                    A.remove(ob);
                }
        }
      //  Iterator<PokeCard>
        System.out.println(A);
    }
}
