import javax.swing.*;

class UsingMultiIfDemo {

    public static void main(String[] args){
        ImageIcon img;
        String animal;

        String file = "picture/";
        String wolf = "Волк";
        String fox = "Лиса";
        String bear = "Медведь";
        String raccoon = "Енот";

        animal = JOptionPane.showInputDialog(null,
                wolf+", "+fox+", "+bear+", "+raccoon+"?", "Укажите название животного",
                JOptionPane.QUESTION_MESSAGE);

        if (animal == null) {
            System.exit(0);
        } else if (animal.equalsIgnoreCase(wolf)) {
            file+="wolf.jpg";
            animal=wolf;
        }else if(animal.equalsIgnoreCase(fox)){
            file+="fox.jpeg";
            animal=fox;
        }else if(animal.equalsIgnoreCase(bear)){
            file+="bear.jpg";
            animal=bear;
        }else {
            file+="raccoon.jpg";
            animal=raccoon;
        }

        img = new ImageIcon(file);
        JOptionPane.showMessageDialog(null, img, animal, JOptionPane.PLAIN_MESSAGE);

    }
}
