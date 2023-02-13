public class Author {
    
    private String name;
    private String email;
    private char gender;
    private boolean isMale;



    public Author(String name, String email, char gender, boolean isMale) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.isMale = isMale;
    }



    public String getName() {
        return this.name;
    }



    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }


    public boolean isIsMale() {
        return this.isMale;
    }

    public boolean getIsMale() {
        return this.isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }


    @Override
    public String toString() {
        return "{" +
            " name=" + getName() + " gender(" + getGender() + ") at "  +
            " email=" + getEmail() + 
            " }";
    }


}