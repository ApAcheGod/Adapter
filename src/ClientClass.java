import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class ClientClass {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
                    System.out.println("English or Russian document (E/R)?");
                    switch (bufferedReader.readLine()){
                        case "E" -> {
                            EnglishDocument document = new EnglishDocument();
                            System.out.println("Input name: ");
                            document.setName(bufferedReader.readLine());
                            System.out.println("Input text: ");
                            document.setText(bufferedReader.readLine());
                            System.out.println("Input position DIRECTOR/DEPUTY DIRECTOR (director/deputy)");
                            switch(bufferedReader.readLine()){
                                case "director" -> document.setPosition(Position.DIRECTOR);
                                case "deputy" -> document.setPosition(Position.DEPUTY_DIRECTOR);
                                default -> {
                                    System.out.println("Incorrect position exception");
                                    throw new Exception();
                                }
                            }
                            System.out.println("First name");
                            document.setFirst_name(bufferedReader.readLine());
                            System.out.println("Last name");
                            document.setLast_name(bufferedReader.readLine());
                            System.out.println("Patronymic");
                            document.setPatronymic(bufferedReader.readLine());
                            System.out.println("Date of creation pattern yyyy-mm-dd");
                            document.setDateOfCreation(LocalDate.parse(bufferedReader.readLine()));
                            System.out.println(document.getDocument());
                            Printable adapter = new PrintableAdapterImpl(document).getConvertedDocument();
                            System.out.println(adapter.getDocument());
                        }
                        case "R" -> {
                            RussianDocument document = new RussianDocument();
                            System.out.println("???????????????? ??????????????????: ");
                            document.setName(bufferedReader.readLine());
                            System.out.println("?????????? ??????????????????: ");
                            document.setText(bufferedReader.readLine());
                            System.out.println("?????????????? ?????????????????? ????????????????/?????????????????????? ?????????????????? (??????/??????)");
                            switch(bufferedReader.readLine()){
                                case "??????" -> document.setPosition(Position.DIRECTOR);
                                case "??????" -> document.setPosition(Position.DEPUTY_DIRECTOR);
                                default -> {
                                    System.out.println("???????????????????????? ??????????????????");
                                    throw new Exception();
                                }
                            }
                            System.out.println("??????: ");
                            document.setFirst_name(bufferedReader.readLine());
                            System.out.println("??????????????: ");
                            document.setLast_name(bufferedReader.readLine());
                            System.out.println("????????????????: ");
                            document.setPatronymic(bufferedReader.readLine());
                            System.out.println("???????? ???????????????? ?????? ????????-????-????: ");
                            document.setDateOfCreation(LocalDate.parse(bufferedReader.readLine()));
                            System.out.println(document.getDocument());
                            Printable adapter = new PrintableAdapterImpl(document).getConvertedDocument();
                            System.out.println(adapter.getDocument());
                        }
                        default -> {
                            System.out.println("Incorrect input");
                            throw new Exception();
                        }
                    }
        }catch (Exception ignored){}
    }
}

