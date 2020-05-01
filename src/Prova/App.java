package Prova;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Map<Integer, Produto> produtos = new HashMap<>();
		Set<Compra> compras = new HashSet<>();

		Set<Cliente> clientes = new HashSet<>();

		int op = 0;
		while (op != 4) {
			System.out.println("\n1 - Cadastrar Produto");
			System.out.println("2 - Cadastrar Compra");
			System.out.println("3 - Listar Comprar");
			System.out.println("4 - Sair");
			System.out.print("Opção:");
			op = teclado.nextInt();
			teclado.nextLine();
			System.out.println("");

			if (op == 1) {
				System.out.print("Nome Produto:");
				String nome = teclado.nextLine();

				System.out.print("Descrição:");
				String descicao = teclado.nextLine();

				System.out.print("Valor Produto:");
				float valor = teclado.nextFloat();
				teclado.nextLine();

				System.out.print("ID do Produto:");
				int id = teclado.nextInt();
				teclado.nextLine();
				if (id != 0) {
					Produto produto = new Produto();

					produto.setNome(nome);
					produto.setDescicao(descicao);
					produto.setId(id);
					produto.setValor(valor);

					produtos.put(id, produto);
				} else {
					System.out.print("Digite um ID válido:");
				}
			} else if (op == 2) {

				System.out.print("Data da Compra:");
				String data = teclado.nextLine();

				System.out.print("Nome Cliente:");
				String nome = teclado.nextLine();

				System.out.print("CPF do Cliente:");
				String cpf = teclado.nextLine();

				System.out.print("Digite a Cidade:");
				String cidade = teclado.nextLine();

				System.out.print("Digite a Rua:");
				String rua = teclado.nextLine();

				System.out.print("Digite o CEP:");
				String cep = teclado.nextLine();

				Endereco endereco = new Endereco();
				endereco.setCep(cep);
				endereco.setCidade(cidade);
				endereco.setRua(rua);

				Cliente cliente = new Cliente();

				cliente.setNome(nome);
				cliente.setEndereco(endereco);
				cliente.setCpf(cpf);

				clientes.add(cliente);

				Set<Produto> prod = new HashSet();

				float valor = 0;

				int op1 = 0;
				while (true) {
					System.out.println("\n1 - Adiconar Itens");
					System.out.println("2 - Não adicionar");
					System.out.println("Opção:");
					op1 = teclado.nextInt();
					teclado.nextLine();

					if (op1 == 1) {
						String achado = "";

						Produto produto = new Produto();

						System.out.print("ID do produto:");
						int id = teclado.nextInt();
						teclado.nextLine();

						for (int idProd : produtos.keySet()) {
							Produto pr = produtos.get(idProd);

							if (pr.getId() == id) {
								achado = "achado";
								if (achado != "achado") {
									System.out.println("Não registrado!");
								} else {
									System.out.print("Quantidade de Itens:");
									int quantidade = teclado.nextInt();
									teclado.nextLine();

									float valor1 = quantidade * pr.getValor();
									valor = valor + valor1;
								}

							}

						}
					} else if (op1 == 2) {
						break;
					}
				}
				Compra compra = new Compra();

				compra.setNome(nome);
				compra.setValor(valor);
				compra.setData(data);

				compras.add(compra);
			} else if (op == 3) {
				for (Compra compra : compras) {
					System.out.println("Data Compra:" + compra.getData());
					System.out.println("Nome do Cliente:" + compra.getNome());
					System.out.println("Preço Total:" + compra.getValor());

					for (Cliente cliente : clientes) {
						if (cliente.getNome().equals(compra.getNome())) {
							System.out.println("CPF:" + cliente.getCpf());
						}
					}
					System.out.println("");
				}
			} else if (op == 4) {
				System.out.println("Saindo");
			}
		}

	}

}
