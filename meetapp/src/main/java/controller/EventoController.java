package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Evento;

@Named
@SessionScoped
public class EventoController implements Serializable {

		private static final long serialVersionUID = 1L;

		@Inject
		private Evento evento;
		
		private List<Evento> eventos = new ArrayList<Evento>();
		
		
		public String adicionarEvento() {
			eventos.add(evento);
			System.out.println("Evento " + evento.getNome() + " cadastrado com sucesso");
			limpar();
			return "";
		}
		
		public void limpar() {
			this.evento = new Evento();
		}

		public Evento getEvento() {
			return evento;
		}

		public void setEvento(Evento evento) {
			this.evento = evento;
		}

		public List<Evento> getEventos() {
			return eventos;
		}

		public void setEventos(List<Evento> eventos) {
			this.eventos = eventos;
		}


}
