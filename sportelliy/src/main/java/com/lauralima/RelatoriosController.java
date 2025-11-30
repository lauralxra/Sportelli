package com.lauralima;

package com.lauralima;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class RelatoriosController {

    @FXML
    private Button OnBtnClienteComdividas;

    @FXML
    private Button OnBtnDevolucaodeEquipamentos;

    @FXML
    private Button OnBtnPagamento; // Suponho que este liga ao GerarBotelo

    @FXML
    private Button OnBtnRelatorioMensal; // Pode ligar ao Relatorio Mensal

    @FXML
    private Button OnBtnVoltarMenu;

    // --- LÓGICA DE GERAÇÃO DE BOLETO/PAGAMENTO ---
    @FXML
    void GerarBotelo(ActionEvent event) {
        
        // 1. Pede o ID da Locação ou email do cliente
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Gerar Boleto de Pagamento");
        dialog.setHeaderText("Emissão de Boleto para Locação Esportiva");
        dialog.setContentText("Digite o ID da Locação ou email:");

        Optional<String> result = dialog.showAndWait();
        
        result.ifPresent(id -> {
            // TODO: Buscar no banco o valor da locação (ex: SELECT valor FROM locacao WHERE id = ...)
            double valorFicticio = 150.00; 
            String servico = "Aluguel Quadra A (2h)";

            mostrarAlerta(AlertType.INFORMATION, "Boleto Gerado", 
                "Boleto emitido com sucesso!",
                "Serviço: " + servico + "\n" +
                "Valor: R$ " + valorFicticio + "\n" +
                "Vencimento: " + LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" +
                "Código de barras: 83920000001-1 23123...");
        });
    }

    // --- RELATÓRIO DE DEVOLUÇÕES ---
    @FXML
    void GerarClientesqueDevolveram(ActionEvent event) {
        // Objetivo: Listar equipamentos devolvidos hoje
        LocalDate hoje = LocalDate.now();
        
        // TODO: SQL -> SELECT * FROM locacoes WHERE data_devolucao = hoje AND status = 'FINALIZADO'
        
        // Simulação de dados retornados do banco
        String relatorio = "1. João Silva - Kit Bola Basquete (Devolvido às 10:00)\n" +
                           "2. Maria Oliveira - Rede de Vôlei (Devolvido às 11:30)\n" +
                           "3. Carlos Santos - Colete Time A (Devolvido às 14:00)";

        mostrarAlerta(AlertType.INFORMATION, "Relatório de Devoluções", 
            "Equipamentos devolvidos em: " + hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
            relatorio);
    }

    // --- RELATÓRIO SEMANAL/MENSAL ---
    @FXML
    void GerarRelatorioSemanal(ActionEvent event) {
        LocalDate dataFim = LocalDate.now();
        LocalDate dataInicio = dataFim.minusDays(7);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // TODO: SQL -> SELECT count(*) FROM locacoes WHERE data BETWEEN dataInicio AND dataFim
        
        // Simulação
        int totalLocacoes = 42;
        double faturamento = 3500.00;
        String itensMaisAlugados = "Quadra Poliesportiva, Bola Oficial Futsal";

        String texto = String.format("Período: %s a %s\n\nTotal de Locações: %d\nFaturamento: R$ %.2f\nItens destaque: %s",
                dataInicio.format(fmt), dataFim.format(fmt), totalLocacoes, faturamento, itensMaisAlugados);

        mostrarAlerta(AlertType.INFORMATION, "Relatório Semanal", "Desempenho da Semana", texto);
    }

    // --- NAVEGAÇÃO (VOLTAR) ---
    @FXML
    void VoltarParaMenu(ActionEvent event) {
        try {
            // Carrega o arquivo FXML do Menu Principal
            // Certifique-se que o arquivo Menu.fxml está no mesmo pacote ou ajuste o caminho
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
            Parent root = loader.load();

            // Pega o palco (Stage) atual através do botão que foi clicado
            Stage stage = (Stage) OnBtnVoltarMenu.getScene().getWindow();
            
            // Troca a cena
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
            mostrarAlerta(AlertType.ERROR, "Erro de Navegação", "Não foi possível carregar o menu.", e.getMessage());
        }
    }

    // --- RELATÓRIO DE INADIMPLÊNCIA ---
    @FXML
    void gerarClientesComDividas(ActionEvent event) {
        // Objetivo: Listar quem alugou, passou do prazo ou não pagou
        
        // TODO: SQL -> SELECT nome, valor FROM locacoes WHERE status = 'PENDENTE' OR data_fim < hoje
        
        StringBuilder listaDevedores = new StringBuilder();
        listaDevedores.append("CLIENTE | DÍVIDA | ATRASO\n");
        listaDevedores.append("----------------------------\n");
        listaDevedores.append("Pedro Souza | R$ 80,00 | 2 dias\n");
        listaDevedores.append("Ana Lima    | R$ 200,00| 5 dias\n");

        mostrarAlerta(AlertType.WARNING, "Clientes com Dívidas", 
            "Lista de Pendências Financeiras/Devolução", 
            listaDevedores.toString());
    } 
    }
}
