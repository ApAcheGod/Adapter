public class PrintableAdapterImpl implements PrintableAdapter{

    private Printable document;

    public PrintableAdapterImpl(Printable document){
        this.document = document;
    }

    public Printable getConvertedDocument() {
        Printable printable = document instanceof RussianDocument ? ((RussianDocument) document) : ((EnglishDocument) document);
        if (document instanceof RussianDocument){
            System.out.println("Переведено на английский");
            return convertToEnglish();
        }else{
            System.out.println("Переведено на русский");
            return convertToRussian();
        }
    }

    @Override
    public RussianDocument convertToRussian() {
        return new RussianDocument(
                document.getName(),
                document.getText(),
                document.getPosition(),
                document.getFirst_name(),
                document.getLast_name(),
                document.getPatronymic(),
                document.getDateOfCreation());
    }

    @Override
    public EnglishDocument convertToEnglish() {
        return new EnglishDocument(
                document.getName(),
                document.getText(),
                document.getPosition(),
                document.getFirst_name(),
                document.getLast_name(),
                document.getPatronymic(),
                document.getDateOfCreation());
    }
}

