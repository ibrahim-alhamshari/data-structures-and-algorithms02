package codeChallenge12;

public class CatClass {

    private String cat;

    public CatClass(String cat){

        this.cat=cat;
    }

    public String getCat() {

        return cat;
    }

    public void setCat(String cat) {

        this.cat = cat;
    }

    @Override
    public String toString() {
        return cat ;
    }
}
