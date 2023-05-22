import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextField;

public class View extends JFrame implements ActionListener
{
    // ============ INICIALIZADORES =============
    // menu inicial
    private JButton btnInserir, btnListar, btnRemover, btnSair;
    // menu inserir
    private JLabel lblNome, lblIdade, lblRa, lblNota, lblSerie;
    private JTextField txfNome, txfIdade,txfRa, txfSerie;
    private JComboBox cbDisciplinas;
    private JLabel lblNomeDisc, lblNotaDisc;
    private JButton btnConfirmaDisciplinas, btnConfirmaInserir, btnCancelaInserir;

    public View(String nomeStr){

        Menu();
        CriaFieldDiscAux();

    }

    // ================ MENU INICIAL ================
    private void Menu(){

        // Cria o FRAME
        JFrame frame = new JFrame("MENU INICIAL");
        frame.setSize(600,80);

        // Cria o PAINEL
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(1, 4, 30, 100));

        // Cria 4 botoes do MENU
        btnInserir = new JButton("Inserir");
        btnInserir.addActionListener(this);
        btnListar = new JButton("Listar");
        btnListar.addActionListener(this);
        btnRemover = new JButton("Remover");
        btnRemover.addActionListener(this);
        btnSair = new JButton("Sair");
        btnSair.addActionListener(this);

        // Bota os 4 botoes no PAINEL
        painel.add(btnInserir);
        painel.add(btnListar);
        painel.add(btnRemover);
        painel.add(btnSair);

        // Bota o PAINEL no FRAME
        frame.add(painel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
        frame.setResizable(false);

    }

    // ================ MENU INSERIR ================
    JFrame frameIns = new JFrame("MENU INSERIR");
    JPanel painelIns = new JPanel();
    private void Inserir(){

        // Cria o FRAME
        frameIns.setSize(600, 200);

        // Cria o PAINEL
        painelIns.setLayout(new GridLayout(6, 2, 10, 10));

        // cria 5 labels, 3 fields, 1 botao, 1 combo box
        lblNome = new JLabel("    Nome:");
        txfNome = new JTextField(10);
        lblIdade = new JLabel("    Idade:");
        txfIdade = new JTextField(10);
        lblRa = new JLabel("    Ra:");
        txfRa = new JTextField(10);
        lblSerie = new JLabel("    Serie:");
        txfSerie = new JTextField(10);
        String[] strDisc = {"Quantidade de materias:", "1", "2", "3", "4", "5", "6", "7", "8"};
        cbDisciplinas = new JComboBox(strDisc);
        cbDisciplinas.addActionListener(this);
        btnConfirmaDisciplinas = new JButton("Confirmar a qnt de disciplinas");
        btnConfirmaDisciplinas.addActionListener(this);
        lblNomeDisc = new JLabel("Nome da materia:");
        lblNotaDisc = new JLabel("Nota:");

        // Bota td acima no PAINEL GERAL
        painelIns.add(lblNome);
        painelIns.add(txfNome);
        painelIns.add(lblIdade);
        painelIns.add(txfIdade);
        painelIns.add(lblRa);
        painelIns.add(txfRa);
        painelIns.add(lblSerie);
        painelIns.add(txfSerie);
        painelIns.add(cbDisciplinas);
        painelIns.add(btnConfirmaDisciplinas);
        painelIns.add(lblNomeDisc);
        painelIns.add(lblNotaDisc);

        // Bota PAINEL no FRAME
        frameIns.add(painelIns);

        frameIns.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frameIns.setVisible(true);
        frameIns.setResizable(true);

    }

    // ================ MENU LISTAR ================
    private void Listar(){

        JFrame frameListar = new JFrame("MENU LISTAR");
        frameListar.setSize(500, 60);
        JPanel painelListar = new JPanel();
        painelListar.setLayout(new GridLayout(1,3,15,15));

        // inicializa 1 label 1 txf 1 botao
        JLabel lblNomeListar;
        JTextField txfNomeListar;
        JButton btnConfirmaListar;

        // cria novo 1 do label, 1 do txf, 1 botao
        lblNomeListar = new JLabel("Nome do aluno: ");
        txfNomeListar = new JTextField(10);
        txfNomeListar.addActionListener(this);
        btnConfirmaListar = new JButton("procurar");
        btnConfirmaListar.addActionListener(this);

        // bota a label e o txf no PAINEL
        painelListar.add(lblNomeListar);
        painelListar.add(txfNomeListar);
        painelListar.add(btnConfirmaListar);

        // bota o PAINEL no FRAME
        frameListar.add(painelListar);

        frameListar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frameListar.setVisible(true);
        frameListar.setResizable(false);

    }
    // ================ CRIA OS FIELDS DE MATERIAS ================
    int qntOld;
    int qntDisc;
    JTextField[] txfNomeDisc = new JTextField[10];
    JTextField[] txfNotaDisc = new JTextField[10];
    private void CriaFieldDiscAux(){

        for (int i=0; i<10; i++){
            txfNomeDisc[i] = new JTextField();
            txfNotaDisc[i] = new JTextField();
        }

        btnCancelaInserir = new JButton("Cancelar o cadastro");
        //btnCancelaInserir.addActionListener(this);
        btnConfirmaInserir = new JButton("Finalizar o cadastro");
        //btnConfirmaInserir.addActionListener(this);
    }

    private void CriaTxfDisc(){
        // pega oq ta no ComboBox e passa pra um int
        qntDisc = Integer.parseInt((String)cbDisciplinas.getSelectedItem());

        int tamanhoFrameIns = 250;
        int tamanhoGridIns = 7;

        // SE QND clicar no botao dnv, eu escolher um numero menor
        // q da ultima vez, remove os antigos
        if (qntOld > qntDisc){

            for (int i=qntOld; i>=qntDisc; i--){
                painelIns.remove(txfNomeDisc[i]);
                painelIns.remove(txfNotaDisc[i]);
            }

        }

        // Bota os novos TextFields
        for (int i=0; i<qntDisc; i++){

            // aumenta tamanho do frame e grid
            tamanhoFrameIns += 50;
            tamanhoGridIns += 1;

            // adiciona as labels
            painelIns.add(txfNomeDisc[i]);
            painelIns.add(txfNotaDisc[i]);

        }
        qntOld = qntDisc;

        // adiciona o botao "Cancelar" e "Confirmar"
        painelIns.add(btnCancelaInserir);
        btnCancelaInserir.addActionListener(this);
        painelIns.add(btnConfirmaInserir);
        btnConfirmaInserir.addActionListener(this);

        // aumenta ou diminui o painel de acordo com as variaveis
        painelIns.setLayout(new GridLayout(tamanhoGridIns, 2, 10, 10));
        frameIns.setSize(600, tamanhoFrameIns);

        // bota o PAINEL INS no frame
        frameIns.add(painelIns);
    }

    private void ConfirmaInserir(){

        String[] nomeDisc = new String[10];
        float[] notaDisc = new float[10];
        // TEM TAMBEM O INT "qntDisc"

        System.out.println("Nome: " + this.lerNome());
        System.out.println("Idade: " + this.lerIdade());
        System.out.println("RA: " + this.lerRa());
        System.out.println("Serie: " + this.lerSerie());

        for (int i=0; i<qntDisc; i++){

            nomeDisc[i] = txfNomeDisc[i].getText();
            int x = i + 1;
            try{
                float aux;
                aux = Float.parseFloat(txfNotaDisc[i].getText());

                if (aux < 0 || aux > 10){
                    JOptionPane.showMessageDialog(null,
                        " Insira um nota entre 0 e 10 para a materia ["  + x + "] ");
                }
                else{
                    notaDisc[i] = aux;
                }

                System.out.println("Nome mat" + i + ": " + nomeDisc[i]);
                System.out.println("Nota mat" + i + ": " + notaDisc[i]);
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,
                    " Insira uma nota valida para a materia [" + x + "].");
            }
        }

    }

    // ============== GETTERS DO CONFIRMA DISCIPLINAS ===============
    public String lerNome(){
        String nome = txfNome.getText();
        return nome;
    }
    public int lerIdade(){
        int idade = 0;
        try{
            int aux = Integer.parseInt(txfIdade.getText());
            if (aux <= 0 || aux > 100){
                JOptionPane.showMessageDialog(null,
                    " Insira um numero entre 0 e 100 para a idade");
            }
            else{
                idade = aux;            
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                " Insira apenas numeros para a idade ");
        }
        return idade;
    }    
    public int lerRa(){
        int ra = 0;
        try{
            int aux = Integer.parseInt(txfRa.getText());
            if (aux <= 0 || aux > 99999999){
                JOptionPane.showMessageDialog(null,
                    " Insira um numero maior que 0 com ate 10 caracteres para o RA(caso tenha menos que 10, sera inserido 0 na frente) ");
            }
            else{
                ra = aux;
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                " Insira apenas numeros no RA ");
        }
        return ra;
    }
    public int lerSerie(){
        int serie = 0;
        try{
            int aux = Integer.parseInt(txfSerie.getText());
            if (aux <= 0 || aux>12){
                JOptionPane.showMessageDialog(null,
                    " Insira um numero entre 0 e 12 para a serie ");
            }
            else{
                serie = aux;
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                " Insira apenas numeros para a serie");
        }
        return serie;
    }
    public int lerQntDisc(){
        return qntDisc;
    }
    public float lerNotaDisc(int x){

        float notaDisc = 0;
        try{
            float aux;
            aux = Float.parseFloat(txfNotaDisc[x].getText());

            if (aux < 0 || aux > 10){
                JOptionPane.showMessageDialog(null,
                    " Insira um nota entre 0 e 10 para a materia ["  + x + "] ");
            }
            else{
                notaDisc = aux;
            }

            System.out.println("Nota mat" + x + ": " + notaDisc);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                " Insira uma nota valida para a materia [" + x + "].");
        }
        return notaDisc;

    }

    // ============== ACTION LISTENER ===============
    public void actionPerformed(ActionEvent e){
        // caso clique INSERIR
        if (e.getSource() == btnInserir){
            Inserir();
            System.out.println("clicou btnInserir");
        }
        // caso clique LISTAR
        else if(e.getSource() == btnListar){
            Listar();
            System.out.println("clicou btnListar");
        }

        // ======= INSERIR =======
        // caso clique CONFIRMAR QNT MATERIAS
        if (e.getSource() == btnConfirmaDisciplinas){
            CriaTxfDisc();
            System.out.println("clicou btnConfirmaDisciplinas");
        }
        // caso clique CONFIRMAR INSERIR
        if (e.getSource() == btnConfirmaInserir){
            ConfirmaInserir();
            System.out.println("clicou btnConfirmaInserir");
        }
        // caso clique CANCELAR INSERIR
        if (e.getSource() == btnCancelaInserir){

        }

    }

}
