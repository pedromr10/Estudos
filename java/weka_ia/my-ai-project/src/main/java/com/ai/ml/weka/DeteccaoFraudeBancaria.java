package com.ai.ml.weka;

import java.util.ArrayList;
import java.util.logging.Level;

import java.util.logging.Logger;

import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

public class DeteccaoFraudeBancaria {
	
	private Classifier classificador; //modelo de classificacao
	private Instances dadosTreinamento; //conjunto de dados usados para treinar o modelo
	//atributos do nosso conjunto de dados:
	private Attribute atributoValor;
	private Attribute atributoOrigem;
	private Attribute atributoFraude;
	
	public void etapa2_definirAtributos() {
		atributoValor = new Attribute("valor");
		ArrayList<String> valoresOrigem = new ArrayList<>();
		valoresOrigem.add("internacional");
		valoresOrigem.add("nacional");
		atributoOrigem = new Attribute("origem", valoresOrigem); //origem da transacao
		ArrayList<String> valoresFraude = new ArrayList<>();
		valoresFraude.add("nao");
		valoresFraude.add("sim");
		atributoFraude = new Attribute("fraude", valoresFraude); //rotulo: se e fraude ou nao
		ArrayList<Attribute> atributos = new ArrayList<>();
		atributos.add(atributoValor);
		atributos.add(atributoOrigem);
		atributos.add(atributoFraude);
		
		//cria o dataset chamado "transacoes" com os atributos definidos. comeca vazio (0 linhas):
		dadosTreinamento = new Instances("transacoes", atributos, 0);
		
		//define o ultimo atributo ("fraude") como a classe alvo (qual o atributo que quero prever) para a previsao:
		dadosTreinamento.setClassIndex(dadosTreinamento.numAttributes()-1);
	}
		//metodo auxiliar para criar e adicionar uma nova transacao ao detaset de treino
		/*
		significa que aqui sera criada uma nvoa instancia de dados (uma linha),
		com a mesma quantidade de colunas (atributos) do dataset dadosTreinamento.
		E como criar uma nova linha em branco em uma planilha, onde voce ainda vai preencher as colunas: valor, origem e fraude.
		*/
		private void adicionarTransacao(double valor, String origem, String fraude) {
			Instance instancia = new DenseInstance(dadosTreinamento.numAttributes());
			//setdataset e uma configuracao obrigatoria que diz a instancia:
			//"voce vai seguir a mesma estrutura do dataset - os mesmos atributos, na mesma ordem e com os mesmos tipos de dados":
			
			instancia.setDataset(dadosTreinamento);
			instancia.setValue(atributoValor, valor);
			instancia.setValue(atributoOrigem, origem);
			instancia.setValue(atributoFraude, fraude);
			dadosTreinamento.add(instancia);
		}
		
		public void etapa4_adicionarExemplos() {
			//exemplos de transacoes fraudulentas (valores altos + origem internacional):
			adicionarTransacao(5000, "internacional", "sim");
			adicionarTransacao(10000, "internacional", "sim");
			adicionarTransacao(7500, "internacional", "sim");
			adicionarTransacao(8000, "internacional", "sim");
			//exemplos de transacoes normais (valores baixos + origem nacional):
			adicionarTransacao(200, "nacional", "nao");
			adicionarTransacao(150, "nacional", "nao");
			adicionarTransacao(300, "nacional", "nao");
			adicionarTransacao(400, "nacional", "nao");
			
			//exemplos adicionais:
			//transacoes com valores medios/altos em territorio nacional
			//pode ser usado para demonstrar variacao ou desafiar o modelo:
			//adicionarTransacao(1000, "nacional", "sim");
			//adicionarTransacao(1500, "nacional", "sim");
			//adicionarTransacao(20000, "nacional", "sim");
		}
		
		//treinamento do modelo:
		public void etapa5_treinarModelo() throws Exception {
			classificador = new J48(); //cria o modelo de decisao chamado J48 (modelo matematico)
			classificador.buildClassifier(dadosTreinamento); //treina o modelo com os dados fornecidos
		}
		
		//classficacao de novas transacoes
		public String classificarTransacao(double valor, String origem) throws Exception {
			//cria uma nova transacao para prever se e fraude ou nao:
			Instance novaInstancia = new DenseInstance(dadosTreinamento.numAttributes());
			novaInstancia.setDataset(dadosTreinamento);
			novaInstancia.setValue(atributoValor, valor);
			novaInstancia.setValue(atributoOrigem, origem);
			//pedir para o classificador prever se a nova transacao e fraude ou nao:
			//o resultado sera 0.0 se nao for fraude e 1.0 se for fraude, conforme o treinamento:
			double previsao = classificador.classifyInstance(novaInstancia);
			//obs: classifyInstance retorna numero decimal porqque usa o mesmo metodo para prever classes e numeros
			
			//transforma o numero previsto em texto (ex: 0 -> "nao", 1 -> "sim") e monta a resposta final
			return "Fraude: " + dadosTreinamento.classAttribute().value((int) previsao);
		}
		
		//teste completo do processo de machine learning:
		public static void main(String[] args) {
			//oculta avisos sobre bibliotecas nativas (nao afetam o funcionamento):
			Logger.getLogger("com.github.fommil.netlib").setLevel(Level.SEVERE);
			
			//criacao do detector:
			DeteccaoFraudeBancaria detector = new DeteccaoFraudeBancaria();
			
			try {
				//etapa 2 - definir atributos:
				detector.etapa2_definirAtributos();
				
				//etapa4 - adicionar exemplos:
				detector.etapa4_adicionarExemplos();
				
				//etapa5 - treinar modelo:
				detector.etapa5_treinarModelo();
				
				//etapa6 - classificar novas transacoes:
				String resultado1 = detector.classificarTransacao(5000, "internacional");
				String resultado2 = detector.classificarTransacao(200, "nacional");
				String resultado3 = detector.classificarTransacao(10000, "internacional");
				String resultado4 = detector.classificarTransacao(150, "nacional");
				String resultado5 = detector.classificarTransacao(7500, "internacional");
				String resultado6 = detector.classificarTransacao(300, "nacional");
				String resultado7 = detector.classificarTransacao(8000, "internacional");
				String resultado8 = detector.classificarTransacao(400, "nacional");
				String resultado9 = detector.classificarTransacao(1000, "nacional");
				
				//impressao dos resultados:
				System.out.println("Teste 1: " + resultado1);
				System.out.println("Teste 2: " + resultado2);
				System.out.println("Teste 3: " + resultado3);
				System.out.println("Teste 4: " + resultado4);
				System.out.println("Teste 5: " + resultado5);
				System.out.println("Teste 6: " + resultado6);
				System.out.println("Teste 7: " + resultado7);
				System.out.println("Teste 8: " + resultado8);
				System.out.println("Teste 9: " + resultado9);
			}catch(Exception e) {
				System.out.println("Erroi ao classificar a transacao: " +  e.getMessage());
			}
		}
		
		
		
	
}
