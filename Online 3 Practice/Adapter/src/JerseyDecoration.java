public abstract  class JerseyDecoration implements Jersey {
    protected  Jersey jersey;
    public JerseyDecoration(Jersey j){
        jersey=j;
    }
    @Override
    public int getPrice() {
        return jersey.getPrice();
    }

    @Override
    public String getName() {
        return jersey.getName();
    }
    @Override
    public String getNumber() {
        return jersey.getNumber();
    }

    @Override
    public String getOwnerName() {
        return jersey.getOwnerName();
    }

    @Override
    public String tournamentName() {
        return jersey.tournamentName();
    }
    abstract int getCost();
    @Override
    public void setNumber(String num) {
       jersey.setNumber(num);
    }

    @Override
    public void setOwnerName(String ownerName) {
        jersey.setOwnerName(ownerName);
    }

    @Override
    public void settournamentName(String tourna) {
        jersey.settournamentName(tourna);
    }
}
