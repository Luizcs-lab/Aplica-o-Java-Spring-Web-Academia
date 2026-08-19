package Projeto.Academia.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Projeto.Academia.dto.pessoaRequestdto;
import Projeto.Academia.entity.Pessoa;
import Projeto.Academia.repository.PessoaRepository;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    @Autowired
    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> ListarPessoas() {
        return repository.findAll();
    }

    public Pessoa salvarPessoa(pessoaRequestdto dto) {
        if (dto.tipo() != 'A' && dto.tipo() != 'I') {
            throw new IllegalArgumentException("O tipo de pessoa deve ser 'A' (Aluno) ou 'I' (Instrutor)");
        }
        
        if (dto.nome() == null || dto.nome().isBlank()) {
            throw new IllegalArgumentException("O nome não pode estar vazio!");
        }
        
        if (dto.data_nascimento() == null) {
            throw new IllegalArgumentException("Deve ter uma data de nascimento");
        }
        
        if (dto.cpf() == null || dto.cpf().length() != 11) {
            throw new IllegalArgumentException("O CPF deve conter 11 números");
        }
        
        if (dto.rg() == null || dto.rg().length() != 9) {
            throw new IllegalArgumentException("O RG deve conter 9 números");
        }
        
        if (dto.email() == null || dto.email().isBlank()) {
            throw new IllegalArgumentException("O email deve ser preenchido");
        }
        
        if (dto.telefone() == null || dto.telefone().isBlank()) {
            throw new IllegalArgumentException("O telefone deve estar preenchido");
        }
        
        if (dto.cep() == null || dto.cep().isBlank()) {
            throw new IllegalArgumentException("O CEP não pode ser vazio");
        }
        
        if (dto.endereco() == null || dto.endereco().isBlank()) {
            throw new IllegalArgumentException("O endereço deve estar preenchido");
        }
        
        if (dto.numero() == null || dto.numero().isBlank() || dto.numero().equals("0")) {
            throw new IllegalArgumentException("O número deve ser válido"); 
        }
        
        if (dto.bairro() == null || dto.bairro().isBlank()) {
            throw new IllegalArgumentException("Campo bairro deve ser preenchido");
        }
        
        if (dto.cidade() == null || dto.cidade().isBlank()) {
            throw new IllegalArgumentException("Nome da cidade deve constar");
        }
        
        if (dto.estado() == null || dto.estado().isBlank()) {
            throw new IllegalArgumentException("Insira um estado");
        }
        
        if (dto.data_admissao() == null) {
            throw new IllegalArgumentException("Informe a data de admissão");
        }

        // Conversão do DTO para entidade
        Pessoa p = new Pessoa();
        p.setId(dto.id());
        p.setTipo(dto.tipo());
        p.setNome(dto.nome());
        p.setDataNascimento(dto.data_nascimento());
        p.setCpf(dto.cpf());
        p.setRg(dto.rg());
        p.setEmail(dto.email());
        p.setTelefone(dto.telefone());
        p.setCep(dto.cep());
        p.setEndereco(dto.endereco());
        p.setNumero(dto.numero());
        p.setBairro(dto.bairro());
        p.setCidade(dto.cidade());
        p.setEstado(dto.estado());
        p.setObservacao(dto.observacao());
        p.setDataAdmissao(dto.data_admissao());

        // Persistência
        return repository.save(p);
    }

    public Pessoa salvarPessoa(Pessoa pessoa) {
        return repository.save(pessoa);
    }
}