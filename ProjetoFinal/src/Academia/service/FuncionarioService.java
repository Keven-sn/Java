package Academia.service;

import Academia.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {
    private final List<Funcionario> funcionarios = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrarFuncionario(String nome, String cargo) {
        Funcionario funcionario = new Funcionario(proximoId++, nome, cargo);
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        System.out.println("Lista de Funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.printf("ID: %d | Nome: %s | Cargo: %s%n", f.getId(), f.getNome(), f.getCargo());
        }
    }
}
