# Desafio-Capgemini
**Documentação Desafio Capgemini:**

O código fonte desse projeto está dividido em duas partes, a primeira é a classe **Projeto** que contém o método principal e a segunda parte baseia-se na classe **Calculadora** que realiza os mesmos cálculos da primeira etapa do desafio.

A classe Projeto contém, além do método principal, dois outros métodos: **Calculadora() e Cadastro()**. 

Calculadora() é apenas um método da classe principal para chamar a classe secundária calculadora e realizar seus devidos cálculos e retornar seus valores dentro da classe Projeto. A descrição do seu funcionamento é a mesma da primeira etapa do desafio: 

A classe possui 4 métodos, três métodos para cálculos matemáticos: **calculaVizualizacoes()**, **calculaCliques()**, **calculaCompartilhamentos()**, e o método **calculaVizPorCompartilhamento()**:

**calculaVizualizacoes()**: recebe um valor double v (valor investido) e uma String origem para sua execução. Se “origem” for igual a “inicio” (tratando no anúncio original) a função retorna o resultado da multiplicação do valor investido por 30. Caso origem seja “compartilhamentos” (não é mais o anúncio original) a função retorna o resultado da multiplicação do valor investido por 40. Sempre arredondando o resultado para baixo. 

**calculaCliques()**: recebe um valor int (numero de visualizações do anúncio) e retorna o resultado da multiplicação desse valor por 0,12, representando que 12% das visualizações resultam no número de cliques. 

**calculaCompartilhamentos()**: recebe um valor int (numero de cliques no anúncio) e retorna o resultado da multiplicação desse valor por 0,15, representando que 15% dos cliques resultam no número de compartilhamentos. 

Além desses três métodos matemáticos, a classe também possui o método **calculaVizPorCompartilhamento()**: que recebe um arraylist de inteiros representando compartilhamentos subsequentes ao primeiro compartilhamento original. Dessa forma ele instancia novos valores para a quantidade de visualizações, cliques e novos compartilhamentos a partir desse compartilhamento atual que provém do anúncio original armazenando esses valores em outro arraylist de inteiros e retornando o mesmo, pois sua chamada é feita em outro método.

Esse método é **calculaNumVizualizacoes()**: que recebe um arraylist de double representando o valor investido no início. A partir desse valor investido, ele instancia novos valores para visualizações, cliques e compartilhamentos, como se trata-se do anúncio original, chamando os métodos de cálculos matemáticos. Sua primeira condição refere-se ao fato do número de compartilhamentos ser menor do que 1, pois se isso for verdadeiro os valores não são capazes de gerar mais engajamento no anúncio e por isso ele retorna os dados instanciados no início. Em caso negativo dessa condição o método segue sua execução, dessa vez gerando outro arraylist para dados auxiliares que acumularão os valores de visualizações, cliques e compartilhamentos. Iterando mais três vezes todos os cálculos matemáticos a partir dos valores acumulados para bloquear o engajamento do anúncio a partir dos quartos compartilhamentos de um anúncio original. Todos os dados acumulados são passados para o arraylist inicial e o mesmo é retornado. 

Cadastro() é o método para a execução do sistema de cadastro do projeto, então o mesmo inicia-se na única chamada da função através do método principal e inicia sua execução. 
Inicialmente é necessário inserir os dados para a realização do cadastro, então, na linha de comando, o usuário é convidado a inseri-los um por um, na seguinte ordem: “Nome do anúncio”, “Cliente”, “data de início" (no formato, dia -> mês -> ano sequencialmente na linha de comando), “data de término” (no mesmo formato anterior) e “valor investido por dia”. 
Diante disso, o processo de execução do código continua para a realização do relatório do anúncio e a partir dessas informações o código continua de modo a verificar se a diferença entre as datas de início e término são iguais, e em caso verdadeiro, o valor total investido pelo cliente será apenas o valor investido por dia. 
Em seguida à verificação do valor investido, a execução entra na chamada do método Calculadora() que realiza seus cálculos na classe secundária e devolve seus respectivos resultados para serem armazenados na classe principal, printando os resultados prontos para a visualização do relatório pelo usuário. 


**Como executar o código:** 

Para executar o código, basta entrar no diretório em que a pasta contendo as duas classes foi salva, por meio da linha de comando, compilar o arquivo Projeto.java com o comando “javac Projeto.java” e executar Projeto com o comando “java Projeto”. Assim que tiver início, o usuário vizualizará os primeiros comandos para inserir seus dados e iniciar seu cadastro. 
