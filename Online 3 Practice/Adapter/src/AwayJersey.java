public class AwayJersey implements Jersey {
    String name="Away Jersey";
    int price=120;
    String num=null;
    String ownername=null;
    String tour=null;
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNumber() {
        return num;
    }

    @Override
    public String getOwnerName() {
        return ownername;
    }

    @Override
    public String tournamentName() {
        return tour;
    }

    @Override
    public void setNumber(String num) {
        this.num=num;
    }

    @Override
    public void setOwnerName(String ownerName) {
this.ownername=ownerName;
    }

    @Override
    public void settournamentName(String tourna) {
this.tour=tourna;
    }
}
