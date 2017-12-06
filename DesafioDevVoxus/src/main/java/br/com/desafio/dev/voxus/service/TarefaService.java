package br.com.desafio.dev.voxus.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.dev.voxus.entity.Tarefa;
import br.com.desafio.dev.voxus.repository.TarefaRepository;

@Service
public class TarefaService {

	@Autowired
	private TarefaRepository tarefaRepository;
	
	public Tarefa gravarTarefa(Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}
	
	public List<Tarefa> buscarTodasTarefas(){
		return tarefaRepository.findAll();
		
	}
	public void excluirTarefa(Integer idTarefa) {
		tarefaRepository.delete(idTarefa);
	}
	
	public Tarefa atualizarTarefa(Integer idTarefa, Tarefa tarefa) {
		Tarefa tarefaSalva = tarefaRepository.findOne(idTarefa);
		
				
		BeanUtils.copyProperties(tarefa, tarefaSalva, "idTarefa");
		
		System.out.println(tarefa.getDescTarefa());
		return tarefaRepository.save(tarefa);
	}
	
	
	
	
}