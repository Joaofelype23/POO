package Questao38;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda() {
        compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(EntradaEmAgenda entrada) {
        compromissos.add(entrada);
    }

    public void listaDia(int dia, int mes, int ano) {
        System.out.println("Compromissos para " + dia + "/" + mes + "/" + ano + ":");
        for (EntradaEmAgenda entrada : compromissos) {
            if (entrada.ehNoDia(dia, mes, ano)) {
                System.out.println(entrada.toString());
            }
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarCompromisso(new EntradaEmAgenda(10, 26, 8, 2023, "Reunião de equipe"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(15, 26, 8, 2023, "Apresentação de projeto"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(18, 27, 8, 2023, "Aniversário de amigo"));

        agenda.listaDia(26, 8, 2023);
    }

}
