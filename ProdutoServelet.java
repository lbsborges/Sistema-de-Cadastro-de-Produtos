package br.com.fiap.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Produto;

/**
 * Servlet implementation class ProdutoServelet
 */
@WebServlet("/produto")
public class ProdutoServelet extends HttpServlet {
	public static List<Produto> lista = new ArrayList<Produto>();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setAttribute("produtos", lista);
    	request.getRequestDispatcher("lista-produtos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Recupera os parametros do formulario
		String nome = request.getParameter("nome");
		int qtd = Integer.parseInt(request.getParameter("quantidade"));
		double valor = Double.parseDouble(request.getParameter("valor"));
		
//		Criação do objeto produto
		Produto produto = new Produto(nome, qtd, valor);
		
//		Adicão de produto na lista
		lista.add(produto);
		
//		Mensagem de sucesso
		request.setAttribute("msg", "Produto adicionado!");
		
		request.getRequestDispatcher("cadastro-produto.jsp").forward(request, response);
		
	}

}
