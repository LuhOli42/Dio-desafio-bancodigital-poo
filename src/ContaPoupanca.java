public class ContaPoupanca extends Conta {

  private static int SEQUENCIAL = 1;

  public ContaPoupanca() {
    super.agencia = AGENCIA_PADRAO;
    super.numero = SEQUENCIAL++;
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("*** Extrato da conta Poupança ***");
    super.imprimirInfoComuns();
  }
}
