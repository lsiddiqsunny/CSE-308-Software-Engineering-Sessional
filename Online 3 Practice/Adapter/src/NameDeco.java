public class NameDeco extends JerseyDecoration {
    public NameDeco(Jersey j) {
        super(j);
    }

    @Override
    int getCost() {

        return jersey.getOwnerName().length()*2;
    }


}
