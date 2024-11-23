import javax.swing.JOptionPane;
class UsingDoWhileDemo {

    static String coder(int number){
        String s= "";
        int n = number;

        do {
            s=(n%2)+s;
            n/=2;
        }while (n!=0);
        return s;
    }

    public static void main(String[] args) {
        String input;
        String title="Вычесление бинарного кода";
        input=JOptionPane.showInputDialog(null,
                "Ведите целое число",
                JOptionPane.QUESTION_MESSAGE);

        if (input==null){
            System.exit(0);
        }

        int num = Integer.parseInt(input);

        String code = coder(num);
        String text ="Вы ввели число: " +num;
        text+="\nБинарный код числа: " +code;
        JOptionPane.showMessageDialog(null,
                text,
                title,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
