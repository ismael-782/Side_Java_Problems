public class vimto {
    public static void main(String[] args) {
       Innervimto  inner = new Innervimto(3,2,1000);
       inner.pourVimto();
       System.out.println(inner.getTotalServd() + " /// " + inner.getRemaining());
    }
}
  
class Innervimto {
    int guests;
    int jugSize;
    int cupSize;
    double totalServd;
    double remaining;
    
    Innervimto(int g, int j, int c){
        guests = g;
        jugSize = j * 1000;
        cupSize = c;
    }

    public double getRemaining() {
        return remaining;
    }

    public double getTotalServd() {
        return totalServd;
    }

    public int getCupSize() {
        return cupSize;
    }

    public int getGuests() {
        return guests;
    }

    public int getJugSize() {
        return jugSize;
    }

    public void setCupSize(int cupSize) {
        this.cupSize = cupSize;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public void setJugSize(int jugSize) {
        this.jugSize = jugSize;
    }

    public void  pourVimto() {
        this.totalServd = cupSize;

        for (int i = 1; i < guests; i++) {
            totalServd = totalServd + ((cupSize / 2));
            cupSize = cupSize / 2;
        }
        //jugSize -= totalServd;
        this.remaining =  jugSize - totalServd;
    }

  }