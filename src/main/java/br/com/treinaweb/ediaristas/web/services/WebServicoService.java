package br.com.treinaweb.ediaristas.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treinaweb.ediaristas.core.exceptions.ServicoNaoEncontradoException;
import br.com.treinaweb.ediaristas.core.models.Servico;
import br.com.treinaweb.ediaristas.core.repositories.ServicoRepository;
import br.com.treinaweb.ediaristas.web.dtos.ServicoFormDTO;
import br.com.treinaweb.ediaristas.web.mappers.WebServicoMapper;

@Service
public class WebServicoService {

    @Autowired
    private ServicoRepository repository;

    @Autowired
    private WebServicoMapper mapper;

    public List<Servico> buscarTodos() {
        return repository.findAll();
    }

    public Servico buscarPorId(Long id) {
        var servicoEncontrado = repository.findById(id);

        if (servicoEncontrado.isPresent()) {
            return servicoEncontrado.get();
        }

        var message = String.format("Serviço com ID %d não encontrado", id);
        throw new ServicoNaoEncontradoException(message);
    }

    public Servico cadastrar(ServicoFormDTO form) {
        var model = mapper.toModel(form);

        return repository.save(model);
    }

    public Servico editar(ServicoFormDTO form, Long id) {
        var servicoEncontrado = buscarPorId(id);

        var model = mapper.toModel(form);
        model.setId(servicoEncontrado.getId());

        return model;
    }

    public void excluirPorId(Long id){
        var servicoEncontrado = buscarPorId(id);

        repository.delete(servicoEncontrado);
    }
}
