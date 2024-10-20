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

class InputVariablesConsoleDemo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int now = 2024;
        String name;
        int age;
        double height;
        double mass;
        System.out.print("Ваше имя: ");
        name = input.nextLine();
        System.out.print("Ваш возраст: ");
        age = input.nextInt();
        System.out.print("Ваш рост (в метрах): ");
        height = input.nextDouble();
        System.out.println("Масса тела (в киллограмах): ");
        mass = input.nextDouble();
        double bmi = mass/height/height;
        System.out.println("Здравствуйте, "+name+"!");
        System.out.println("Вы родились в "+(now-age)+" году!");
        System.out.printf("Ваш индекс массы тела: %5.2f\n",bmi);
    }
}

class MyClass {
    int number;
    char symbol;

    void set(int n, char s) {
        number = n;
        symbol = s;
    }

    String getInfo(){
        String text = "Число: " + number + "\n";
        text = "Символы: " + symbol + "\n";
        return text;
    }
}

class UsingObjectWithMethodsDemo {
    public static void main(String[] args) {
        MyClass objA = new MyClass();
        MyClass objB = new MyClass();

        objA.set(100, 'A');
        objB.set(200, 'B');

        JOptionPane.showMessageDialog(null, objA.getInfo(), "Первый обЪект", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, objB.getInfo(), "Второй обЪект", JOptionPane.INFORMATION_MESSAGE);
    }
}

class OverloadClass{
    int number;
    char symbol;

    void set (int n){
        number = n;
    }

    void set(char s){
        symbol = s;
    }

    void set(int n,char s){
        set(n);
        set(s);
    }

    void set(){
        set(0,'Z');
    }

    void show(){
        System.out.println("Значение полей "+number+" и "+ symbol);
    }

    void show(String txt){
        System.out.println(txt+" значение полей "+ number + " и "+ symbol);
    }

    void show(String txt1, String txt2){
        System.out.println(txt1+ ": " + number);
        System.out.println(txt2+ ": " + symbol);
    }
}

class MethodOverloadingDemo{
    public static void main(String[] args) {
        OverloadClass objA,objB;

        objA = new OverloadClass();
        objB = new OverloadClass();
        objA.set(100);
        objA.set('A');

        System.out.println("ОбЪект objA:");
        objA.show();
        objB.set();
        objB.show("ОбЪект objB:");
        objB.set(200, 'B');
        System.out.println("Объект objB после изменения:");
        objB.show("Число", "Символ");

    }
}