import javax.swing.JOptionPane;

public class startingJava {
    public static void main(String args[]){

        System.out.println("starting java");

        //exemplos variaiveis java!!

        int idade = 27;
        double temperatura = 37.5;
        String name = "Nicolly";
        boolean pessoa = true;

        JOptionPane.showMessageDialog(null, "starting java");
        JOptionPane.showMessageDialog(null, "idade = "+idade);
        JOptionPane.showMessageDialog(null, "temperatura = "+temperatura);
        JOptionPane.showMessageDialog(null, "Qual o nome? = "+name);
        JOptionPane.showMessageDialog(null, "É uma pessoa? = "+pessoa);
    }
}
