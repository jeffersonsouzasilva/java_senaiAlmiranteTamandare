package Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


public class SistemaLogin {
    private static HashMap<String, String> usersDatabase = new HashMap<>();


    public static void main(String[] args) {
        // Adicionando usuários ao "banco de dados"
        usersDatabase.put("admin", "12345");
        usersDatabase.put("user", "senha");


        // Criando a tela de login
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(300, 200);


        JPanel loginPanel = new JPanel();
        loginFrame.add(loginPanel);
        colocarComponentesLogin(loginPanel, loginFrame);


        loginFrame.setVisible(true);
    }


    private static void colocarComponentesLogin(JPanel panel, JFrame loginFrame) {
        panel.setLayout(null);


        // Label Usuário
        JLabel userLabel = new JLabel("Usuário:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);


        // Campo de Texto Usuário
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);


        // Label Senha
        JLabel passwordLabel = new JLabel("Senha:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);


        // Campo de Senha
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);


        // Botão Login
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 100, 25);
        panel.add(loginButton);


        // Mensagem de Status
        JLabel statusLabel = new JLabel("");
        statusLabel.setBounds(10, 110, 250, 25);
        panel.add(statusLabel);


        // Ação do botão de login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = new String(passwordText.getPassword());


                if (usersDatabase.containsKey(user) && usersDatabase.get(user).equals(password)) {
                    statusLabel.setText("Login bem-sucedido!");
                    loginFrame.dispose(); // Fecha a janela de login
                    abrirMenuPrincipal(); // Abre o menu principal
                } else {
                    statusLabel.setText("Usuário ou senha inválidos.");
                }
            }
        });
    }


    private static void abrirMenuPrincipal() {
        JFrame menuFrame = new JFrame("Menu Principal");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(400, 300);


        JMenuBar menuBar = new JMenuBar();


        // Menu Cadastro
        JMenu cadastroMenu = new JMenu("Cadastro");
        JMenuItem novoCadastro = new JMenuItem("Novo");
        JMenuItem excluirCadastro = new JMenuItem("Excluir");
        cadastroMenu.add(novoCadastro);
        cadastroMenu.add(excluirCadastro);


        // Menu Relatório
        JMenu relatorioMenu = new JMenu("Relatórios");
        JMenuItem gerarRelatorio = new JMenuItem("Gerar Relatório");
        relatorioMenu.add(gerarRelatorio);


        // Adicionando menus à barra
        menuBar.add(cadastroMenu);
        menuBar.add(relatorioMenu);


        // Adicionando barra de menu ao frame
        menuFrame.setJMenuBar(menuBar);


        // Configurações para ações dos menus
        novoCadastro.addActionListener(e -> JOptionPane.showMessageDialog(menuFrame, "Abrir tela de cadastro..."));
        excluirCadastro.addActionListener(e -> JOptionPane.showMessageDialog(menuFrame, "Abrir tela de exclusão..."));
        gerarRelatorio.addActionListener(e -> JOptionPane.showMessageDialog(menuFrame, "Gerar relatório..."));


        menuFrame.setVisible(true);
    }
}