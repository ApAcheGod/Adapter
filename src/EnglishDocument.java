import java.time.LocalDate;
import java.util.Objects;

public class EnglishDocument implements Printable{
    private String name;
    private String text;
    private Position position;
    private String first_name;
    private String last_name;
    private String patronymic;
    private LocalDate dateOfCreation;


    public EnglishDocument(String name, String text, Position position, String first_name, String last_name, String patronymic, LocalDate dateOfCreation) {
        this.name = name;
        this.text = text;
        this.position = position;
        this.first_name = first_name;
        this.last_name = last_name;
        this.patronymic = patronymic;
        this.dateOfCreation = dateOfCreation;
    }

    public EnglishDocument() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnglishDocument that = (EnglishDocument) o;

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(text, that.text)) return false;
        if (!Objects.equals(position, that.position)) return false;
        if (!Objects.equals(first_name, that.first_name)) return false;
        if (!Objects.equals(last_name, that.last_name)) return false;
        if (!Objects.equals(patronymic, that.patronymic)) return false;
        return Objects.equals(dateOfCreation, that.dateOfCreation);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (first_name != null ? first_name.hashCode() : 0);
        result = 31 * result + (last_name != null ? last_name.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (dateOfCreation != null ? dateOfCreation.hashCode() : 0);
        return result;
    }

    @Override
    public String getDocument() {
        return "EnglishDocument\n" +
                "___________________\n" +
                "name: " + name + '\n' +
                "text: " + text + '\n' +
                "position: " + position.getEng() + '\n' +
                "first name: " + first_name + '\n' +
                "last name: " + last_name + '\n' +
                "patronymic: " + patronymic + '\n' +
                "date of creation: " + dateOfCreation +
                "\n______________________________________";
    }
}
