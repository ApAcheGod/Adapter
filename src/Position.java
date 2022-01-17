public enum Position {
    DIRECTOR("Director", "Директор"),
    DEPUTY_DIRECTOR("Deputy director", "Заместитель директора");

    private final String eng;
    private final String rus;


    Position(String eng, String rus) {
        this.eng = eng;
        this.rus = rus;
    }

    public String getEng(){
        return eng;
    }

    public String getRus(){
        return rus;
    }
}
