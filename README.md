# Exemplos de uso do kafka + spring boot 3

#### Antes de mais nada, você deve subir um kafka. Crie os tópicos com a seguinte configuração

<ul>
  <li>topic-a: 1 partição, 1 fator de replicação</li>
  <li>topic-b: 1 partição, 1 fator de replicação</li>
  <li>topic-c: 3 partições, 1 fator de replicação</li>
  <li>topic-d: 3 partições, 1 fator de replicação</li>
</ul>

#### Para facilitar subir o docker, estou deixando na raiz desse projeto um docker compose com zookeeper, kafka, e kafdrop.

#### Na pasta kafka-teste está um exemplo simples com uma única partição. Só rodar, e ao iniciar, já vamos incluir alguns registros na fila que serão consumidos.

#### Na pasta kafka-teste-particionado está um exemplo mais complexo, os dois tópicos tem 3 partições cada, e estamos subindo 3 consumidores, um para cada partição. Portanto, você precisa subir três instâncias dele, uma em cada porta, usando a variável de ambiente PORT. Após iniciar todos, chamar o endpoint POST http://localhost:8080/produce para incluir registros nas partições.
