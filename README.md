﻿
# System Tour

Time de Desenvolvedores : 
	<ul>
	<li>Abílio "abilioNB" Nogueira</li> 
	<li>Kelvin "kpoliveira" Pinheiro</li>
	<li>Gabriel "gvgabriellb" Vinicius</li> 
	</ul>
Orientador : 
<br>Andre Camara

Descrição: Baseado em um case real , foi idealizado  um escopo para um programa que visa gerenciar por parte de seus donos um micro-empresa de viagem .
O <b>Gerencia Tour</b> trata-se de um sistema que será utilizado pelos administradores da empresa onde eles poderão informatizar toda parte de controle de ativos , como os clientes , quanto a parte financeira. Ainda visando destaque em demais plataformas existentes, será implementado uma função que baseada nas recentes escolha  de destinos/pacotes dos clientes possam ser cotados para as viagens, assim sempre formando uma lista de possíveis clientes para aquele destino.

 ## Setup de Instalação :
  
Versão JAVA: 
	<br> Java 8
<br>Dependências: 
	<ul>
		<li>JPA</li>
		<li>Java FX</li>
		<li> Banco de dados Mysql</li>
		<li>Maven</li>
	</ul>


## Executando: 

Para criar o Banco :
    <ol>
	<li>create database stdatabase;</li>
	<li>Depois é só rodar o programa:</li>
	<li>Fazer o chamado da função de cadastro com banco;</li>
	<li>Executar o programa.</li>
    </ol>

Como executar o programa : 
<ol>
	<li> Baixe e Import o banco de dados : stdatabase.sql</li>
	<li>Inicie o programa</li>
</ol>


## Estrutura de Classes

Adiministradores:
		<ul>
	<li>Criar Administrador;</li>
		</ul>
Cliente:
	<ul>
	<li>Criar cliente;</li>
	<li>Editar Cliente;</li>
	<li>Excluir Cliente;</li>
	</ul>

<br>Gerencia Fincanceira:
	<ul>
	<li>Gerencia de pagamentos;</li>
	<li>Análise de dados dos clientes;</li>
	</ul>
<br>Viagens : 
	<ul> 
	<li>Criação de Viagem;</li> 
	<li>Gerar Pacote de viagem : 
		<ul>
			<li>Individual;</li>
			<li>Família.</li>
		</ul>
	</li>
	<li>Listar despesas relacionadas a cada viagem;</li>
	<li>Calcular  o valor unitário de gasto por cliente;</li>
	<li>Estimar lucro baseado no custo do cliente;</li>

  </ul>
  
   <br>Diagrama de Classes{V1}:
   <br>
  ![package beans](https://user-images.githubusercontent.com/21352623/42130078-94124234-7cae-11e8-8546-70f022d8afa9.png)
  
  
   Arquitetura Parcial{V1}:
  ![diagrama em branco](https://user-images.githubusercontent.com/21352623/42009151-6e94a73c-7a5f-11e8-9d5e-6d07409be0b0.png)
  <br>
  
  
