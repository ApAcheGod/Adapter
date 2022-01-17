import java.time.LocalDate;

public interface Printable {

    String getDocument();
    String getName();
    String getText();
    Position getPosition();
    String getFirst_name();
    String getLast_name();
    String getPatronymic();
    LocalDate getDateOfCreation();

}
