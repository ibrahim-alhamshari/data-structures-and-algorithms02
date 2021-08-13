package codeChallenge12;


public class DogClass{

    private String dog;

    public DogClass(String dog){

        this.dog=dog;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return dog ;
    }
}
