package br.com.fiap.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Carrinho extends Remote {

	void cadastrarItem(Item item) throws RemoteException;

	List<Item> obterMedicamentos() throws RemoteException;

	int obterQuantidadeItens() throws RemoteException;

	void removerCadastro(int matricula) throws RemoteException;

}
