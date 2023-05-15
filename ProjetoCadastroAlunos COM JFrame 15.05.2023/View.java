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
        int qntDisc = Integer.parseInt((String)cbDisciplinas.getSelectedItem());

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

        String nome = txfNome.getText();
        int idade, ra, serie;
        String[] nomeDisc = new String[10];
        float[] notaDisc = new float[10];
        
        try{
            idade = Integer.parseInt(txfIdade.getText());
            ra = Integer.parseInt(txfRa.getText());
            serie = Integer.parseInt(txfSerie.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,
            " Insira apenas numeros para Idade, RA e Serie ");
        }
        
        for (int i=0; i<10; i++){
            
            nomeDisc[i] = txfNomeDisc[i].getText();aaaaaaa
            try{
                notaDisc[i] = Float.parseFloat(txfNotaDisc[i].getText());
            }
            catch(NumberFormatException e){
                
                int x = i+1;
                JOptionPane.showMessageDialog(null,
                " Insira uma nota valida para a materia " + x);
            }
        }
    
    
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
