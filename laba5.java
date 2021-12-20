
import java.util.ArrayList;
import java.util.Scanner;

public class laba5 {
    //Написать программу, выполняющую «сглаживание» вещественного массива A размерности N
    // следующим образом: элемент AK
    //заменяется на среднее арифметическое первых K исходных
    //элементов массива A. На экран должны выводиться как оригинальное состояние массива, так и
    //итоговое.
    public static void main(String[] args) {
        System.out.println("Enter_the_number_of_elements_for_the_list:");
        ArrayList<Float> naborchisel = null;
        int kolvo;
        try {
            Scanner in = new Scanner(System.in);
            kolvo = in.nextInt();
            naborchisel = new ArrayList<Float>();
            System.out.println("Enter_the_elements_of_the_list");
            for (int i = 0; i < kolvo; i++) {
                naborchisel.add(in.nextFloat());
            }

            in.close();
        } catch (Exception e) {
            System.out.println("Incorrect_data");
            System.exit(1);
        }
        System.out.println("Original_list:");
        System.out.println(naborchisel);
        float tekushelem;
        float predydush = (naborchisel.get(0));
        //первый элемент не изменяем
        for (int i = 1; i < naborchisel.size(); i++) {
            tekushelem = 0;
            tekushelem = naborchisel.get(i);
            naborchisel.set(i, predydush / i);
            predydush = predydush + tekushelem;
        }
        System.out.println("Result:");
        System.out.println(naborchisel);
    }
}
