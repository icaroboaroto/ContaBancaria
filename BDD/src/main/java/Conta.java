import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Conta {

	/**
	 * Esta classe contém definições Cucumber para testes de aceitação relacionados a operações de saque em contas.
     * Os cenários incluem clientes especiais e comuns, com diferentes saldos, simulando solicitações de saque.
     * O código para cada passo está atualmente marcado como pendente e deve ser implementado conforme necessário.
	 * @author icaro
	 * @param arg1 Este é o primeiro parametroS
	 * @throws Throwable
	 */
	
	
	 /**
     * Configura um cenário com um cliente especial e um saldo inicial específico.
     *
     * @param int1 O saldo atual do cliente especial.
     */
		@Given("Um cliente especial com saldo atual de -(\\d+) reais$")
		public void um_cliente_especial_com_saldo_atual_de_reais(int arg1) throws Throwable {
			throw new PendingException();
		}

		/**
	     * Simula a solicitação de um saque por um cliente especial.
	     *
	     * @param int1 O valor do saque solicitado.
	     */
		@When("^for solicitado um saque no valor de (\\d+) reais$")
		public void for_solicitado_um_saque_no_valor_de_reais(int arg1) throws Throwable {
			throw new PendingException();	
		}

		/**
	     * Verifica se o saque foi efetuado corretamente e atualiza o saldo da conta.
	     *
	     * @param int1 O novo saldo esperado após o saque.
	     */
		@Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
		public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) throws Throwable{
			throw new PendingException();
		}
		
		/**
	     * Configura um cenário com um cliente comum e um saldo inicial específico.
	     *
	     * @param int1 O saldo atual do cliente comum.
	     */
		@Then("^check more outcomes$")
		public void chec_more_outcomes() throws Throwable {
			throw new PendingException();
			
		}



}
