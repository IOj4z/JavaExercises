import javax.swing.*;

class UsingListDemo {
    public static void main(String[] args){
        String[] txt = {"Волк","Лиса","Медьведь","Енот"};

        String[] files = {"wolf.jpg","fox.jpeg","bear.jpg","raccoon.jpg"};

        String folder="picture/";
        String message="Кого показать?";

        String title="В мире животных";

        ImageIcon img = new ImageIcon(folder+"giraffe.png");
        String animal;

        animal=(String)JOptionPane.showInputDialog(null,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE,
                img,
                txt,
                txt[0]);

        if(animal==null){
            System.exit(0);
        }
        for (int k=0; k < txt.length; k++){
            if (animal.equals(txt[k])){
                img = new ImageIcon(folder+files[k]);
                break;
            }
        }
        JOptionPane.showMessageDialog(null,
                img,
                animal,
                JOptionPane.PLAIN_MESSAGE
        );
    }
}
