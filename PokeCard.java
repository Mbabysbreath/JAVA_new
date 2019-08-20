import java.util.Objects;

public class PokeCard {
    int value;
    String color;
    public PokeCard(int value,String color){
        this.value=value;
        this.color=color;
    }

    @Override
    public String toString() {
        return "[" +
                 + value
                + color +
                ']';
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return  false;
        }
        if(!(obj instanceof PokeCard)){
            return false;
        }
        PokeCard other=(PokeCard)obj;
        return this.value==other.value&&(this.color.equals(other.color));
    }
}
