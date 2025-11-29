Sistema de Locação de Equipamentos e Reserva de Locais Esportivos
Descrição do Projeto
Este sistema tem como objetivo gerenciar clientes, locais esportivos e equipamentos, possibilitando o cadastro, reservas, locações, devoluções, pagamentos e geração de relatórios.
O projeto busca automatizar o processo de administração de centros esportivos, garantindo controle de disponibilidade, histórico de uso e integridade dos dados.

Integrantes do grupo com nome completo
*Aniely Carla Ferreira da Silva - anielycarlaf@gmail.com

*Aline de Oliveira Barbosa - alineoliveirab23@gmail.com

*Maria Eduarda de Souza - eduardasouzaa021@gmail.com

*Laura de Lima Cavalcante - estudando202f@gmail.com

*Tomaz Bruno Aureliano de Sant’anna Vieira - tomazbruno24@gmail.com

Requisitos Funcionais
1. Gerenciamento de Clientes <br> 
REQ01: Permitir cadastro de clientes com nome, documento, telefone e e-mail.<br>
REQ02: Manter histórico de reservas de locais e locações de equipamentos realizadas por cada cliente.<br>
2. Gerenciamento de Equipamentos<br>
REQ03: Permitir cadastro de equipamentos com nome, tipo, quantidade, valor de locação e condição atual.<br>
REQ04: Associar equipamentos a locais específicos.<br>
REQ05: Controlar status dos equipamentos (disponível, emprestado, reservado, em manutenção).<br>
3. Gerenciamento de Locais<br>
REQ06: Permitir cadastro de locais esportivos com nome, tipo, capacidade, recursos disponíveis e valor de reserva.<br>
REQ07: Controlar status dos locais (disponível, reservado, em manutenção).<br>
4. Reservas de Locais e Equipamentos<br>
REQ08: Permitir a reserva de locais para uma data e horário específicos, vinculando cliente e participantes.<br>
REQ09: Permitir que uma reserva de local inclua também os equipamentos necessários, respeitando disponibilidade.<br>
REQ10: Cancelar reservas apenas até um prazo limite antes do horário reservado.<br>
REQ11: Impedir que um local ou equipamento seja reservado para dois clientes no mesmo horário.<br>
5. Empréstimos e Devoluções de Equipamentos<br>
REQ12: Permitir empréstimos de equipamentos vinculados a uma reserva de local ou a uma locação independente.<br>
REQ13: Registrar devoluções de equipamentos, atualizando o estoque.<br>
REQ14: Registrar atrasos na devolução, aplicando multa proporcional ao tempo excedido.<br>
REQ15: Permitir registrar danos e encaminhar equipamentos para manutenção, alterando o status.<br>
6. Pagamentos<br>
REQ16: Permitir registro de pagamentos de reservas de locais e locações de equipamentos, incluindo valor total, data e método de pagamento.<br>
REQ17: Controlar status do pagamento como pendente ou concluído.<br>
REQ18: Permitir cobrança de multa em caso de cancelamento fora do prazo.<br>
7. Relatórios e Estatísticas<br>
REQ19: Gerar relatório de uso de locais por período, com taxa de ocupação.<br>
REQ20: Gerar relatório de equipamentos mais utilizados em determinado período.<br>
REQ21: Gerar relatório de clientes mais ativos em reservas e locações.<br>
REQ22: Permitir exportação de relatórios em PDF e CSV, com filtros e agrupamentos.<br>
8. Regras e Restrições<br>
REQ23: Não permitir a reserva de local acima da capacidade máxima cadastrada.<br>
REQ24: Não permitir reserva de equipamentos em quantidade superior ao estoque disponível.<br>
REQ25: Bloquear reservas e empréstimos para clientes com pendências de devolução ou pagamento.<br>
REQ26: Apenas funcionários autorizados podem registrar manutenção em equipamentos e locais.<br>



