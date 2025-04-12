package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SistemaCadastro {
    public static void main(String[] args) {
        // Inicialização da interface principal
        JFrame menuFrame = new JFrame("Menu Principal");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(400, 300);


        JMenuBar menuBar = new JMenuBar();


        // Menu Cadastro
        JMenu cadastroMenu = new JMenu("Cadastro");
        JMenuItem cadastrarItem = new JMenuItem("Cadastrar");
        cadastroMenu.add(cadastrarItem);


        // Adicionando menus à barra
        menuBar.add(cadastroMenu);


        // Adicionando barra de menu ao frame
        menuFrame.setJMenuBar(menuBar);


        // Configuração da ação para abrir a tela de cadastro
        cadastrarItem.addActionListener(e -> abrirTelaCadastro());


        menuFrame.setVisible(true);
    }


    // Método para abrir a tela de cadastro
    private static void abrirTelaCadastro() {
        JFrame cadastroFrame = new JFrame("Cadastrar");
        cadastroFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cadastroFrame.setSize(300, 250);


        JPanel panel = new JPanel();
        panel.setLayout(null);


        // Campo Código
        JLabel codigoLabel = new JLabel("Código:");
        codigoLabel.setBounds(10, 20, 80, 25);
        panel.add(codigoLabel);


        JTextField codigoField = new JTextField();
        codigoField.setBounds(100, 20, 165, 25);
        panel.add(codigoField);


        // Campo Nome
        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(10, 50, 80, 25);
        panel.add(nomeLabel);


        JTextField nomeField = new JTextField();
        nomeField.setBounds(100, 50, 165, 25);
        panel.add(nomeField);


        // Campo Curso
        JLabel cursoLabel = new JLabel("Curso:");
        cursoLabel.setBounds(10, 80, 80, 25);
        panel.add(cursoLabel);


        JTextField cursoField = new JTextField();
        cursoField.setBounds(100, 80, 165, 25);
        panel.add(cursoField);


        // Botão Salvar
        JButton salvarButton = new JButton("Salvar");
        salvarButton.setBounds(100, 120, 100, 25);
        panel.add(salvarButton);


        // Ação do botão Salvar
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = codigoField.getText();
                String nome = nomeField.getText();
                String curso = cursoField.getText();


                if (!codigo.isEmpty() && !nome.isEmpty() && !curso.isEmpty()) {
                    JOptionPane.showMessageDialog(cadastroFrame, "Cadastro realizado!\nCódigo: " + codigo + "\nNome: " + nome + "\nCurso: " + curso);
                    // Aqui você pode adicionar lógica para salvar no banco de dados ou arquivo
                } else {
                    JOptionPane.showMessageDialog(cadastroFrame, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        cadastroFrame.add(panel);
        cadastroFrame.setVisible(true);
    }
}
