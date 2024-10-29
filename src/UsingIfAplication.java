import javax.swing.*;

class UsingIfAplication {
    public static void main(String[] args) {
        String input,txt,title;

        int number;

        ImageIcon img;

        input = JOptionPane.showInputDialog(null,
                "Ведите целое число",
                "Проверка числа",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println(input);
        if (input == null || input.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Вы не вели число!",
                    "Ошибка ввода",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        number = Integer.parseInt(input);
        if (number%2 == 0){
            img = new ImageIcon("/home/spectre/Pictures/FilmFisher-Logo-w-Fish-2-370x200.png");
            txt= "Число " + number + "-- четное!";
            title = "Четное число!";
        }
        else{
            img = new ImageIcon("/home/spectre/Pictures/unnamed.jpg");
            txt = "Число "+number+"-- нечетное!";
            title = "Нечетное число!";
        }
        JOptionPane.showMessageDialog(null,
                txt, title, JOptionPane.PLAIN_MESSAGE, img);
    }
}
