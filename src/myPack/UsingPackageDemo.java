package myPack;
import static javax.swing.JOptionPane.*;

public class UsingPackageDemo {
    public static void main(String[] args){
        showMessageDialog(
                null,
                "Статический импорт - это удобно!",
                "Пакет mypack",
                WARNING_MESSAGE);
    }
}
