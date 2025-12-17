package myshollw;

public class MyGamecharacter implements IMyGame{

    private String charactername;
    private String characterType;
    private int helth;

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public String getCharactername() {
        return charactername;
    }

    public void setCharactername(String charactername) {
        this.charactername = charactername;
    }

    public MyGamecharacter(String charactername,String characterType,int helth){

        this.charactername = charactername;
        this.characterType = characterType;
        this.helth = helth;
    }

    @Override
    public MyGamecharacter clone() {
        try {
            return (MyGamecharacter) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException();
        }
    }

    @Override
    public void ShowAttribute() {

        System.out.println("characterName :"+this.charactername+" | charecterType :"+this.characterType+" | helth :"+this.helth);

    }
}
