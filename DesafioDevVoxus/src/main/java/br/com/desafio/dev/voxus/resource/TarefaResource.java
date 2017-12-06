package br.com.desafio.dev.voxus.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.dev.voxus.entity.Tarefa;
import br.com.desafio.dev.voxus.service.TarefaService;

@RestController
@RequestMapping("/tarefa")
public class TarefaResource {

	@Autowired
	private TarefaService tarefaService;

	@GetMapping("/tarefas")
	public List<Tarefa> listarTarefas() {
		return tarefaService.buscarTodasTarefas();
	}

	@PostMapping("/gravartarefa")
	public ResponseEntity<Tarefa> criarTarefa(@RequestBody Tarefa tarefa, HttpServletResponse response) {
		Tarefa tarefaSalva = tarefaService.gravarTarefa(tarefa);

		return ResponseEntity.status(HttpStatus.CREATED).body(tarefaSalva);
	}

	@DeleteMapping("/deletartarefa/{idTarefa}")
	public void deletarTarefa(@PathVariable Integer idTarefa) {
		tarefaService.excluirTarefa(idTarefa);
	}

	@PutMapping("atualizartarefa/{idTarefa}")
	public ResponseEntity<Tarefa> modificarTarefa(@PathVariable Integer idTarefa, @RequestBody Tarefa tarefa) {
		
		System.out.println("idTarefa "+idTarefa);
		System.out.println("tarefa "+tarefa);
		try {
			Tarefa tarefaSalva = tarefaService.atualizarTarefa(idTarefa, tarefa);
			return ResponseEntity.ok(tarefaSalva);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}
}
