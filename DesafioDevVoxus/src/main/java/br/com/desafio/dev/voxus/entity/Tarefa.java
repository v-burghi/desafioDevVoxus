package br.com.desafio.dev.voxus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarefa")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tarefa")
	private Integer idTarefa;

	@Column(name = "nome_tarefa")
	private String nomeTarefa;

	@Column(name = "desc_tarefa")
	private String descTarefa;

	@Column(name = "prioridade")
	private Integer prioridade;

	@Column(name = "concluida")
	private boolean concluida;

	@Column(name = "usuario_criador")
	private String usuarioCriador;

	@Column(name = "usuario_finalizador")
	private String usuarioFinalizador;

	public Tarefa() {
		super();
	}

	public Integer getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(Integer idTarefa) {
		this.idTarefa = idTarefa;
	}

	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	public String getDescTarefa() {
		return descTarefa;
	}

	public void setDescTarefa(String descTarefa) {
		this.descTarefa = descTarefa;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	public String getUsuarioCriador() {
		return usuarioCriador;
	}

	public void setUsuarioCriador(String usuarioCriador) {
		this.usuarioCriador = usuarioCriador;
	}

	public String getUsuarioFinalizador() {
		return usuarioFinalizador;
	}

	public void setUsuarioFinalizador(String usuarioFinalizador) {
		this.usuarioFinalizador = usuarioFinalizador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTarefa == null) ? 0 : idTarefa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		if (idTarefa == null) {
			if (other.idTarefa != null)
				return false;
		} else if (!idTarefa.equals(other.idTarefa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tarefa [idTarefa=" + idTarefa + "]";
	}

}
