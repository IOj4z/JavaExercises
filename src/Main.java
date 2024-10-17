import javax.swing.JOptionPane;
import java.util.Scanner;

class ShowMeAWindowDemo{
    public static void main(String[] args){
        String title = "Сообщение";
        String text = "Продолжаем изучать JAVA";

        JOptionPane.showMessageDialog(null, text, title, JOptionPane.PLAIN_MESSAGE);
    }
}

class ConsoleOutputDemo{
    public static void main(String[] args){
        System.out.println("Мы изучаем Java!");
    }
}


class InputDialogDemo{
    public static void main(String[] args){
        String text;
        int num = 10, a = 5, b = 5;
        System.out.printf("%d %d %d%n", num, a, b);
        double x = 0.0, y = 12.5;
        System.out.print(x);
        System.out.print(y);
        float z;
        char s='B',symb;

//        text = JOptionPane.showInputDialog("Ведите текст:");
//        JOptionPane.showMessageDialog(null, "Вы вели такой текст:\n"+text);
    }
}

class ShowMeWindowsDemo{
    public static void main(String[] args){
        String title;
        String text;

        title = JOptionPane.showInputDialog(null,"Имя для окна:", "Название", JOptionPane.WARNING_MESSAGE);

        text = JOptionPane.showInputDialog(null, "Текст сообщения:","Содержание", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null,text, title,JOptionPane.INFORMATION_MESSAGE);
    }
}


class ConsoleInputApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day,month,year;
        System.out.print("Какой сегодня день? ");
        day = input.nextLine();
        System.out.print("Какой сегодня месяц? ");
        month = input.nextLine();
        String text;

        text = "Сегодня " + day + ", месяц - " + month;
        System.out.print(text);
    }
}

class UsingVariablesDemo {
    public static void main(String[] args) {
        int number = 123;
        double x=32.1;
        char symb='A';
        boolean state = true;
        String text="Использумые перенные:\n";
        text =text+"Целое число: " + number+"\n";
        text = text + "Действительное число: " + x+"\n";
        text = text + "Символ: " + symb+"\n";
        text = text + "Логическое значение: " + state;
        JOptionPane.showMessageDialog(null, text);
    }
}

class UsingVarsConsoleDemo {
    public static void main(String[] args) {
        int number = 123;
        double x=32.1;
        char symb='A';
        boolean state = true;
        String text="Использумые перенные:";
        text =text+"Целое число: " + number;
        text = text + "Действительное число: " + x;
        text = text + "Символ: " + symb;
//        text = text + "Логическое значение: " + state;
        System.out.println("Использумые перенные: ");
        System.out.println("Целое число: " + number);
        System.out.println("Действительное число: " + x);
        System.out.println("Символ: " + symb);
        System.out.println("Логическое значение: " + state);
    }
}

class InputIntVariablesDemo {
    public static void main(String[] args) {
        int age, year, birth;
        String result;
        result = JOptionPane.showInputDialog("Какой сейчас год? ");
        year = Integer.parseInt(result);
        result = JOptionPane.showInputDialog("Сколько вам лет? ");
        age = Integer.parseInt(result);
        birth = year - age;
        JOptionPane.showMessageDialog(null, "Вы родились в " + birth + " году!");
    }
}
class InputDoubleVariablesDemo {
    public static void main(String[] args) {
        double mass,height,bmi;
        String result;

        result=JOptionPane.showInputDialog("Ваш рост в метрах: ");
        height = Double.parseDouble(result);

        result = JOptionPane.showInputDialog("Ваш вес в киллограммах:");
        mass = Double.parseDouble(result);

        bmi = mass/height/height;
        bmi = Math.round(bmi*100)/100.0;
        JOptionPane.showMessageDialog(null, "Индекс массы тела: " + bmi);
    }
}
