package DZ6.Logics;

import DZ6.Models.DeductModel;
import DZ6.Models.DividModel;
import DZ6.Models.MultyModel;
import DZ6.Models.SumModel;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        while (true) {
            try (Scanner scanner = new Scanner(System.in)) {
                while (true) {
                    System.out.println("Выберите действие - +, -, *, / \nили введите i для операций с комплексными числами ");
                    String key = scanner.next();
                    System.out.print("\033[H\033[J");
                    switch (key) {
                        case "+":
                            Presenter p = new Presenter(new SumModel(), new View());
                            p.buttonClick("+");

                            break;
                        case "-":
                            p = new Presenter(new DeductModel(), new View());
                            p.buttonClick("-");
                            break;
                        case "*":
                            p = new Presenter(new MultyModel(), new View());
                            p.buttonClick("*");
                            break;
                        case "/":
                            p = new Presenter(new DividModel(), new View());
                            p.buttonClick("/");
                            break;
                        case "i":
                            ComplexProgram.complex();

                        default:
                            System.out.println("Такой команды нет");
                            break;
                    }
                }
            }

        }
    }
}