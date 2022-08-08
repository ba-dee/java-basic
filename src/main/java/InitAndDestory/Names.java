package InitAndDestory;

public enum Names {
    A,B,C,D;

    public static void main(String[] args) {
        Names name =Names.B;

        for (Names value : Names.values()) {

            System.out.println(value + ":" + value.ordinal());
        }

        System.out.println(name +":" +  name.ordinal());
    }


}
